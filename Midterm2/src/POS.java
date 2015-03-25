/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class POS extends javax.swing.JApplet {

    /**
     * Initializes the applet POS
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        item1 = new javax.swing.JCheckBox();
        item2 = new javax.swing.JCheckBox();
        item3 = new javax.swing.JCheckBox();
        item4 = new javax.swing.JCheckBox();
        item5 = new javax.swing.JCheckBox();
        item6 = new javax.swing.JCheckBox();
        ground = new javax.swing.JRadioButton();
        air = new javax.swing.JRadioButton();
        fedex = new javax.swing.JRadioButton();
        with = new javax.swing.JButton();
        without = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextPane();

        item1.setText("Webcam - $50");

        item2.setText("Mouse - $20");

        item3.setText("Keyboard - $25");

        item4.setText("Printer - $120");

        item5.setText("Headphones - $20");

        item6.setText("Speakers - $60");

        buttonGroup1.add(ground);
        ground.setSelected(true);
        ground.setText("Ground - 5%");

        buttonGroup1.add(air);
        air.setText("Air - 10%");

        buttonGroup1.add(fedex);
        fedex.setText("FedEx - 20%");

        with.setText("With Shipping");

        without.setText("Without Shpping");
        without.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Computer - $300");

        jLabel2.setText("Add-ons:");

        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(with)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(without))
                            .addComponent(item1)
                            .addComponent(item2)
                            .addComponent(item3)
                            .addComponent(item4)
                            .addComponent(item5)
                            .addComponent(item6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ground)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(air)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fedex))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 297, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(item6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ground)
                    .addComponent(air)
                    .addComponent(fedex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(with)
                    .addComponent(without))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void withoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutActionPerformed
        String str = "Qty 1: " + "$" + Double.toString(calculateCost(1, false)) + "\n";
        for(int i = 100; i <= 1000; i = i + 100){
            str = str.concat("Qty "+ i + ": " + "$" + Double.toString(calculateCost(i, false)) + "\n");
        }
        output.setText(str);
    }//GEN-LAST:event_withoutActionPerformed
    
    public double calculateCost(){
        double cost = 300;
        if(item1.isSelected()){
            cost = cost + 50;
        }
        if(item2.isSelected()){
            cost = cost + 20;
        }
        if(item3.isSelected()){
            cost = cost + 25;
        }
        if(item4.isSelected()){
            cost = cost + 120;
        }
        if(item5.isSelected()){
            cost = cost + 20;
        }
        if(item6.isSelected()){
            cost = cost + 60;
        }
        return(cost);
    }
    
    public double calculateCost(int qty, boolean ship){
        double costPerUnit = calculateCost();
        double shipping = 0;
        if(ship == true){
            if(ground.isSelected()){
                shipping = 1.05;
            }
            if(air.isSelected()){
                shipping = 1.1;
            }
            if(fedex.isSelected()){
                shipping = 1.2;
            }
            return(getDiscountPackage(qty) * shipping);
        }
        else{
            return(getDiscountPackage(qty));
        }
    }
    
    public double getDiscountPackage(int qty){
        double costPerUnit = calculateCost();
        double discount = 0;
        int i = 199;
        while(i <= qty){
            discount = discount + .01;
            i = i + 100;
        }
        return(costPerUnit * qty * (1 - discount));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton air;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fedex;
    private javax.swing.JRadioButton ground;
    private javax.swing.JCheckBox item1;
    private javax.swing.JCheckBox item2;
    private javax.swing.JCheckBox item3;
    private javax.swing.JCheckBox item4;
    private javax.swing.JCheckBox item5;
    private javax.swing.JCheckBox item6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane output;
    private javax.swing.JButton with;
    private javax.swing.JButton without;
    // End of variables declaration//GEN-END:variables
}
