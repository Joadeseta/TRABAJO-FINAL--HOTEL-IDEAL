package vistas;

import accesoDatos.HuespedData;
import accesoDatos.ReservaData;
import accesoDatos.TipoHabitacionData;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joadz
 */
public class ReservaVista extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
    private ArrayList<Reserva> listaR;

    private final ReservaData resvdat = new ReservaData();
    private Reserva resv = null;

    
    public ReservaVista() {
        initComponents();
        
        armarCabeceraTabla();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBBuscarIDResv = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jBBuscarIDHpd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jBBuscarCod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jBBuscarCantPers = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRBEstado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResv = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jRActivas = new javax.swing.JRadioButton();
        jRInactivas = new javax.swing.JRadioButton();
        jDateFechaEntrada = new com.toedter.calendar.JDateChooser();
        jDateFechaSalida = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("RESERVA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("ID de Reserva:");

        jBBuscarIDResv.setText("Buscar");
        jBBuscarIDResv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarIDResvActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("ID de Huesped:");

        jBBuscarIDHpd.setText("Buscar");
        jBBuscarIDHpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarIDHpdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Código:");

        jBBuscarCod.setText("Buscar");
        jBBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Cantidad de Personas:");

        jBBuscarCantPers.setText("Buscar");
        jBBuscarCantPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCantPersActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Fecha de Entrada:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Fecha de Salida:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Importe Total:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Estado:");

        jRBEstado.setBackground(new java.awt.Color(204, 255, 255));

        jTResv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTResv);

        jBNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jRActivas.setBackground(new java.awt.Color(204, 255, 255));
        jRActivas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRActivas.setForeground(new java.awt.Color(0, 153, 204));
        jRActivas.setText("Reservas Activas");
        jRActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRActivasActionPerformed(evt);
            }
        });

        jRInactivas.setBackground(new java.awt.Color(204, 255, 255));
        jRInactivas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRInactivas.setForeground(new java.awt.Color(0, 153, 204));
        jRInactivas.setText("Reservas Inactivas");
        jRInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInactivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRActivas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRInactivas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52)
                                .addComponent(jDateFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                    .addGap(54, 54, 54))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(7, 7, 7)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(60, 60, 60)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRBEstado)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jDateFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBBuscarIDResv)
                            .addComponent(jBBuscarIDHpd)
                            .addComponent(jBBuscarCod)
                            .addComponent(jBBuscarCantPers))))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jBNuevo)
                .addGap(91, 91, 91)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarIDResv))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscarIDHpd)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscarCod)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBBuscarCantPers)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jDateFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jRBEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRActivas)
                    .addComponent(jRInactivas))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarIDResvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarIDResvActionPerformed
        try {
            String idText = jTextField1.getText();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de ID de reserva.");
                return;
            }
            
            int id = Integer.parseInt(idText);

            resv = resvdat.buscarReservaPorIdReserva(id);

            if (resv != null) {
                jTextField1.setText(Integer.toString(resv.getIdReserva()));
                jTextField2.setText(Integer.toString(resv.getIdHuesped()));
                jTextField3.setText(Integer.toString(resv.getCodigo()));
                jTextField4.setText(Integer.toString(resv.getCantPersonas()));
                LocalDate lc = resv.getFecha_entrada();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDateFechaEntrada.setDate(date);
                LocalDate lc2 = resv.getFecha_salida();
                java.util.Date date2 = java.util.Date.from(lc2.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDateFechaSalida.setDate(date2);                
                jTextField8.setText(Double.toString(resv.getImporteTotal()));
                jRBEstado.setSelected(resv.isEstado());
                cargarDatosPorIdReserva();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese ID de reserva.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de ID reserva.");
        }
    }//GEN-LAST:event_jBBuscarIDResvActionPerformed

    private void jBBuscarIDHpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarIDHpdActionPerformed
        try {
            limpiarCamposExpIDHPD();
            String idText = jTextField2.getText();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de ID de huesped.");
                return;
            }
            
            int id = Integer.parseInt(idText);

            resv = resvdat.buscarReservaPorIdHuesped(id);

            if (resv != null) {
                jTextField2.setText(Integer.toString(resv.getIdHuesped()));
                cargarDatosPorIdHuesped();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese ID de huesped.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de ID huesped.");
        }
    }//GEN-LAST:event_jBBuscarIDHpdActionPerformed

    private void jBBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCodActionPerformed
        try {
            limpiarCamposExpCOD();
            String idText = jTextField3.getText();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de código.");
                return;
            }
            
            int id = Integer.parseInt(idText);

            resv = resvdat.buscarReservaPorCod(id);

            if (resv != null) {
                jTextField3.setText(Integer.toString(resv.getCodigo()));
                cargarDatosPorCod();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese código.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de código.");
        }
    }//GEN-LAST:event_jBBuscarCodActionPerformed

    private void jBBuscarCantPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCantPersActionPerformed
        try {
            limpiarCamposExpCantPers();
            String idText = jTextField4.getText();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de cantidad de personas.");
                return;
            }
            
            int id = Integer.parseInt(idText);

            resv = resvdat.buscarReservaPorCantPers(id);

            if (resv != null) {
                jTextField4.setText(Integer.toString(resv.getCantPersonas()));
                cargarDatosPorCantPers();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese ID de reserva.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de ID reserva.");
        }
    }//GEN-LAST:event_jBBuscarCantPersActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
        borrarFilaTabla();
        resv = null;
        cargarDatos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String idresvText = jTextField1.getText();
            String idhpdText = jTextField2.getText();
            String codText = jTextField3.getText();
            String cantPersText = jTextField4.getText();
            String impTotalText = jTextField8.getText();
            boolean estado = jRBEstado.isSelected();
            int idresv = Integer.parseInt(idresvText);
            int idhpd = Integer.parseInt(idhpdText);
            int cantPers = Integer.parseInt(cantPersText);
            int cod = Integer.parseInt(codText);
            double impTotal = Double.parseDouble(impTotalText);

            if (idresv < 0 || idhpd < 0 || cod < 0 || cantPers < 0 || impTotal < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese datos válidos en todos los campos obligatorios.");
                return;
            }
            
            java.util.Date fecha1 = jDateFechaEntrada.getDate();
            LocalDate fecha2 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            java.util.Date fecha3 = jDateFechaSalida.getDate();
            LocalDate fecha4 = fecha3.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (resv == null) {
                resv = new Reserva (idresv, idhpd, cod, cantPers, fecha2, fecha4, impTotal, estado);
                resvdat.agregarReserva(resv);
            } else if (resv != null){
                resv = new Reserva (idresv, idhpd, cod, cantPers, fecha2, fecha4, impTotal, estado);
                resvdat.actualizarReserva(resv);
            }
            
            limpiarCampos();
            borrarFilaTabla();
            resv = null;
            cargarDatos();
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo código.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar el tipo de habitación." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivasActionPerformed
        borrarFilaTabla();
        jRInactivas.setSelected(false);
        cargarDatosActivas();
    }//GEN-LAST:event_jRActivasActionPerformed

    private void jRInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInactivasActionPerformed
        borrarFilaTabla();
        jRActivas.setSelected(false);
        cargarDatosInactivas();
    }//GEN-LAST:event_jRInactivasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarCantPers;
    private javax.swing.JButton jBBuscarCod;
    private javax.swing.JButton jBBuscarIDHpd;
    private javax.swing.JButton jBBuscarIDResv;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDateFechaEntrada;
    private com.toedter.calendar.JDateChooser jDateFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRActivas;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRInactivas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResv;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();

        filaCabecera.add("IDReserva");
        filaCabecera.add("IDHuesped");
        filaCabecera.add("Código");
        filaCabecera.add("Cant. Pers");
        filaCabecera.add("Fecha Ent");
        filaCabecera.add("Fecha Sal");
        filaCabecera.add("ImporteTotal");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTResv.setModel(modelo);
    }

