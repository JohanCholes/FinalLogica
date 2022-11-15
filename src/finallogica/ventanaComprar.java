/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finallogica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
    public ventanaComprar() {
        initComponents();
        showEspecifico.setText(medellin.showEspecifico);
        //verificar la cantidad de boletas 5-1
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(5);
        nm.setMinimum(0);
        nm.setStepSize(1);
        jSpinner1.setModel(nm);
        //precio
        labelPrecio.setText("PRECIO TOTAL: $100");
        //asigamos la direccion de la variable global
        fieldDireccion.setText(ventana1.direccion);
        //dependiendo de la ciudad donde este, se mostraran tres puntos fijos de venta
        switch(ventana2.ciudadEspecifica){
            case "medellin":
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("Estación San Antonio");
                comboPuntoVenta.addItem("Parque Belén");
                comboPuntoVenta.addItem("Niquía");
                //agregar evento caracteristico de cada ciudad
                if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Estadio Atanasio Girardot");
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("Teatro José Gutierrez Gómez");
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Plaza de Toreos La Macarena");
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad Eafit");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Museo de Arte Moderno");
                }
                //fecha dependiendo del evento
                switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("Fecha:\n7/09/2023");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("");
                        break;
                    case "TENNIS":
                        fieldFechaEvento.setText("");
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("");
                        break;
                }
                break;
            case "barranquilla":
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("La ventana del mundo");
                comboPuntoVenta.addItem("Olímpica La 30");
                comboPuntoVenta.addItem("Universidad del Norte");
                //agregar evento caracteristico de cada ciudad
                 if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Estadio Metropolitano");
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("teatro José Consuegra Higgins");
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Puerta de Oro");
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad del Norte");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Museo Mapuka");
                }
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("");
                        break;
                    case "TENNIS":
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("");
                        break;
                }
                break;
            case "bogota":
                comboPuntoVenta.removeAll();
                comboPuntoVenta.addItem("Plaza Bolívar");
                comboPuntoVenta.addItem("Estación Caracas");
                comboPuntoVenta.addItem("C.C Santa Fé");
                //agregar evento caracteristico de cada ciudad
                 if (medellin.showEspecifico.equals("FUTBOL") || medellin.showEspecifico.equals("VOLEIBOL") || medellin.showEspecifico.equals("TENNIS")){
                    comboPunto.addItem("Parque Metropolitano El Tunal");
                }else if(medellin.showEspecifico.equals("SANTA CLAUS") || medellin.showEspecifico.equals("CIEN AÑOS DE SOLEDAD") || medellin.showEspecifico.equals("OPERA")){
                    comboPunto.addItem("Teatro Julio Mario Santo Domingo");
                }else if(medellin.showEspecifico.equals("SILVESTRE DANGOND") || medellin.showEspecifico.equals("MALUMA") || medellin.showEspecifico.equals("BAD BUNNY")){
                    comboPunto.addItem("Movistar Arena");
                }else if(medellin.showEspecifico.equals("PYTHON 2.0") || medellin.showEspecifico.equals("APRENDE TRAIDING") || medellin.showEspecifico.equals("CRISTO ESTA AQUI")){
                  comboPunto.addItem("Universidad de los Andes");
                }else if(medellin.showEspecifico.equals("LA MONA LISA") || medellin.showEspecifico.equals("LA MOMIA") || medellin.showEspecifico.equals("LA ULTIMA CENA")){
                    comboPunto.addItem("Palacio de Justicia");
                }
                  //fecha dependiendo del evento
                 switch (medellin.showEspecifico) {
                    case "FUTBOL":
                        fieldFechaEvento.setText("");
                        break;
                    case "VOLEIBOL":
                        fieldFechaEvento.setText("");
                        break;
                    case "TENNIS":
                        fieldFechaEvento.setText("");
                        break;
                    case "SANTA CLAUS":
                        fieldFechaEvento.setText("");
                        break;
                    case "CIEN AÑOS DE SOLEDAD":
                        fieldFechaEvento.setText("");
                        break;
                    case "OPERA":
                        fieldFechaEvento.setText("");
                        break;
                    case "SILVESTRE DANGOND":
                        fieldFechaEvento.setText("");
                        break;
                    case "MALUMA":
                        fieldFechaEvento.setText("");
                        break;
                    case "BAD BUNNY":
                        fieldFechaEvento.setText("");
                        break;
                    case "PYTHON 2.0":
                        fieldFechaEvento.setText("");
                        break;
                    case "APRENDE TRAIDING":
                        fieldFechaEvento.setText("");
                        break;
                    case "CRISTO ESTA AQUI":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MONA LISA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA MOMIA":
                        fieldFechaEvento.setText("");
                        break;
                    case "LA ULTIMA CENA":
                        fieldFechaEvento.setText("");
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

        fieldFechaEvento.setText("jTextField1");

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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelComprarLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelComprarLayout.createSequentialGroup()
                                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkComprar)
                                    .addComponent(checkDomicilio)
                                    .addComponent(labelCantidadBoletas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkReservar)
                                .addGap(25, 25, 25))
                            .addGroup(panelComprarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(grafiquita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelComprarLayout.createSequentialGroup()
                                        .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                            .addComponent(fieldDireccion))))))
                        .addGap(39, 39, 39))
                    .addGroup(panelComprarLayout.createSequentialGroup()
                        .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelComprarLayout.createSequentialGroup()
                                .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(comboPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addComponent(checkDomicilio)
                .addGap(26, 26, 26)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
    }//GEN-LAST:event_checkComprarActionPerformed

    private void checkReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReservarActionPerformed
        //quitamos la opcion a los otros botones
        checkComprar.setSelected(false);
        checkDomicilio.setSelected(false);
    }//GEN-LAST:event_checkReservarActionPerformed

    private void checkDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDomicilioActionPerformed
        // TODO add your handling code here:
        checkReservar.setSelected(false);
        
    }//GEN-LAST:event_checkDomicilioActionPerformed

    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JPanel panelComprar;
    private javax.swing.JLabel showEspecifico;
    // End of variables declaration//GEN-END:variables



}
