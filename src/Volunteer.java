/**
 * Community Services Recorder Program
 * the functions of this program are
 * check community services hours
 * sign in new account
 * add community services hours
 * display all new student's status
 * display over 40 hours
 * display below 40 hours
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;


/**
 *
 * @author zhongh1521
 */
public class Volunteer extends javax.swing.JFrame {

    /**
     * Creates new form Volunteer
     */
  

    /**
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtCard = new javax.swing.JTextField();
        lblCard = new javax.swing.JLabel();
        btnCkeck = new javax.swing.JButton();
        lblHour = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblHours = new javax.swing.JLabel();
        lblEx = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAdd = new javax.swing.JTextField();
        lblAdd = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblCheck = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnShowall = new javax.swing.JButton();
        btnShowover = new javax.swing.JButton();
        btnBelow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShow = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardActionPerformed(evt);
            }
        });

        lblCard.setText("Card Number");

        btnCkeck.setText("Check");
        btnCkeck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCkeckActionPerformed(evt);
            }
        });

        lblHour.setText("Total Hours");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblHours.setText("0");

        lblEx.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        lblEx.setText("Community Service Recorder System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEx, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHours, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCard)
                                .addGap(18, 18, 18)
                                .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCkeck, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEx, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCard)
                    .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCkeck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHours, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister))
                .addGap(108, 108, 108))
        );

        jTabbedPane1.addTab("Check Hours", jPanel1);

        txtAdd.setText("0");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        lblAdd.setText("Total Number Add");

        btnAdd.setText("Add New Hours");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Hours", jPanel2);

        btnShowall.setText("Display All Students");
        btnShowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowallActionPerformed(evt);
            }
        });

        btnShowover.setText("Display Over 40 Hours");
        btnShowover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowoverActionPerformed(evt);
            }
        });

        btnBelow.setText("Display Below 40 Hours");
        btnBelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBelowActionPerformed(evt);
            }
        });

        txtShow.setColumns(20);
        txtShow.setRows(5);
        jScrollPane1.setViewportView(txtShow);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnShowall)
                        .addGap(35, 35, 35)
                        .addComponent(btnShowover)
                        .addGap(33, 33, 33)
                        .addComponent(btnBelow)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Students Status", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


}//GEN-LAST:event_txtAddActionPerformed
    
    int c=0;
    String numbers[] = new String[20];
    String [] hours = new String[20];
    String number;
    Date now = new Date ();
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");



    /**
     * this method load data from txt file and storage in array
     */

    public void loadfile (){
        File textFile =new File("volunteer.txt");
        
        FileReader in;
        BufferedReader readFile;
        String lineOfText;
        c=0;  
        
        try{
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while((lineOfText = readFile.readLine())!=null){                
                numbers[c] = lineOfText;
                lineOfText=readFile.readLine();               
                hours[c] = lineOfText;                             
                c++;
            }
            readFile.close();
            in.close();
        }catch (FileNotFoundException e){
            System.out.println("file does not exist");
            System.err.println("fileNotFoundException:  " + e.getMessage());
        }catch (IOException e){
            System.out.println("Problem reading file");
            System.err.println("IOEception:  " + e.getMessage());
        }
    }


    public Volunteer(){
        initComponents();
        loadfile ();
    }
    
   
    /**
    * This method sign up a new account in this program 
    * @param evt 
    */     
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        lblHours.setText("0");
        File f = new File(txtCard.getText()+ ".txt");
        if (f.exists()) {
           JOptionPane.showMessageDialog(null,"Client Already Exists");
        } else {
            try {
                PrintWriter writer = new PrintWriter(txtCard.getText() + ".txt");
                writer.println(formatter.format(now));
                writer.println(txtCard.getText());
                writer.println("0");
                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.err.println("FilenotFoundException:  " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Problem reading file");
                System.err.println("IOException:  " + e.getMessage());
            }
            File file = new File("volunteer.txt");
           
            
            String addhours;
            String adduser;
            java.util.List<String> contents = new ArrayList<String>();
            adduser = txtCard.getText();
            addhours = "0";
            try {
                String textfile = "volunteer";
                FileWriter fw = new FileWriter(textfile, true);

                fw.write("/r/n" + adduser);
                fw.write(addhours + "r/n");
                fw.close();
                contents.add(adduser);
                contents.add("0");
                
                FileUtils.writeLines(file, contents, true);
               
            } catch (IOException e) {}
            JOptionPane.showMessageDialog(null,"Client Added!");
        }  
    }//GEN-LAST:event_btnRegisterActionPerformed


