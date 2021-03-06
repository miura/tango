/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tango.util;

import javax.swing.SwingUtilities;

/**
 *
 * @author jean
 */
public class Progressor extends javax.swing.JFrame {

    int nbSteps;
    int currentStep;

    public Progressor() {
        initComponents();
    }

    public synchronized void setAction(String action) {
        this.currentAction.setText(action);
        this.repaint();
        System.out.println("progressor action:" + action);
    }

    public synchronized void resetProgress(int nbSteps) {
        this.nbSteps = nbSteps;
        this.currentStep = -1;
        incrementStep();
    }

    /*
     * public synchronized void incrementStep() { this.currentStep++;
     * this.currentProgress.setText(currentStep+" / "+nbSteps); this.repaint();
     * System.out.println("progressor increment:"+currentStep); }
     *
     */
    public synchronized void incrementStep() {
        //SwingUtilities.invokeLater(new Runnable() {
        //       public void run() {
        currentStep++;
        currentProgress.setText((currentStep + 1) + " / " + nbSteps);
        repaint();
        //System.out.println("progressor increment:"+currentStep);
        //      }
        // });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentActionLabel = new javax.swing.JLabel();
        currentAction = new javax.swing.JLabel();
        currentProgressLabel = new javax.swing.JLabel();
        currentProgress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        currentActionLabel.setText("Current Action :");

        currentAction.setText("action");

        currentProgressLabel.setText("Progress :");

        currentProgress.setText("0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentActionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(currentAction))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentProgressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentProgress)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(currentAction))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentActionLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentProgressLabel)
                    .addComponent(currentProgress))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Progressor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Progressor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Progressor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Progressor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Progressor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentAction;
    private javax.swing.JLabel currentActionLabel;
    private javax.swing.JLabel currentProgress;
    private javax.swing.JLabel currentProgressLabel;
    // End of variables declaration//GEN-END:variables
}
