/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finallogica;
import static finallogica.medellin.showEspecifico;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Johan Choles
 */
public class barranquilla extends javax.swing.JPanel {

    /**
     * Creates new form barranquilla
     */
    private static byte valorVerdad;
    public barranquilla() {
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

        jPanel1 = new javax.swing.JPanel();
        ventana2_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        jComboBoxEXPOSICIONES = new javax.swing.JComboBox<>();
        jComboBoxCONFERENCIAS = new javax.swing.JComboBox<>();
        jComboBoxCONCIERTO = new javax.swing.JComboBox<>();
        jComboBoxTEATRO = new javax.swing.JComboBox<>();
        jComboBoxDEPORTE = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        imgMedellín = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(175, 191, 255));
        jPanel1.setLayout(null);

        ventana2_1.setBackground(new java.awt.Color(173, 189, 252));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("ESPECTACULOS");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEPORTES");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TEATRO");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONCIERTOS");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONFERENCIAS");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EXPOSICIONES");

        bAceptar.setBackground(new java.awt.Color(153, 153, 255));
        bAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAceptar.setText("ACEPTAR");
        bAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        jComboBoxEXPOSICIONES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "LA MONA LISA", "LA MOMIA", "LA ULTIMA CENA" }));

        jComboBoxCONFERENCIAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PYTHON 2.0", "APRENDE TRAIDING", "CRISTO ESTA AQUI" }));

        jComboBoxCONCIERTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SILVESTRE DANGOND", "MALUMA", "BAD BUNNY" }));

        jComboBoxTEATRO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SANTA CLAUS", "CIEN AÑOS DE SOLEDAD", "OPERA" }));

        jComboBoxDEPORTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "FUTBOL", "VOLEIBOL", "TENNIS" }));

        javax.swing.GroupLayout ventana2_1Layout = new javax.swing.GroupLayout(ventana2_1);
        ventana2_1.setLayout(ventana2_1Layout);
        ventana2_1Layout.setHorizontalGroup(
            ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana2_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana2_1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54))
                                .addGroup(ventana2_1Layout.createSequentialGroup()
                                    .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana2_1Layout.createSequentialGroup()
                                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxCONFERENCIAS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxCONCIERTO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDEPORTE, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTEATRO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEXPOSICIONES, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ventana2_1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventana2_1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(bAceptar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ventana2_1Layout.setVerticalGroup(
            ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana2_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxDEPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTEATRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCONCIERTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxCONFERENCIAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxEXPOSICIONES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jPanel1.add(ventana2_1);
        ventana2_1.setBounds(450, 0, 400, 470);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 38)); // NOI18N
        jLabel1.setText("BARRANQUILLA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(73, 32, 292, 42);

        imgMedellín.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgBarranquilla.jpg"))); // NOI18N
        imgMedellín.setText("imagenMedellín");
        imgMedellín.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(imgMedellín);
        imgMedellín.setBounds(47, 104, 340, 303);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        //invocamos la funcion para verificar que solo este un show
        verificarSoloUnEvento();
        //condiciones para controlar la utilizacion de campos
        //El usuario no ha seleccionado ningun espectaculo
        if (jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
                && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
                && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
                && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
                && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR, SELECCIONE EL ESPECTACULO AL CUAL QUIERE ASISTIR\n");
        }
        //El usuario eligio solo un evento de los espectaculos
        else if (valorVerdad== (byte) (1)) {
            //asigno el valor de 0 a la variable por si el usuario vuelve a ventana 1 e ingresa otra vez a medellin
            valorVerdad = 0;
             //asigno el nombre del show a la variable showEspecifico
            if(jComboBoxDEPORTE.getSelectedItem().toString()!="SELECCIONAR"){
                showEspecifico = jComboBoxDEPORTE.getSelectedItem().toString();    
            }else if(jComboBoxTEATRO.getSelectedItem().toString()!="SELECCIONAR"){
                showEspecifico = jComboBoxTEATRO.getSelectedItem().toString();  
            }else if(jComboBoxCONCIERTO.getSelectedItem().toString()!="SELECCIONAR"){
                showEspecifico = jComboBoxCONCIERTO.getSelectedItem().toString();  
            }else if(jComboBoxCONFERENCIAS.getSelectedItem().toString()!="SELECCIONAR"){
                showEspecifico = jComboBoxCONFERENCIAS.getSelectedItem().toString();  
            }else if(jComboBoxEXPOSICIONES.getSelectedItem().toString()!="SELECCIONAR"){
                showEspecifico = jComboBoxEXPOSICIONES.getSelectedItem().toString();  
            }
            //abrir la ventanaComprar
            ventanaComprar p1 = new ventanaComprar();
            funcionVentana2_1(p1);
        
        }else{
            JOptionPane.showMessageDialog(null, "POR FAVOR, SELECCIONE SOLO UN EVENTO\n");
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    
    //Funcion que cambia a la ventana comprar
    public void funcionVentana2_1(JPanel p1){
        p1.setSize(398, 470);
        
        ventana2_1.removeAll();
        ventana2_1.add(p1);
        ventana2_1.revalidate();
        ventana2_1.repaint();
    }
     //funcion que verifica que solo un show este seleccionado
    public void verificarSoloUnEvento() {
        try {
             if((jComboBoxDEPORTE.getSelectedItem().toString()!="SELECCIONAR"
            && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR"))
        ||
        (jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxTEATRO.getSelectedItem().toString()!="SELECCIONAR"
            && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR"))
        ||
        (jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONCIERTO.getSelectedItem().toString()!="SELECCIONAR"
            && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR"))
        ||
        (jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONFERENCIAS.getSelectedItem().toString()!="SELECCIONAR"
            && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR"))
        ||
        (jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxEXPOSICIONES.getSelectedItem().toString()!="SELECCIONAR")
                )

        {
           valorVerdad =1;
        }  
        } catch (Exception e) {
            System.out.println("Ocurrio un error en la funcion verificarSoloUnEvento" + e);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel imgMedellín;
    private javax.swing.JComboBox<String> jComboBoxCONCIERTO;
    private javax.swing.JComboBox<String> jComboBoxCONFERENCIAS;
    private javax.swing.JComboBox<String> jComboBoxDEPORTE;
    private javax.swing.JComboBox<String> jComboBoxEXPOSICIONES;
    private javax.swing.JComboBox<String> jComboBoxTEATRO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ventana2_1;
    // End of variables declaration//GEN-END:variables
}
