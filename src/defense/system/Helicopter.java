
package defense.system;


public class Helicopter extends javax.swing.JFrame implements DefenseObserver {

    private DefenseObservable mainController;
     private String unitName = "Helicopter";
    public Helicopter() {
        this.mainController = mainController;
        initComponents();
        setVisible(true);
        btnShoot.setEnabled(false);
       btnMissileOpeation.setEnabled(false);
       btnLaserOperation.setEnabled(false);
       HelicopterScreen.setEditable(false);
       helicopterSlider.setValue(0);
       
       
        
    }
    
//public void setMainController(DefenseObservable mainController) {
//    this.mainController = mainController;
//    System.out.println("MainController set for Helicopter");
//}

    
    public void updateStatus(boolean isAreaClear){
        String AreaStatus = isAreaClear ? "Area Cleared":"Area not Cleared";
        lblArea.setText(AreaStatus);
    }
    
    public void sendStrength(int scrollValue){
        System.out.println("Helicopter Recieved Position: "+scrollValue);
             btnShoot.setEnabled(scrollValue >15);
             btnMissileOpeation.setEnabled(scrollValue >50);
             btnLaserOperation.setEnabled(scrollValue >75);
                
                
                
    }
    
    public void updateScreen(String message){
        HelicopterScreen.append(message+"\n");
    }
    
     
    
    private void sendMessage() {
         if (mainController == null) {
        System.err.println("Error: mainController is not initialized.");
        return;
    }
        String message = userInput.getText();
        if (!message.isEmpty()) {
            mainController.displayMessage(unitName, message);
            userInput.setText("");
        }
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        userInput = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        helicopterSlider = new javax.swing.JSlider();
        lblSignalStrength = new javax.swing.JLabel();
        btnLaserOperation = new javax.swing.JButton();
        btnMissileOpeation = new javax.swing.JButton();
        positionCheckbox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        HelicopterScreen = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Helicopter Controller");

        lblArea.setText("Area Status:Unknown");

        btnShoot.setText("Shoot");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        helicopterSlider.setMajorTickSpacing(20);
        helicopterSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        helicopterSlider.setPaintLabels(true);
        helicopterSlider.setPaintTicks(true);

        lblSignalStrength.setText("Strength Signal: None");

        btnLaserOperation.setText("Laser Operations");

        btnMissileOpeation.setText("Missile Operations");

        positionCheckbox.setText("Position");
        positionCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckboxActionPerformed(evt);
            }
        });

        HelicopterScreen.setColumns(20);
        HelicopterScreen.setRows(5);
        jScrollPane1.setViewportView(HelicopterScreen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSend))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblArea)
                            .addGap(208, 208, 208)))
                    .addComponent(lblSignalStrength)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLaserOperation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(positionCheckbox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMissileOpeation)))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                        .addComponent(helicopterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(helicopterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSignalStrength)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot)
                            .addComponent(btnMissileOpeation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaserOperation)
                            .addComponent(positionCheckbox))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       sendMessage();
    }//GEN-LAST:event_btnSendActionPerformed

    private void positionCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckboxActionPerformed
        boolean isSelectPosition = positionCheckbox.isSelected();
                
    }//GEN-LAST:event_positionCheckboxActionPerformed

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helicopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HelicopterScreen;
    private javax.swing.JButton btnLaserOperation;
    private javax.swing.JButton btnMissileOpeation;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JSlider helicopterSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblSignalStrength;
    private javax.swing.JCheckBox positionCheckbox;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
