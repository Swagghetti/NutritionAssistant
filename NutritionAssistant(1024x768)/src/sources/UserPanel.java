/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sources;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class UserPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserPanel
     */
    public MiddlePanel mp = new MiddlePanel();
    
    public UserPanel() {
        initComponents();
        mp.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderSelectionBG = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        wicon = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        hicon = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        aicon = new javax.swing.JLabel();
        gicon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        approveButton = new javax.swing.JButton();
        weightErrorLbl = new javax.swing.JLabel();
        heightErrorLbl = new javax.swing.JLabel();
        ageErrorLbl = new javax.swing.JLabel();
        transparentBG = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 700));

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(104, 92, 112));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 120, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nutrition Assistant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 100);

        weightTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        weightTextField.setToolTipText("Enter Weight in Kilograms");
        weightTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true), "Weight", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N
        jPanel2.add(weightTextField);
        weightTextField.setBounds(370, 220, 270, 50);

        wicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/weight.png"))); // NOI18N
        jPanel2.add(wicon);
        wicon.setBounds(310, 220, 50, 50);

        heightTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        heightTextField.setToolTipText("Enter Height in Centimeters");
        heightTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true), "Height", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N
        jPanel2.add(heightTextField);
        heightTextField.setBounds(370, 320, 270, 50);

        hicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/height1.png"))); // NOI18N
        jPanel2.add(hicon);
        hicon.setBounds(310, 320, 50, 50);

        ageTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        ageTextField.setToolTipText("Age between 18-65");
        ageTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Age", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N
        jPanel2.add(ageTextField);
        ageTextField.setBounds(370, 430, 100, 50);

        aicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/age.png"))); // NOI18N
        jPanel2.add(aicon);
        aicon.setBounds(320, 430, 50, 50);

        gicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gender.png"))); // NOI18N
        jPanel2.add(gicon);
        gicon.setBounds(500, 430, 50, 50);

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));

        genderSelectionBG.add(maleButton);
        maleButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        maleButton.setSelected(true);
        maleButton.setText("Male");
        maleButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        genderSelectionBG.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        femaleButton.setText("Female");
        femaleButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(maleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(femaleButton)
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(550, 430, 80, 50);

        approveButton.setBackground(new java.awt.Color(153, 153, 153));
        approveButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        approveButton.setText("APPROVE USER");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(approveButton);
        approveButton.setBounds(430, 520, 150, 30);

        weightErrorLbl.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        weightErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(weightErrorLbl);
        weightErrorLbl.setBounds(400, 270, 210, 20);

        heightErrorLbl.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        heightErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(heightErrorLbl);
        heightErrorLbl.setBounds(400, 370, 220, 20);

        ageErrorLbl.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        ageErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(ageErrorLbl);
        ageErrorLbl.setBounds(380, 480, 140, 20);

        transparentBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transparentbl.png"))); // NOI18N
        transparentBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(transparentBG);
        transparentBG.setBounds(300, 180, 400, 400);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bacc.png"))); // NOI18N
        background.setAlignmentY(0.0F);
        background.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        background.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.add(background);
        background.setBounds(-20, 0, 1940, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        int age;
        double weight;
        int height;
        boolean hasError = false;
        try{
            age =  Integer.parseInt(ageTextField.getText());
            if(age < 18 || age > 65){
                ageErrorLbl.setText("Invalid age value");
                hasError = true;
            }
            else
                ageErrorLbl.setText("");
        }catch(NumberFormatException e1){
            ageErrorLbl.setText("Invalid format");
            hasError = true;
        }
        try{
            weight = Double.parseDouble(weightTextField.getText());
            if(weight < 30 || weight > 200){
                weightErrorLbl.setText("Invalid weight value");
                hasError = true;
            }
            else
                weightErrorLbl.setText("");
        }catch(NumberFormatException e2){
            weightErrorLbl.setText("Invalid format");
            hasError = true;
        }
        try{
            height = Integer.parseInt(heightTextField.getText());
            if(height < 120 || height > 250){
                heightErrorLbl.setText("Invalid height value");
                hasError = true;
            }
            else
                heightErrorLbl.setText("");
        }catch(NumberFormatException e2){
            heightErrorLbl.setText("Invalid format");
            hasError = true;
        }
        if(!hasError){
            SystemClass.user = new User(Integer.parseInt(ageTextField.getText()), Double.parseDouble(weightTextField.getText()), 
                    Integer.parseInt(heightTextField.getText()), maleButton.isSelected());
            mp.setVisible(true);
            this.setVisible(false);
            //mp.setLocation(170, 0);
        }
    }//GEN-LAST:event_approveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserPanel up = new UserPanel();
                up.setVisible(true);
                //up.setLocation(183, 15);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageErrorLbl;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel aicon;
    private javax.swing.JButton approveButton;
    private javax.swing.JLabel background;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.ButtonGroup genderSelectionBG;
    private javax.swing.JLabel gicon;
    private javax.swing.JLabel heightErrorLbl;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel hicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel transparentBG;
    private javax.swing.JLabel weightErrorLbl;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JLabel wicon;
    // End of variables declaration//GEN-END:variables
}
