package Frontend;

import Data.clsQuerys;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * * @author Carlos Alberto Sanchez Mendoza
 */
public class frmProducto extends javax.swing.JFrame {

    public frmProducto() {
        initComponents();
        condicionesIniciales();
    }

    private void condicionesIniciales() {
        btnGuardarNuevo.setVisible(false);
        btnGuardarEditado.setVisible(false);
        btnCancelarEditado.setVisible(false);
        btnCancelarNuevo.setVisible(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        mostrarProductosEnTabla();
        limpiarCajasDeTexto();
        bloquearCajasDeTexto();
        System.gc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ctTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ctFarmaceutica = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ctPresentacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctComposicion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        ctStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ctPrecio = new javax.swing.JTextField();
        btnGuardarNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPanel = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnGuardarEditado = new javax.swing.JButton();
        btnCancelarNuevo = new javax.swing.JButton();
        btnCancelarEditado = new javax.swing.JButton();
        ctCodigo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 13, -1, -1));

        jLabel2.setText("CODIGO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 61, -1, -1));

        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 96, -1, -1));

        ctNombre.setEditable(false);
        ctNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNombreActionPerformed(evt);
            }
        });
        getContentPane().add(ctNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 93, 287, -1));

        jLabel4.setText("TIPO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 131, -1, -1));

        ctTipo.setEditable(false);
        ctTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTipoActionPerformed(evt);
            }
        });
        getContentPane().add(ctTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 128, 287, -1));

        jLabel5.setText("FARMACEUTICA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 166, -1, -1));

        ctFarmaceutica.setEditable(false);
        ctFarmaceutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctFarmaceuticaActionPerformed(evt);
            }
        });
        getContentPane().add(ctFarmaceutica, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 162, 287, 25));

        jLabel6.setText("PRESENTACION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 62, -1, -1));

        ctPresentacion.setEditable(false);
        ctPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPresentacionActionPerformed(evt);
            }
        });
        getContentPane().add(ctPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 160, -1));

        jLabel7.setText("COMPOSICION:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 100, -1, -1));

        ctComposicion.setEditable(false);
        ctComposicion.setColumns(20);
        ctComposicion.setRows(5);
        jScrollPane1.setViewportView(ctComposicion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 250, 94));

        jLabel8.setText("STOCK:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 203, -1, -1));

        ctStock.setEditable(false);
        getContentPane().add(ctStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 200, 123, -1));

        jLabel9.setText("PRECIO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 203, -1, -1));

        ctPrecio.setEditable(false);
        ctPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPrecioActionPerformed(evt);
            }
        });
        ctPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(ctPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 200, 108, -1));

        btnGuardarNuevo.setText("GUARDAR");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 141, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 96, 123, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 134, 123, -1));

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 58, 123, -1));

        tbProductos = new JTable(){
            public boolean isCellEditable(int row, int column){
                for(int i=0; i<tbProductos.getRowCount(); i++){
                    if(row == i){
                        return false;
                    }
                }
                return true;
            }
        };
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPanel.setViewportView(tbProductos);

        getContentPane().add(jScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 299, 800, 270));

        btnGuardarEditado.setText("GUARDAR");
        btnGuardarEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 141, -1));

        btnCancelarNuevo.setText("CANCELAR");
        btnCancelarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 141, -1));

        btnCancelarEditado.setText("CANCELAR");
        btnCancelarEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarEditado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 141, -1));

        ctCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ctCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 20));

        jLabel10.setText("*Doble click sobre un producto para ver detalles, editar o eliminar.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNombreActionPerformed

    private void ctTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTipoActionPerformed

    private void ctPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPresentacionActionPerformed

    private void ctFarmaceuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFarmaceuticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFarmaceuticaActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        if (cumpleRequerimientos()) {
            clsQuerys objInsert = new clsQuerys();

            if (objInsert.fncInsertProduct(ctNombre.getText(),
                    ctTipo.getText(),
                    ctFarmaceutica.getText(),
                    ctPresentacion.getText(),
                    ctComposicion.getText(),
                    ctStock.getText(),
                    ctPrecio.getText()
            )) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "AVISO", JOptionPane.OK_OPTION);
            }
            condicionesIniciales();
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos, Stock y precio son valores numericos", "AVISOS", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private boolean cumpleRequerimientos() {
        return verificarCamposCompletados() && esEntero(ctStock.getText()) && esDecimal(ctPrecio.getText());
    }

    private static boolean esEntero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean esDecimal(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        desbloquearCajasDeTexto();
        btnGuardarEditado.setVisible(true);
        btnCancelarEditado.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (ctCodigo.getText() != "") {
            clsQuerys objDelete = new clsQuerys();
            if (objDelete.fncDeleteProduct(ctCodigo.getText())) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente", "AVISO", JOptionPane.OK_OPTION);
                condicionesIniciales();
            } else {
                JOptionPane.showMessageDialog(null, "Error inesperado, no se pudo eliminar el producto", "AVISOS", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquearCajasDeTexto();
        limpiarCajasDeTexto();
        btnGuardarNuevo.setVisible(true);
        btnCancelarNuevo.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditadoActionPerformed
        if (cumpleRequerimientos()) {
            clsQuerys objUpdate = new clsQuerys();

            if (objUpdate.fncUpdateProduct(
                    ctCodigo.getText(),
                    ctNombre.getText(),
                    ctTipo.getText(),
                    ctFarmaceutica.getText(),
                    ctPresentacion.getText(),
                    ctStock.getText(),
                    ctPrecio.getText(),
                    ctComposicion.getText()
            )) {
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente", "AVISO", JOptionPane.OK_OPTION);
            }
            condicionesIniciales();
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos, Stock y Precio son valores numericos", "AVISOS", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnGuardarEditadoActionPerformed

    private void ctPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPrecioActionPerformed

    private void btnCancelarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoActionPerformed
        condicionesIniciales();
    }//GEN-LAST:event_btnCancelarNuevoActionPerformed

    private void btnCancelarEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditadoActionPerformed
        condicionesIniciales();
    }//GEN-LAST:event_btnCancelarEditadoActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        if (evt.getClickCount() == 2) {

            int filaAMostrar = tbProductos.getSelectedRow();

            condicionesIniciales();
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);

            DefaultTableModel modeloConDatos = (DefaultTableModel) tbProductos.getModel();
            System.out.println("llega aca con fila: " + tbProductos.getSelectedRow());
            String indiceDatoSeleccionado = (String) modeloConDatos.getValueAt(filaAMostrar, 0);
            System.out.println("el campos es: " + indiceDatoSeleccionado);

            clsQuerys objOneProducto = new clsQuerys();
            String[] detalleProductoIndividual = objOneProducto.fcnDetalleUnProducto(indiceDatoSeleccionado);
            ctCodigo.setText(detalleProductoIndividual[0]);
            ctNombre.setText(detalleProductoIndividual[1]);
            ctTipo.setText(detalleProductoIndividual[2]);
            ctFarmaceutica.setText(detalleProductoIndividual[3]);
            ctPresentacion.setText(detalleProductoIndividual[4]);
            ctStock.setText(detalleProductoIndividual[5]);
            ctPrecio.setText(detalleProductoIndividual[6]);
            ctComposicion.setText(detalleProductoIndividual[7]);
            System.gc();
        }
    }//GEN-LAST:event_tbProductosMouseClicked

    private void ctPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctPrecioKeyTyped


    }//GEN-LAST:event_ctPrecioKeyTyped

    public void mostrarProductosEnTabla() {
        clsQuerys objRead = new clsQuerys();
        tbProductos.setModel(objRead.fcnShowProductsList());
    }

    private void limpiarCajasDeTexto() {
        ctCodigo.setText("");
        ctNombre.setText("");
        ctTipo.setText("");
        ctFarmaceutica.setText("");
        ctPrecio.setText("");
        ctStock.setText("");
        ctPresentacion.setText("");
        ctComposicion.setText("");
    }

    private void bloquearCajasDeTexto() {
        ctNombre.setEditable(false);
        ctTipo.setEditable(false);
        ctFarmaceutica.setEditable(false);
        ctPrecio.setEditable(false);
        ctStock.setEditable(false);
        ctPresentacion.setEditable(false);
        ctComposicion.setEditable(false);
    }

    private void desbloquearCajasDeTexto() {
        ctNombre.setEditable(true);
        ctTipo.setEditable(true);
        ctFarmaceutica.setEditable(true);
        ctPrecio.setEditable(true);
        ctStock.setEditable(true);
        ctPresentacion.setEditable(true);
        ctComposicion.setEditable(true);
    }

    private boolean verificarCamposCompletados() {

        return !"".equals(ctPrecio.getText())
                && !"".equals(ctNombre.getText())
                && !"".equals(ctTipo.getText())
                && !"".equals(ctFarmaceutica.getText())
                && !"".equals(ctPresentacion.getText())
                && !"".equals(ctComposicion.getText())
                && !"".equals(ctStock.getText());

    }

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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEditado;
    private javax.swing.JButton btnCancelarNuevo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarEditado;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel ctCodigo;
    private javax.swing.JTextArea ctComposicion;
    private javax.swing.JTextField ctFarmaceutica;
    private javax.swing.JTextField ctNombre;
    private javax.swing.JTextField ctPrecio;
    private javax.swing.JTextField ctPresentacion;
    private javax.swing.JTextField ctStock;
    private javax.swing.JTextField ctTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbProductos;
    // End of variables declaration//GEN-END:variables
}
