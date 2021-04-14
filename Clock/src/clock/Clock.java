/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author student
 */
interface SecondObserver{
    void tick();
}
public class Clock implements SecondObserver{
    private int Hours;
    private int Minutes;
    private int Seconds;
    private boolean isAM;
    
    Clock(){
        Hours = 0;
        Minutes = 0;
        Seconds = 0;
        isAM = true;
    }
    Clock(int Hours, boolean isAM){
        this.Hours = Hours;
        Minutes = 0;
        Seconds = 0;
        this.isAM = isAM;
    }
    Clock(int Hours,int Minutes, int Seconds, boolean isAM){
        if(Hours >= 1 && Hours <= 12 && Minutes >= 0 && Minutes <= 59 && Seconds >= 0 && Seconds <= 59){
            this.Hours = Hours;
            this.Minutes = Minutes;
            this.Seconds = Seconds;
            this.isAM = isAM;
        }else{
            System.out.println("Values are Invailid!");
        }
    }
    public int getHours(){
        return Hours;
    }
    public int getMinutes(){
        return Minutes;
    }
    public int getSeconds(){
        return Seconds;
    }
    public boolean getIsAM(){
        return isAM;
    }
    public void setTime(int Hours,int Minutes, int Seconds, boolean isAM){
        this.Hours = Hours;
        this.Minutes = Minutes;
        this.Seconds = Seconds;
        this.isAM = isAM;
    }
    public void tick(){
        if(Seconds < 59){
            ++Seconds;
        }else if(Seconds == 59){
            Seconds = 0;
            if(Minutes < 59){
                ++Minutes;
            }else if(Minutes == 59){
                Minutes = 0;
                if(Hours < 11){
                    ++Hours;
                }else if(Hours == 11){
                    Hours = 12;
                    if(isAM){
                        isAM = false;
                    }else{
                        isAM = true;
                    }
                }else if(Hours == 12){
                    Hours = 1;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintClock pclk = new PrintClock();
        
        pclk.PrintCurrentTime();
        
        
    }
    
}
