/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.tea;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 30310250
 */
public class TIC extends javax.swing.JFrame {
    private String startGame = "x";
    private int xCount =0;
    private int oCount =0;

    /**
     * Creates new form TIC
     */
    public TIC() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
private void gameScore()
   {
    jblplayex.setText(String.valueOf(xCount));
    jblplayero.setText(String.valueOf(oCount));
    }
private void choose_a_player(){
    if (startGame.equalsIgnoreCase("x"))
    {
        startGame="o";
    }
    else  
    {
        startGame="x";
    }
    
    
}
     
private void winningGame()
{
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
     String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
     String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    
    if (b1 == ("x") && b2 == ("x") && b3 ==("x")){
        JOptionPane.showMessageDialog(this,"NAHOM WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
         jButton3.setBackground(Color.YELLOW);
    }
    if (b4 == ("x") && b5 == ("x") && b6 ==("x")){
        JOptionPane.showMessageDialog(this,"NAHOM WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
         jButton6.setBackground(Color.CYAN);
    }
    if (b7 == ("x") && b8 == ("x") && b9 ==("x")){
        JOptionPane.showMessageDialog(this,"NAHOM WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
         jButton9.setBackground(Color.CYAN);
         
    }
    
    if (b1 == ("x") && b4 == ("x") && b7 ==("x")){
        JOptionPane.showMessageDialog(this,"Nahom WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton1.setBackground(Color.MAGENTA);
        jButton4.setBackground(Color.MAGENTA);
         jButton7.setBackground(Color.MAGENTA);
    }
    
    if (b2 == ("x") && b5 == ("x") && b8 ==("x")){
        JOptionPane.showMessageDialog(this,"Nahom WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton2.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
         jButton8.setBackground(Color.PINK);
    }
     if (b3 == ("x") && b6 == ("x") && b9 ==("x")){
        JOptionPane.showMessageDialog(this,"Nahom WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton3.setBackground(Color.MAGENTA);
        jButton6.setBackground(Color.MAGENTA);
         jButton9.setBackground(Color.MAGENTA);
    }
      if (b1 == ("x") && b5 == ("x") && b9 ==("x")){
        JOptionPane.showMessageDialog(this,"Nahom WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton1.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
    }
      if (b3 == ("x") && b5 == ("x") && b7 ==("x")){
        JOptionPane.showMessageDialog(this,"Nahom  WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       xCount++;
       gameScore();
       jButton3.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
         jButton7.setBackground(Color.CYAN);
    }
      ////////////// I STARTED FOR THE NEXT ONE FROM HERE OOO
      
      
        else if (b1 == ("O") && b2 == ("0") && b3 ==("0")){
        JOptionPane.showMessageDialog(this,"Fili WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
         jButton3.setBackground(Color.YELLOW);
    }
        else if (b4 == ("o") && b5 == ("o") && b6 ==("o")){
        JOptionPane.showMessageDialog(this,"FILMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton4.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
         jButton6.setBackground(Color.CYAN);
    }
        else if (b7 == ("o") && b8 == ("o") && b9 ==("o")){
        JOptionPane.showMessageDialog(this,"FILMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton7.setBackground(Color.CYAN);
        jButton8.setBackground(Color.CYAN);
         jButton9.setBackground(Color.CYAN);
         
    }
    
        else if (b1 == ("o") && b4 == ("0") && b7 ==("0")){
        JOptionPane.showMessageDialog(this,"FILMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton1.setBackground(Color.MAGENTA);
        jButton4.setBackground(Color.MAGENTA);
         jButton7.setBackground(Color.MAGENTA);
    }
    
        else if (b2 == ("o") && b5 == ("o") && b8 ==("o")){
        JOptionPane.showMessageDialog(this,"FILMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton2.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
         jButton8.setBackground(Color.PINK);
    }
        else if (b3 == ("o") && b6 == ("o") && b9 ==("o")){
        JOptionPane.showMessageDialog(this,"FILIMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton3.setBackground(Color.MAGENTA);
        jButton6.setBackground(Color.MAGENTA);
         jButton9.setBackground(Color.MAGENTA);
    }
        else if (b1 == ("o") && b5 == ("o") && b9 ==("o")){
        JOptionPane.showMessageDialog(this,"FILMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton1.setBackground(Color.PINK);
        jButton5.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
    }
        else  if (b3 == ("o") && b5 == ("o") && b7 ==("o")){
        JOptionPane.showMessageDialog(this,"FILIMON WON ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       oCount++;
       gameScore();
       jButton3.setBackground(Color.CYAN);
        jButton5.setBackground(Color.CYAN);
         jButton7.setBackground(Color.CYAN);
    }
      
      
    {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jblplayex = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jblplayero = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButtonreset = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("              TIC TAC TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 98)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 98)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PLAYER X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jblplayex.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jblplayex.setText("      ");
        jPanel7.add(jblplayex, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER O:");
        jPanel13.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jblplayero.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jblplayero.setText("       ");
        jPanel14.add(jblplayero, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButtonreset.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButtonreset.setText("Reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        jPanel20.add(jButtonreset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jButtonexit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButtonexit.setText("Exit");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonexit);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ", " Tic Tac Toe",
        JOptionPane.YES_NO_OPTION  ) == JOptionPane.YES_NO_OPTION );
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton1.setForeground(Color.GREEN);
    }
    else
    {
        jButton1.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            jButton2.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton2.setForeground(Color.GREEN);
    }
    else 
    {
        jButton2.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            jButton3.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton3.setForeground(Color.GREEN);
    }
    else 
    {
        jButton3.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            jButton4.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton4.setForeground(Color.GREEN);
    }
    else 
    {
        jButton4.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            jButton5.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton5.setForeground(Color.GREEN);
    }
    else 
    {
        jButton5.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            jButton6.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton6.setForeground(Color.GREEN);
    }
    else 
    {
        jButton6.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
            jButton7.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton7.setForeground(Color.GREEN);
    }
    else 
    {
        jButton7.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            jButton8.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton8.setForeground(Color.GREEN);
    }
    else 
    {
        jButton8.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
            jButton9.setText(startGame);
    if (startGame.equalsIgnoreCase("x"))
    {
       jButton9.setForeground(Color.GREEN);
    }
    else 
    {
        jButton9.setForeground(Color.BLUE);
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButtonresetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jblplayero;
    private javax.swing.JLabel jblplayex;
    // End of variables declaration//GEN-END:variables
}
