
package com.travel;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Splash extends javax.swing.JFrame {
   static Thread t = new Thread();

    public Splash() throws InterruptedException {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        setVisible(true);
        
        for(int i=1;i<=3;i++)
        {
        t.sleep(1000);}
         LoginPage pg  = new LoginPage();
        
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(550, 450));

        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Users\\DELL\\Documents\\NetBeansProjects\\Travelagency\\images\\Splash.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                try {
                    new Splash().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the t
     */
    public static Thread getT() {
        return t;
    }

    /**
     * @param aT the t to set
     */
    public static void setT(Thread aT) {
        t = aT;
    }
}
