/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
import java.awt.Graphics;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Malkhan Singh
 */
public class ClockGUI extends javax.swing.JFrame{
    
    private String strHours0;
    private String strMinutes0;
    private String strSeconds0;
    private String strHours1;
    private String strMinutes1;
    private String strSeconds1;
    private String AM;
    public Integer btnType = 0;
    public Integer hourValue;
    public Integer minuteValue;
    public Integer secondValue;
    
    /**
     * Creates new form ClockGUI
     */
    public ClockGUI(int Hours,int Minutes, int Seconds, boolean isAM) {
        initComponents();
         strHours0 = Integer.toString(Hours%10);
         strMinutes0 = Integer.toString(Minutes%10);
         strSeconds0 = Integer.toString(Seconds%10);
         
         strHours1 = Integer.toString((Hours/10)%10);
         strMinutes1 = Integer.toString((Minutes/10)%10);
         strSeconds1 = Integer.toString((Seconds/10)%10);
        if(isAM){
            AM = "AM";
        }else{
            AM = "PM";
        }
        lblHourValue.setText(strHours1+strHours0);
        lblMinuteValue.setText(strMinutes1+strMinutes0);
        lblSecondValue.setText(strSeconds1+strSeconds0);
        lblIsAM.setText(AM);
        
        
        setVisible(true);
    }

    
    public void runClock(int Hours,int Minutes, int Seconds, boolean isAM){
        strHours0 = Integer.toString(Hours%10);
        strMinutes0 = Integer.toString(Minutes%10);
        strSeconds0 = Integer.toString(Seconds%10);

        strHours1 = Integer.toString((Hours/10)%10);
        strMinutes1 = Integer.toString((Minutes/10)%10);
        strSeconds1 = Integer.toString((Seconds/10)%10);
        if(isAM){
            AM = "AM";
        }else{
            AM = "PM";
        }
        lblHourValue.setText(strHours1+strHours0);
        lblMinuteValue.setText(strMinutes1+strMinutes0);
        lblSecondValue.setText(strSeconds1+strSeconds0);
        lblIsAM.setText(AM);
    }
    public Integer getBtnType(){
        return btnType;
    }
    public void setBtnType(Integer btnType){
        this.btnType = btnType;
    }
    public Integer getNewHour(){
        return hourValue;
    }
    public Integer getNewMinute(){
        return minuteValue;
    }
    public Integer getNewSecond(){
        return secondValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHourValue = new javax.swing.JLabel();
        lblMinuteValue = new javax.swing.JLabel();
        lblSecondValue = new javax.swing.JLabel();
        lblIsAM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSet = new javax.swing.JButton();
        setHourValue = new javax.swing.JTextField();
        setMinuteValue = new javax.swing.JTextField();
        setSecondValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MClock");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        lblHourValue.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblHourValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHourValue.setText("00");
        lblHourValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMinuteValue.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblMinuteValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinuteValue.setText("00");

        lblSecondValue.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblSecondValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecondValue.setText("00");

        lblIsAM.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblIsAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIsAM.setText("AM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digital Clock");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnSet.setText("Set");
        btnSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSetMouseClicked(evt);
            }
        });

        setHourValue.setText("00");

        setMinuteValue.setText("00");

        setSecondValue.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSet)
                .addGap(357, 357, 357))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset)
                    .addComponent(lblHourValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinuteValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(setHourValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(setMinuteValue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lblIsAM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(setSecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIsAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSecondValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinuteValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblHourValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(setHourValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setMinuteValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setSecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSet)
                .addGap(113, 113, 113))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        btnType = 1;
        Clock clk = new Clock();
        runClock(clk.getHours(), clk.getMinutes(), clk.getSeconds(), clk.getIsAM());
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnSetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetMouseClicked
        // TODO add your handling code here:
        btnType = 2;
        String text1 = setHourValue.getText();
        String text2 = setMinuteValue.getText();
        String text3 = setSecondValue.getText();
        hourValue = Integer.parseInt(text1);
        minuteValue = Integer.parseInt(text2);
        secondValue = Integer.parseInt(text3);
        Clock clk = new Clock(hourValue, minuteValue, secondValue, true);
        runClock(clk.getHours(), clk.getMinutes(), clk.getSeconds(), clk.getIsAM());
            clk.tick();
            runClock(clk.getHours(), clk.getMinutes(), clk.getSeconds(), clk.getIsAM());
           
    }//GEN-LAST:event_btnSetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ClockGUI().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHourValue;
    private javax.swing.JLabel lblIsAM;
    private javax.swing.JLabel lblMinuteValue;
    private javax.swing.JLabel lblSecondValue;
    private javax.swing.JTextField setHourValue;
    private javax.swing.JTextField setMinuteValue;
    private javax.swing.JTextField setSecondValue;
    // End of variables declaration//GEN-END:variables
}