    /**
     * This method check current volunteer status 
     * and display it in the label
     * @param evt 
     */
    private void btnCkeckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCkeckActionPerformed
             lblHours.setText("0");
        
             int flog=0;
             for (int a=0; a<c;a++){               
             String num;
             
             num=txtCard.getText();
            
             if (num.equals(numbers[a])){
                 lblHours.setText(hours[a]);       
                 flog=1;
             }   else {
                 JOptionPane.showMessageDialog(null,"please register a new account ");
             }                
        }
            if(flog==0){
                 JOptionPane.showMessageDialog(null,"please register a new account ");         
        }
    }//GEN-LAST:event_btnCkeckActionPerformed



    /**
     * this method add up new community services hours to this system
     * @param evt 
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
        int add=0;
        loadfile (); 
         
        for (int a=0; a<c; a++){  
          if(txtCard.getText().equals(numbers[a])){
            add=Integer.parseInt(hours[a])+Integer.parseInt(txtAdd.getText());
            hours[a]=Integer.toString(add);
            lblCheck.setText("Your current volunteer hours are "+ Integer.toString(add)+ " hours"); 
          }
        }
          File textOut = new File(txtCard.getText()+".txt");
          FileWriter out;
          BufferedWriter writeFile;
        try{
            out = new FileWriter(textOut,true);
            
            writeFile = new BufferedWriter(out);                              
       
            writeFile.write(formatter.format(now));
            writeFile.newLine();
            writeFile.write(txtAdd.getText());
            writeFile.newLine();
            writeFile.write(Integer.toString(add));
            writeFile.newLine();
            
            writeFile.close();
            out.close();                 
   
        }catch (IOException e){
            System.out.println("problem writing to file");
            System.err.println("IOException :  "+ e.getMessage() );
        }   
        
            for (int b=0; b<c; b++){  
                if(txtCard.getText().equals(numbers[b])){
                hours[b]=Integer.toString(add);               
            }
                
            File textOut2 = new File("volunteer.txt");
            FileWriter out2;
            BufferedWriter writeFile2;         
        try{             
            
            out2 = new FileWriter(textOut2,false);          
            writeFile2 = new BufferedWriter(out2);   
           
            for (int a=0; a<c; a++){ 
            writeFile2.write(numbers[a]);
            writeFile2.newLine();
            writeFile2.write(hours[a]);
            writeFile2.newLine();
            
            System.out.println(numbers[a]);
            System.out.println(hours[a]);
            }
            writeFile2.close();
            out2.close();                 
        
        }catch (IOException e){
            System.out.println("problem writing to file");
            System.err.println("IOException :  "+ e.getMessage() );
       
        }                
        }
    }//GEN-LAST:event_btnAddActionPerformed



    /**
     * this method display student's information
     * @param evt 
     */
    private void btnShowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowallActionPerformed

        loadfile ();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<c;i++){
           sb.append(numbers[i] + "," +hours[i]).append("\n");
        }
         txtShow.setText(sb.toString());  
    
    }//GEN-LAST:event_btnShowallActionPerformed



    /**
     * this method check whether student complete 40 hours
     * @param evt 
     */
    private void btnShowoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowoverActionPerformed
        loadfile ();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<c;i++){
            
             if (Integer.parseInt(hours[i])>=40){                           
             sb.append(numbers[i] + "," +hours[i]).append("\n");
             txtShow.setText(sb.toString());
                              
            }                  
        }       
    }//GEN-LAST:event_btnShowoverActionPerformed

    

    /**
     * this method shows the students who have not complete 40 hours
     * @param evt 
     */
    private void btnBelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBelowActionPerformed
        loadfile ();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<c;i++){
            
             if (Integer.parseInt(hours[i])<=40){                           
             sb.append(numbers[i] + "," +hours[i]).append("\n");
             txtShow.setText(sb.toString());
                              
            }                  
        }       
    }//GEN-LAST:event_btnBelowActionPerformed


 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volunteer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volunteer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBelow;
    private javax.swing.JButton btnCkeck;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnShowall;
    private javax.swing.JButton btnShowover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblCard;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblEx;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblHours;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextArea txtShow;
    // End of variables declaration//GEN-END:variables
}
