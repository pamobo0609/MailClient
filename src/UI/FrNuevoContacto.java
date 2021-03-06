/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.Contacto;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Pablo MB
 */
public class FrNuevoContacto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrNuevoContacto
     */
    public FrNuevoContacto() {
        initComponents();
        this.btnGuardarCambios.setVisible(false);
        this.btnEliminar.enable(false);
        
        this.setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNCPrincipal = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblApodo = new javax.swing.JLabel();
        txtApodo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblContactos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContactos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        panelNCPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar nuevo contacto"));

        lblCorreo.setText("Correo:");

        lblApodo.setText("Apodo:");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/folder_new.png"))); // NOI18N
        btnAgregar.setText("Agregar contacto!");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/cancel2.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblContactos.setText("Contactos previamente registrados:");

        tbContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Correo electrónico", "Apodo"
            }
        ));
        jScrollPane1.setViewportView(tbContactos);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar contacto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/save_all.png"))); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNCPrincipalLayout = new javax.swing.GroupLayout(panelNCPrincipal);
        panelNCPrincipal.setLayout(panelNCPrincipalLayout);
        panelNCPrincipalLayout.setHorizontalGroup(
            panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                                .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar))
                                    .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                                        .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCorreo)
                                            .addComponent(lblApodo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtApodo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(txtCorreo))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarCambios))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNCPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        panelNCPrincipalLayout.setVerticalGroup(
            panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNCPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApodo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNCPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(lblContactos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNCPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNCPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Contacto contacto = new Contacto(txtCorreo.getText(), txtApodo.getText());
        if(contacto.agregarContacto())
            JOptionPane.showMessageDialog(null, "Éxito al guardar!","Alerta!",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Error al guardar,intente de nuevo","Alerta!",JOptionPane.ERROR);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtApodo.setText("");
        txtCorreo.setText("");
        btnGuardarCambios.disable();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        txtCorreo.enable(false);
        Contacto c = new Contacto(txtCorreo.getText(), txtApodo.getText());
        if(c.editarContacto())
            JOptionPane.showMessageDialog(null, "Éxito al editar!","Alerta!",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Error al editar,intente de nuevo","Alerta!",JOptionPane.ERROR);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApodo;
    private javax.swing.JLabel lblContactos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JPanel panelNCPrincipal;
    private javax.swing.JTable tbContactos;
    private javax.swing.JTextField txtApodo;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
