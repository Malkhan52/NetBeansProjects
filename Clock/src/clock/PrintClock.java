/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import java.util.concurrent.*; 
/**
 *
 * @author student
 */
public class PrintClock extends Clock{
    
    ClockGUI cUI = new ClockGUI(0, 0, 0, true);
    void runClock(Clock clk){
        String am;
        clk.tick();
            if(clk.getIsAM()){
                am = "AM";
            }else{
                am = "PM";
            }
                cUI.runClock(clk.getHours(), clk.getMinutes(), clk.getSeconds(), clk.getIsAM());
                TimeUnit time = TimeUnit.SECONDS;
                try{
                    time.sleep(1);
                }catch(InterruptedException e){
                    System.out.println("Interrupted while Sleeping");
                }
    }
    
    void PrintCurrentTime(){
            Clock clk1 = new Clock(11,59,30,true);
            Clock clk2 = new Clock();
            Boolean isSet = false;
            Integer btnType;
        while(true){
            btnType = cUI.getBtnType();
            if(btnType == 0){
                runClock(clk1);
            }
            if(btnType == 1){
                runClock(clk2);
            }
            if(btnType == 2){
                if(!isSet){
                    clk2.setTime(cUI.getNewHour(), cUI.getNewMinute(), cUI.getNewSecond(), true);
                    isSet = true;
                }
                runClock(clk2);
            }
        } 
    }
}