private void borrarFilaTabla() {
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice; i >= 0; i --) {
            modelo.removeRow(i);
        }
    }

private void cargarDatos() {
        listaR = (ArrayList) resvdat.listarReservas();
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private void cargarDatosActivas() {
        listaR = (ArrayList) resvdat.listarReservasActivas();
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private void cargarDatosInactivas() {
        listaR = (ArrayList) resvdat.listarReservasInactivas();
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private int obtenerIdReservaSeleccionado() {
    return Integer.parseInt(jTextField1.getText()); 
}

private void cargarDatosPorIdReserva(){
        int idSeleccionado = obtenerIdReservaSeleccionado();
        listaR = (ArrayList) resvdat.listarReservasPorIDReserva(idSeleccionado);
        modelo.setRowCount(0);
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private int obtenerIdHuespedSeleccionado() {
    return Integer.parseInt(jTextField2.getText()); 
}

private void cargarDatosPorIdHuesped(){
        int idSeleccionado = obtenerIdHuespedSeleccionado();
        listaR = (ArrayList) resvdat.listarReservasPorIDHuesped(idSeleccionado);
        modelo.setRowCount(0);
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private int obtenerCodSeleccionado() {
    return Integer.parseInt(jTextField3.getText()); 
}

private void cargarDatosPorCod(){
        int idSeleccionado = obtenerCodSeleccionado();
        listaR = (ArrayList) resvdat.listarReservasPorCod(idSeleccionado);
        modelo.setRowCount(0);
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private int obtenerCantPersSeleccionado() {
    return Integer.parseInt(jTextField4.getText()); 
}

private void cargarDatosPorCantPers(){
        int idSeleccionado = obtenerCantPersSeleccionado();
        listaR = (ArrayList) resvdat.listarReservasPorCantPers(idSeleccionado);
        modelo.setRowCount(0);
        for (Reserva r: listaR) {
            String estado = r.isEstado() ? "Ocupada" : "Desocupada";
            modelo.addRow(new Object[] {r.getIdReserva(), r.getIdHuesped(), r.getCodigo(), r.getCantPersonas(), r.getFecha_entrada(), r.getFecha_salida(), r.getImporteTotal(), estado});
        }
    }

private void limpiarCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jDateFechaEntrada.setDate(null);
        jDateFechaSalida.setDate(null);
        jTextField8.setText("");
        jRBEstado.setSelected(false);
    } 

private void limpiarCamposExpIDHPD() {
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jDateFechaEntrada.setDate(null);
        jDateFechaSalida.setDate(null);
        jTextField8.setText("");
        jRBEstado.setSelected(false);
    }

private void limpiarCamposExpCOD() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jDateFechaEntrada.setDate(null);
        jDateFechaSalida.setDate(null);
        jTextField8.setText("");
        jRBEstado.setSelected(false);
    }

private void limpiarCamposExpCantPers() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jDateFechaEntrada.setDate(null);
        jDateFechaSalida.setDate(null);
        jTextField8.setText("");
        jRBEstado.setSelected(false);
    } 
}
