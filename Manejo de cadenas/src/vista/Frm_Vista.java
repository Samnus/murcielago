
package vista;

import datos.MurcielagoCipherExample;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Frm_Vista extends javax.swing.JFrame {

    MurcielagoCipherExample proces;
    boolean contenidoDesdeArchivo = false;
    File archivoSeleccionado = null;

    public Frm_Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_info = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_lt = new javax.swing.JTextField();
        txt_tp = new javax.swing.JTextField();
        txt_pl = new javax.swing.JTextField();
        txt_ul = new javax.swing.JTextField();
        txt_lc = new javax.swing.JTextField();
        txt_pp = new javax.swing.JTextField();
        txt_up = new javax.swing.JTextField();
        txt_pc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        txt_e = new javax.swing.JTextField();
        txt_i = new javax.swing.JTextField();
        txt_o = new javax.swing.JTextField();
        txt_u = new javax.swing.JTextField();
        txt_par = new javax.swing.JTextField();
        txt_impar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_datos = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_titulo.setText("MANEJO DE CADENAS");

        lbl_descripcion.setText("Ingrese un texto o abra un archivo.");

        txta_info.setColumns(20);
        txta_info.setRows(5);
        jScrollPane1.setViewportView(txta_info);

        btn_procesar.setText("PROCESAR");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        jLabel1.setText("Longitud de texto:");

        jLabel2.setText("Total de palabras:");

        jLabel3.setText("Primer letra del texto:");

        jLabel4.setText("Ultima letra del texto:");

        jLabel5.setText("Primera palabra del texto:");

        jLabel6.setText("Letra central del texto:");

        jLabel7.setText("Ultima palabra del texto:");

        jLabel8.setText("Palabra central del texto:");

        jLabel9.setText("Repeticiones con \"A\", \"a\" o \"á\"");

        jLabel10.setText("Repeticiones con \"E\", \"e\", o \"é\"");

        jLabel11.setText("Repeticiones con \"I\", \"i\", o \"í\"");

        jLabel12.setText("Repeticiones con \"O\", \"o\", u \"ó\"");

        jLabel13.setText("Repeticiones con \"U\", \"u\" o \"ú\"");

        jLabel14.setText("Palabras con cantidad de caracteres par:");

        jLabel15.setText("Palabras con cantidad de caracteres impar:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Traduccion a clave murcielago");

        txta_datos.setColumns(20);
        txta_datos.setRows(5);
        jScrollPane2.setViewportView(txta_datos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_procesar)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_titulo)
                        .addGap(186, 186, 186))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descripcion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_pl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_lc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_ul, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_pp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_lt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_up, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_e, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_i, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_u, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_o, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_impar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_descripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_procesar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_impar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mn_menu.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mn_menu.add(jMenuItem1);

        jMenuItem2.setText("Guardar como");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mn_menu.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mn_menu.add(jMenuItem3);

        jMenuBar1.add(mn_menu);

        jMenu2.setText("Editar");

        jMenuItem4.setText("Copiar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Cortar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Pegar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Buscar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Reemplazar");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        
        String texto = this.txta_info.getText();
        int longitud = texto.length();
        JFrame frame = new JFrame("Primera Letra");
        String[] palabras = texto.split("\\s+"); // Dividir el texto en palabras usando espacios en blanco como delimitador
        texto = texto.toLowerCase(); // Convertir el texto a minúsculas para contar 'a' y 'á'
        
        //LONGITUD DE TEXTO
        
        this.txt_lt.setText(Integer.toString(longitud));
        
        //CANTIDAD DE PALABRAS
        
        int cantidadPalabras = palabras.length;
        this.txt_tp.setText(Integer.toString(cantidadPalabras));
        
        //PRIMER LETRA DE TEXTO
        
            if (!texto.isEmpty()) {
                char primeraLetra = texto.charAt(0);
                this.txt_pl.setText(Character.toString(primeraLetra));
            } else {
                JOptionPane.showMessageDialog(frame, "El texto está vacío.");
            }
        
        //ULTIMA LETRA DE TEXTO
                
            if (longitud > 0) {
                char ultimaLetra = texto.charAt(longitud - 1);
                this.txt_ul.setText(Character.toString(ultimaLetra));
            } else {
                JOptionPane.showMessageDialog(frame, "El texto está vacío.");
            }
                
        //LETRA CENTRAL DEL TEXTO
        
            if (longitud > 0) {
                int indiceLetraCentral = longitud / 2;
                char letraCentral = texto.charAt(indiceLetraCentral);
                this.txt_lc.setText(Character.toString(letraCentral));
                } else {
                    JOptionPane.showMessageDialog(frame, "El texto está vacío.");
                }
        
        //PRIMERA PALABRA DEL TEXTO
                
            if (palabras.length > 0) {
                String primeraPalabra = palabras[0];
                this.txt_pp.setText(primeraPalabra);
                } else {
                    JOptionPane.showMessageDialog(frame, "El texto está vacío.");
                }
        
        //PALABRA CENTRAL DEL TEXTO
        
            if (palabras.length > 0) {
                int indicePalabraCentral = (palabras.length - 1) / 2;
                String palabraCentral = palabras[indicePalabraCentral];
                this.txt_pc.setText(palabraCentral);
            } else {
                JOptionPane.showMessageDialog(frame, "El texto está vacío.");
            }
        
        //ULTIMA PALABRA DEL TEXTO
        
            if (palabras.length > 0) {
                String ultimaPalabra = palabras[palabras.length - 1];
                this.txt_up.setText(ultimaPalabra);
            } else {
                JOptionPane.showMessageDialog(frame, "El texto está vacío.");
            }
            
        //Repeticiones con "A", "a" o "á"
        
            int conteo1 = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter == 'a' || caracter == 'á') {
                conteo1++;
                }
            }
            this.txt_a.setText(Integer.toString(conteo1));
        
        //Repeticiones con "E", "e", o "é"
        
            int conteo2 = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter == 'e' || caracter == 'é') {
                conteo2++;
                }
            }
            this.txt_e.setText(Integer.toString(conteo2));
        
        //Repeticiones con "I", "i", o "í"
        
            int conteo3 = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter == 'i' || caracter == 'í') {
                conteo3++;
                }
            }
            this.txt_i.setText(Integer.toString(conteo3));
        
        //Repeticiones con "O", "o", u "ó"
            
            int conteo4 = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter == 'o' || caracter == 'ó') {
                conteo4++;
                }
            }
            this.txt_o.setText(Integer.toString(conteo4));
            
        //Repeticiones con "U", "u" o "ú"
        
        int conteo5 = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (caracter == 'u' || caracter == 'ú') {
                conteo5++;
                }
            }
            this.txt_u.setText(Integer.toString(conteo5));
        
        //CANTIDAD PALABRAS PAR
        
        int contadorPalabrasPar = 0;
            for (String palabra : palabras) {
                if (palabra.length() % 2 == 0) { // Verificar si la longitud de la palabra es par
                    contadorPalabrasPar++;
                }
            }
            this.txt_par.setText(Integer.toString(contadorPalabrasPar));
        
        //CANTIDAD PALABRAS IMPAR
        
        int contadorPalabrasImpar = 0;
            for (String palabra : palabras) {
                if (palabra.length() % 2 != 0) { // Verificar si la longitud de la palabra es impar
                    contadorPalabrasImpar++;
                }
            }
            this.txt_impar.setText(Integer.toString(contadorPalabrasImpar));
        
        //TRADUCIR MURCIELAGO
        
        String textoTraducido = proces.traducirAMurcielago(texto);
        this.txta_datos.setText(textoTraducido);        

    }//GEN-LAST:event_btn_procesarActionPerformed
 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFrame frame = new JFrame("Seleccionar y Leer Archivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        
        JFileChooser fileChooser = new JFileChooser();

                // Establece un filtro para mostrar solo archivos de texto (.txt)
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
                fileChooser.setFileFilter(filter);

                int seleccion = fileChooser.showOpenDialog(frame);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    // El usuario seleccionó un archivo
                    archivoSeleccionado = fileChooser.getSelectedFile();

                    
                    // Lee el contenido del archivo y colócalo en la caja de texto
                    try {
                        FileReader archivo = new FileReader(archivoSeleccionado);
                        BufferedReader lector = new BufferedReader(archivo);
                        StringBuilder contenido = new StringBuilder();
                        String linea;

                        while ((linea = lector.readLine()) != null) {
                            contenido.append(linea).append("");
                        }

                        lector.close();
                        this.txta_info.setText(contenido.toString()); // Establece el contenido en la caja de texto
                        contenidoDesdeArchivo = true; // Indica que el contenido proviene de un archivo
   
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error al leer el archivo: " + ex.getMessage());
                    }
                } else if (seleccion == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(frame, "Selección de archivo cancelada.");
                }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Variable para indicar si el contenido proviene de un archivo
        
        JFrame frame = new JFrame("Validar Texto Desde Archivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
                    // Si el contenido proviene de un archivo, guarda el contenido en un nuevo archivo
                    JFileChooser fileChooser = new JFileChooser();

                    // Establece un filtro para mostrar solo archivos de texto (.txt)
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
                    fileChooser.setFileFilter(filter);

                    int seleccion = fileChooser.showSaveDialog(frame);

                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        String rutaGuardada = fileChooser.getSelectedFile().getAbsolutePath();

                        try {
                            FileWriter archivo = new FileWriter(rutaGuardada);
                            BufferedWriter escritor = new BufferedWriter(archivo);
                            escritor.write(this.txta_info.getText());
                            escritor.close();
                            JOptionPane.showMessageDialog(frame, "Archivo guardado exitosamente.");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(frame, "Error al guardar el archivo: " + ex.getMessage());
                        }
                    } else if (seleccion == JFileChooser.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(frame, "Guardado de archivo cancelado.");
                    }
                
                    // Si el contenido no proviene de un archivo, muestra un mensaje de advertencia
                   // JOptionPane.showMessageDialog(frame, "El contenido no proviene de un archivo y no se puede guardar.");
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFrame frame = new JFrame("Validar y Sobrescribir Archivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        if (contenidoDesdeArchivo && archivoSeleccionado != null) {
                    // Si el contenido proviene de un archivo y se seleccionó un archivo
                    try {
                        FileWriter archivo = new FileWriter(archivoSeleccionado);
                        BufferedWriter escritor = new BufferedWriter(archivo);
                        escritor.write(this.txta_info.getText());
                        escritor.close();
                        JOptionPane.showMessageDialog(frame, "Archivo sobrescrito exitosamente.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error al sobrescribir el archivo: " + ex.getMessage());
                    }
                } else {
                    // Si el contenido no proviene de un archivo o no se seleccionó un archivo, muestra un mensaje de advertencia
                    JOptionPane.showMessageDialog(frame, "No se puede sobrescribir el archivo.");
                }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Obtener el texto seleccionado en el JTextArea
            String textoSeleccionado = this.txta_info.getSelectedText();

            // Verificar si se seleccionó texto
            if (textoSeleccionado != null && !textoSeleccionado.isEmpty()) {
                // Obtener el portapapeles del sistema operativo
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

                // Crear un objeto StringSelection para almacenar el texto seleccionado
                StringSelection texto = new StringSelection(textoSeleccionado);

                // Colocar el texto en el portapapeles
                clipboard.setContents(texto, null);

                System.out.println("Texto copiado al portapapeles: " + textoSeleccionado);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    }
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Cortar el texto seleccionado en el JTextArea
                this.txta_info.cut();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Pegar el contenido del portapapeles en el JTextArea
                this.txta_info.paste();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
                JFrame frame = new JFrame("Buscar Palabra en JTextArea");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                
                // Panel para el formulario de búsqueda
                //JPanel searchPanel = new JPanel();
                JTextField searchField = new JTextField(20);
                //JButton searchButton = new JButton("Buscar");
                
                // Obtener la palabra a buscar desde el campo de texto
                String palabraABuscar = searchField.getText();

                // Obtener el texto del JTextArea
                String texto = this.txta_info.getText();

                // Realizar la búsqueda
                int index = texto.indexOf(palabraABuscar);

                if (index != -1) {
                    // Resaltar la palabra encontrada seleccionándola
                    this.txta_info.setSelectionStart(index);
                    this.txta_info.setSelectionEnd(index + palabraABuscar.length());
                } else {
                    JOptionPane.showMessageDialog(frame, "Palabra no encontrada.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenu mn_menu;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_e;
    private javax.swing.JTextField txt_i;
    private javax.swing.JTextField txt_impar;
    private javax.swing.JTextField txt_lc;
    private javax.swing.JTextField txt_lt;
    private javax.swing.JTextField txt_o;
    private javax.swing.JTextField txt_par;
    private javax.swing.JTextField txt_pc;
    private javax.swing.JTextField txt_pl;
    private javax.swing.JTextField txt_pp;
    private javax.swing.JTextField txt_tp;
    private javax.swing.JTextField txt_u;
    private javax.swing.JTextField txt_ul;
    private javax.swing.JTextField txt_up;
    private javax.swing.JTextArea txta_datos;
    private javax.swing.JTextArea txta_info;
    // End of variables declaration//GEN-END:variables
}
