
package Vista;

import java.awt.Dimension;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpPagador = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        OpProveedor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        OpLcr = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        OpConsultaDoc = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        OpConsultaPvr = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        OpCargaManual = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        OpCargaExcel = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        OpPagos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(150, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setForeground(new java.awt.Color(51, 51, 255));

        jMenu1.setText("Administración");
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        OpPagador.setText("Pagador");
        jMenu1.add(OpPagador);
        jMenu1.add(jSeparator1);

        OpProveedor.setText("Proveedor");
        jMenu1.add(OpProveedor);
        jMenu1.add(jSeparator2);

        OpLcr.setText("Linea De Credito");
        jMenu1.add(OpLcr);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestion");
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        OpConsultaDoc.setText("Consulta Documentos");
        jMenu2.add(OpConsultaDoc);
        jMenu2.add(jSeparator5);

        OpConsultaPvr.setText("Consulta Proveedores");
        jMenu2.add(OpConsultaPvr);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Operaciones");
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        OpCargaManual.setText("Carga Manual ");
        jMenu5.add(OpCargaManual);
        jMenu5.add(jSeparator3);

        OpCargaExcel.setText("Carga Excel");
        jMenu5.add(OpCargaExcel);
        jMenu5.add(jSeparator4);

        OpPagos.setText("Pagos");
        jMenu5.add(OpPagos);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Finalizar Sesion");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OpCargaExcel;
    private javax.swing.JMenuItem OpCargaManual;
    private javax.swing.JMenuItem OpConsultaDoc;
    private javax.swing.JMenuItem OpConsultaPvr;
    private javax.swing.JMenuItem OpLcr;
    private javax.swing.JMenuItem OpPagador;
    private javax.swing.JMenuItem OpPagos;
    private javax.swing.JMenuItem OpProveedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
