package vistas;

import accesoDatos.TipoHabitacionData;
import entidades.TipoHabitacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tipohabitacionVista extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    private ArrayList<TipoHabitacion> listaTH;

    private final TipoHabitacionData tiphabdat = new TipoHabitacionData();
    private TipoHabitacion tiphab = null;

    public tipohabitacionVista() {
        initComponents();
        
        initComponents();
        armarCabeceraTabla();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBBuscarTHID = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jBBuscarTHC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jBBuscarTHCP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTipHab = new javax.swing.JTable();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(589, 776));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("TIPO DE HABITACIÓN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("ID de Tipo de Habitación:");

        jBBuscarTHID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscarTHID.setText("Buscar");
        jBBuscarTHID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTHIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Código de Tipo de Habitación:");

        jBBuscarTHC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscarTHC.setText("Buscar");
        jBBuscarTHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTHCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Capacidad de Personas:");

        jBBuscarTHCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscarTHCP.setText("Buscar");
        jBBuscarTHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTHCPActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Cantidad de Camas:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Tipo de Camas:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Precio por Noche:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Estado:");

        jRBEstado.setBackground(new java.awt.Color(204, 255, 255));
        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

        jTTipHab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTTipHab);

        jBNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRBEstado)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscarTHC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarTHID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarTHCP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(88, 88, 88)
                        .addComponent(jBEliminar)
                        .addGap(87, 87, 87)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBBuscarTHID)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarTHC)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscarTHCP)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jRBEstado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(42, 42, 42))
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

    private void jBBuscarTHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTHCActionPerformed
        try {
            String codText = jTextField2.getText();

            if (codText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de código.");
                return;
            }
            
            int cod = Integer.parseInt(codText);

            tiphab = tiphabdat.buscarTipoHabitacionPorCod(cod);

            if (tiphab != null) {
                jTextField1.setText(Integer.toString(tiphab.getIdTipoHabitacion()));
                jTextField2.setText(Integer.toString(tiphab.getCodigo()));
                jTextField3.setText(Integer.toString(tiphab.getCapMaxima()));
                jTextField4.setText(Integer.toString(tiphab.getCantCamas()));
                jTextField5.setText(tiphab.getTipoCamas());
                jTextField6.setText(Double.toString(tiphab.getPrecPorNoche()));
                jRBEstado.setSelected(tiphab.isEstado());
                cargarDatosPorCod();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese código.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de código.");
        }
    }//GEN-LAST:event_jBBuscarTHCActionPerformed

    private void jBBuscarTHIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTHIDActionPerformed
        try {
            String idText = jTextField1.getText();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de ID.");
                return;
            }
            
            int id = Integer.parseInt(idText);

            tiphab = tiphabdat.buscarTipoHabitacionPorId(id);

            if (tiphab != null) {
                jTextField1.setText(Integer.toString(tiphab.getIdTipoHabitacion()));
                jTextField2.setText(Integer.toString(tiphab.getCodigo()));
                jTextField3.setText(Integer.toString(tiphab.getCapMaxima()));
                jTextField4.setText(Integer.toString(tiphab.getCantCamas()));
                jTextField5.setText(tiphab.getTipoCamas());
                jTextField6.setText(Double.toString(tiphab.getPrecPorNoche()));
                jRBEstado.setSelected(tiphab.isEstado());
                cargarDatosPorId();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con ese ID.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de ID.");
        }
    }//GEN-LAST:event_jBBuscarTHIDActionPerformed

    private void jBBuscarTHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTHCPActionPerformed
        try {
            String cantPersText = jTextField3.getText();

            if (cantPersText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de cantidad de personas.");
                return;
            }
            
            int cantPers = Integer.parseInt(cantPersText);

            tiphab = tiphabdat.buscarTipoHabitacionPorCantPers(cantPers);

            if (tiphab != null) {
                jTextField1.setText(Integer.toString(tiphab.getIdTipoHabitacion()));
                jTextField2.setText(Integer.toString(tiphab.getCodigo()));
                jTextField3.setText(Integer.toString(tiphab.getCapMaxima()));
                jTextField4.setText(Integer.toString(tiphab.getCantCamas()));
                jTextField5.setText(tiphab.getTipoCamas());
                jTextField6.setText(Double.toString(tiphab.getPrecPorNoche()));
                jRBEstado.setSelected(tiphab.isEstado());
                cargarDatosPorCantPersonas();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tipo de habitación con esa cantidad de personas.");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de cantidad de personas.");
        }
    }//GEN-LAST:event_jBBuscarTHCPActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
        borrarFilaTabla();
        tiphab = null;
        cargarDatos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (tiphab != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar éste tipo de habitación?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    tiphabdat.eliminarTipoHabitacion(tiphab.getIdTipoHabitacion());
                    limpiarCampos();
                    tiphab = null;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el tipo de habitación.");
                }
            } else if (confirmacion == JOptionPane.NO_OPTION){
                try {
                    JOptionPane.showMessageDialog(this, "Usted no ha anulado ningún tipo de habitación.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el tipo de habitación.");
                }                
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún tipo de habitación para eliminar.");
        }
        borrarFilaTabla();
        cargarDatos();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String idText = jTextField1.getText();
            String codText = jTextField2.getText();
            String cantPersText = jTextField3.getText();
            String cantCamasText = jTextField4.getText();
            String tipoCamas = jTextField5.getText();
            String precNocheText = jTextField6.getText();
            boolean estado = jRBEstado.isSelected();
            int id = Integer.parseInt(idText);
            int cod = Integer.parseInt(codText);
            int cantPers = Integer.parseInt(cantPersText);
            int cantCamas = Integer.parseInt(cantCamasText);
            double precNoche = Double.parseDouble(precNocheText);

            if (id < 0 || cod < 0 || cantPers < 0 || cantCamas < 0 || tipoCamas.isEmpty() || precNoche < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese datos válidos en todos los campos obligatorios.");
                return;
            }

            if (tiphab == null) {
                tiphab = new TipoHabitacion(id, cod, cantPers, cantCamas, tipoCamas, precNoche, estado);
                tiphabdat.agregarTipoHabitacion(tiphab);
            } else if (tiphab != null){
                tiphab = new TipoHabitacion(id, cod, cantPers, cantCamas, tipoCamas, precNoche, estado);
                tiphabdat.actualizarTipoHabitacion(tiphab);
            }
            
            limpiarCampos();
            borrarFilaTabla();
            tiphab = null;
            cargarDatos();
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo código.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar el tipo de habitación." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarTHC;
    private javax.swing.JButton jBBuscarTHCP;
    private javax.swing.JButton jBBuscarTHID;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTipHab;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();

        filaCabecera.add("ID");
        filaCabecera.add("Código");
        filaCabecera.add("Cant. Pers");
        filaCabecera.add("Cant. Camas");
        filaCabecera.add("Tipo. Camas");
        filaCabecera.add("PrecioXNoche");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTTipHab.setModel(modelo);
    }

