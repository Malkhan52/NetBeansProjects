/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_calculator;

/**
 *
 * @author Malkhan Singh
 */
public class FP_Calculator_GUI extends javax.swing.JFrame {
    double ei, ei_result;
    double eo, eo_result;
    double eq, eq_result;
    double lif, lif_result;
    double eif, eif_result;
    double f_result = 0;
    double caf_result = 0;
    double ufp_result = 0;
    double fp_result = 0;
    
//    Constant Values
    double simple_ei = 3;
    double simple_eo = 4;
    double simple_eq = 3;
    double simple_lif = 7;
    double simple_eif = 5;
    
    double average_ei = 4;
    double average_eo = 5;
    double average_eq = 4;
    double average_lif = 10;
    double average_eif = 7;
    
    double complex_ei = 6;
    double complex_eo = 7;
    double complex_eq = 6;
    double complex_lif = 15;
    double complex_eif = 10;
    
    double NO_INFLUENCE = 0;
    double INCIDENTAL = 1;
    double MODERATE = 2;
    double AVERAGE = 3;
    double SIGNIFICANT = 4;
    double ESSENTIAL = 5;
    /**
     * Creates new form FP_Calculator_GUI
     */
    public FP_Calculator_GUI() {
        initComponents();
        
        setVisible(true);
    }
 void calculate_ei_simple(){
     ei = Double.valueOf(txt_EI.getText());
     if(EI_Simple.isSelected()){
        ei_result = ei * simple_ei;
         EI_Average.setSelected(false);
         EI_Complex.setSelected(false);
     }
 }
 void calculate_eo_simple(){
    eo = Double.valueOf(txt_EO.getText());
     if(EO_Simple.isSelected()){
        eo_result = eo * simple_eo;
         EO_Average.setSelected(false);
         EO_Complex.setSelected(false);
     }
 }
  void calculate_eq_simple(){
   eq = Double.valueOf(txt_EQ.getText());
     if(EQ_Simple.isSelected()){
        eq_result = eq * simple_eq;
         EQ_Average.setSelected(false);
         EQ_Complex.setSelected(false);
     }
  }
   void calculate_lif_simple(){
   lif = Double.valueOf(txt_LIF.getText());
     if(LIF_Simple.isSelected()){
        lif_result = lif * simple_lif;
         LIF_Average.setSelected(false);
         LIF_Complex.setSelected(false);
     }
   }
  void calculate_eif_simple(){
   eif = Double.valueOf(txt_EIF.getText());
     if(EIF_Simple.isSelected()){
        eif_result = eif * simple_eif;
         EIF_Average.setSelected(false);
         EIF_Complex.setSelected(false);
     }     
 }
 
 void calculate_ei_average(){
     ei = Double.valueOf(txt_EI.getText());
     if(EI_Average.isSelected()){
        ei_result = ei * average_ei;
         EI_Simple.setSelected(false);
         EI_Complex.setSelected(false);
     }     
 }
 void calculate_eo_average(){
     eo = Double.valueOf(txt_EO.getText());
     if(EO_Average.isSelected()){
        eo_result = eo * average_eo;
         EO_Simple.setSelected(false);
         EO_Complex.setSelected(false);
     }     
 }
 void calculate_eq_average(){
     eq = Double.valueOf(txt_EQ.getText());
     if(EQ_Average.isSelected()){
        eq_result = eq * average_eq;
         EQ_Simple.setSelected(false);
         EQ_Complex.setSelected(false);
     }     
 }
 void calculate_lif_average(){
     lif = Double.valueOf(txt_LIF.getText());
     if(LIF_Average.isSelected()){
        lif_result = lif * average_lif;
         LIF_Simple.setSelected(false);
         LIF_Complex.setSelected(false);
     }     
 }
 void calculate_eif_average(){
     eif = Double.valueOf(txt_EIF.getText());
     if(EIF_Average.isSelected()){
        eif_result = eif * average_eif;
         EIF_Simple.setSelected(false);
         EIF_Complex.setSelected(false);
     }     
 }
 
 void calculate_ei_complex(){
     ei = Double.valueOf(txt_EI.getText());
     if(EI_Complex.isSelected()){
        ei_result = ei * complex_ei;
         EI_Simple.setSelected(false);
         EI_Average.setSelected(false);
     }
 }
 
