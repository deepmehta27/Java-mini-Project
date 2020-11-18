/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author yashm
 */
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
    }
    private String username;
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/signup";
    String user = "root";
    String password ="";

    Connection conn= null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    
    
    public void getData(){
        
        try{
			Class.forName(driverName);			
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
        try
		{
			conn = DriverManager.getConnection(url, user, password);
			ps = conn.prepareStatement("SELECT FirstName, LastName, UserName, emailid from signupdatabase where UserName = '" +  getUsername() + "' ");
			rs = ps.executeQuery();
			while(rs.next())
			{
				FirstName.setText(FirstName.getText() +" " + rs.getString("FirstName"));
				LastName.setText(LastName.getText() +" " + rs.getString("LastName"));
				UserName.setText(UserName.getText() +" " + rs.getString("UserName"));
				emailid.setText(emailid.getText() +" " + rs.getString("emailid"));
			}
		}
		catch(SQLException sqle)
		{
			System.out.println(sqle);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        MainMenuButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        ChangePasswordButton = new javax.swing.JButton();
        emailid = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(756, 0, 0, 0);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 230, 62);

        FirstName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(0, 0, 0));
        FirstName.setText("First Name:     ");
        getContentPane().add(FirstName);
        FirstName.setBounds(50, 130, 310, 23);

        MainMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        MainMenuButton.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\Main.png")); // NOI18N
        MainMenuButton.setBorder(null);
        MainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuButtonMouseClicked(evt);
            }
        });
        getContentPane().add(MainMenuButton);
        MainMenuButton.setBounds(50, 400, 210, 50);

        LastName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(0, 0, 0));
        LastName.setText("Last Name:     ");
        getContentPane().add(LastName);
        LastName.setBounds(50, 190, 340, 23);

        UserName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(0, 0, 0));
        UserName.setText("User Name:     ");
        getContentPane().add(UserName);
        UserName.setBounds(50, 260, 340, 23);

        ChangePasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        ChangePasswordButton.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\ChangePassword.png")); // NOI18N
        ChangePasswordButton.setBorder(null);
        ChangePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordButtonMouseClicked(evt);
            }
        });
        getContentPane().add(ChangePasswordButton);
        ChangePasswordButton.setBounds(460, 400, 200, 50);

        emailid.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        emailid.setForeground(new java.awt.Color(0, 0, 0));
        emailid.setText("Email ID:     ");
        getContentPane().add(emailid);
        emailid.setBounds(50, 330, 350, 23);

        LogOut.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 0, 0));
        LogOut.setText("Log Out");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(610, 110, 90, 19);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\Profile.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuButtonMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.setUsername(getUsername());
        System.out.println(menu.getUsername());
        this.dispose();
        setVisible(false);
    }//GEN-LAST:event_MainMenuButtonMouseClicked

    private void ChangePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordButtonMouseClicked
        ChangePassword change = new ChangePassword();
        change.setVisible(true);
        change.setUsername(getUsername());
        this.dispose();
    }//GEN-LAST:event_ChangePasswordButtonMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        JOptionPane.showMessageDialog(null, "Do you want to Log Out?");
        LoginPage page = new LoginPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePasswordButton;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}