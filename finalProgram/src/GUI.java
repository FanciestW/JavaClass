import javax.swing.*;

public class GUI extends javax.swing.JFrame {
    
    //Instance variables that are aviable to all the methods.
    Person father = new Person();
    Person mother = new Person();
    int traitIndex;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jLabel1 = new javax.swing.JLabel();
        traitList = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phenoMother = new javax.swing.JComboBox();
        phenoFather = new javax.swing.JComboBox();
        genoMother = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genoFather = new javax.swing.JComboBox();
        cross = new javax.swing.JButton();
        results = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        reset = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Typer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Trait:");

        traitList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        traitList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select A Trait", "Blood Type" }));
        traitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traitListActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mother:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Father:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setLabelFor(phenoMother);
        jLabel4.setText("Phenotype:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setLabelFor(phenoFather);
        jLabel5.setText("Phenotype:");

        phenoMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phenoMotherActionPerformed(evt);
            }
        });

        phenoFather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phenoFatherActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setLabelFor(genoMother);
        jLabel6.setText("Genotype:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setLabelFor(genoFather);
        jLabel7.setText("Genotype:");

        cross.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cross.setText("Cross");
        cross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossActionPerformed(evt);
            }
        });

        results.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        results.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results.setToolTipText("");

        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset(evt);
            }
        });
        jMenuBar1.add(reset);

        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
        });
        jMenuBar1.add(exit);

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
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phenoMother, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genoMother, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(genoFather, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cross)
                                    .addComponent(results)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phenoFather, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(traitList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(traitList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phenoMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genoMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phenoFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genoFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(cross)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(results)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Resets everything to how it was when the program started.
    public void reset(){
        traitList.setSelectedIndex(0);
        DefaultComboBoxModel blank = new DefaultComboBoxModel();
        phenoMother.setModel(blank);
        phenoFather.setModel(blank);
        genoMother.setModel(blank);
        genoFather.setModel(blank);
        phenoMother.setEnabled(true);
        phenoFather.setEnabled(true);
        genoMother.setEnabled(true);
        genoFather.setEnabled(true);
    }
    
    //This checks to see if the Trait list has been changes and updates the form based on what is chosen
    private void traitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traitListActionPerformed
        traitIndex = traitList.getSelectedIndex();
        switch(traitIndex){
            case 1:
                phenoMother.setModel(new DefaultComboBoxModel(mother.bloodTypes));
                phenoFather.setModel(new DefaultComboBoxModel(father.bloodTypes));
                break;
            default:
                reset();
                break;
        }
    }//GEN-LAST:event_traitListActionPerformed
    
    //This checks the phenoType of the mother and updates the Genotype based on the selection. And saves the selected bloodtype to the mother Person
    private void phenoMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phenoMotherActionPerformed
        int choice = phenoMother.getSelectedIndex();
        if(choice == 3){
            genoMother.setEnabled(false);
            genoMother.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoMother.setSelectedIndex(1);
            mother.bloodType = mother.bloodTypes[choice];
            mother.homo = false;
        }
        else if(choice == 4){
            genoMother.setEnabled(false);
            genoMother.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoMother.setSelectedIndex(0);
            mother.bloodType = mother.bloodTypes[choice];
            mother.homo = true;
        }
        else if(choice != 0 && choice <= 4){
            mother.bloodType = mother.bloodTypes[choice];
            genoMother.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoMother.setEnabled(true);
        }
        else{
            genoMother.setModel(new DefaultComboBoxModel());
            genoMother.setEnabled(true);
        }
    }//GEN-LAST:event_phenoMotherActionPerformed

    //This checks the phenoType of the father and updates the Genotype based on the selection. And saves the selected bloodtype to the father Person
    private void phenoFatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phenoFatherActionPerformed
        int choice = phenoFather.getSelectedIndex();
        if(choice == 3){
            genoFather.setEnabled(false);
            genoFather.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoFather.setSelectedIndex(1);
            father.bloodType = father.bloodTypes[choice];
            father.homo = false;
        }
        else if(choice == 4){
            genoFather.setEnabled(false);
            genoFather.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoFather.setSelectedIndex(0);
            father.bloodType = father.bloodTypes[choice];
            father.homo = true;
        }
        else if(choice != 0 && choice <= 4){
            father.bloodType = father.bloodTypes[choice];
            genoFather.setModel(new DefaultComboBoxModel(new String[] {"Homozygous", "Heterozygous"}));
            genoFather.setEnabled(true);
        }
        else{
            genoFather.setModel(new DefaultComboBoxModel());
            genoFather.setEnabled(true);
        }
    }//GEN-LAST:event_phenoFatherActionPerformed
    
    /*
    This code is executed when the Cross button is pressed. It checks whether the parents are homozygouse or not and then
    it checks whether everything is filled out or not. If so it then goes to the displayResult method.
    */
    private void crossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossActionPerformed
        if(genoMother.getSelectedIndex() == 0) mother.homo = true;
        else mother.homo = false;
        if(genoFather.getSelectedIndex() == 0) father.homo = true;
        else father.homo = false;
        if(traitList.getSelectedIndex() != 0){
            if(phenoMother.getSelectedIndex() != 0 && phenoFather.getSelectedIndex() != 0){
                displayResults(mother.bloodType, mother.homo, father.bloodType, father.homo);
            }
            else{
                JOptionPane.showMessageDialog(null, "Fill In All the Fields", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select A Trait", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_crossActionPerformed
    
    //This is executed when the reset button is clicked. It resets the whole program
    private void reset(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset
        reset();
    }//GEN-LAST:event_reset

    //This is executed when the exit button is clicked. It terminates the program. or exits the program.
    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
        System.exit(0);
    }//GEN-LAST:event_exit
    
    //This method displays the results using the information from the mother and father Person.
    public void displayResults(String motherBlood, boolean motherHomo, String fatherBlood, boolean fatherHomo){
        if(motherHomo == true && fatherHomo == true){
            if(motherBlood.equals(fatherBlood)){
                JOptionPane.showMessageDialog(null, "100% " + motherBlood + " Homozygous");
            }
            if(!motherBlood.equals(fatherBlood)){
                if(!motherBlood.equals("O") && !fatherBlood.equals("O")){
                    JOptionPane.showMessageDialog(null, "100% " + "AB");
                }
                else{
                    if(motherBlood.equals("O")) JOptionPane.showMessageDialog(null, "100% " + fatherBlood + " Heterozygous");
                    if(fatherBlood.equals("O")) JOptionPane.showMessageDialog(null, "100% " + motherBlood + " Heterozygous");
                }
            }
        }
        else if(motherHomo == true || fatherHomo == true){
            if(motherBlood.equals(fatherBlood)){
                JOptionPane.showMessageDialog(null, "50% " + motherBlood + " Homozygous, 50% " + fatherBlood + " Heterozyous");
            }
            else if(motherBlood.equals("AB")){
                JOptionPane.showMessageDialog(null, "50% AB, 50% " + fatherBlood + " Homozygous");
            }
            else if(fatherBlood.equals("AB")){
                JOptionPane.showMessageDialog(null, "50% AB, 50% " + motherBlood + " Homozygous");
            }
            else{
                if(motherHomo == true){
                    JOptionPane.showMessageDialog(null, "50% AB, 50% " + motherBlood + " Heterozygous");
                }
                else if(fatherHomo == true){
                    JOptionPane.showMessageDialog(null, "50% AB, 50% " + fatherBlood + " Heterozygous");
                }
            }
        }
        else if(motherHomo == false && fatherHomo == false){
            if(motherBlood.equals("AB") && fatherBlood.equals("AB")){
                JOptionPane.showMessageDialog(null, "50% AB, 25% A Homozygous, and 25% B Homozygous");
            }
            else if(motherBlood.equals("AB") || fatherBlood.equals("AB")){
                if(motherBlood.equals("A") || fatherBlood.equals("A")) JOptionPane.showMessageDialog(null, "25% AB, 25% A Homozygous, 25% A Heteozygous, 25% B Heterozygous");
                if(motherBlood.equals("B") || fatherBlood.equals("B")) JOptionPane.showMessageDialog(null, "25% AB, 25% B Homozygous, 25% A Heteozygous, 25% B Heterozygous");
            }
            else if(motherBlood.equals(fatherBlood)){
                JOptionPane.showMessageDialog(null, "50% " + motherBlood + " Homozygous, 25% " + motherBlood + " Homozygous, 25% O");
            }
            else if(!motherBlood.equals(fatherBlood)){
                JOptionPane.showMessageDialog(null, "25% AB, 25% A Heterozygous, 25% B Heterozygous, 25% O");
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cross;
    private javax.swing.JMenu exit;
    private javax.swing.JComboBox genoFather;
    private javax.swing.JComboBox genoMother;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox phenoFather;
    private javax.swing.JComboBox phenoMother;
    private javax.swing.JMenu reset;
    private javax.swing.JLabel results;
    private javax.swing.JComboBox traitList;
    // End of variables declaration//GEN-END:variables
}
