/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoDatos.TipoHabitacionData;
import accesoDatos.habitacionData;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HabitacionVista extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    private final habitacionData habitacionData = new habitacionData();
    private final TipoHabitacionData tipoHabitacionData = new TipoHabitacionData();
    private TipoHabitacion tipoHabitacion = null;
    private Habitacion habitacionActual = null;

    private List<HabitacionVista> lista;

    private DefaultTableModel tabla;

    public HabitacionVista() {
        initComponents();
        armarCabeceraTabla();
    }

    private void limpiarCampos() {
        jTextIDHABITACION.setText("");
        jTexTIPOHABITACION.setText("");
        jTextIdNUMEROHABITACION.setText("");
        jRadioESTADOHABITACION.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexTIPOHABITACION = new javax.swing.JTextField();
        jTextIDHABITACION = new javax.swing.JTextField();
        jButtonBUSCARHABITACION = new javax.swing.JButton();
        jTextIdNUMEROHABITACION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTODASLASHABITACIONES = new javax.swing.JTable();
        JLAlumno = new javax.swing.JLabel();
        jRadioESTADOHABITACION = new javax.swing.JRadioButton();
        JLAlumno1 = new javax.swing.JLabel();
        jBLimpiarCampos = new javax.swing.JButton();
        jBGuardarHABITACION = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBELIMINARHABITACION = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSalir3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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

        JLAlumno1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno1.setForeground(new java.awt.Color(0, 153, 204));
        JLAlumno1.setText("Habitaciones");

        jBLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBLimpiarCampos.setText("Nuevo");
        jBLimpiarCampos.setPreferredSize(new java.awt.Dimension(82, 25));
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jBGuardarHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBGuardarHABITACION.setText("Guardar");
        jBGuardarHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBGuardarHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarHABITACIONActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("id Habitación");

        jBELIMINARHABITACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBELIMINARHABITACION.setText("Eliminar");
        jBELIMINARHABITACION.setPreferredSize(new java.awt.Dimension(82, 25));
        jBELIMINARHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBELIMINARHABITACIONActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(277, 277, 277))
                    .addComponent(JLAlumno)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jBELIMINARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jBGuardarHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JLAlumno1)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTexTIPOHABITACION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextIdNUMEROHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioESTADOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextIDHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBUSCARHABITACION))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(49, Short.MAX_VALUE))
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
                    .addComponent(jTextIdNUMEROHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBUSCARHABITACION))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRadioESTADOHABITACION))
                .addGap(18, 18, 18)
                .addComponent(JLAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardarHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBELIMINARHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBUSCARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARHABITACIONActionPerformed
        try {
            int numHabitacion = Integer.parseInt(jTextIdNUMEROHABITACION.getText());

            habitacionActual = habitacionData.BuscarporNumeroHabitacion(numHabitacion);

            if (habitacionActual != null) {

                jTextIdNUMEROHABITACION.setText(Integer.toString(habitacionActual.getNumeroHabitacion()));
                jTexTIPOHABITACION.setText(Integer.toString(tipoHabitacion.getIdTipoHabitacion()));
                jRadioESTADOHABITACION.setSelected(habitacionActual.getEstado());
            } else {
                // Manejar el caso en que no se encuentre ningún alumno
                JOptionPane.showMessageDialog(this, "No se encontró ningún alumno con ese número.");
            }
        } catch (NumberFormatException nf) {
            // El usuario ingresó un valor no numérico en el campo de "Nº Alumno", muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de Nº Alumno");

        }
    }//GEN-LAST:event_jButtonBUSCARHABITACIONActionPerformed

    private void jRadioESTADOHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioESTADOHABITACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioESTADOHABITACIONActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed

        limpiarCampos();
        habitacionActual = null;
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    private void jBGuardarHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarHABITACIONActionPerformed
        try {
            String tipoHabit = jTexTIPOHABITACION.getText();
            int numeroHabitacion = Integer.parseInt(jTextIdNUMEROHABITACION.getText());
            boolean estado = jRadioESTADOHABITACION.isSelected();

            if (tipoHabit.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el tipo de habitación.");
                return;
            }

            if (habitacionActual == null) {
                // Crear una nueva habitación
                Habitacion habitacionActual = new Habitacion();
                habitacionActual.setTipoHabitacion(this.tipoHabitacion);
                habitacionActual.setNumeroHabitacion(numeroHabitacion);
                habitacionActual.setEstado(estado);

                // Aquí deberías agregar la lógica para guardar la habitación en la base de datos.
                // habitacionData.guardarHabitacion(habitacionActual);
                JOptionPane.showMessageDialog(this, "Habitación guardada exitosamente.");
            } else {
                // Actualizar la habitación existente
                habitacionActual.setTipoHabitacion(tipoHabitacion);
                habitacionActual.setNumeroHabitacion(numeroHabitacion);
                habitacionActual.setEstado(estado);

                // Aquí deberías agregar la lógica para actualizar la habitación en la base de datos.
                // habitacionData.actualizarHabitacion(habitacionActual);
                JOptionPane.showMessageDialog(this, "Habitación actualizada exitosamente.");
            }

            // Limpiar los campos y establecer habitacionActual a null
            limpiarCampos();
            habitacionActual = null;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo Número de Habitación.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar la habitación: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBGuardarHABITACIONActionPerformed

    private void jBELIMINARHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBELIMINARHABITACIONActionPerformed
        if (habitacionActual != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea inhabilitar esta habitacion?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Intenta eliminar al alumno
                    habitacionData.DesactivarEstadoHabitacion(habitacionActual.getIdHabitacion());

                    // Limpia los campos y establece alumnoActual a null
                    limpiarCampos();
                    habitacionActual = null;

                    JOptionPane.showMessageDialog(this, "Habitacion inhabilitada exitosamente.");
                } catch (Exception e) {
                    // Maneja las excepciones que puedan ocurrir durante la eliminación
                    JOptionPane.showMessageDialog(this, "Error al inhabilitar la habitación");
                }
            }
        } else {
            // Muestra un mensaje de advertencia si no se ha seleccionado un huesped
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna habitacion para inhabilitar.");
        }
        
    }//GEN-LAST:event_jBELIMINARHABITACIONActionPerformed
    
    
    

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();

        filaCabecera.add("ID");
        filaCabecera.add("Dni");
        filaCabecera.add("Nombre");
        filaCabecera.add("Celular");
        filaCabecera.add("Estado");
        filaCabecera.add("Domicilio");

        for (Object columnHeader : filaCabecera) {
            modelo.addColumn(columnHeader);
        }

        ArrayList<Habitacion> listaHabitaciones = habitacionData.obtenerTodasLasHabitaciones();
        modelo.setRowCount(0);

        // Iterar a través de la lista de huéspedes y agregarlos al modelo de tabla
        for (Habitacion habitacion : listaHabitaciones) {
            Object[] fila = {
                habitacion.getIdHabitacion(),
                habitacion.getCodigo(),
                habitacion.getNumeroHabitacion(),
                habitacion.getEstado(),};

            modelo.addRow(fila);
        }

        jtTODASLASHABITACIONES.setModel(modelo);
    }
    private void jBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalir3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JLabel JLAlumno1;
    private javax.swing.JButton jBELIMINARHABITACION;
    private javax.swing.JButton jBGuardarHABITACION;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBSalir3;
    private javax.swing.JButton jButtonBUSCARHABITACION;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioESTADOHABITACION;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexTIPOHABITACION;
    private javax.swing.JTextField jTextIDHABITACION;
    private javax.swing.JTextField jTextIdNUMEROHABITACION;
    private javax.swing.JTable jtTODASLASHABITACIONES;
    // End of variables declaration//GEN-END:variables
}
