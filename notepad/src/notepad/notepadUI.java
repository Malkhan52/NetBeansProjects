/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import java.io.File;  
import java.io.*;
import java.nio.file.*;;
import java.io.FileWriter; 
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import sun.swing.FilePane;
import com.ozten.font.JFontChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author student
 */
public class notepadUI extends javax.swing.JFrame {
    String content = "";
    String selctedContent = "";
    String currentFile = "";
    int numberOfWords = 0;
    int numberOfLines = 0;
    int numLettrs = 0;
    /**
     * Creates new form notepadUI
     */
    public notepadUI() {
        initComponents();
        setVisible(true);
        lblCount.setVisible(false);
        lblPosition.setVisible(false);
        updateStatus();
    }
    
    void updateStatus(){
        while(true){
            getStatus();
        }
    }
    
    void readFile(String filePath)throws Exception{
        FileReader fr = new FileReader(filePath);
        content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(content);
        txtArea.setText(content);
    }
    void updateFile(){
        if(currentFile.equals("")){
            saveFile();
        }else{
            try {
                content = txtArea.getText();
                FileWriter myWriter = new FileWriter(currentFile);
                myWriter.write(content);
//                System.out.println(content);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        }
    }
    void saveFile(){
        javax.swing.JFrame parentFrame = new javax.swing.JFrame();
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save As");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            
            try {
                content = txtArea.getText();
                FileWriter myWriter = new FileWriter(fileToSave.getAbsolutePath());
                myWriter.write(content);
                System.out.println(content);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            currentFile = fileToSave.getAbsolutePath();
            System.out.println("Save as file: " + currentFile);
            
        }
    }
        void openFile(){
        String filePath;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            System.out.println("Selected file: " + filePath);
            currentFile = filePath;
            try{
                readFile(filePath);
            }catch(Exception e){
                System.out.println("Uncaught error occured");
            }
        }
            setTitle("Mein Malkhan Singh nahi hu.....copy!!!!");
    }
        void copyText(){
            selctedContent = txtArea.getSelectedText();
            System.out.println(selctedContent);
        }
        void pasteText(){
            txtArea.insert(selctedContent, txtArea.getCaretPosition());
        }
        void cutText(){
            selctedContent = txtArea.getSelectedText();
            txtArea.replaceSelection("");
        }
        void newFile(){
            currentFile = "";
            content = "";
            txtArea.setText(content);
        }
        int wordcount(String string)  
        {  
          int count=0;
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length()-1;i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) || ((ch[i] == '\n')&& ch[i+1] != ' ') )  
                    count++;
            }
            return count;  
        }
        int countLetters(String str){
            int count = 0;
            char ch[]= new char[str.length()];     
            for(int i=0;i<str.length();i++)  
            {  
                ch[i]= str.charAt(i);  
                if( ((ch[i] == '\n')&& ch[i+1] != ' ') )  
                    count++;
            }
            return count;
        }
        int countLines(String str){
            String[] lines = str.split("\r\n|\r|\n");
            return  lines.length;
        }
        void getStatus(){
            lblPosition.setText(Integer.toString(txtArea.getCaretPosition()));
            numberOfWords = wordcount(txtArea.getText());
            numberOfLines = countLines(txtArea.getText());
            numLettrs = countLines(txtArea.getText());
            lblCount.setText("Words: "+Integer.toString(numberOfWords)+" Lines: "+Integer.toString(numberOfLines));
        //dfdnhn;;
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        swingUtil1 = new com.ozten.util.SwingUtil();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        lblCount = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        submenuNew = new javax.swing.JMenuItem();
        submenuOpen = new javax.swing.JMenuItem();
        submenuSave = new javax.swing.JMenuItem();
        submenuSaveAs = new javax.swing.JMenuItem();
        submenuPrint = new javax.swing.JMenuItem();
        submenuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        submenuUndo = new javax.swing.JMenuItem();
        submenuCut = new javax.swing.JMenuItem();
        submenuCopy = new javax.swing.JMenuItem();
        submenuPaste = new javax.swing.JMenuItem();
        submenuDelete = new javax.swing.JMenuItem();
        submenuFind = new javax.swing.JMenuItem();
        submenuFindNext = new javax.swing.JMenuItem();
        submenuReplace = new javax.swing.JMenuItem();
        submenuGoTo = new javax.swing.JMenuItem();
        submenuSelectAll = new javax.swing.JMenuItem();
        submenuTimeDate = new javax.swing.JMenuItem();
        menuFormat = new javax.swing.JMenu();
        submenuWordWrap = new javax.swing.JMenuItem();
        submenuFont = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        submenuStatusBar = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        submenuViewHelp = new javax.swing.JMenuItem();
        submenuAboutNotepad = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem16.setText("jMenuItem16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuFile.setText("File");
        menuFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFileMouseClicked(evt);
            }
        });
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        submenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        submenuNew.setText("New");
        submenuNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submenuNewMouseClicked(evt);
            }
        });
        submenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuNewActionPerformed(evt);
            }
        });
        menuFile.add(submenuNew);

        submenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        submenuOpen.setText("Open");
        submenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuOpenActionPerformed(evt);
            }
        });
        menuFile.add(submenuOpen);

        submenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        submenuSave.setText("Save");
        submenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuSaveActionPerformed(evt);
            }
        });
        menuFile.add(submenuSave);

        submenuSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        submenuSaveAs.setText("Save As");
        submenuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(submenuSaveAs);

        submenuPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        submenuPrint.setText("Print");
        submenuPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuPrintActionPerformed(evt);
            }
        });
        menuFile.add(submenuPrint);

        submenuExit.setText("Exit");
        menuFile.add(submenuExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");

        submenuUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        submenuUndo.setText("Undo");
        menuEdit.add(submenuUndo);

        submenuCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        submenuCut.setText("Cut");
        submenuCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuCutActionPerformed(evt);
            }
        });
        menuEdit.add(submenuCut);

        submenuCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        submenuCopy.setText("Copy");
        submenuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuCopyActionPerformed(evt);
            }
        });
        menuEdit.add(submenuCopy);

        submenuPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        submenuPaste.setText("Paste");
        submenuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuPasteActionPerformed(evt);
            }
        });
        menuEdit.add(submenuPaste);

        submenuDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        submenuDelete.setText("Delete");
        menuEdit.add(submenuDelete);

        submenuFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        submenuFind.setText("Find");
        menuEdit.add(submenuFind);

        submenuFindNext.setText("Find Next");
        menuEdit.add(submenuFindNext);

        submenuReplace.setText("Replace");
        menuEdit.add(submenuReplace);

        submenuGoTo.setText("Go to");
        menuEdit.add(submenuGoTo);

        submenuSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        submenuSelectAll.setText("Select All");
        menuEdit.add(submenuSelectAll);

        submenuTimeDate.setText("Time/Date");
        menuEdit.add(submenuTimeDate);

        jMenuBar1.add(menuEdit);

        menuFormat.setText("Format");

        submenuWordWrap.setText("Word Wrap");
        menuFormat.add(submenuWordWrap);

        submenuFont.setText("Font");
        submenuFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuFontActionPerformed(evt);
            }
        });
        menuFormat.add(submenuFont);

        jMenuBar1.add(menuFormat);

        menuView.setText("View");

        submenuStatusBar.setText("Status Bar");
        submenuStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuStatusBarActionPerformed(evt);
            }
        });
        menuView.add(submenuStatusBar);

        jMenuBar1.add(menuView);

        menuHelp.setText("Help");

        submenuViewHelp.setText("View Help");
        menuHelp.add(submenuViewHelp);

        submenuAboutNotepad.setText("About Notepad");
        menuHelp.add(submenuAboutNotepad);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submenuNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submenuNewMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_submenuNewMouseClicked

    private void submenuPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submenuPrintActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuFileActionPerformed

    private void menuFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFileMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuFileMouseClicked

    private void submenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuOpenActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_submenuOpenActionPerformed

    private void submenuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuSaveAsActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_submenuSaveAsActionPerformed

    private void submenuCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuCopyActionPerformed
        // TODO add your handling code here:
        copyText();
    }//GEN-LAST:event_submenuCopyActionPerformed

    private void submenuPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuPasteActionPerformed
        // TODO add your handling code here:
        pasteText();
    }//GEN-LAST:event_submenuPasteActionPerformed

    private void submenuCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuCutActionPerformed
        // TODO add your handling code here:
        cutText();
    }//GEN-LAST:event_submenuCutActionPerformed

    private void submenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuSaveActionPerformed
        // TODO add your handling code here:
        updateFile();
    }//GEN-LAST:event_submenuSaveActionPerformed

    private void submenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuNewActionPerformed
        // TODO add your handling code here:
        newFile();
    }//GEN-LAST:event_submenuNewActionPerformed

    private void submenuStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuStatusBarActionPerformed
        // TODO add your handling code here:
        lblCount.setVisible(true);
        lblPosition.setVisible(true);
    }//GEN-LAST:event_submenuStatusBarActionPerformed

    private void submenuFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuFontActionPerformed
        // TODO add your handling code here:
        JFontChooser fontChooser = new JFontChooser();
	       JOptionPane.showMessageDialog(null, fontChooser, "Plsease choose font", JOptionPane.PLAIN_MESSAGE);
               txtArea.setFont(fontChooser.getPreviewFont());
    }//GEN-LAST:event_submenuFontActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuFormat;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem submenuAboutNotepad;
    private javax.swing.JMenuItem submenuCopy;
    private javax.swing.JMenuItem submenuCut;
    private javax.swing.JMenuItem submenuDelete;
    private javax.swing.JMenuItem submenuExit;
    private javax.swing.JMenuItem submenuFind;
    private javax.swing.JMenuItem submenuFindNext;
    private javax.swing.JMenuItem submenuFont;
    private javax.swing.JMenuItem submenuGoTo;
    private javax.swing.JMenuItem submenuNew;
    private javax.swing.JMenuItem submenuOpen;
    private javax.swing.JMenuItem submenuPaste;
    private javax.swing.JMenuItem submenuPrint;
    private javax.swing.JMenuItem submenuReplace;
    private javax.swing.JMenuItem submenuSave;
    private javax.swing.JMenuItem submenuSaveAs;
    private javax.swing.JMenuItem submenuSelectAll;
    private javax.swing.JMenuItem submenuStatusBar;
    private javax.swing.JMenuItem submenuTimeDate;
    private javax.swing.JMenuItem submenuUndo;
    private javax.swing.JMenuItem submenuViewHelp;
    private javax.swing.JMenuItem submenuWordWrap;
    private com.ozten.util.SwingUtil swingUtil1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
