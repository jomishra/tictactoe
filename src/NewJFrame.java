
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * start from here.
 */

/**
 *
 * @author Vineet
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int turn = 2;
    int buttonused[] = {0,0,0,0,0,0,0,0,0};
    
    int  p1won[] = {0,0,0,0,0,0,0,0,0};
    int  p2won[] = {0,0,0,0,0,0,0,0,0};
    
    int p1won()
    {
        if(p1won[0]==1 && p1won[1]==1 && p1won[2]==1)
        {
            return 1;
        }
        if(p1won[3]==1 && p1won[4]==1 && p1won[5]==1)
        {
            return 1;
        }
        if(p1won[6]==1 && p1won[7]==1 && p1won[8]==1)
        {
            return 1;
        }
        if(p1won[0]==1 && p1won[3]==1 && p1won[6]==1)
        {
            return 1;
        }
        if(p1won[1]==1 && p1won[4]==1 && p1won[7]==1)
        {
            return 1;
        }
        if(p1won[2]==1 && p1won[5]==1 && p1won[8]==1)
        {
            return 1;
        }
        if(p1won[2]==1 && p1won[4]==1 && p1won[6]==1)
        {
            return 1;
        }
        if(p1won[0]==1 && p1won[4]==1 && p1won[8]==1)
        {
            return 1;
        }
        return 0;
    }
    
    int p2won()
    {
        if(p2won[0]==1 && p2won[1]==1 && p2won[2]==1)
        {
            return 1;
        }
        if(p2won[3]==1 && p2won[4]==1 && p2won[5]==1)
        {
            return 1;
        }
        if(p2won[6]==1 && p2won[7]==1 && p2won[8]==1)
        {
            return 1;
        }
        if(p2won[0]==1 && p2won[3]==1 && p2won[6]==1)
        {
            return 1;
        }
        if(p2won[1]==1 && p2won[4]==1 && p2won[7]==1)
        {
            return 1;
        }
        if(p2won[2]==1 && p2won[5]==1 && p2won[8]==1)
        {
            return 1;
        }
        if(p2won[2]==1 && p2won[4]==1 && p2won[6]==1)
        {
            return 1;
        }
        if(p2won[0]==1 && p2won[4]==1 && p2won[8]==1)
        {
            return 1;
        }
        return 0;
    }
     
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reset.setText("Play Again");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        
        if(buttonused[0]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b1.setText("X");
                buttonused[0] = 1;
                p1won[0]=1;
                
                int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b1.setText("O");
                buttonused[0] = 1;
                p2won[0]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        
        if(buttonused[3]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b4.setText("X");
                buttonused[3] = 1;
                p1won[3]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b4.setText("O");
                buttonused[3] = 1;
                p2won[3]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        turn = 2;
        
        for(int i=0; i<9; i++)
        {
            buttonused[i]=0;
        }
        
        for(int i=0; i<9; i++)
        {
            p1won[i]=0;
        }
        
        for(int i=0; i<9; i++)
        {
            p2won[i]=0;
        }
    }//GEN-LAST:event_resetActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b2.setText("X");
                buttonused[1] = 1;
                p1won[1]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b2.setText("O");
                buttonused[1] = 1;
                p2won[1]=1;
                
                int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b3.setText("X");
                buttonused[2] = 1;
                p1won[2]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b3.setText("O");
                buttonused[2] = 1;
                p2won[2]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b5.setText("X");
                buttonused[4] = 1;
                p1won[4]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b5.setText("O");
                buttonused[4] = 1;
                p2won[4]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b6.setText("X");
                buttonused[5] = 1;
                p1won[5]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b6.setText("O");
                buttonused[5] = 1;
                p2won[5]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b7.setText("X");
                buttonused[6] = 1;
                p1won[6]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b7.setText("O");
                buttonused[6] = 1;
                p2won[6]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b8.setText("X");
                buttonused[7] = 1;
                p1won[7]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b8.setText("O");
                buttonused[7] = 1;
                p2won[7]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8]==0)
        {
            if(turn % 2 == 0)
            {
                turn++;
                b9.setText("X");
                buttonused[8] = 1;
                p1won[8]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
            else
            {
                turn++;
                b9.setText("O");
                buttonused[8] = 1;
                p2won[8]=1;
                
                 int result1 = p1won();
                int result2 = p2won();
                
                if(result1 == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "**Player 1 has won **");
                }
                else if(result2 == 1)
                {
                     JOptionPane.showMessageDialog(rootPane, "**Player 2 has won **");
                }
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "!This button is used Already !");
        }
    }//GEN-LAST:event_b9ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
    //end here
    //end here too
}