 void calculate_eo_complex(){
     eo = Double.valueOf(txt_EO.getText());
     if(EO_Complex.isSelected()){
        eo_result = eo * complex_eo;
         EO_Simple.setSelected(false);
         EO_Average.setSelected(false);
     }     
 }
 void calculate_eq_complex(){
     eq = Double.valueOf(txt_EQ.getText());
     if(EQ_Complex.isSelected()){
        eq_result = eq * complex_eq;
         EQ_Simple.setSelected(false);
         EQ_Average.setSelected(false);
     }     
 }
 void calculate_lif_complex(){
     lif = Double.valueOf(txt_LIF.getText());
     if(LIF_Complex.isSelected()){
        lif_result = lif * complex_lif;
         LIF_Simple.setSelected(false);
         LIF_Average.setSelected(false);
     }     
 }
 void calculate_eif_complex(){
     eif = Double.valueOf(txt_EIF.getText());
     if(EIF_Complex.isSelected()){
        eif_result = eif * complex_eif;
         EIF_Simple.setSelected(false);
         EIF_Average.setSelected(false);
     }     
 }





 void calculate_f(){
     String selected = (String)CAV_List.getSelectedItem();
     if(selected.equals("No Influence - 0")){
         f_result = NO_INFLUENCE * 14;
     }else if(selected.equals("Incidental - 1")){
         f_result = INCIDENTAL * 14;
     }else if(selected.equals("Moderate - 2")){
         f_result = MODERATE * 14;
     }else if(selected.equals("Average - 3")){
         f_result = AVERAGE * 14;
     }else if(selected.equals("Significant - 4")){
         f_result = SIGNIFICANT * 14;
     }else if(selected.equals("Essential - 5")){
         f_result = ESSENTIAL * 14;
     }else{
         if(!txt_f.getText().isEmpty()){
             double sum_f = Double.valueOf(txt_f.getText());
             f_result = sum_f;
         }
     }
     caf_result = 0.65 + (0.01 * f_result);
 }
 void calculate_fp(){
     ufp_result = ei_result + eo_result + eq_result + lif_result + eif_result;
     fp_result = ufp_result * caf_result;
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_EO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_EI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_EQ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_LIF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EI_Simple = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        EO_Simple = new javax.swing.JCheckBox();
        EQ_Simple = new javax.swing.JCheckBox();
        LIF_Simple = new javax.swing.JCheckBox();
        EIF_Simple = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        EI_Average = new javax.swing.JCheckBox();
        EO_Average = new javax.swing.JCheckBox();
        EQ_Average = new javax.swing.JCheckBox();
        LIF_Average = new javax.swing.JCheckBox();
        EIF_Average = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        EI_Complex = new javax.swing.JCheckBox();
        EO_Complex = new javax.swing.JCheckBox();
        EQ_Complex = new javax.swing.JCheckBox();
        LIF_Complex = new javax.swing.JCheckBox();
        EIF_Complex = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        EI_Result = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        LIF_Result = new javax.swing.JLabel();
        EO_Result = new javax.swing.JLabel();
        EQ_Result = new javax.swing.JLabel();
        F_Result = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        CAV_List = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        EIF_Result = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_EIF = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        CAF_Result = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        UFP_Result = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        FP_Result = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_f = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Function Point Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Software Engineering");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("716CS1047");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Developer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Malkhan Singh");

        jLabel6.setText("Number of User Outputs(EO) :- ");

        jLabel7.setText("Number of User Inputs(EI) :- ");

        jLabel8.setText("Number of User Inquiries(EQ) :- ");

        jLabel9.setText("Number of files(LIF) :- ");

        jLabel10.setText("Number of External Interfaces(EIF) :- ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Simple");

