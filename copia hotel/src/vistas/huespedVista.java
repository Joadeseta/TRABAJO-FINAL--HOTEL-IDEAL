/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoDatos.HuespedData;
import entidades.Huesped;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joadz
 */
public class huespedVista extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    private final HuespedData hueData = new HuespedData();
    private Huesped huespedActual = null;

    public huespedVista() {
        initComponents();
        armarCabeceraTabla();
        jtTODOSLOSHUESPEDES = new javax.swing.JTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNOMBREHUESPED = new javax.swing.JPanel();
        JLAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioESTADOHUESPED = new javax.swing.JRadioButton();
        jBLimpiarCampos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBGuardarHuesped = new javax.swing.JButton();
        jBELIMINARHUESPED = new javax.swing.JButton();
        jBSalir3 = new javax.swing.JButton();
        jTextNumeroDNI = new javax.swing.JTextField();
        jTextDOMICILIOHUESPED = new javax.swing.JTextField();
        jTextNOMBRE = new javax.swing.JTextField();
        jButtonBuscarPorDni = new javax.swing.JButton();
        jButtonBuscarPorId = new javax.swing.JButton();
        jTextIdHUESPED = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCORREOHUESPED = new javax.swing.JTextField();
        jTextCELULARHUESPED = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioHUESPEDESACTIVOS = new javax.swing.JRadioButton();
        jRadioHUESPEDESINACTIVOS = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTODOSLOSHUESPEDES = new javax.swing.JTable();

        jPanelNOMBREHUESPED.setBackground(new java.awt.Color(204, 255, 255));

        JLAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(0, 153, 204));
        JLAlumno.setText("HUESPEDES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Domicilio:");

        jRadioESTADOHUESPED.setBackground(new java.awt.Color(204, 255, 255));
        jRadioESTADOHUESPED.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioESTADOHUESPED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioESTADOHUESPEDActionPerformed(evt);
            }
        });

        jBLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBLimpiarCampos.setText("Nuevo");
        jBLimpiarCampos.setPreferredSize(new java.awt.Dimension(82, 25));
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Documento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");

        jBGuardarHuesped.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBGuardarHuesped.setText("Guardar");
        jBGuardarHuesped.setPreferredSize(new java.awt.Dimension(82, 25));
        jBGuardarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarHuespedActionPerformed(evt);
            }
        });

        jBELIMINARHUESPED.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBELIMINARHUESPED.setText("Eliminar");
        jBELIMINARHUESPED.setPreferredSize(new java.awt.Dimension(82, 25));
        jBELIMINARHUESPED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBELIMINARHUESPEDActionPerformed(evt);
            }
        });

        jBSalir3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalir3.setText("Salir");
        jBSalir3.setPreferredSize(new java.awt.Dimension(82, 25));
        jBSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir3ActionPerformed(evt);
            }
        });

        jButtonBuscarPorDni.setText("Buscar");
        jButtonBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPorDniActionPerformed(evt);
            }
        });

        jButtonBuscarPorId.setText("Buscar");
        jButtonBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPorIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nº Huesped");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");

        jTextCELULARHUESPED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCELULARHUESPEDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Celular:");

        jRadioHUESPEDESACTIVOS.setBackground(new java.awt.Color(204, 255, 255));
        jRadioHUESPEDESACTIVOS.setText("Huespedes Activos");

        jRadioHUESPEDESINACTIVOS.setBackground(new java.awt.Color(204, 255, 255));
        jRadioHUESPEDESINACTIVOS.setText("Huespedes Inactivos");
        jRadioHUESPEDESINACTIVOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioHUESPEDESINACTIVOSActionPerformed(evt);
            }
        });

        jtTODOSLOSHUESPEDES.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTODOSLOSHUESPEDES.setToolTipText("");
        jtTODOSLOSHUESPEDES.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jtTODOSLOSHUESPEDES);

        javax.swing.GroupLayout jPanelNOMBREHUESPEDLayout = new javax.swing.GroupLayout(jPanelNOMBREHUESPED);
        jPanelNOMBREHUESPED.setLayout(jPanelNOMBREHUESPEDLayout);
        jPanelNOMBREHUESPEDLayout.setHorizontalGroup(
            jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLAlumno)
                .addGap(232, 232, 232))
            .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(184, 184, 184)
                                    .addComponent(jRadioESTADOHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(149, 149, 149)
                                    .addComponent(jTextNumeroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBuscarPorDni))
                                .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextIdHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonBuscarPorId))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(376, 376, 376))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                    .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextCORREOHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextDOMICILIOHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextCELULARHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(83, 83, 83)))
                            .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                                        .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jBELIMINARHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jBGuardarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jRadioHUESPEDESACTIVOS)
                        .addGap(75, 75, 75)
                        .addComponent(jRadioHUESPEDESINACTIVOS)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelNOMBREHUESPEDLayout.setVerticalGroup(
            jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNOMBREHUESPEDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNumeroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarPorDni))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextIdHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarPorId))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDOMICILIOHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCORREOHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCELULARHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRadioESTADOHUESPED))
                .addGap(29, 29, 29)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioHUESPEDESACTIVOS)
                    .addComponent(jRadioHUESPEDESINACTIVOS))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanelNOMBREHUESPEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBELIMINARHUESPED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNOMBREHUESPED, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNOMBREHUESPED, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioESTADOHUESPEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioESTADOHUESPEDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioESTADOHUESPEDActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed

        limpiarCampos();
        huespedActual = null;
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed
    private void limpiarCampos() {
        jTextNumeroDNI.setText("");
        jTextNOMBRE.setText("");
        jTextIdHUESPED.setText("");
        jTextDOMICILIOHUESPED.setText("");
        jTextCELULARHUESPED.setText("");
        jTextCORREOHUESPED.setText("");
        jRadioESTADOHUESPED.setSelected(false);
    }


    private void jBGuardarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarHuespedActionPerformed

        try {
            /*Obtener los datos de los campos*/
            String dniS = jTextNumeroDNI.getText();
            /* Integer idHuesped = Integer.parseInt(jTextIdHUESPED.getText());*/
            String nombre = jTextNOMBRE.getText();
            String domicilio = jTextDOMICILIOHUESPED.getText();
            String correo = jTextCORREOHUESPED.getText();
            Integer celular = Integer.parseInt(jTextCELULARHUESPED.getText());
            boolean estado = jRadioESTADOHUESPED.isSelected();
            int dni = Integer.parseInt(dniS);

            if (dni <= 0 || nombre.isEmpty() || domicilio.isEmpty() || correo.isEmpty() || celular <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese datos válidos en todos los campos obligatorios.");
                return;
            }

            if (huespedActual == null) {
                // Crear un nuevo alumno
                huespedActual = new Huesped(nombre, dni, domicilio, correo, celular, estado);
                hueData.agregarHuesped(huespedActual);
                JOptionPane.showMessageDialog(this, "huesped guardado exitosamente.");

            } else {

                huespedActual.setDni(dni);
                huespedActual.setNombre(nombre);
                huespedActual.setDomicilio(domicilio);
                huespedActual.setCorreo(correo);
                huespedActual.setCelular(celular);
                huespedActual.setEstado(estado);
                ;
                JOptionPane.showMessageDialog(this, "Huesped guardado exitosamente.");
            }
            // Limpiar los campos y establecer alumnoActual a null
            limpiarCampos();
            huespedActual = null;

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo DNI.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar o modificar al alumno: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jBGuardarHuespedActionPerformed

    private void jBELIMINARHUESPEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBELIMINARHUESPEDActionPerformed
        if (huespedActual != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este Huesped?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    // Intenta eliminar al alumno
                    hueData.eliminaHuesped(huespedActual.getIdHuesped());

                    // Limpia los campos y establece alumnoActual a null
                    limpiarCampos();
                    huespedActual = null;

                    JOptionPane.showMessageDialog(this, "Huesped eliminado exitosamente.");
                } catch (Exception e) {
                    // Maneja las excepciones que puedan ocurrir durante la eliminación
                    JOptionPane.showMessageDialog(this, "Error al eliminar al huesped: ");
                }
            }
        } else {
            // Muestra un mensaje de advertencia si no se ha seleccionado un huesped
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún huesped para eliminar.");
        }

    }//GEN-LAST:event_jBELIMINARHUESPEDActionPerformed

    private void jBSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalir3ActionPerformed

    private void jButtonBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPorDniActionPerformed

        try {
            // Obtiene el DNI ingresado como texto desde jTextNumeroDNI
            String dniText = jTextNumeroDNI.getText();

            // Verifica si el campo de DNI está vacío
            if (dniText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un número de DNI.");
                return; // Sale de la función si no se ingresó un DNI válido.
            }

            // Convertir el DNI a un entero
            int dni = Integer.parseInt(dniText);

            // Busca al alumno por DNI en la base de datos
            huespedActual = hueData.buscarPorDni(dni);

            // Verifica si se encontró al alumno
            if (huespedActual != null) {
                // Actualiza los campos de la interfaz con los datos del alumno
                jTextIdHUESPED.setText(Integer.toString(huespedActual.getIdHuesped()));
                jTextNOMBRE.setText(huespedActual.getNombre());
                jTextCELULARHUESPED.setText(Integer.toString(huespedActual.getCelular()));
                jTextDOMICILIOHUESPED.setText(huespedActual.getDomicilio());
                jRadioESTADOHUESPED.setSelected(huespedActual.isEstado());
            } else {
                // El alumno no se encontró en la base de datos
                JOptionPane.showMessageDialog(this, "No se encontró ningún alumno con ese DNI.");
            }

        } catch (NumberFormatException nf) {
            // El usuario ingresó un valor no numérico en el campo de DNI
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de DNI.");
        }

    }//GEN-LAST:event_jButtonBuscarPorDniActionPerformed

    private void jButtonBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPorIdActionPerformed
        try {
            int numHuesped = Integer.parseInt(jTextIdHUESPED.getText());
            huespedActual = hueData.buscarHuesped(numHuesped);

            if (huespedActual != null) {

                jTextIdHUESPED.setText(Integer.toString(huespedActual.getDni()));
                jTextNOMBRE.setText(huespedActual.getNombre());
                jTextCELULARHUESPED.setText(Integer.toString(huespedActual.getCelular()));
                jTextDOMICILIOHUESPED.setText(huespedActual.getDomicilio());
                jTextCORREOHUESPED.setText(huespedActual.getCorreo());
                jRadioESTADOHUESPED.setSelected(huespedActual.isEstado());
            } else {
                // Manejar el caso en que no se encuentre ningún alumno
                JOptionPane.showMessageDialog(this, "No se encontró ningún alumno con ese número.");
            }
        } catch (NumberFormatException nf) {
            // El usuario ingresó un valor no numérico en el campo de "Nº Alumno", muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en el campo de Nº Alumno");

        }

    }//GEN-LAST:event_jButtonBuscarPorIdActionPerformed

    private void jTextCELULARHUESPEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCELULARHUESPEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCELULARHUESPEDActionPerformed

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

        ArrayList<Huesped> listaHuespedes = hueData.obtenerTodosLosHuespedes();
        modelo.setRowCount(0);

        // Iterar a través de la lista de huéspedes y agregarlos al modelo de tabla
        for (Huesped huesped : listaHuespedes) {
            Object[] fila = {
                huesped.getIdHuesped(),
                huesped.getDni(),
                huesped.getNombre(),
                huesped.getCelular(),
                huesped.isEstado(),
                huesped.getDomicilio()
            };

            modelo.addRow(fila);
        }

        jtTODOSLOSHUESPEDES.setModel(modelo);
    }

    private void jRadioHUESPEDESINACTIVOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioHUESPEDESINACTIVOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioHUESPEDESINACTIVOSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JButton jBELIMINARHUESPED;
    private javax.swing.JButton jBGuardarHuesped;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBSalir3;
    private javax.swing.JButton jButtonBuscarPorDni;
    private javax.swing.JButton jButtonBuscarPorId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelNOMBREHUESPED;
    private javax.swing.JRadioButton jRadioESTADOHUESPED;
    private javax.swing.JRadioButton jRadioHUESPEDESACTIVOS;
    private javax.swing.JRadioButton jRadioHUESPEDESINACTIVOS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCELULARHUESPED;
    private javax.swing.JTextField jTextCORREOHUESPED;
    private javax.swing.JTextField jTextDOMICILIOHUESPED;
    private javax.swing.JTextField jTextIdHUESPED;
    private javax.swing.JTextField jTextNOMBRE;
    private javax.swing.JTextField jTextNumeroDNI;
    private javax.swing.JTable jtTODOSLOSHUESPEDES;
    // End of variables declaration//GEN-END:variables
}
