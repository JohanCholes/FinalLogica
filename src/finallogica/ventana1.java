/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package finallogica;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Johan Choles
 */

public class ventana1 extends javax.swing.JFrame {

    /** Creates new form ventana1 */
    public static String comboCiudad ="";
    public ventana1() {
        initComponents();
        //para el icono
        setIconImage(getIconImage());
         //para que aparezca en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        TextPrompt placeHolder = new TextPrompt("NOMBRES", campoNombre);
        placeHolder = new TextPrompt("APELLIDOS", campoApellidos);
        placeHolder = new TextPrompt("CORREO ELECRONICO", jTextField1);
        placeHolder = new TextPrompt("CÉDULA", campoCédula);
//        placeHolder = new TextPrompt("EDAD", jComboBox1);
        placeHolder = new TextPrompt("DIRECCIÓN", campoDirección);
       
    }

       //para el inconsito
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoParaVentana.jpg"));
        return retValue;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoNegro = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        campoCédula = new javax.swing.JTextField();
        campoDirección = new javax.swing.JTextField();
        JComboCiudad = new javax.swing.JComboBox<>();
        botonContinuar = new javax.swing.JButton();
        campoEdad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOWTICKET");
        setLocationByPlatform(true);
        setResizable(false);

        fondoNegro.setBackground(new java.awt.Color(0, 0, 0));

        dashboard.setBackground(new java.awt.Color(0, 51, 255));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoeste-removebg-preview.png"))); // NOI18N
        icon.setText("jLabel2");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.setBackground(new java.awt.Color(175, 191, 255));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("INGRESE");

        campoNombre.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        campoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        campoApellidos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });
        campoApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoApellidosKeyTyped(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoCédula.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        campoCédula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCédulaActionPerformed(evt);
            }
        });
        campoCédula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCédulaKeyTyped(evt);
            }
        });

        campoDirección.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        campoDirección.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JComboCiudad.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        JComboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medellín", "Barranquilla", "Bogotá" }));
        JComboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboCiudadActionPerformed(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(49, 152, 255));
        botonContinuar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        botonContinuar.setText("CONTINUAR");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        campoEdad.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        campoEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDAD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122" }));
        campoEdad.setBorder(null);
        campoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdadActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPrincipal-PhotoRoom.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JComboCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(campoDirección, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(97, 97, 97))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(campoCédula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCédula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEdad))
                        .addGap(18, 18, 18)
                        .addComponent(campoDirección, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JComboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout fondoNegroLayout = new javax.swing.GroupLayout(fondoNegro);
        fondoNegro.setLayout(fondoNegroLayout);
        fondoNegroLayout.setHorizontalGroup(
            fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoNegroLayout.setVerticalGroup(
            fondoNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoNegroLayout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoCédulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCédulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCédulaActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // TODO add your handling code here:
        //esta instruccion asigna a la variable global comboCiudad lo que hay seleccioando en el combo ciudad
          comboCiudad = JComboCiudad.getSelectedItem().toString();
        
        if(campoNombre.getText().isEmpty()==false
                && campoApellidos.getText().isEmpty()==false
                && campoCédula.getText().isEmpty()==false
                && campoEdad.getSelectedItem().toString() != "EDAD" 
                && campoDirección.getText().isEmpty()==false){
            ventana2 vent2 = new ventana2();
            vent2.setDato(campoNombre.getText());
            vent2.setVisible(true);
            this.setVisible(false);
        }
        
        else
             JOptionPane.showMessageDialog(null, "Revise que todos los campos de datos esten completos\n");
        
       
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void campoCédulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCédulaKeyTyped
        // TODO add your handling code here:
        
        //codigo para que permita solo numeros
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if(!numeros){
            evt.consume();
        }
        
        
        if((campoCédula.getText().length() >= 10)){
        evt.consume();
        }
        
        
    }//GEN-LAST:event_campoCédulaKeyTyped

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        // TODO add your handling code here:
        
        //codigo que permite unicamente caracteres
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
    }
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoApellidosKeyTyped
        // TODO add your handling code here:
        
        //codigo que permite unicamente caracteres
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
    }
    }//GEN-LAST:event_campoApellidosKeyTyped

    private void campoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdadActionPerformed

    private void JComboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboCiudadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JComboCiudadActionPerformed

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboCiudad;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCédula;
    private javax.swing.JTextField campoDirección;
    private javax.swing.JComboBox<String> campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel fondoNegro;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
