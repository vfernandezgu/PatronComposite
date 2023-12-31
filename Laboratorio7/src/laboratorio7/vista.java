/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio7;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class vista extends javax.swing.JFrame {
    Continente america = new Continente("America");
    /**
     * Creates new form vista
     */
    public vista() { 
        initComponents();
        stateNew();
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
        jPanel2 = new javax.swing.JPanel();
        cbEu = new javax.swing.JComboBox<>();
        btnAñadirEU = new javax.swing.JButton();
        cbMex = new javax.swing.JComboBox<>();
        btnAñadirMex = new javax.swing.JButton();
        cbCan = new javax.swing.JComboBox<>();
        btnAñadirCan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        btbAñadirPais = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbEu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nueva York", "Los Angeles", "Miami" }));
        jPanel2.add(cbEu);

        btnAñadirEU.setText("Añadir");
        btnAñadirEU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirEUMouseClicked(evt);
            }
        });
        jPanel2.add(btnAñadirEU);

        cbMex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guadalajara", "Ciudad de Mexico", "Monterrey" }));
        jPanel2.add(cbMex);

        btnAñadirMex.setText("Añadir");
        btnAñadirMex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMexMouseClicked(evt);
            }
        });
        jPanel2.add(btnAñadirMex);

        cbCan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toronto", "Vancouver" }));
        jPanel2.add(cbCan);

        btnAñadirCan.setText("Añadir");
        btnAñadirCan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirCanMouseClicked(evt);
            }
        });
        jPanel2.add(btnAñadirCan);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 660, 190));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Gestion de viaje compuesto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos", "Canada", "Mexico" }));
        jPanel1.add(cbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        btbAñadirPais.setText("Añadir");
        btbAñadirPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbAñadirPaisMouseClicked(evt);
            }
        });
        jPanel1.add(btbAñadirPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        btnShow.setText("Imprimir Informacion");
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });
        jPanel1.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInformacion.setColumns(20);
        txtInformacion.setRows(5);
        jScrollPane1.setViewportView(txtInformacion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 290, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbAñadirPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbAñadirPaisMouseClicked
        
        Pais pais = new Pais(cbPais.getSelectedItem().toString());
        america.add(pais);
        switch (cbPais.getSelectedIndex()) {
            case 0:
                cbEu.setVisible(true);
                btnAñadirEU.setVisible(true);
                break;
            case 1:
                cbCan.setVisible(true);
                btnAñadirCan.setVisible(true);
                break;
            case 2:
                cbMex.setVisible(true);
                btnAñadirMex.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
        JOptionPane.showMessageDialog(null,"Se ha agregado el siguiente pais: "+
                pais.getNombre(),"Pais agregado",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btbAñadirPaisMouseClicked

    private void btnAñadirEUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirEUMouseClicked
        Ciudad ciudad = new Ciudad(cbEu.getSelectedItem().toString());
         int posicion = -1; 

        for (int i = 0; i < america.getPaises().size(); i++) {
            if (america.getPaises().get(i).getNombre().equals("Estados Unidos")) {
                posicion = i; 
                break; 
            }
        }
        ciudad.add(new CityTour("Tour por la ciudad","Viaje todo pagado",1,1));
        america.getPaises().get(posicion).add(ciudad);
        JOptionPane.showMessageDialog(null,"Se ha agregado la siguiente ciudad: "+
                ciudad.getNombre(),"Ciudad agregada",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAñadirEUMouseClicked

    private void btnAñadirMexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMexMouseClicked
        Ciudad ciudad = new Ciudad(cbMex.getSelectedItem().toString());
         int posicion = -1; 

        for (int i = 0; i < america.getPaises().size(); i++) {
            if (america.getPaises().get(i).getNombre().equals("Mexico")) {
                posicion = i; 
                break; 
            }
        }
        ciudad.add(new CityTour("Tour por la ciudad","Viaje todo pagado",1,1));
        america.getPaises().get(posicion).add(ciudad);
        JOptionPane.showMessageDialog(null,"Se ha agregado la siguiente ciudad: "+
                ciudad.getNombre(),"Ciudad agregada",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAñadirMexMouseClicked

    private void btnAñadirCanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirCanMouseClicked
        Ciudad ciudad = new Ciudad(cbCan.getSelectedItem().toString());
         int posicion = -1; 

        for (int i = 0; i < america.getPaises().size(); i++) {
            if (america.getPaises().get(i).getNombre().equals("Canada")) {
                posicion = i; 
                break; 
            }
        }
        ciudad.add(new CityTour("Tour por la ciudad","Viaje todo pagado",1,1));
        america.getPaises().get(posicion).add(ciudad);
        JOptionPane.showMessageDialog(null,"Se ha agregado la siguiente ciudad: "+
                ciudad.getNombre(),"Ciudad agregada",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAñadirCanMouseClicked

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        txtInformacion.setText(america.mostrarInfo() + "\nCoste Total: \n" + 
                america.calcularCostoTotal()+ "\nDuracion en días:\n "+ america.calcularDuracionTotal());
            
    }//GEN-LAST:event_btnShowMouseClicked

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAñadirPais;
    private javax.swing.JButton btnAñadirCan;
    private javax.swing.JButton btnAñadirEU;
    private javax.swing.JButton btnAñadirMex;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cbCan;
    private javax.swing.JComboBox<String> cbEu;
    private javax.swing.JComboBox<String> cbMex;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtInformacion;
    // End of variables declaration//GEN-END:variables
public void stateNew(){
    cbEu.setVisible(false);
    cbMex.setVisible(false);
    cbCan.setVisible(false);
    btnAñadirCan.setVisible(false);
    btnAñadirMex.setVisible(false);
    btnAñadirEU.setVisible(false);
}
}
