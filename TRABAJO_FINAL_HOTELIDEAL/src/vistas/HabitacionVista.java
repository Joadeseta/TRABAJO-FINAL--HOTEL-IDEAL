/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoDatos.TipoHabitacionData;
import accesoDatos.habitacionData;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HabitacionVista extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    private final TipoHabitacionData tipoHabitacionData = new TipoHabitacionData();
    private TipoHabitacion tipoHabitacion = null;
    private final habitacionData habitacionData = new habitacionData();
    private Habitacion habitacionActual = null;

    public HabitacionVista() {
        initComponents();
        armarCabeceraTabla();
        armarTabla();
    }

    private void limpiarCampos() {
        jTextIDHABITACION.setText("");
        jTexTIPOHABITACION.setText("");
        jTextNUMEROHABITACION.setText("");
        OcupadaDesocuopada.setText("***********");
        OcupadaDesocuopada.setForeground(Color.CYAN);
        jRadioESTADOHABITACION.setSelected(false);
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexTIPOHABITACION = new javax.swing.JTextField();
        jTextIDHABITACION = new javax.swing.JTextField();
        jButtonBUSCARHABITACION = new javax.swing.JButton();
        jTextNUMEROHABITACION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTODASLASHABITACIONES = new javax.swing.JTable();
        JLAlumno = new javax.swing.JLabel();
        jRadioESTADOHABITACION = new javax.swing.JRadioButton();
        OcupadaDesocuopada = new javax.swing.JLabel();
        jBLimpiarCampos = new javax.swing.JButton();
        jBCREARHABITACION = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBDESOSUPARHABITACION = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSalir3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JLAlumno2 = new javax.swing.JLabel();
        jBoCUPARHABITACION = new javax.swing.JButton();
        jBACTUALIZARHABITACION = new javax.swing.JButton();

        jButtonBUSCARHABITACION.setText("Buscar");
        jButtonBUSCARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUSCARHABITACIONActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Número Habitación");

        jtTODASLASHABITACIONES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTODASLASHABITACIONES.setToolTipText("");
        jtTODASLASHABITACIONES.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jtTODASLASHABITACIONES);

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 204));
        JLAlumno.setText("HABITACIÓN");

        jRadioESTADOHABITACION.setBackground(new java.awt.Color(204, 255, 255));
        jRadioESTADOHABITACION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioESTADOHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioESTADOHABITACIONActionPerformed(evt);
            }
        });

        OcupadaDesocuopada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OcupadaDesocuopada.setForeground(new java.awt.Color(0, 153, 204));
        OcupadaDesocuopada.setText("***********");

        jBLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBLimpiarCampos.setText("Limpiar campos");
        jBLimpiarCampos.setPreferredSize(new java.awt.Dimension(82, 25));
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jBCREARHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCREARHABITACION.setText("Crear habitación");
        jBCREARHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBCREARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCREARHABITACIONActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("id Habitación");

        jBDESOSUPARHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBDESOSUPARHABITACION.setText("Desocupar habitación");
        jBDESOSUPARHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBDESOSUPARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDESOSUPARHABITACIONActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tipo Habitación(codigo)");

        jBSalir3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir3.setText("Salir");
        jBSalir3.setPreferredSize(new java.awt.Dimension(82, 25));
        jBSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");

        JLAlumno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno2.setForeground(new java.awt.Color(0, 153, 204));
        JLAlumno2.setText("Habitaciones");

        jBoCUPARHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBoCUPARHABITACION.setText("Ocupar habitación");
        jBoCUPARHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBoCUPARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoCUPARHABITACIONActionPerformed(evt);
            }
        });

        jBACTUALIZARHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBACTUALIZARHABITACION.setText("Actualizar habitación");
        jBACTUALIZARHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBACTUALIZARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBACTUALIZARHABITACIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JLAlumno)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTexTIPOHABITACION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextNUMEROHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextIDHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBUSCARHABITACION))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioESTADOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OcupadaDesocuopada))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBSalir3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBDESOSUPARHABITACION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCREARHABITACION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBoCUPARHABITACION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBACTUALIZARHABITACION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(JLAlumno2)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIDHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTexTIPOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextNUMEROHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBUSCARHABITACION))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jRadioESTADOHABITACION)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(OcupadaDesocuopada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCREARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBACTUALIZARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBoCUPARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDESOSUPARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(JLAlumno2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBUSCARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARHABITACIONActionPerformed
        try {
            int numHabitacion = Integer.parseInt(jTextNUMEROHABITACION.getText());

            habitacionActual = habitacionData.BuscarporNumeroHabitacion(numHabitacion);

            if (habitacionActual != null) {
                jTextIDHABITACION.setText(Integer.toString(habitacionActual.getIdHabitacion()));
                jTextNUMEROHABITACION.setText(Integer.toString(habitacionActual.getNumeroHabitacion()));
                jTexTIPOHABITACION.setText(Integer.toString(habitacionActual.getCodigo()));
                if (habitacionActual.getEstado()) {
                    jRadioESTADOHABITACION.setSelected(true);
                    OcupadaDesocuopada.setText("Ocupada");
                    OcupadaDesocuopada.setForeground(Color.RED);
                } else {
                    jRadioESTADOHABITACION.setSelected(false);
                    OcupadaDesocuopada.setText("Desocupada");
                    OcupadaDesocuopada.setForeground(Color.GREEN);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna habitación con ese número.");

            }
        } catch (NumberFormatException nf) {

            JOptionPane.showMessageDialog(this, "Ingrese un número por favor");

        }


    }//GEN-LAST:event_jButtonBUSCARHABITACIONActionPerformed

    private void jRadioESTADOHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioESTADOHABITACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioESTADOHABITACIONActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed

        limpiarCampos();
        habitacionActual = null;
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    private void jBCREARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCREARHABITACIONActionPerformed

        try {
            String tipoHabit = jTexTIPOHABITACION.getText();
            int numeroHabitacion = Integer.parseInt(jTextNUMEROHABITACION.getText());
            boolean estado = jRadioESTADOHABITACION.isSelected();

            if (tipoHabit.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el tipo de habitación.");
                return;
            }

            int tipoHabitInt = Integer.parseInt(tipoHabit);

            if (tipoHabitInt < 1 || tipoHabitInt > 3) {
                JOptionPane.showMessageDialog(this, "Ingrese el codigo o tipo de habitación entre 1 y 3.");
                return;
            }
            if (habitacionActual == null) {

                Habitacion nuevaHabitacion = new Habitacion();
                nuevaHabitacion.setCodigo(tipoHabitInt);
                nuevaHabitacion.setNumeroHabitacion(numeroHabitacion);
                nuevaHabitacion.setEstado(estado);

                habitacionData.crearHabitacion(nuevaHabitacion);

            } else {

                JOptionPane.showMessageDialog(this, "La habitación ya existe, no se ha realizado ninguna actualización.");

            }

            limpiarCampos();
            habitacionActual = null;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar la habitación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBCREARHABITACIONActionPerformed

    private void jBDESOSUPARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDESOSUPARHABITACIONActionPerformed
        if (habitacionActual != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea marcar esta habitacion como desocupada?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {

                    habitacionData.DesactivarEstadoHabitacion(habitacionActual.getNumeroHabitacion());

                    limpiarCampos();
                    habitacionActual = null;

                    /*JOptionPane.showMessageDialog(this, "Habitación desocupada exitosamente.");*/
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Error al inhabilitar la habitación");
                }
            }
        } else {

            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna habitacion para inhabilitar.");
        }

    }//GEN-LAST:event_jBDESOSUPARHABITACIONActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();

        filaCabecera.add("ID");
        filaCabecera.add("Codigo de la Habitación");
        filaCabecera.add("Numero de Habitación");
        filaCabecera.add("Estado");

        for (Object columnHeader : filaCabecera) {
            modelo.addColumn(columnHeader);
        }

    }

    private void armarTabla() {
        
        ArrayList<Habitacion> listaHabitaciones = habitacionData.obtenerTodasLasHabitaciones();
        modelo.setRowCount(0);
        for (Habitacion habitacion : listaHabitaciones) {
            String estado = habitacion.getEstado() ? "Ocupada" : "Desocupada";
            String tipoHabitacion = obtenerTipoHabitacion(habitacion.getCodigo());
            Object[] fila = {
                habitacion.getIdHabitacion(),
                tipoHabitacion,
                habitacion.getNumeroHabitacion(),
                estado};

            modelo.addRow(fila);
        }

        jtTODASLASHABITACIONES.setModel(modelo);
    }

    private String obtenerTipoHabitacion(int codigo) {
        String tipoHabitacion;

        switch (codigo) {
            case 1:
                tipoHabitacion = "Tipo 1/Simple/1 Persona ";
                break;
            case 2:
                tipoHabitacion = "Tipo 2/Doble/2 Personas";
                break;
            case 3:
                tipoHabitacion = "Tipo 3/Triple/2 Personas";
                break;
            default:
                tipoHabitacion = "Desconocido";
                break;
        }

        return tipoHabitacion;
    }
    private void jBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalir3ActionPerformed

    private void jBoCUPARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoCUPARHABITACIONActionPerformed
        if (habitacionActual != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea marcar esta habitacion como ocupada?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {

                    habitacionData.ActivarEstadoHabitacion(habitacionActual.getNumeroHabitacion());

                    limpiarCampos();
                    habitacionActual = null;

                    /* JOptionPane.showMessageDialog(this, "Habitación ocupada exitosamente.");*/
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Error al inhabilitar la habitación");
                }
            }
        } else {

            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna habitacion para inhabilitar.");
        }
    }//GEN-LAST:event_jBoCUPARHABITACIONActionPerformed

    private void jBACTUALIZARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBACTUALIZARHABITACIONActionPerformed

        try {
            String tipoHabit = jTexTIPOHABITACION.getText();
            int numeroHabitacion = Integer.parseInt(jTextNUMEROHABITACION.getText());
            boolean estado = jRadioESTADOHABITACION.isSelected();

            if (tipoHabit.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el tipo de habitación.");
                return;
            }

            int tipoHabitInt = Integer.parseInt(tipoHabit);

            if (tipoHabitInt < 1 || tipoHabitInt > 3) {
                JOptionPane.showMessageDialog(this, "Ingrese el codigo o tipo de habitación entre 1 y 3.");
                return;
            }
            if (habitacionActual != null) {

                habitacionActual.setCodigo(tipoHabitInt);
                habitacionActual.setNumeroHabitacion(numeroHabitacion);
                habitacionActual.setEstado(estado);

                habitacionData.ModificarHabitacion(habitacionActual);

                /*JOptionPane.showMessageDialog(this, "Habitación actualizada exitosamente.");*/
            } else {
                JOptionPane.showMessageDialog(this, "La habitación no existe, cree una o seleccione una que ya exista.");
            }

            limpiarCampos();
            habitacionActual = null;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar la habitación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBACTUALIZARHABITACIONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JLabel JLAlumno2;
    private javax.swing.JLabel OcupadaDesocuopada;
    private javax.swing.JButton jBACTUALIZARHABITACION;
    private javax.swing.JButton jBCREARHABITACION;
    private javax.swing.JButton jBDESOSUPARHABITACION;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBSalir3;
    private javax.swing.JButton jBoCUPARHABITACION;
    private javax.swing.JButton jButtonBUSCARHABITACION;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioESTADOHABITACION;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexTIPOHABITACION;
    private javax.swing.JTextField jTextIDHABITACION;
    private javax.swing.JTextField jTextNUMEROHABITACION;
    private javax.swing.JTable jtTODASLASHABITACIONES;
    // End of variables declaration//GEN-END:variables
}
