/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finallogica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.data.general.DefaultPieDataset;  libreria para grafica de torta

/**
 *
 * @author Johan Choles
 */
public class ventanaComprar extends javax.swing.JPanel {

    /**
     * Creates new form ventanaComprar
     */
    //variable que contendra el precio total
    public static int precioTotal;
    private static byte contadorQuemado;
    public ventanaComprar() {
        initComponents();
        //se iniciara la ventana con algunas variables disponibles
        jSpinner1.setEnabled(false);
        fieldDireccion.setEnabled(false);
        fieldCelular.setEnabled(false);
        comboPunto.setEnabled(false);
        comboPuntoVenta.setEnabled(false);
        labelPagoAdicional.setText("");
        
        showEspecifico.setText(medellin.showEspecifico);
        //verificar la cantidad de boletas 5-1
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(5);
        nm.setMinimum(0);
        nm.setStepSize(1);
        jSpinner1.setModel(nm);
        //asigamos la direccion de la variable global
        fieldDireccion.setText(ventana1.direccion);
        //dependiendo de la ciudad donde este, se mostraran tres puntos fijos de venta
        switch(ventana2.ciudadEspecifica){
            case "medellin":
                ventana1.vectorDatos[5] = "MEDELLIN";
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("Estación San Antonio");
                comboPuntoVenta.addItem("Parque Belén");
                comboPuntoVenta.addItem("Niquía");
                //agregar evento caracteristico de cada ciudad
                if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Estadio Atanasio Girardot");
                    ventana1.vectorDatos[6] = "DEPORTES";
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $50.000");
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("Teatro José Gutierrez Gómez");
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                    ventana1.vectorDatos[6] = "TEATRO";
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Plaza de Toreos La Macarena");
                    ventana1.vectorDatos[6] = "CONCIERTOS";
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad Eafit");
                  ventana1.vectorDatos[6] = "CONFERENCIAS";
                  //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Museo de Arte Moderno");
                    ventana1.vectorDatos[6] = "EXPOSICIONES";
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $80.000");
                }
                //fecha dependiendo del evento
                switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("Fecha:\n7/09/2023  Hora\n7:00am");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("Fecha: 8/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        fieldFechaEvento.setText("Fecha: 9/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("Fecha: 6/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("Fecha: 9/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("Fecha: 12/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("Fecha: 9/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $750.000");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("Fecha: 10/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.000.000");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("Fecha: 11/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.500.000");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("Fecha: 20/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("Fecha: 21/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("Fecha: 22/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("Fecha: 2/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("Fecha: 3/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("Fecha: 4/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
            case "barranquilla":
                ventana1.vectorDatos[5] = "BARRANQUILLA";
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("La ventana del mundo");
                comboPuntoVenta.addItem("Olímpica La 30");
                comboPuntoVenta.addItem("Universidad del Norte");
                //agregar evento caracteristico de cada ciudad
                 if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Estadio Metropolitano");
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $50.000");
                    ventana1.vectorDatos[6] = "DEPORTES";
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("teatro José Consuegra Higgins");
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                    ventana1.vectorDatos[6] = "TEATRO";
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Puerta de Oro");
                    ventana1.vectorDatos[6] = "CONCIERTOS";
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad del Norte");
                  ventana1.vectorDatos[6] = "CONFERENCIAS";
                  //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Museo Mapuka");
                    ventana1.vectorDatos[6] = "EXPOSICIONES";
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $80.000");
                }
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("Fecha: 20/09/2023 Hora: 7:00am");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("Fecha: 21/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        fieldFechaEvento.setText("Fecha: 22/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("Fecha: 20/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("Fecha: 22/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("Fecha: 23/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("Fecha: 27/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $750.000");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("Fecha: 28/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.000.000");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("Fecha: 29/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.500.000");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("Fecha: 10/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("Fecha: 11/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("Fecha: 12/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("Fecha: 13/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("Fecha: 14/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("Fecha: 15/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
            case "bogota":
                ventana1.vectorDatos[5] = "BOGOTA";
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("Plaza Bolívar");
                comboPuntoVenta.addItem("Estación Caracas");
                comboPuntoVenta.addItem("C.C Santa Fé");
                //agregar evento caracteristico de cada ciudad
                 if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Parque Metropolitano El Tunal");
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $50.000");
                    ventana1.vectorDatos[6] = "DEPORTES";
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("Teatro Julio Mario Santo Domingo");
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                    ventana1.vectorDatos[6] = "TEATRO";
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Movistar Arena");
                    ventana1.vectorDatos[6] = "CONCIERTOS";
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad de los Andes");
                  ventana1.vectorDatos[6] = "CONFERENCIAS";
                  //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $70.000");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Palacio de Justicia");
                    ventana1.vectorDatos[6] = "EXPOSICIONES";
                    //precio de la boleta
                    labelPrecio.setText("PRECIOxU: $80.000");
                }
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("Fecha: 13/09/2023 Hora: 7:00am'");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("Fecha: 14/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        fieldFechaEvento.setText("Fecha: 15/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("Fecha: 27/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("Fecha: 28/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("Fecha: 29/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("Fecha: 15/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $750.000");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("Fecha: 17/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.000.000");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("Fecha: 18/08/2023 Hora 9:00pm");
                        //precio de la boleta
                        labelPrecio.setText("PRECIOxU: $1.500.000");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("Fecha: 1/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("Fecha: 2/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("Fecha: 2/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("Fecha: 22/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("Fecha: 23/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("Fecha: 24/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
        }
        //para poner la fecha del evento en bruto
        

          grafica();
          
//        //grafica con libreria jfreechart de barras
//         int boletasVendidas = ventana1.boletasDisponible - (int)(Math.random()*500);
//        //a continuacion, todo el proceso para la grafica de barras
//        DefaultCategoryDataset datos = new DefaultCategoryDataset();
//        datos.setValue(ventana1.boletasDisponible, "Boletas Disponibles", "");
//        datos.setValue(boletasVendidas, "Boletas Vendidas", "");
//        
//        JFreeChart graficoBarras = ChartFactory.createBarChart(
//        "Boletas",                                       //nombre del grafico
//        "",                                                   //nombre de las barras o columnas
//        "Cantidad",                                    //nombre de la numeracion
//        datos,                                             //datos del grafico
//        PlotOrientation.VERTICAL,           //orientacion
//        true,                                               //legenda de barras individuales por color
//        true,                                               //herramientas
//        false                                               //url del grafico
//        );
//        graficoBarras.setBackgroundPaint(Color.WHITE);
//        ChartPanel panel = new ChartPanel(graficoBarras);
//        panel.setMouseWheelEnabled(true);
//        panel.setPreferredSize(new Dimension(300,160));
//        
//        grafiquita.setLayout(new BorderLayout());
//        grafiquita.add(panel, BorderLayout.NORTH);
//        repaint();
        
        
//        //grafica con libreria jfreechart de torta
//        //usamos la variable global "boletasDisponible" creada en ventana1
//        //creamos una variable que tendra las bolestas vendidas
//        int boletasVendidas = ventana1.boletasDisponible - (int)(Math.random()*500);
//        //a continuacion, todo el proceso para la grafica
//        DefaultPieDataset datos = new DefaultPieDataset();
//        datos.setValue("BOLESTAS DISPONIBLES", ventana1.boletasDisponible);
//        datos.setValue("BOLETAS VENDIDAS", boletasVendidas);
//        
//        JFreeChart graficoCircular = ChartFactory.createPieChart(
//        "",          //nombre del grafico  
//        datos,                      //datos
//        true,                       //nombre de las categorias
//        true,                       //herramientas
//        false                       //generacion de URl
//        );
//        
//        ChartPanel panel = new ChartPanel(graficoCircular);
//        panel.setMouseWheelEnabled(true);
//        panel.setPreferredSize(new Dimension(220,110));
//        
//        grafiquita.setLayout(new BorderLayout());
//        grafiquita.add(panel, BorderLayout.NORTH);
//        repaint();
        
        
    }
 
    //creamos funcion que me iniciara la grafica dependiendo del deporte
    public void grafica(){
        //variables para MEDELLIN
        //deporte:
        int medDeporFut=1000,medDeporVolei=1000,medDeporTenis=1000;
        //teatro:
        int medTeaSanta=1000,medTea100Soledad=1000 ,medTeaOpera=1000;
        //concierto:
        int medConcieSilves=1000,medConcieMalu=1000,medConcieBad=1000;
        //conferencia:
        int medConfePyhton=1000,medConfeTrading=1000,medConfeCristo=1000;
        //exposiciones:
        int medExpoMona=1000,medExpoMomia=1000,medExpoUltima=1000;
        //variables para QUILLA
        //deporte:
        int quillaDeporFut=1000,quillaDeporVolei=1000,quillaDeporTenis=1000;
        //teatro:
        int quillaTeaSanta=1000,quillaTea100Soledad=1000 ,quillaTeaOpera=1000;
        //concierto:
        int quillaConcieSilves=1000,quillaConcieMalu=1000,quillaConcieBad=1000;
        //conferencia:
        int quillaConfePyhton=1000,quillaConfeTrading=1000,quillaConfeCristo=1000;
        //exposiciones:
        int quillaExpoMona=1000,quillaExpoMomia=1000,quillaExpoUltima=1000;
        //variables para BOGOTA
        //deporte:
        int bogoDeporFut=1000,bogoDeporVolei=1000,bogoDeporTenis=1000;
        //teatro:
        int bogoTeaSanta=1000,bogoTea100Soledad=1000 ,bogoTeaOpera=1000;
        //concierto:
        int bogoConcieSilves=1000,bogoConcieMalu=1000,bogoConcieBad=1000;
        //conferencia:
        int bogoConfePyhton=1000,bogoConfeTrading=1000,bogoConfeCristo=1000;
        //exposiciones:
        int bogoExpoMona=1000,bogoExpoMomia=1000,bogoExpoUltima=1000;
        //para iniciar la grafica dependiendo de que evento seleccionó usamos la variable creada en cada ciudad "eventoGrafica"
        //tambien usaremos la variable ciudadEspecifica creada en ventana2
        switch(ventana2.ciudadEspecifica){
            //empieza medallo
            case "medellin":
                switch(medellin.eventoGrafica){
                    case "DEPORTE":
                        switch(medellin.showEspecifico){
                            case "FUTBOL":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = medDeporFut - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(medDeporFut, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "VOLEIBOL":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medDeporVolei - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(medDeporVolei, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "TENNIS":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medDeporTenis - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(medDeporTenis, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "TEATRO":
                        switch(medellin.showEspecifico){
                            case "SANTA CLAUS":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = medTeaSanta - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(medTeaSanta, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "CIEN AÑOS DE SOLEDAD":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medTea100Soledad - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(medTea100Soledad, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "OPERA":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medTeaOpera - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(medTeaOpera, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "CONCIERTO":
                        switch(medellin.showEspecifico){
                            case "SILVESTRE DANGOND":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = medConcieSilves - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(medConcieSilves, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "MALUMA":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medConcieMalu - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(medConcieMalu, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "BAD BUNNY":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medConcieBad - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(medConcieBad, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "CONFERENCIAS":
                        switch(medellin.showEspecifico){
                            case "PYTHON 2.0":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = medConfePyhton - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(medConfePyhton, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "APRENDE TRAIDING":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medConfeTrading - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(medConfeTrading, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "CRISTO ESTA AQUI":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medConfeCristo - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(medConfeCristo, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "EXPOSICIONES":
                        switch(medellin.showEspecifico){
                            case "LA MONA LISA":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = medExpoMona - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(medExpoMona, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "LA MOMIA":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medExpoMomia - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(medExpoMomia, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "LA ULTIMA CENA":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = medExpoUltima - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(medExpoUltima, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                }
                break;
            //empieza ciudad quilla    
            case "barranquilla":
                switch(barranquilla.eventoGrafica){
                    case "DEPORTE":
                        switch(medellin.showEspecifico){
                            case "FUTBOL":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = quillaDeporFut - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(quillaDeporFut, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "VOLEIBOL":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = quillaDeporVolei - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(quillaDeporVolei, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "TENNIS":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = quillaDeporTenis - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(quillaDeporTenis, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "TEATRO":
                        switch(medellin.showEspecifico){
                            case "SANTA CLAUS":
                                //grafica con libreria jfreechart de barras
                                int boletasVendidas = quillaTeaSanta - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos = new DefaultCategoryDataset();
                                datos.setValue(quillaTeaSanta, "Boletas Disponibles", "");
                                datos.setValue(boletasVendidas, "Boletas Vendidas", "");

                                JFreeChart graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                ChartPanel panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "CIEN AÑOS DE SOLEDAD":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = quillaTea100Soledad - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos1 = new DefaultCategoryDataset();
                                datos1.setValue(quillaTea100Soledad, "Boletas Disponibles", "");
                                datos1.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos1, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                            case "OPERA":
                                //grafica con libreria jfreechart de barras
                                boletasVendidas = quillaTeaOpera - (int) (Math.random() * 500);
                                //a continuacion, todo el proceso para la grafica de barras
                                DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
                                datos2.setValue(quillaTeaOpera, "Boletas Disponibles", "");
                                datos2.setValue(boletasVendidas, "Boletas Vendidas", "");

                                graficoBarras = ChartFactory.createBarChart(
                                        "Boletas", //nombre del grafico
                                        "", //nombre de las barras o columnas
                                        "Cantidad", //nombre de la numeracion
                                        datos2, //datos del grafico
                                        PlotOrientation.VERTICAL, //orientacion
                                        true, //legenda de barras individuales por color
                                        true, //herramientas
                                        false //url del grafico
                                );
                                graficoBarras.setBackgroundPaint(Color.WHITE);
                                panel = new ChartPanel(graficoBarras);
                                panel.setMouseWheelEnabled(true);
                                panel.setPreferredSize(new Dimension(300, 160));

                                grafiquita.setLayout(new BorderLayout());
                                grafiquita.add(panel, BorderLayout.NORTH);
                                repaint();
                                break;
                        }
                        break;
                    case "CONCIERTO":
                        switch(medellin.showEspecifico){
                            case "SILVESTRE DANGOND":
                                break;
                            case "MALUMA":
                                break;
                            case "BAD BUNNY":
                                break;
                        }
                        break;
                    case "CONFERENCIAS":
                        switch(medellin.showEspecifico){
                            case "PYTHON 2.0":
                                break;
                            case "APRENDE TRAIDING":
                                break;
                            case "CRISTO ESTA AQUI":
                                break;
                        }
                        break;
                    case "EXPOSICIONES":
                        switch(medellin.showEspecifico){
                            case "LA MONA LISA":
                                break;
                            case "LA MOMIA":
                                break;
                            case "LA ULTIMA CENA":
                                break;
                        }
                        break;
                }
                break;
            //empieza rololandia    
            case "bogota":
              switch(Bogotá.eventoGrafica){
                    case "DEPORTE":
                        switch(medellin.showEspecifico){
                            case "FUTBOL":
                                break;
                            case "VOLEIBOL":
                                break;
                            case "TENNIS":
                                break;
                        }
                        break;
                    case "TEATRO":
                        switch(medellin.showEspecifico){
                            case "SANTA CLAUS":
                                break;
                            case "CIEN AÑOS DE SOLEDAD":
                                break;
                            case "OPERA":
                                break;
                        }
                        break;
                    case "CONCIERTO":
                        switch(medellin.showEspecifico){
                            case "SILVESTRE DANGOND":
                                break;
                            case "MALUMA":
                                break;
                            case "BAD BUNNY":
                                break;
                        }
                        break;
                    case "CONFERENCIAS":
                        switch(medellin.showEspecifico){
                            case "PYTHON 2.0":
                                break;
                            case "APRENDE TRAIDING":
                                break;
                            case "CRISTO ESTA AQUI":
                                break;
                        }
                        break;
                    case "EXPOSICIONES":
                        switch(medellin.showEspecifico){
                            case "LA MONA LISA":
                                break;
                            case "LA MOMIA":
                                break;
                            case "LA ULTIMA CENA":
                                break;
                        }
                        break;
                }
                break;
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        panelComprar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        showEspecifico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        grafiquita = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        checkComprar = new javax.swing.JCheckBox();
        checkReservar = new javax.swing.JCheckBox();
        checkDomicilio = new javax.swing.JCheckBox();
        labelCantidadBoletas = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        labelPrecio = new javax.swing.JLabel();
        fieldDireccion = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldCelular = new javax.swing.JTextField();
        comboPuntoVenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboPunto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fieldFechaEvento = new javax.swing.JTextField();
        labelPagoAdicional = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        panelComprar.setBackground(new java.awt.Color(173, 189, 252));

        jPanel1.setBackground(new java.awt.Color(169, 185, 247));

        showEspecifico.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        showEspecifico.setForeground(new java.awt.Color(0, 0, 0));
        showEspecifico.setText("showEspecifico");
        showEspecifico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                showEspecificoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(169, 185, 247));
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB", 2, 8)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("Seleccione una ciudad  para regresar");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(169, 185, 247));
        jTextArea1.setInheritsPopupMenu(true);
        jTextArea1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextArea1.setSelectedTextColor(new java.awt.Color(204, 0, 0));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout grafiquitaLayout = new javax.swing.GroupLayout(grafiquita);
        grafiquita.setLayout(grafiquitaLayout);
        grafiquitaLayout.setHorizontalGroup(
            grafiquitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        grafiquitaLayout.setVerticalGroup(
            grafiquitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        checkComprar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        checkComprar.setForeground(new java.awt.Color(0, 0, 0));
        checkComprar.setText("COMPRAR");
        checkComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkComprarActionPerformed(evt);
            }
        });

        checkReservar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        checkReservar.setForeground(new java.awt.Color(0, 0, 0));
        checkReservar.setText("RESERVAR");
        checkReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkReservarActionPerformed(evt);
            }
        });

        checkDomicilio.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        checkDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        checkDomicilio.setText("DOMICILIO");
        checkDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDomicilioActionPerformed(evt);
            }
        });

        labelCantidadBoletas.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        labelCantidadBoletas.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidadBoletas.setText("CANTIDAD DE BOLETAS");

        jSpinner1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jSpinner1.setBorder(null);
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setName(""); // NOI18N
        jSpinner1.setValue(1);
        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        labelPrecio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecio.setText("Precio:  ");
        labelPrecio.setFocusCycleRoot(true);

        fieldDireccion.setText("dirección");

        labelDireccion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("Dirección:");
        labelDireccion.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Celular:");

        fieldCelular.setPreferredSize(new java.awt.Dimension(71, 29));

        comboPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuntoVentaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Punto de reclamo:");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sitio del evento:");

        fieldFechaEvento.setEditable(false);
        fieldFechaEvento.setBackground(new java.awt.Color(173, 189, 252));
        fieldFechaEvento.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        fieldFechaEvento.setForeground(new java.awt.Color(0, 0, 153));
        fieldFechaEvento.setText("fechas");
        fieldFechaEvento.setAutoscrolls(false);
        fieldFechaEvento.setBorder(null);

        labelPagoAdicional.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        labelPagoAdicional.setForeground(new java.awt.Color(0, 0, 204));
        labelPagoAdicional.setText("avisopagoadicional");

        javax.swing.GroupLayout panelComprarLayout = new javax.swing.GroupLayout(panelComprar);
        panelComprar.setLayout(panelComprarLayout);
        panelComprarLayout.setHorizontalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelComprarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComprarLayout.createSequentialGroup()
                        .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelComprarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(fieldDireccion)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelComprarLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelComprarLayout.createSequentialGroup()
                                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelComprarLayout.createSequentialGroup()
                                        .addComponent(checkDomicilio)
                                        .addGap(50, 50, 50)
                                        .addComponent(labelPagoAdicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelComprarLayout.createSequentialGroup()
                                        .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkComprar)
                                            .addComponent(labelCantidadBoletas))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkReservar)))
                                .addGap(25, 25, 25)))
                        .addGap(39, 39, 39))
                    .addGroup(panelComprarLayout.createSequentialGroup()
                        .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelComprarLayout.createSequentialGroup()
                                .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(comboPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelComprarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(grafiquita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelComprarLayout.setVerticalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComprarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grafiquita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkComprar)
                    .addComponent(checkReservar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPagoAdicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(labelCantidadBoletas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );

        jScrollPane2.setViewportView(panelComprar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkComprarActionPerformed
        // quitamos la opcion a los otros botones
        checkDomicilio.setSelected(false);
        checkReservar.setSelected(false);
        //activos los datos a ingresar
        jSpinner1.setEnabled(true);
        fieldCelular.setEnabled(true);
        comboPunto.setEnabled(true);
        comboPuntoVenta.setEnabled(true);
        labelPagoAdicional.setText("");
        
        //quitamos las otras opciones con un condicional
        if (checkComprar.isSelected() == false) {
            jSpinner1.setEnabled(false);
            fieldDireccion.setEnabled(false);
            fieldCelular.setEnabled(false);
            comboPunto.setEnabled(false);
            comboPuntoVenta.setEnabled(false);
            labelPagoAdicional.setText("");
        }
    }//GEN-LAST:event_checkComprarActionPerformed

    private void checkReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReservarActionPerformed
        //quitamos la opcion a los otros botones
        checkComprar.setSelected(false);
        checkDomicilio.setSelected(false);
        //activos los datos a ingresar
        jSpinner1.setEnabled(true);
        fieldCelular.setEnabled(true);
        comboPunto.setEnabled(true);
        comboPuntoVenta.setEnabled(true);
        fieldDireccion.setEnabled(false);
        labelPagoAdicional.setText("");
        //quitamos las otras opciones con un condicional
        if (checkReservar.isSelected() == false) {
            jSpinner1.setEnabled(false);
            fieldDireccion.setEnabled(false);
            fieldCelular.setEnabled(false);
            comboPunto.setEnabled(false);
            comboPuntoVenta.setEnabled(false);
            labelPagoAdicional.setText("");
        }
    }//GEN-LAST:event_checkReservarActionPerformed

    private void checkDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDomicilioActionPerformed
        // TODO add your handling code here:
        checkReservar.setSelected(false);
        //activo los datos a ingresar
        jSpinner1.setEnabled(true);
        fieldDireccion.setEnabled(true);
        fieldCelular.setEnabled(true);
        comboPunto.setEnabled(true);
        labelPagoAdicional.setText("$5.000 adicional");
        //quitamos las otras opciones con un condicional
        if (checkDomicilio.isSelected() == false) {
            jSpinner1.setEnabled(false);
            fieldDireccion.setEnabled(false);
            fieldCelular.setEnabled(false);
            comboPunto.setEnabled(false);
            comboPuntoVenta.setEnabled(false);
            labelPagoAdicional.setText("");
        }
    }//GEN-LAST:event_checkDomicilioActionPerformed

    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // cambiar ventana para que siga comprando
        if (ventana2.ciudadEspecifica.equals("medellin")) {
            ventanaEspectaculo vent1 = new ventanaEspectaculo();
            vent1.setSize(398, 470);
        
            jScrollPane2.removeAll();
            jScrollPane2.add(vent1);
            jScrollPane2.revalidate();
            jScrollPane2.repaint();
        }else if(ventana2.ciudadEspecifica.equals("barranquilla")){
            ventanaEspectaculo vent1 = new ventanaEspectaculo();
            vent1.setSize(398, 470);
        
            jScrollPane2.removeAll();
            jScrollPane2.add(vent1);
            jScrollPane2.revalidate();
            jScrollPane2.repaint();
        }else if(ventana2.ciudadEspecifica.equals("bogota")){
            ventanaEspectaculo vent1 = new ventanaEspectaculo();
            vent1.setSize(398, 470);
        
            jScrollPane2.removeAll();
            jScrollPane2.add(vent1);
            jScrollPane2.revalidate();
            jScrollPane2.repaint();
        }
        
        //gestion de boletas y todo
        
        //SI LA BOLETA ES COMPRADA O RESRVADA
        if (checkComprar.isSelected()==false) {
            ventana1.vectorDatos[8] = "";
        }else{
            ventana1.vectorDatos[8] = "COMPRADA";
        }
        if (checkReservar.isSelected()==false) {
            ventana1.vectorDatos[8] = "";
        }else{
            ventana1.vectorDatos[8] = "RESERVADA";
        }
        
        //DOMICILIO SI/NO
         if (checkDomicilio.isSelected()==false) {
            ventana1.vectorDatos[9] = "NO";
        }else{
            ventana1.vectorDatos[9] = "SI";
        }       
        //CANTIDAD DE BOLETAS
        ventana1.vectorDatos[10] = jSpinner1.getValue().toString();
        
        //PRECIO TOTAL
        if (Integer.parseInt(ventana1.vectorDatos[10])>0) {
            if (medellin.eventoGrafica.equals("DEPORTE")) {
                //si es domiciolio o no
                if (ventana1.vectorDatos[9].equals("SI")) {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10])*50000);
                    precioTotal+=((Integer.parseInt(ventana1.vectorDatos[10])*50000)*0.08)+5000;
                    ventana1.vectorDatos[11]=String.valueOf(precioTotal);
                }else{
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10])*50000);
                    precioTotal+=(Integer.parseInt(ventana1.vectorDatos[10])*50000)*0.08;
                    ventana1.vectorDatos[11]=String.valueOf(precioTotal);
                }
            }else if(medellin.eventoGrafica.equals("TEATRO")){
                //si es domiciolio o no
                if (ventana1.vectorDatos[9].equals("SI")) {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10])*70000);
                    precioTotal+=((Integer.parseInt(ventana1.vectorDatos[10])*70000)*0.08)+5000;
                    ventana1.vectorDatos[11]=String.valueOf(precioTotal);
                }else{
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10])*70000);
                    precioTotal+=(Integer.parseInt(ventana1.vectorDatos[10])*70000)*0.08;
                    ventana1.vectorDatos[11]=String.valueOf(precioTotal);
                }
            }else if(medellin.eventoGrafica.equals("CONCIERTO")){
                //si es domilicio
                if (ventana1.vectorDatos[9].equals("SI")) {
                    switch (medellin.showEspecifico) {
                        case "SILVESTRE DANGOND":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 750000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) * 750000) * 0.08) + 5000;
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                        case "MALUMA":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 1000000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) * 1000000) * 0.08) + 5000;
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                        case "BAD BUNNY":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 1500000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) * 1500000) * 0.08) + 5000;
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                    }
                } else {
                    switch (medellin.showEspecifico) {
                        case "SILVESTRE DANGOND":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 1000000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) *  1000000) * 0.08);
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                        case "MALUMA":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) *  1000000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) *  1000000) * 0.08);
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                        case "BAD BUNNY":
                            precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 1500000);
                            precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) *1500000) * 0.08);
                            ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                            break;
                    }
                }
            }else if (medellin.eventoGrafica.equals("CONFERENCIAS")) {
                //si es domiciolio o no
                if (ventana1.vectorDatos[9].equals("SI")) {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 70000);
                    precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) * 70000) * 0.08) + 5000;
                    ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                } else {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 70000);
                    precioTotal += (Integer.parseInt(ventana1.vectorDatos[10]) * 70000) * 0.08;
                    ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                }
            }else if(medellin.eventoGrafica.equals("EXPOSICIONES")){
                //si es domiciolio o no
                if (ventana1.vectorDatos[9].equals("SI")) {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 80000);
                    precioTotal += ((Integer.parseInt(ventana1.vectorDatos[10]) * 80000) * 0.08) + 5000;
                    ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                } else {
                    precioTotal = (Integer.parseInt(ventana1.vectorDatos[10]) * 80000);
                    precioTotal += (Integer.parseInt(ventana1.vectorDatos[10]) * 80000) * 0.08;
                    ventana1.vectorDatos[11] = String.valueOf(precioTotal);
                }
            }
        }
        
        //celular
        ventana1.vectorDatos[12]= fieldCelular.getText();
        //sitio del evento
        ventana1.vectorDatos[13] = comboPunto.getSelectedItem().toString();
        //fecha
        switch(ventana2.ciudadEspecifica){
            case "medellin":
                //fecha dependiendo del evento
                switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 7/09/2023  Hora7:00am");
                        break;
                    case "VOLEIBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 8/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        ventana1.vectorDatos[14]= ("Fecha: 9/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        ventana1.vectorDatos[14]= ("Fecha: 6/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        ventana1.vectorDatos[14]= ("Fecha: 9/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        ventana1.vectorDatos[14]= ("Fecha: 12/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        ventana1.vectorDatos[14]= ("Fecha: 9/08/2023 Hora 9:00pm");
               
                        break;
                    case "MALUMA":
                        ventana1.vectorDatos[14]= ("Fecha: 10/08/2023 Hora 9:00pm");
                    
                        break;
                    case "BAD BUNNY":
                        ventana1.vectorDatos[14]= ("Fecha: 11/08/2023 Hora 9:00pm");
                  
                        break;
                    case "PYTHON 2.0":
                        ventana1.vectorDatos[14]= ("Fecha: 20/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        ventana1.vectorDatos[14]= ("Fecha: 21/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        ventana1.vectorDatos[14]= ("Fecha: 22/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        ventana1.vectorDatos[14]= ("Fecha: 2/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        ventana1.vectorDatos[14]= ("Fecha: 3/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        ventana1.vectorDatos[14]= ("Fecha: 4/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
            case "barranquilla":
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 20/09/2023 Hora: 7:00am");
                        break;
                    case "VOLEIBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 21/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        ventana1.vectorDatos[14]= ("Fecha: 22/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        ventana1.vectorDatos[14]= ("Fecha: 20/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        ventana1.vectorDatos[14]= ("Fecha: 22/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        ventana1.vectorDatos[14]= ("Fecha: 23/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        ventana1.vectorDatos[14]= ("Fecha: 27/08/2023 Hora 9:00pm");
           
                        break;
                    case "MALUMA":
                        ventana1.vectorDatos[14]= ("Fecha: 28/08/2023 Hora 9:00pm");
                   
                        break;
                    case "BAD BUNNY":
                        ventana1.vectorDatos[14]= ("Fecha: 29/08/2023 Hora 9:00pm");
                 
                        break;
                    case "PYTHON 2.0":
                        ventana1.vectorDatos[14]= ("Fecha: 10/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        ventana1.vectorDatos[14]= ("Fecha: 11/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        ventana1.vectorDatos[14]= ("Fecha: 12/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        ventana1.vectorDatos[14]= ("Fecha: 13/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        ventana1.vectorDatos[14]= ("Fecha: 14/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        ventana1.vectorDatos[14]= ("Fecha: 15/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
            case "bogota":
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 13/09/2023 Hora: 7:00am'");
                        break;
                    case "VOLEIBOL":
                        ventana1.vectorDatos[14]= ("Fecha: 14/09/2023 Hora: 7:00am");
                        break;
                    case "TENNIS":
                        ventana1.vectorDatos[14]= ("Fecha: 15/09/2023 Hora: 7:00am");
                        break;
                    case "SANTA CLAUS":
                        ventana1.vectorDatos[14]= ("Fecha: 27/10/2023 Hora: 7:00pm");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        ventana1.vectorDatos[14]= ("Fecha: 28/10/2023 Hora: 7:00pm");
                        break;
                    case "OPERA":
                        ventana1.vectorDatos[14]= ("Fecha: 29/10/2023 Hora: 7:00pm");
                        break;
                    case "SILVESTRE DANGOND":
                        ventana1.vectorDatos[14]= ("Fecha: 15/08/2023 Hora 9:00pm");
                     
                        break;
                    case "MALUMA":
                        ventana1.vectorDatos[14]= ("Fecha: 17/08/2023 Hora 9:00pm");
               
                        break;
                    case "BAD BUNNY":
                        ventana1.vectorDatos[14]= ("Fecha: 18/08/2023 Hora 9:00pm");
                    
                        break;
                    case "PYTHON 2.0":
                        ventana1.vectorDatos[14]= ("Fecha: 1/06/2023 Hora: 9:00am");
                        break;
                    case "APRENDE TRAIDING":
                        ventana1.vectorDatos[14]= ("Fecha: 2/06/2023 Hora: 9:00am");
                        break;
                    case "CRISTO ESTA AQUI":
                        ventana1.vectorDatos[14]= ("Fecha: 2/06/2023 Hora: 9:00am");
                        break;
                    case "LA MONA LISA":
                        ventana1.vectorDatos[14]= ("Fecha: 22/07/2023 Hora: 4:00pm");
                        break;
                    case "LA MOMIA":
                        ventana1.vectorDatos[14]= ("Fecha: 23/07/2023 Hora: 4:00pm");
                        break;
                    case "LA ULTIMA CENA":
                        ventana1.vectorDatos[14]= ("Fecha: 24/07/2023 Hora: 4:00pm");
                        break;
                }
                break;
        }
        JOptionPane.showMessageDialog(null, "Precio total: "+ ventana1.vectorDatos[11]);
    
        //necesitamos declarar las variables que me permitiran escribir el archivo.
        try {
            //si le agregamsos ,true sobreescribe el archivo
            FileWriter arch_totales = new FileWriter("C:/Users/Johan Choles/Desktop/logica/proLog/datos.csv");
            PrintWriter linea_imp = new PrintWriter(arch_totales);

            contadorQuemado = 0;
            if (contadorQuemado < 1) {
                for (byte i = 0; i < 15; i++) {
                    linea_imp.print(ventana1.datosQuemados[i] + ";");
                }
                linea_imp.println("");
                contadorQuemado++;
                //recorremos el vector datos
                for (byte i = 0; i < 15; i++) {
                    linea_imp.print(ventana1.vectorDatos[i] + ";");
                }
                linea_imp.close();

            }

        } catch (Exception e) {
            System.out.println("Error llenando el archivo:" + e);
        }

        //creamos un contador que me permitira iniciar los datos quemados para el archivo
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuntoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuntoVentaActionPerformed

    private void showEspecificoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_showEspecificoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_showEspecificoAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkComprar;
    private javax.swing.JCheckBox checkDomicilio;
    private javax.swing.JCheckBox checkReservar;
    private javax.swing.JComboBox<String> comboPunto;
    private javax.swing.JComboBox<String> comboPuntoVenta;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldFechaEvento;
    private javax.swing.JPanel grafiquita;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCantidadBoletas;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelPagoAdicional;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JPanel panelComprar;
    private javax.swing.JLabel showEspecifico;
    // End of variables declaration//GEN-END:variables



}
