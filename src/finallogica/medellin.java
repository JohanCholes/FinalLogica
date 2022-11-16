/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finallogica;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Johan Choles
 */
public class medellin extends javax.swing.JPanel {

    /**
     * Creates new form medellin
     */
    //creamos variable que contendra el valor de verdad de la funcion verificarSoloUnEvento
    private static byte valorVerdad;
    public static String showEspecifico;
    public static String eventoGrafica;
    public medellin() {
        initComponents();
//        setImageLabel(imgMedellín, "src/imagenes/imagenMedellín.jpg");
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
        jLabel1 = new javax.swing.JLabel();
        imgMedellín = new javax.swing.JLabel();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(175, 191, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 38)); // NOI18N
        jLabel1.setText("MEDELLÍN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(135, 29, 183, 42);

        imgMedellín.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenMedellín.jpg"))); // NOI18N
        imgMedellín.setText("imagenMedellín");
        imgMedellín.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(imgMedellín);
        imgMedellín.setBounds(57, 106, 340, 303);

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
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jComboBoxDEPORTE, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana2_1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jComboBoxTEATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBoxCONCIERTO, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBoxCONFERENCIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBoxEXPOSICIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(bAceptar))
        );
        ventana2_1Layout.setVerticalGroup(
            ventana2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana2_1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
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
                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ventana2_1);
        ventana2_1.setBounds(450, 0, 398, 470);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        //invocamos la funcion para verificar que solo este un show
        verificarSoloUnEvento();
        //condiciones para controlar la utilizacion de campos
        //El usuario no ha seleccionado ningun espectaculo
        if(jComboBoxDEPORTE.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxTEATRO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONCIERTO.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxCONFERENCIAS.getSelectedItem().toString().equals("SELECCIONAR")
            && jComboBoxEXPOSICIONES.getSelectedItem().toString().equals("SELECCIONAR")){
            JOptionPane.showMessageDialog(null, "POR FAVOR, SELECCIONE EL ESPECTACULO AL CUAL QUIERE ASISTIR\n");
        }

        //El usuario eligio solo un evento de los espectaculos
        else if (valorVerdad== (byte) (1)) {
            //asigno el valor de 0 a la variable por si el usuario vuelve a ventana 1 e ingresa otra vez a medellin
            valorVerdad = 0;
            //asigno el nombre del show a la variable showEspecifico
            if(jComboBoxDEPORTE.getSelectedItem().toString()!="SELECCIONAR"){
                eventoGrafica = "DEPORTE";
                showEspecifico = jComboBoxDEPORTE.getSelectedItem().toString();    
                ventana1.vectorDatos[7] = showEspecifico;
            }else if(jComboBoxTEATRO.getSelectedItem().toString()!="SELECCIONAR"){
                 eventoGrafica = "TEATRO";
                showEspecifico = jComboBoxTEATRO.getSelectedItem().toString();  
                ventana1.vectorDatos[7] = showEspecifico;
            }else if(jComboBoxCONCIERTO.getSelectedItem().toString()!="SELECCIONAR"){
                 eventoGrafica = "CONCIERTO";
                showEspecifico = jComboBoxCONCIERTO.getSelectedItem().toString();  
                ventana1.vectorDatos[7] = showEspecifico;
            }else if(jComboBoxCONFERENCIAS.getSelectedItem().toString()!="SELECCIONAR"){
                 eventoGrafica = "CONFERENCIAS";
                showEspecifico = jComboBoxCONFERENCIAS.getSelectedItem().toString();  
                ventana1.vectorDatos[7] = showEspecifico;
            }else if(jComboBoxEXPOSICIONES.getSelectedItem().toString()!="SELECCIONAR"){
                 eventoGrafica = "EXPOSICIONES";
                showEspecifico = jComboBoxEXPOSICIONES.getSelectedItem().toString();
                ventana1.vectorDatos[7] = showEspecifico;
            }
            //abrir la ventanaComprar
            ventanaComprar p1 = new ventanaComprar();
            funcionVentana2_1(p1);
        
        }else{
            JOptionPane.showMessageDialog(null, "POR FAVOR, SELECCIONE SOLO UN EVENTO\n");
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    //creamos una funcion que asignara a la variable global valorVerdad un numero
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
    
    //Funcion que me cambia a la ventanaComprar
    public void funcionVentana2_1(JPanel p1){
        p1.setSize(398, 470);
        
        ventana2_1.removeAll();
        ventana2_1.add(p1);
        ventana2_1.revalidate();
        ventana2_1.repaint();   
    }
    
    
    
//    private void setImageLabel(JLabel labelName, String root){
//        ImageIcon image = new ImageIcon(root);
//        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
//        labelName.setIcon(icon);
//        this.repaint();
//        
//        
//    }
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
