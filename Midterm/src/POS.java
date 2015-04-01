
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
        Items = new javax.swing.JLabel();
        processor = new javax.swing.JCheckBox();
        motherboard = new javax.swing.JCheckBox();
        ram = new javax.swing.JCheckBox();
        psu = new javax.swing.JCheckBox();
        pcCase = new javax.swing.JCheckBox();
        harddrive = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        total4 = new javax.swing.JLabel();
        total5 = new javax.swing.JLabel();
        total6 = new javax.swing.JLabel();
        calsub = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        ground = new javax.swing.JCheckBox();
        air = new javax.swing.JCheckBox();
        fedex = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        shipping = new javax.swing.JLabel();
        overallTotal = new javax.swing.JButton();
        qty1 = new javax.swing.JTextField();
        qty2 = new javax.swing.JTextField();
        qty3 = new javax.swing.JTextField();
        qty4 = new javax.swing.JTextField();
        qty5 = new javax.swing.JTextField();
        qty6 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuTitle = new javax.swing.JMenu();
        ResetOption = new javax.swing.JMenuItem();

        setPreferredSize(new java.awt.Dimension(400, 450));

        Items.setText("Items:");

        processor.setText("Processor - $150");

        motherboard.setText("Motherboard - $100");

        ram.setText("Ram (8GB) - $90");

        psu.setText("PSU (500W) - $50");

        pcCase.setText("PC Case - $60");

        harddrive.setText("1TB Hard Drive - $55");

        jLabel1.setText("Qty:");

        jLabel4.setText("Qty:");

        jLabel6.setText("Qty:");

        jLabel8.setText("Qty:");

        jLabel10.setText("Qty:");

        jLabel12.setText("Qty:");

        jLabel2.setText("Total:");

        jLabel3.setText("Total:");

        jLabel5.setText("Total:");

        jLabel7.setText("Total:");

        jLabel9.setText("Total:");

        jLabel11.setText("Total:");

        calsub.setText("Calculate Sub-Total");
        calsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calsubActionPerformed(evt);
            }
        });

        jLabel13.setText("Sub-Total:");

        buttonGroup1.add(ground);
        ground.setText("Ground - 5%");

        buttonGroup1.add(air);
        air.setText("Air - 10%");

        buttonGroup1.add(fedex);
        fedex.setText("FedEx - 20%");

        jLabel14.setText("Shipping:");

        overallTotal.setText("Calculate Order Total");
        overallTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallTotalActionPerformed(evt);
            }
        });

        qty1.setText("0");

        qty2.setText("0");

        qty3.setText("0");

        qty4.setText("0");

        qty5.setText("0");

        qty6.setText("0");

        MenuTitle.setText("POS");
        MenuTitle.setContentAreaFilled(false);

        ResetOption.setText("Reset");
        ResetOption.setContentAreaFilled(false);
        MenuTitle.add(ResetOption);

        jMenuBar1.add(MenuTitle);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Items)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(harddrive)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(qty6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(pcCase)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(qty5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(processor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(motherboard)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(qty2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ram)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel6))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(psu)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel8)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(calsub))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(198, 198, 198)
                                        .addComponent(jLabel13)
                                        .addGap(28, 28, 28)
                                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(overallTotal)
                                .addGap(109, 109, 109)))
                        .addComponent(shipping))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ground)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(air)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(fedex))))
                .addGap(73, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Items)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processor)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(total1)
                    .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motherboard)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(total2)
                    .addComponent(qty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ram)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(total3)
                    .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psu)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(total4)
                    .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcCase)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(total5)
                    .addComponent(qty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harddrive)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(total6)
                    .addComponent(qty6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calsub)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ground)
                    .addComponent(fedex)
                    .addComponent(air))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(8, 8, 8)
                .addComponent(overallTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shipping)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calsubActionPerformed
        subtotal.setText("$" + totals());
    }//GEN-LAST:event_calsubActionPerformed

    private void overallTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallTotalActionPerformed
        shipping.setText("$" + Math.round(shipCost()));
    }//GEN-LAST:event_overallTotalActionPerformed

    public int totals(){
        int t1 = 150 * Integer.parseInt(qty1.getText());
        int t2 =  100 * Integer.parseInt(qty2.getText());
        int t3 = 90 * Integer.parseInt(qty3.getText());
        int t4 = 50 * Integer.parseInt(qty4.getText());
        int t5 = 60 * Integer.parseInt(qty5.getText());
        int t6 = 55 * Integer.parseInt(qty6.getText());
        if(t1 > 0){
            processor.setSelected(true);
        }
        if(t2 > 0){
            motherboard.setSelected(true);
        }
        if(t3 > 0){
            ram.setSelected(true);
        }
        if(t4 > 0){
            psu.setSelected(true);
        }
        if(t5 > 0){
            pcCase.setSelected(true);
        }
        if(t6 > 0){
            harddrive.setSelected(true);
        }
        total1.setText("$" + t1);
        total2.setText("$" + t2);
        total3.setText("$" + t3);
        total4.setText("$" + t4);
        total5.setText("$" + t5);
        total6.setText("$" + t6);
        subtotal.setText("$" + (t1 + t2 + t3 + t4 + t5 + t6));
        return (t1 + t2 + t3 + t4 + t5 + t6);
    }
    
    public double shipCost(){
        int theTotal = totals();
        int units;
        if(ground.isSelected()){
            return(theTotal * .05);
        }
        else if(air.isSelected()){
            return(theTotal * .1);
        }
        else if(fedex.isSelected()){
            return(theTotal * .2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a shipping method.");
            return(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Items;
    private javax.swing.JMenu MenuTitle;
    private javax.swing.JMenuItem ResetOption;
    private javax.swing.JCheckBox air;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calsub;
    private javax.swing.JCheckBox fedex;
    private javax.swing.JCheckBox ground;
    private javax.swing.JCheckBox harddrive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBox motherboard;
    private javax.swing.JButton overallTotal;
    private javax.swing.JCheckBox pcCase;
    private javax.swing.JCheckBox processor;
    private javax.swing.JCheckBox psu;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qty2;
    private javax.swing.JTextField qty3;
    private javax.swing.JTextField qty4;
    private javax.swing.JTextField qty5;
    private javax.swing.JTextField qty6;
    private javax.swing.JCheckBox ram;
    private javax.swing.JLabel shipping;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel total3;
    private javax.swing.JLabel total4;
    private javax.swing.JLabel total5;
    private javax.swing.JLabel total6;
    // End of variables declaration//GEN-END:variables
}