/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finallogica;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;



/**
 *
 * @author Johan Choles
 */
public class ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form ventana2
     */
    private String dato;
    public static String ciudadEspecifica;
    public ventana2() {
        initComponents();
          //para el icono
        setIconImage(getIconImage());
         //para que aparezca en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //iniciar con ventana dependiendo de que se selecciono en combobox ciudad
        if (ventana1.comboCiudad.equals("Medellín")) {
            ciudadEspecifica = "medellin";
            medellin p1 = new medellin();
            cambiarContent(p1);
        }else if (ventana1.comboCiudad.equals("Barranquilla")) {
            ciudadEspecifica ="barranquilla";
            barranquilla p1 = new barranquilla();
            cambiarContent(p1);
        }else if(ventana1.comboCiudad.equals("Bogotá")){
            ciudadEspecifica = "bogota";
            Bogotá p1 = new Bogotá();
            cambiarContent(p1);
        }
        
    }
    //para el inconsito
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoParaVentana.jpg"));
        return retValue;
    }
    
    //funcion cambiarContent
    private void cambiarContent(JPanel p1){
        p1.setSize(848, 424);
        
        content.removeAll();
        content.add(p1);
        content.revalidate();
        content.repaint();
    }
            
    public void setDato(String dato){
        this.dato = dato;
        jLabel2.setText("Bienvenido, "+ dato);
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
        TBmedellin = new javax.swing.JToggleButton();
        TBbarranquilla = new javax.swing.JToggleButton();
        TBbogotá = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOWTICKET");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        TBmedellin.setBackground(new java.awt.Color(0, 52, 255));
        TBmedellin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        TBmedellin.setForeground(new java.awt.Color(255, 255, 51));
        TBmedellin.setSelected(true);
        TBmedellin.setText("Medellín");
        TBmedellin.setBorder(null);
        TBmedellin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBmedellin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmedellinActionPerformed(evt);
            }
        });

        TBbarranquilla.setBackground(new java.awt.Color(0, 51, 255));
        TBbarranquilla.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        TBbarranquilla.setForeground(new java.awt.Color(255, 255, 51));
        TBbarranquilla.setText("Barranquilla");
        TBbarranquilla.setToolTipText("");
        TBbarranquilla.setBorder(null);
        TBbarranquilla.setBorderPainted(false);
        TBbarranquilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBbarranquilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBbarranquillaActionPerformed(evt);
            }
        });

        TBbogotá.setBackground(new java.awt.Color(0, 51, 255));
        TBbogotá.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        TBbogotá.setForeground(new java.awt.Color(255, 255, 51));
        TBbogotá.setText("Bogotá");
        TBbogotá.setBorder(null);
        TBbogotá.setBorderPainted(false);
        TBbogotá.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TBbogotá.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBbogotáActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("mensajeBienve");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoeste-removebg-preview.png"))); // NOI18N
        icon.setText("jLabel2");

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SALIR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(TBmedellin)
                .addGap(18, 18, 18)
                .addComponent(TBbarranquilla)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(TBbogotá)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBmedellin)
                    .addComponent(TBbarranquilla)
                    .addComponent(TBbogotá)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        content.setBackground(new java.awt.Color(175, 191, 255));
        content.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                contentAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBmedellinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmedellinActionPerformed
        // TODO add your handling code here:
        TBbarranquilla.setSelected(false);
        TBbogotá.setSelected(false);
        //asignamos la ciudad especifica a la variable "ciudadEspecifica" para usarla en ventanaComprar
        ciudadEspecifica = "medellin";
        //cambiamos segun el content segun tenga el boton seleccionado
        medellin p1 = new medellin();
        cambiarContent(p1);
    }//GEN-LAST:event_TBmedellinActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void TBbarranquillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBbarranquillaActionPerformed
        // TODO add your handling code here:
        TBmedellin.setSelected(false);
        TBbogotá.setSelected(false);
        //asignamos la ciudad especifica a la variable "ciudadEspecifica" para usarla en ventanaComprar
        ciudadEspecifica = "barranquilla";
        
        //cambiamos segun el content segun tenga el boton seleccionado
        barranquilla p1 = new barranquilla();
        cambiarContent(p1);
    }//GEN-LAST:event_TBbarranquillaActionPerformed

    private void TBbogotáActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBbogotáActionPerformed
        // TODO add your handling code here:
        TBmedellin.setSelected(false);
        TBbarranquilla.setSelected(false);
        //asignamos la ciudad especifica a la variable "ciudadEspecifica" para usarla en ventanaComprar
        ciudadEspecifica = "bogota";
        
        //cambiamos segun el content segun tenga el boton seleccionado
        Bogotá p1 = new Bogotá();
        cambiarContent(p1);
    }//GEN-LAST:event_TBbogotáActionPerformed

    private void contentAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_contentAncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_contentAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana1 vent1 = new ventana1();
        vent1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TBbarranquilla;
    private javax.swing.JToggleButton TBbogotá;
    private javax.swing.JToggleButton TBmedellin;
    private javax.swing.JPanel content;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
