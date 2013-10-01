/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Jose Pablo MB
 */
public class FrPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrPrincipal
     */
    public FrPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        btnNuevoCorreo = new javax.swing.JButton();
        btnNuevoContacto = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        tabbedBandeja = new javax.swing.JTabbedPane();
        tabBandeja = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBandejaEntrada = new javax.swing.JTable();
        tabElementos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableElementosEnviados = new javax.swing.JTable();
        tabBorradores = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBorradores = new javax.swing.JTable();
        tabThrash = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableThrash = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        nuevoCorreo = new javax.swing.JMenuItem();
        nuevaBandeja = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        listaContactos = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        mantenimiento = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenu();
        acercaD = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnNuevoCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/window_new.png"))); // NOI18N
        btnNuevoCorreo.setText("Nuevo correo...");

        btnNuevoContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/folder_new.png"))); // NOI18N
        btnNuevoContacto.setText("Nuevo contacto...");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/folder_new.png"))); // NOI18N
        btnRegistrar.setText("Registrar nuevo correo");

        tabbedBandeja.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableBandejaEntrada.setModel(new javax.swing.table.DefaultTableModel(
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
                "Recibido de:", "Asunto"
            }
        ));
        jScrollPane1.setViewportView(tableBandejaEntrada);

        javax.swing.GroupLayout tabBandejaLayout = new javax.swing.GroupLayout(tabBandeja);
        tabBandeja.setLayout(tabBandejaLayout);
        tabBandejaLayout.setHorizontalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabBandejaLayout.setVerticalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedBandeja.addTab("Bandeja de entrada", tabBandeja);

        tableElementosEnviados.setModel(new javax.swing.table.DefaultTableModel(
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
                "Para:", "Asunto"
            }
        ));
        jScrollPane2.setViewportView(tableElementosEnviados);

        javax.swing.GroupLayout tabElementosLayout = new javax.swing.GroupLayout(tabElementos);
        tabElementos.setLayout(tabElementosLayout);
        tabElementosLayout.setHorizontalGroup(
            tabElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabElementosLayout.setVerticalGroup(
            tabElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabElementosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedBandeja.addTab("Elementos enviados", tabElementos);

        tableBorradores.setModel(new javax.swing.table.DefaultTableModel(
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
                "Para:", "Asunto"
            }
        ));
        jScrollPane3.setViewportView(tableBorradores);

        javax.swing.GroupLayout tabBorradoresLayout = new javax.swing.GroupLayout(tabBorradores);
        tabBorradores.setLayout(tabBorradoresLayout);
        tabBorradoresLayout.setHorizontalGroup(
            tabBorradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBorradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabBorradoresLayout.setVerticalGroup(
            tabBorradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBorradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedBandeja.addTab("Borradores", tabBorradores);

        tableThrash.setModel(new javax.swing.table.DefaultTableModel(
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
                "Recibido de:", "Asunto"
            }
        ));
        jScrollPane4.setViewportView(tableThrash);

        javax.swing.GroupLayout tabThrashLayout = new javax.swing.GroupLayout(tabThrash);
        tabThrash.setLayout(tabThrashLayout);
        tabThrashLayout.setHorizontalGroup(
            tabThrashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThrashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabThrashLayout.setVerticalGroup(
            tabThrashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabThrashLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        tabbedBandeja.addTab("Thrash", tabThrash);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/delete.png"))); // NOI18N
        jButton1.setText("Eliminar");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnNuevoCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoContacto)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tabbedBandeja, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(50, 50, 50))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tabbedBandeja, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        file.setText("File");

        nuevoCorreo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevoCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/window_new.png"))); // NOI18N
        nuevoCorreo.setText("Nuevo correo...");
        file.add(nuevoCorreo);

        nuevaBandeja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/folder_new.png"))); // NOI18N
        nuevaBandeja.setText("Registrar correo");
        file.add(nuevaBandeja);
        file.add(separador);

        listaContactos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        listaContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/preferences_contact_list.png"))); // NOI18N
        listaContactos.setText("Contactos");
        file.add(listaContactos);

        menuBar.add(file);

        edit.setText("Edit");

        mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/maintenance_time.png"))); // NOI18N
        mantenimiento.setText("Mantenimiento...");
        edit.add(mantenimiento);

        menuBar.add(edit);

        acerca.setText("Acerca de...");

        acercaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/info.png"))); // NOI18N
        acercaD.setText("Acerca de esta aplicación");
        acerca.add(acercaD);

        menuBar.add(acerca);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acerca;
    private javax.swing.JMenuItem acercaD;
    private javax.swing.JButton btnNuevoContacto;
    private javax.swing.JButton btnNuevoCorreo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem listaContactos;
    private javax.swing.JMenuItem mantenimiento;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nuevaBandeja;
    private javax.swing.JMenuItem nuevoCorreo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JPanel tabBandeja;
    private javax.swing.JPanel tabBorradores;
    private javax.swing.JPanel tabElementos;
    private javax.swing.JPanel tabThrash;
    private javax.swing.JTabbedPane tabbedBandeja;
    private javax.swing.JTable tableBandejaEntrada;
    private javax.swing.JTable tableBorradores;
    private javax.swing.JTable tableElementosEnviados;
    private javax.swing.JTable tableThrash;
    // End of variables declaration//GEN-END:variables
}
