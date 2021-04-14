/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Stack;
import java.lang.Math; 
/**
 *
 * @author Malkhan Singh
 */
public class Calculator {
    
    public double evaluate(String expression){
        char[] tokens = expression.toCharArray();
//        System.out.println(tokens[2]);
        Stack<Double> values = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuffer sbuf = new StringBuffer();
                int j = i;
                while(j<tokens.length && tokens[j] >= '0' && tokens[j] <= '9')
                    sbuf.append(tokens[j++]);
                i = j-1;
                values.push(Double.parseDouble(sbuf.toString()));
                System.out.println(sbuf.toString());
            }
            else if(tokens[i] == '('){
                operators.push(tokens[i]);
            }
            else if(tokens[i] == ')'){
                while(operators.peek() != '('){
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            }
            else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '/' || tokens[i] == '*'){
                while(!operators.empty() && hasPrecedence(tokens[i], operators.peek()))
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                operators.push(tokens[i]);
                System.out.println(tokens[i]);
            }
            else if(tokens[i] >= 'a' && tokens[i] <= 'z'){
                StringBuffer sbuf = new StringBuffer();
                StringBuffer sbuf2 = new StringBuffer();
                int j = i;
                while(j<tokens.length && tokens[j] >= 'a' && tokens[j] <= 'z')
                    sbuf.append(tokens[j++]);
                String fun = sbuf.toString();
                System.out.println(fun);
                if(tokens[j] == '('){
                    while(tokens[j+1] != ')')
                        sbuf2.append(tokens[++j]);
                    double val = Double.parseDouble(sbuf2.toString());
//                    System.out.println(sbuf.toString()+')');
                    System.out.println(val);
                    i = j-1;
//                    values.push(solveFun(fun, val));
                    return(solveFun(fun, val));
                }
            }
        }
        while(!operators.empty())
            values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
        return values.pop();
    }
    public boolean hasPrecedence(char op1, char op2){
        if(op2 == '(' || op2 == ')')
            return false;
        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public double applyOperator(char op, double a, double b){
        switch(op){
            case '+':
                return a+b;
            case '-':
                return b-a;
            case '*':
                return a*b;
            case '/':
                if(b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return b/a;
        }
        return 0;
    }
    public double solveFun(String fun, double val){
        if(fun.equals("sin"))
            return(Math.sin(Math.toRadians(val)));
        else if(fun.equals("cos"))
            return(Math.cos(Math.toRadians(val)));
        else if(fun.equals("tan"))
            return(Math.tan(Math.toRadians(val)));
        else if(fun.equals("ln"))
            return(Math.log(val));
        else if(fun.equals("log"))
            return(Math.log10(val));
        else if(fun.equals("asin"))
            return(Math.asin(val));
        else if(fun.equals("acos"))
            return(Math.acos(val));
        else if(fun.equals("atan"))
            return(Math.atan(val));
        else if(fun.equals("sqrt"))
            return(Math.sqrt(val));
        else if(fun.equals("deg"))
            return(Math.toDegrees(val));
        else if(fun.equals("rad"))
            return(Math.toRadians(val));
        return 0;
    }
    public void main(String[] args) {
//            CalculatorUI clcUI = new CalculatorUI();
    }
}