        EI_Simple.setText("3");
        EI_Simple.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EI_SimpleStateChanged(evt);
            }
        });
        EI_Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EI_SimpleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Weighting Factors");

        EO_Simple.setText("4");
        EO_Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EO_SimpleActionPerformed(evt);
            }
        });

        EQ_Simple.setText("3");
        EQ_Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQ_SimpleActionPerformed(evt);
            }
        });

        LIF_Simple.setText("7");
        LIF_Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIF_SimpleActionPerformed(evt);
            }
        });

        EIF_Simple.setText("5");
        EIF_Simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIF_SimpleActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Average");

        EI_Average.setText("4");
        EI_Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EI_AverageActionPerformed(evt);
            }
        });

        EO_Average.setText("5");
        EO_Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EO_AverageActionPerformed(evt);
            }
        });

        EQ_Average.setText("4");
        EQ_Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQ_AverageActionPerformed(evt);
            }
        });

        LIF_Average.setText("10");
        LIF_Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIF_AverageActionPerformed(evt);
            }
        });

        EIF_Average.setText("7");
        EIF_Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIF_AverageActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Complex");

        EI_Complex.setText("6");
        EI_Complex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EI_ComplexActionPerformed(evt);
            }
        });

        EO_Complex.setText("7");
        EO_Complex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EO_ComplexActionPerformed(evt);
            }
        });

        EQ_Complex.setText("6");
        EQ_Complex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQ_ComplexActionPerformed(evt);
            }
        });

        LIF_Complex.setText("15");
        LIF_Complex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIF_ComplexActionPerformed(evt);
            }
        });

        EIF_Complex.setText("10");
        EIF_Complex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIF_ComplexActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("X");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("X");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("X");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("X");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("X");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("=");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("=");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("=");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("=");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("=");

        EI_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Result");

        LIF_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        EO_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        EQ_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        F_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel21.setText("Complexity Adjustment Values (F) = ");

        CAV_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "No Influence - 0", "Incidental - 1", "Moderate - 2", "Average - 3", "Significant - 4", "Essential - 5" }));
        CAV_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAV_ListActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("X");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("14");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("=");

        EIF_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel30.setText("Complexity Adjustment Factor (CAF) = ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("0.65 + ( 0.01 X F )");

        jLabel32.setText("Unadjusted Function Point (UFP) =  ");

        CAF_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("=");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("UFP X CAF");

        jLabel36.setText("Function Point (FP) =  ");

        UFP_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("=");

        FP_Result.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("OR  (Sum of 14 complexity adjustment values)");

        jButton1.setText("Calculate");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(0, 625, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UFP_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FP_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CAV_List, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(F_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_EI, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EO, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EQ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_LIF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EIF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(EI_Simple)
                                    .addGap(33, 33, 33)
                                    .addComponent(EI_Average)
                                    .addGap(31, 31, 31)
                                    .addComponent(EI_Complex))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(EO_Simple)
                                            .addGap(33, 33, 33)
                                            .addComponent(EO_Average)
                                            .addGap(31, 31, 31)
                                            .addComponent(EO_Complex))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(EQ_Simple)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(EQ_Average))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LIF_Simple)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(LIF_Average))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(EIF_Simple)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(EIF_Average)))
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(EIF_Complex)
                                                .addComponent(LIF_Complex)
                                                .addComponent(EQ_Complex)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(LIF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(EO_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(EQ_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(EI_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(EIF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap(74, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)))
                            .addGap(210, 210, 210)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_EI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EI_Simple)
                                            .addComponent(EI_Average)
                                            .addComponent(EI_Complex)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel20)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(EI_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EIF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_EO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EO_Simple)
                                            .addComponent(EO_Average)
                                            .addComponent(EO_Complex)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel23)
                                            .addComponent(EO_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EQ_Simple)
                                            .addComponent(EQ_Average)
                                            .addComponent(EQ_Complex)
                                            .addComponent(txt_EQ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel22)
                                            .addComponent(EQ_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_LIF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LIF_Simple)
                                            .addComponent(LIF_Average)
                                            .addComponent(LIF_Complex)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel24)
                                            .addComponent(LIF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EIF_Simple)
                                            .addComponent(EIF_Average)
                                            .addComponent(EIF_Complex)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel25)
                                            .addComponent(txt_EIF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(CAV_List, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(F_Result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAF_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_f, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UFP_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38))
                            .addComponent(FP_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CAV_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAV_ListActionPerformed
        // TODO add your handling code here:
        calculate_f();
        F_Result.setText(Double.toString(f_result));
        
        CAF_Result.setText(Double.toString(caf_result));
    }//GEN-LAST:event_CAV_ListActionPerformed

    private void EI_SimpleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EI_SimpleStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_EI_SimpleStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        calculate_f();
        calculate_fp();
        CAF_Result.setText(Double.toString(caf_result));
        UFP_Result.setText(Double.toString(ufp_result));
        FP_Result.setText(Double.toString(fp_result));
    }//GEN-LAST:event_jButton1MouseClicked

    private void EI_SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EI_SimpleActionPerformed
        // TODO add your handling code here:
        calculate_ei_simple();
        EI_Result.setText(Double.toString(ei_result));
    }//GEN-LAST:event_EI_SimpleActionPerformed

    private void EI_AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EI_AverageActionPerformed
        // TODO add your handling code here:
        calculate_ei_average();
        EI_Result.setText(Double.toString(ei_result));
    }//GEN-LAST:event_EI_AverageActionPerformed

    private void EI_ComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EI_ComplexActionPerformed
        // TODO add your handling code here:
        calculate_ei_complex();
        EI_Result.setText(Double.toString(ei_result));
    }//GEN-LAST:event_EI_ComplexActionPerformed

    private void EO_SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EO_SimpleActionPerformed
        // TODO add your handling code here:
        calculate_eo_simple();
        EO_Result.setText(Double.toString(eo_result));
    }//GEN-LAST:event_EO_SimpleActionPerformed

    private void EQ_SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQ_SimpleActionPerformed
        // TODO add your handling code here:
        calculate_eq_simple();
        EQ_Result.setText(Double.toString(eq_result));
    }//GEN-LAST:event_EQ_SimpleActionPerformed

    private void LIF_SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIF_SimpleActionPerformed
        // TODO add your handling code here:
        calculate_lif_simple();
        LIF_Result.setText(Double.toString(lif_result));
    }//GEN-LAST:event_LIF_SimpleActionPerformed

    private void EIF_SimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIF_SimpleActionPerformed
        // TODO add your handling code here:
        calculate_eif_simple();
        EIF_Result.setText(Double.toString(eif_result));
    }//GEN-LAST:event_EIF_SimpleActionPerformed

    private void EIF_AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIF_AverageActionPerformed
        // TODO add your handling code here:
        calculate_eif_average();
        EIF_Result.setText(Double.toString(eif_result));
    }//GEN-LAST:event_EIF_AverageActionPerformed

    private void LIF_AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIF_AverageActionPerformed
        // TODO add your handling code here:
        calculate_lif_average();
        LIF_Result.setText(Double.toString(lif_result));
    }//GEN-LAST:event_LIF_AverageActionPerformed

    private void EQ_AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQ_AverageActionPerformed
        // TODO add your handling code here:
        calculate_eq_average();
        EQ_Result.setText(Double.toString(eq_result));
    }//GEN-LAST:event_EQ_AverageActionPerformed

    private void EO_AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EO_AverageActionPerformed
        // TODO add your handling code here:
        calculate_eo_average();
        EO_Result.setText(Double.toString(eo_result));
    }//GEN-LAST:event_EO_AverageActionPerformed

    private void EO_ComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EO_ComplexActionPerformed
        // TODO add your handling code here:
        calculate_eo_complex();
        EO_Result.setText(Double.toString(eo_result));
    }//GEN-LAST:event_EO_ComplexActionPerformed

    private void EQ_ComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQ_ComplexActionPerformed
        // TODO add your handling code here:
        calculate_eq_complex();
        EQ_Result.setText(Double.toString(eq_result));
    }//GEN-LAST:event_EQ_ComplexActionPerformed

    private void LIF_ComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIF_ComplexActionPerformed
        // TODO add your handling code here:
        calculate_lif_complex();
        LIF_Result.setText(Double.toString(lif_result));
    }//GEN-LAST:event_LIF_ComplexActionPerformed

    private void EIF_ComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIF_ComplexActionPerformed
        // TODO add your handling code here:
        calculate_eif_complex();
        EIF_Result.setText(Double.toString(eif_result));
    }//GEN-LAST:event_EIF_ComplexActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FP_Calculator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FP_Calculator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FP_Calculator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FP_Calculator_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAF_Result;
    private javax.swing.JComboBox<String> CAV_List;
    private javax.swing.JCheckBox EIF_Average;
    private javax.swing.JCheckBox EIF_Complex;
    private javax.swing.JLabel EIF_Result;
    private javax.swing.JCheckBox EIF_Simple;
    private javax.swing.JCheckBox EI_Average;
    private javax.swing.JCheckBox EI_Complex;
    private javax.swing.JLabel EI_Result;
    private javax.swing.JCheckBox EI_Simple;
    private javax.swing.JCheckBox EO_Average;
    private javax.swing.JCheckBox EO_Complex;
    private javax.swing.JLabel EO_Result;
    private javax.swing.JCheckBox EO_Simple;
    private javax.swing.JCheckBox EQ_Average;
    private javax.swing.JCheckBox EQ_Complex;
    private javax.swing.JLabel EQ_Result;
    private javax.swing.JCheckBox EQ_Simple;
    private javax.swing.JLabel FP_Result;
    private javax.swing.JLabel F_Result;
    private javax.swing.JCheckBox LIF_Average;
    private javax.swing.JCheckBox LIF_Complex;
    private javax.swing.JLabel LIF_Result;
    private javax.swing.JCheckBox LIF_Simple;
    private javax.swing.JLabel UFP_Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_EI;
    private javax.swing.JTextField txt_EIF;
    private javax.swing.JTextField txt_EO;
    private javax.swing.JTextField txt_EQ;
    private javax.swing.JTextField txt_LIF;
    private javax.swing.JTextField txt_f;
    // End of variables declaration//GEN-END:variables
}
