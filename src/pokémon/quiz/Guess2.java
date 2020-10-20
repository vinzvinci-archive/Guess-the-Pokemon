
package pokémon.quiz;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Guess2 extends javax.swing.JFrame {
    public Guess2() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblResults.hide();
        btnWrong1.hide();
        btnWrong2.hide();
        btnWrong3.hide();
        btnCorrect.hide();
        lblOptions.hide();
        btnNext.hide();
        lblTips.hide();
        lblTips1.hide();
        lblTips2.hide();
    }
    int life = 3;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnWrong1 = new javax.swing.JButton();
        btnWrong2 = new javax.swing.JButton();
        btnCorrect = new javax.swing.JButton();
        lblOptions = new javax.swing.JLabel();
        lblTips = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTimer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Life1 = new javax.swing.JLabel();
        Life = new javax.swing.JLabel();
        lblTips1 = new javax.swing.JLabel();
        lblTips2 = new javax.swing.JLabel();
        lblResults = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblBeg = new javax.swing.JLabel();
        btnWrong3 = new javax.swing.JButton();
        lblTen = new javax.swing.JLabel();
        lblTenGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(0, 0, 0));
        btnStart.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 255, 0));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 240, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWrong1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnWrong1.setText("Vileplume");
        btnWrong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWrong1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnWrong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 140, -1));

        btnWrong2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnWrong2.setText("Moormo");
        btnWrong2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWrong2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnWrong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 140, -1));

        btnCorrect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCorrect.setText("Tentacool");
        btnCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrectActionPerformed(evt);
            }
        });
        jPanel2.add(btnCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 140, -1));

        lblOptions.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblOptions.setText("Choose your answer");
        jPanel2.add(lblOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        lblTips.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTips.setText("Tips:");
        jPanel2.add(lblTips, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Life:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTimer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 0, 0));
        lblTimer.setText("10");
        lblTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lblTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Timer");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 70, 70));

        Life1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon/quiz/Life.png"))); // NOI18N
        jPanel3.add(Life1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 20));

        Life.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Life.setForeground(new java.awt.Color(255, 0, 0));
        Life.setText("3");
        jPanel3.add(Life, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        lblTips1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTips1.setText("A Pokémon that lives underground. Because of its dark");
        jPanel2.add(lblTips1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        lblTips2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTips2.setText("habitat, it is repelled by bright sunlight.");
        jPanel2.add(lblTips2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lblResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResults.setText("Results");
        jPanel2.add(lblResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 255, 0));
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 110, -1));

        lblBeg.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblBeg.setForeground(new java.awt.Color(51, 51, 255));
        lblBeg.setText("CLICK START TO BEGIN");
        jPanel2.add(lblBeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnWrong3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnWrong3.setText("Gengar");
        btnWrong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWrong3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnWrong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 520, 640));

        lblTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon/quiz/PokemonTentacool.jpg"))); // NOI18N
        jPanel1.add(lblTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTenGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon/quiz/PokemonTentacoolgif.gif"))); // NOI18N
        lblTenGif.setText("jLabel1");
        jPanel1.add(lblTenGif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i=10;
        Timer start = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        i--;
         if (i>=0)
            lblTimer.setText(""+i);       
         if (i==0) {
             Gameover me = new Gameover();
             me.setVisible(true);
             dispose();  
            }       
        }
        });
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        start.start();
        btnStart.hide();
        lblBeg.hide();
        btnWrong1.show();
        btnWrong2.show();
        btnWrong3.show();
        btnCorrect.show();
        lblOptions.show();
        lblTips.show();
        lblTips1.show();
        lblTips2.show();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnWrong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWrong1ActionPerformed
        lblResults.show();
        lblResults.setText("Vileplume is wrong!");
        btnWrong1.setEnabled(false);
        life--;
        Life.setText("" + life);
        if (life==0) {
            Gameover me = new Gameover();
            me.setVisible(true);
            dispose();
            start.stop();
        }
    }//GEN-LAST:event_btnWrong1ActionPerformed

    private void btnWrong2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWrong2ActionPerformed
        lblResults.show();
        lblResults.setText("Moormo is wrong!");
        btnWrong2.setEnabled(false);
        life--;
        Life.setText("" + life);
        if (life==0) {
            Gameover me = new Gameover();
            me.setVisible(true);
            dispose();
            start.stop();
        }
    }//GEN-LAST:event_btnWrong2ActionPerformed

    private void btnCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrectActionPerformed
        start.stop();
        lblTen.hide();
        lblTenGif.show();
        ImageIcon icon = (ImageIcon) lblTenGif.getIcon();
        Image img = icon.getImage();
        ImageIcon newIcon = new ImageIcon(img);
        img.flush();
        lblTenGif.setIcon(newIcon);
        lblResults.show();
        lblResults.setText("Tentacool is correct!");
        btnWrong1.setEnabled(false);
        btnWrong2.setEnabled(false);
        btnWrong3.setEnabled(false);
        btnCorrect.setEnabled(false);
        btnNext.show();
    }//GEN-LAST:event_btnCorrectActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Guess3 start = new Guess3();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnWrong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWrong3ActionPerformed
        lblResults.show();
        lblResults.setText("Gengar is wrong!");
        btnWrong3.setEnabled(false);
        life--;
        Life.setText("" + life);
        if (life==0) {
            Gameover me = new Gameover();
            me.setVisible(true);
            dispose();
            start.stop();
        }
    }//GEN-LAST:event_btnWrong3ActionPerformed

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
            java.util.logging.Logger.getLogger(Guess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guess2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Life;
    private javax.swing.JLabel Life1;
    private javax.swing.JButton btnCorrect;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnWrong1;
    private javax.swing.JButton btnWrong2;
    private javax.swing.JButton btnWrong3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBeg;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTenGif;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel lblTips;
    private javax.swing.JLabel lblTips1;
    private javax.swing.JLabel lblTips2;
    // End of variables declaration//GEN-END:variables
}
