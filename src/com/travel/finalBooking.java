/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;

import com.model.dbaseAccount;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.reflect.Array.set;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class finalBooking extends javax.swing.JFrame {
ResultSet rs;
    double totalfare;
    int op;//will use it in insert function
    Vector v1;//will use it in insert function
    /**
     * Creates new form finalBooking
     */
    public finalBooking() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        returnjpanel.setVisible(false);
        setVisible(true);
        setResizable(false);
    }
    
    
    
    public  void flightdetails(Vector v,int option) throws SQLException
    {
        String code,code1,departtime = null,departfare = null,returntime = null,returnfare = null;
       
       op = option;
       v1 =v;
        code = String.valueOf(v.get(3));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba.finaldepart(code); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                departtime = rs.getString("departtime");
                departfare = rs.getString("fare");
            }                            
               
       
       lbldepartureflight.setText(String.valueOf(v.get(0)) +" to  "+ String.valueOf(v.get(1)));
       
       lbldepartflightcode.setText(lbldepartflightcode.getText() +" " + String.valueOf(v.get(3)) );
      
       DateFormat df = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lbldepartflightdate.setText(lbldepartflightdate.getText() +" " + String.valueOf(df.format( v.get(2))) );
       
    
        
      lbldepartflighttime.setText(lbldepartflighttime.getText() +" " + departtime  );
      lbldepartfare.setText(lbldepartfare.getText() +" " + departfare  );
      totalfare = 1.12 * (Integer.parseInt(departfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
      
    
     if (option ==2) //fetching additional data for return
    {
        returnjpanel.setVisible(true);
         code1 = String.valueOf(v.get(5));//we have passed flight code in index 3 of vector
        
        // now to get deart time and fare for selected flight
        dbaseAccount dba1 = new dbaseAccount(); //this is our class in com.model
                try {
                    rs = dba1.finalreturn(code1); //calling function from database
                                                           
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(flightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            rs.beforeFirst();
            while (rs.next()== true)
            {           
                
                returntime = rs.getString("departtime");
                returnfare = rs.getString("fare");
            }     
            
            lblreturnflight.setText(String.valueOf(v.get(1)) +" to  "+ String.valueOf(v.get(0)));
       
       lblreturnflightcode.setText(lblreturnflightcode.getText() +" " + String.valueOf(v.get(5)) );
      
       DateFormat df1 = new  SimpleDateFormat("dd-MM-yyyy");//if we dont do this, system will display the current time also
       lblreturnflightdate.setText(lblreturnflightdate.getText() +" " + String.valueOf(df1.format( v.get(4))) );
       
    
        
      lblreturnflighttime.setText(lblreturnflighttime.getText() +" " + returntime  );
      lblreturnfare.setText(lblreturnfare.getText()+ " " + returnfare  );
      lbltotalfare.setText(" ");
      totalfare = 1.12 * ( totalfare + Integer.parseInt(returnfare));
      lbltotalfare.setText(lbltotalfare.getText() +" " + totalfare  );
    
    
    }
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
        jPanel1 = new javax.swing.JPanel();
        lbldepartureflight = new javax.swing.JLabel();
        lbldepartflightcode = new javax.swing.JLabel();
        lbldepartflightdate = new javax.swing.JLabel();
        lbldepartflighttime = new javax.swing.JLabel();
        lbldepartfare = new javax.swing.JLabel();
        returnjpanel = new javax.swing.JPanel();
        lblreturnflight = new javax.swing.JLabel();
        lblreturnflightcode = new javax.swing.JLabel();
        lblreturnflightdate = new javax.swing.JLabel();
        lblreturnflighttime = new javax.swing.JLabel();
        lblreturnfare = new javax.swing.JLabel();
        lbltotalfare = new javax.swing.JLabel();
        buttoncomplete = new javax.swing.JButton();
        cmbsalutation = new javax.swing.JComboBox<>();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(877, 595));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Salutation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 150, 80, 19);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 190, 87, 19);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 230, 86, 19);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mobile No.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 330, 90, 19);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbldepartureflight.setBackground(new java.awt.Color(0, 0, 0));
        lbldepartureflight.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbldepartureflight.setForeground(new java.awt.Color(0, 0, 0));
        lbldepartureflight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbldepartureflight.setText("Flight:");

        lbldepartflightcode.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbldepartflightcode.setForeground(new java.awt.Color(0, 0, 0));
        lbldepartflightcode.setText("Flight code:");

        lbldepartflightdate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbldepartflightdate.setForeground(new java.awt.Color(0, 0, 0));
        lbldepartflightdate.setText("Depature date:");

        lbldepartflighttime.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbldepartflighttime.setForeground(new java.awt.Color(0, 0, 0));
        lbldepartflighttime.setText("Depature time:");

        lbldepartfare.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbldepartfare.setForeground(new java.awt.Color(0, 0, 0));
        lbldepartfare.setText("Fare:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldepartflightdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldepartflighttime, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldepartureflight, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldepartfare, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(lbldepartflightcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbldepartureflight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbldepartflightcode)
                .addGap(48, 48, 48)
                .addComponent(lbldepartflightdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lbldepartflighttime)
                .addGap(53, 53, 53)
                .addComponent(lbldepartfare)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 150, 250, 370);

        returnjpanel.setBackground(new java.awt.Color(255, 255, 255));

        lblreturnflight.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblreturnflight.setForeground(new java.awt.Color(0, 0, 0));
        lblreturnflight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblreturnflight.setText("Flight:");

        lblreturnflightcode.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblreturnflightcode.setForeground(new java.awt.Color(0, 0, 0));
        lblreturnflightcode.setText("Flight code:");

        lblreturnflightdate.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblreturnflightdate.setForeground(new java.awt.Color(0, 0, 0));
        lblreturnflightdate.setText("Return date:");

        lblreturnflighttime.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblreturnflighttime.setForeground(new java.awt.Color(0, 0, 0));
        lblreturnflighttime.setText("Return time:");

        lblreturnfare.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblreturnfare.setForeground(new java.awt.Color(0, 0, 0));
        lblreturnfare.setText("Fare:");

        javax.swing.GroupLayout returnjpanelLayout = new javax.swing.GroupLayout(returnjpanel);
        returnjpanel.setLayout(returnjpanelLayout);
        returnjpanelLayout.setHorizontalGroup(
            returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnjpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblreturnflight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblreturnflightcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblreturnflightdate, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(lblreturnfare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblreturnflighttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        returnjpanelLayout.setVerticalGroup(
            returnjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnjpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblreturnflight)
                .addGap(46, 46, 46)
                .addComponent(lblreturnflightcode)
                .addGap(52, 52, 52)
                .addComponent(lblreturnflightdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(lblreturnflighttime)
                .addGap(53, 53, 53)
                .addComponent(lblreturnfare)
                .addGap(22, 22, 22))
        );

        getContentPane().add(returnjpanel);
        returnjpanel.setBounds(310, 150, 250, 370);

        lbltotalfare.setBackground(new java.awt.Color(153, 153, 153));
        lbltotalfare.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbltotalfare.setForeground(new java.awt.Color(0, 0, 0));
        lbltotalfare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotalfare.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lbltotalfare);
        lbltotalfare.setBounds(660, 420, 120, 30);

        buttoncomplete.setBackground(new java.awt.Color(255, 255, 255));
        buttoncomplete.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\confirm.png")); // NOI18N
        buttoncomplete.setBorder(null);
        buttoncomplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttoncompleteMouseClicked(evt);
            }
        });
        buttoncomplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncompleteActionPerformed(evt);
            }
        });
        getContentPane().add(buttoncomplete);
        buttoncomplete.setBounds(630, 490, 190, 60);

        cmbsalutation.setBackground(new java.awt.Color(255, 255, 255));
        cmbsalutation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Other" }));
        getContentPane().add(cmbsalutation);
        cmbsalutation.setBounds(690, 150, 70, 22);

        txtfirstname.setBackground(new java.awt.Color(255, 255, 255));
        txtfirstname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtfirstname);
        txtfirstname.setBounds(690, 190, 151, 22);

        txtlastname.setBackground(new java.awt.Color(255, 255, 255));
        txtlastname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtlastname);
        txtlastname.setBounds(690, 230, 150, 22);

        txtcontact.setBackground(new java.awt.Color(255, 255, 255));
        txtcontact.setForeground(new java.awt.Color(0, 0, 0));
        txtcontact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontact);
        txtcontact.setBounds(690, 330, 150, 22);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 280, 60, 22);

        txtEmailid.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailid.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtEmailid);
        txtEmailid.setBounds(690, 280, 150, 22);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONFIRM BOOKING");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 20, 720, 50);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Flight Details");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 100, 220, 40);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Flight Details");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 100, 230, 40);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Passenger Details");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(590, 106, 250, 30);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TOTAL FARE (INCLUDING 12% GST):");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 380, 260, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\finalbooking.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 870, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncompleteActionPerformed

    private void buttoncompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttoncompleteMouseClicked
       int x=0;
       dbaseAccount dba2 = new dbaseAccount();
        try {
            //we need to pass all data as string
            x = dba2.insertdata(String.valueOf( v1.get(0)),String.valueOf(v1.get(1)),
                    String.valueOf(v1.get(3)),String.valueOf(v1.get(5)),totalfare, String.valueOf(cmbsalutation.getSelectedItem()), 
                    txtfirstname.getText(), txtlastname.getText(),txtcontact.getText(),txtEmailid.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(finalBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (x != 0 )
        JOptionPane.showMessageDialog(null,"THANKS FOR BOOKING");
        else
          JOptionPane.showMessageDialog(null, "INAVLID DETAILS");
        this.dispose();
    }//GEN-LAST:event_buttoncompleteMouseClicked

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

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
            java.util.logging.Logger.getLogger(finalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoncomplete;
    private javax.swing.JComboBox<String> cmbsalutation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldepartfare;
    private javax.swing.JLabel lbldepartflightcode;
    private javax.swing.JLabel lbldepartflightdate;
    private javax.swing.JLabel lbldepartflighttime;
    private javax.swing.JLabel lbldepartureflight;
    private javax.swing.JLabel lblreturnfare;
    private javax.swing.JLabel lblreturnflight;
    private javax.swing.JLabel lblreturnflightcode;
    private javax.swing.JLabel lblreturnflightdate;
    private javax.swing.JLabel lblreturnflighttime;
    private javax.swing.JLabel lbltotalfare;
    private javax.swing.JPanel returnjpanel;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    // End of variables declaration//GEN-END:variables
}
