/*
SwingAreaCalculator.java
By: William Lin
This program is a Swing GUI that allows user to select what shape they want to have
the area calculated. And then the program takes the user inputted values
to calculate the area of the specific shape.
*/
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class SwingAreaCalculator extends javax.swing.JFrame {

    /**
     * Creates new form SwingAreaCalculator
     */
    public SwingAreaCalculator() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        circle = new javax.swing.JRadioButton();
        rectangle = new javax.swing.JRadioButton();
        triangle = new javax.swing.JRadioButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        dim1 = new javax.swing.JTextField();
        dim2 = new javax.swing.JTextField();
        areaBtn = new javax.swing.JButton();
        ansLabel = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clearMenu = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(circle);
        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rectangle);
        rectangle.setText("Rectangle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        buttonGroup1.add(triangle);
        triangle.setText("Triangle");
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });

        label1.setText("Dimension 1:");

        label2.setText("Dimension 2:");

        dim1.setPreferredSize(new java.awt.Dimension(60, 25));

        dim2.setMinimumSize(new java.awt.Dimension(6, 25));
        dim2.setPreferredSize(new java.awt.Dimension(60, 25));

        areaBtn.setText("Calculate Area");
        areaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaBtnActionPerformed(evt);
            }
        });

        ansLabel.setText("The area is:");

        jLabel1.setText("units");

        jLabel2.setText("units");

        clearMenu.setText("Clear");
        clearMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(clearMenu);

        exitMenu.setText("Exit");
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(areaBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(circle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rectangle)
                        .addGap(9, 9, 9)
                        .addComponent(triangle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ansLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circle)
                    .addComponent(rectangle)
                    .addComponent(triangle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dim1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dim2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansLabel)
                    .addComponent(ans))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dim2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        // TODO add your handling code here:
        label1.setText("Radius:");
        label2.setText("N/A:");
        dim2.setEnabled(false);
    }//GEN-LAST:event_circleActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        // TODO add your handling code here:
        label1.setText("Length:");
        label2.setText("Height:");
        dim2.setEnabled(true);
    }//GEN-LAST:event_rectangleActionPerformed
    
    /*
    This method controls what happens when the Calculate Area button is clicked.
    it checks for which radio button is selected and uses that info to proceed to 
    calculate the area of each certain shape.
    */
    private void areaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaBtnActionPerformed
        // TODO add your handling code here:
        if(circle.isSelected()){
            double radius = Double.parseDouble(dim1.getText());
            ans.setText(String.valueOf(Math.PI * Math.pow(radius, 2)));
        }
        else if(rectangle.isSelected()){
            double length = Double.parseDouble(dim1.getText());
            double width = Double.parseDouble(dim2.getText());
            ans.setText(String.valueOf(length * width));
        }
        else if(triangle.isSelected()){
            double base = Double.parseDouble(dim1.getText());
            double height = Double.parseDouble(dim2.getText());
            ans.setText(String.valueOf(.5*base*height));
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a shape");
        }
    }//GEN-LAST:event_areaBtnActionPerformed

    //This method controls what happens when triangle radio button is clicked/selected.
    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
        // TODO add your handling code here:
        label1.setText("Base:");
        label2.setText("Height:");
        dim2.setEnabled(true);
    }//GEN-LAST:event_triangleActionPerformed
    
    //This method ends the whole program/
    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMenuMouseClicked
    
   
    //This method clears the text boxes and the answer label when clear is clicked
    private void clearMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMenuMouseClicked
        dim1.setText(null);
        dim2.setText(null);
        ans.setText(null);
    }//GEN-LAST:event_clearMenuMouseClicked

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
            java.util.logging.Logger.getLogger(SwingAreaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingAreaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingAreaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingAreaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingAreaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JLabel ansLabel;
    private javax.swing.JButton areaBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton circle;
    private javax.swing.JMenu clearMenu;
    private javax.swing.JTextField dim1;
    private javax.swing.JTextField dim2;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JRadioButton rectangle;
    private javax.swing.JRadioButton triangle;
    // End of variables declaration//GEN-END:variables
}