private void borrarFilaTabla() {
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice; i >= 0; i --) {
            modelo.removeRow(i);
        }
    }

private void cargarDatos() {
        listaTH = (ArrayList) tiphabdat.listarTipoHabitacion();
        for (TipoHabitacion th: listaTH) {
            modelo.addRow(new Object[] {th.getIdTipoHabitacion(), th.getCodigo(), th.getCapMaxima(), th.getCantCamas(), th.getTipoCamas(), th.getPrecPorNoche(), th.isEstado()});
        }
    }

private int obtenerIdSeleccionado() {
    return Integer.parseInt(jTextField1.getText()); 
}

private void cargarDatosPorId(){
        int idSeleccionado = obtenerIdSeleccionado();
        listaTH = (ArrayList) tiphabdat.listarTipoHabitacionPorID(idSeleccionado);
        modelo.setRowCount(0);
        for (TipoHabitacion th: listaTH) {
            modelo.addRow(new Object[] {th.getIdTipoHabitacion(), th.getCodigo(), th.getCapMaxima(), th.getCantCamas(), th.getTipoCamas(), th.getPrecPorNoche(), th.isEstado()});
        }
    }

private int obtenerCodSeleccionado() {
    return Integer.parseInt(jTextField2.getText()); 
}

private void cargarDatosPorCod(){
        int codSeleccionado = obtenerCodSeleccionado();
        listaTH = (ArrayList) tiphabdat.listarTipoHabitacionPorCod(codSeleccionado);
        modelo.setRowCount(0);
        for (TipoHabitacion th: listaTH) {
            modelo.addRow(new Object[] {th.getIdTipoHabitacion(), th.getCodigo(), th.getCapMaxima(), th.getCantCamas(), th.getTipoCamas(), th.getPrecPorNoche(), th.isEstado()});
        }
    }

private int obtenerCantPersonasSeleccionado() {
    return Integer.parseInt(jTextField3.getText()); 
}

private void cargarDatosPorCantPersonas(){
        int cantPersonasSeleccionadas = obtenerCantPersonasSeleccionado();
        listaTH = (ArrayList) tiphabdat.listarTipoHabitacionPorCantPers(cantPersonasSeleccionadas);
        modelo.setRowCount(0);
        for (TipoHabitacion th: listaTH) {
            modelo.addRow(new Object[] {th.getIdTipoHabitacion(), th.getCodigo(), th.getCapMaxima(), th.getCantCamas(), th.getTipoCamas(), th.getPrecPorNoche(), th.isEstado()});
        }
    }

private void limpiarCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jRBEstado.setSelected(false);
    }  
}
