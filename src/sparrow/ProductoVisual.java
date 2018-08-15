package sparrow;

import Clases.Producto;
import Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ErickBSG
 */
public class ProductoVisual extends javax.swing.JFrame {

    URL url = null;
    ImageIcon icon = null;
    Producto p = new Producto(); //INSTANCIA DE LA CLASE PRODUCTO

    public ProductoVisual() {    //CONSTRUCTOR
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecioC = new javax.swing.JLabel();
        lblPrecioV = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioC = new javax.swing.JTextField();
        txtPrecioV = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        txtDirecccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnGuardarBD = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setText("Codigo:");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblDescripcion.setText("Descripción:");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblCategoria.setText("Categoría:");
        jPanel2.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblCantidad.setText("Cantidad:");
        jPanel2.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblPrecioC.setText("Precio C:");
        jPanel2.add(lblPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblPrecioV.setText("Precio V:");
        jPanel2.add(lblPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblProveedor.setText("Proveedor:");
        jPanel2.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, -1));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));
        jPanel2.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, -1));
        jPanel2.add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, -1));
        jPanel2.add(txtPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, -1));
        jPanel2.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 290));

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        btnCargar.setText("CARGAR IMAGEN");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtDirecccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecccionActionPerformed(evt);
            }
        });

        lblDireccion.setText("Nombre De La Imagen:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(txtDirecccion, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDirecccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 300, 320));

        jPanel4.setBackground(new java.awt.Color(102, 255, 204));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnVenta.setText("VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporte)
                .addGap(18, 18, 18)
                .addComponent(btnVenta)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBorrar)
                    .addComponent(btnCerrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnReporte)
                    .addComponent(btnVenta))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 560, 60));

        btnGuardarBD.setText("GUARDAR EN BD");
        btnGuardarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBDActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFileChooser archivo = new JFileChooser();

        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter("Archivo De Texto", "txt");

        archivo.setFileFilter(filtro);
        int opcion = archivo.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getSelectedFile().getAbsolutePath()));
                bw.write(txtCodigo.getText());
                bw.write(txtNombre.getText());
                bw.write(txtDescripcion.getText());
                bw.write(txtCategoria.getText());
                bw.write(txtCantidad.getText());
                bw.write(txtPrecioC.getText());
                bw.write(txtPrecioV.getText());
                bw.write(txtProveedor.getText());
                bw.write(txtDirecccion.getText());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
    }//GEN-LAST:event_btnGuardarActionPerformed
        }
    }
    File fichero;

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        int resultado;
        JFileChooser archivo = new JFileChooser();

        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter("Imagenes", "png");

        archivo.setFileFilter(filtro);

        resultado = archivo.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            fichero = archivo.getSelectedFile();

            try {
                ImageIcon icon = new ImageIcon(fichero.toString());

                Icon icono = new ImageIcon(icon.getImage());

                lblImagen.setText(null);

                lblImagen.setIcon(icono);

                /*fichero = new File(getServletContext().getContextPath() + "/Imagenes", "archivo.getSelectedFile().getName()");
                Files.copy(e2, fichero.toPath(), StandardCopyOption.REPLACE_EXISTING); */
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error Abriendo La Imagen " + ex);
            }

            txtDirecccion.setText(archivo.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtCategoria.setText("");
        txtCantidad.setText("");
        txtPrecioC.setText("");
        txtPrecioV.setText("");
        txtProveedor.setText("");
        txtDirecccion.setText("");
        lblImagen.setIcon(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (p.buscarProducto(txtCodigo.getText()) == 1) {

                txtNombre.setText(p.getNombre());
                txtDescripcion.setText(p.getDescripcion());
                txtCategoria.setText(Integer.toString(p.getCveCategoria()));
                txtCantidad.setText(Integer.toString(p.getCantidad()));
                txtPrecioC.setText(Double.toString(p.getPrecioC()));
                txtPrecioV.setText(Double.toString(p.getPrecioV()));
                txtProveedor.setText(Integer.toString(p.getCveProveedor()));

                int op = Integer.parseInt(txtCodigo.getText());

                switch (op) {
                    case 1:
                        this.mostrarImagen("/Imagenes/1.jpg");
                        txtDirecccion.setText("1.jpg");
                        break;
                    case 2:
                        this.mostrarImagen("/Imagenes/logo4.png");
                        txtDirecccion.setText("logo4.png");
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Producto No Encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (p.buscarProducto(txtCodigo.getText()) == 1) {

            txtNombre.setText(p.getNombre());
            txtDescripcion.setText(p.getDescripcion());
            txtCategoria.setText(Integer.toString(p.getCveCategoria()));
            txtCantidad.setText(Integer.toString(p.getCantidad()));
            txtPrecioC.setText(Double.toString(p.getPrecioC()));
            txtPrecioV.setText(Double.toString(p.getPrecioV()));
            txtProveedor.setText(Integer.toString(p.getCveProveedor()));

            int op = Integer.parseInt(txtCodigo.getText());

            switch (op) {
                case 1:
                    this.mostrarImagen("/Imagenes/1.jpg");
                    txtDirecccion.setText("1.jpg");
                    break;
                case 2:
                    this.mostrarImagen("/Imagenes/logo4.png");
                    txtDirecccion.setText("logo4.png");
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Producto No Encontrado", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void mostrarImagen(String urlImagen) {
        url = this.getClass().getResource(urlImagen);
        icon = new ImageIcon(url);
        lblImagen.setIcon(icon);

    }

    private void txtDirecccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecccionActionPerformed
    }//GEN-LAST:event_txtDirecccionActionPerformed

    private void btnGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBDActionPerformed

        if (p.buscarProducto(txtCodigo.getText()) == 1) {

            p.setNombre(txtNombre.getText());
            p.setDescripcion(txtDescripcion.getText());
            p.setCveCategoria(Integer.parseInt(txtCategoria.getText()));
            p.setCantidad(Integer.parseInt(txtCantidad.getText()));
            p.setPrecioC(Double.parseDouble(txtPrecioC.getText()));
            p.setPrecioV(Double.parseDouble(txtPrecioV.getText()));
            p.setCveProveedor(Integer.parseInt(txtProveedor.getText()));

            if (p.guardarProducto() == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {

            p.setCodigo(txtCodigo.getText());
            p.setNombre(txtNombre.getText());
            p.setDescripcion(txtDescripcion.getText());
            p.setCveCategoria(Integer.parseInt(txtCategoria.getText()));
            p.setCantidad(Integer.parseInt(txtCantidad.getText()));
            p.setPrecioC(Double.parseDouble(txtPrecioC.getText()));
            p.setPrecioV(Double.parseDouble(txtPrecioV.getText()));
            p.setCveProveedor(Integer.parseInt(txtProveedor.getText()));

            if (p.guardarProducto() == 1) {
                JOptionPane.showMessageDialog(null, "Producto Guardado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnGuardarBDActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        Map parameters = new HashMap();

        parameters.put("Nombre", "Erick Sánchez");

        try {
            JasperReport report = JasperCompileManager.compileReport(
                    "C:\\Users\\ErickBSG\\Documents\\NetBeansProjects\\Sparrow\\src\\Reportes\\Prueba.jrxml");

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new Conexion().ConectarBD());

            JasperExportManager.exportReportToPdfFile(print,
                    "C:\\Users\\ErickBSG\\Documents\\NetBeansProjects\\Sparrow\\src\\Reportes\\Prueba.pdf");

            JasperViewer.viewReport(print, false);
        } catch (JRException e) {
            System.out.println("Error Al Generar El Reporte: " + e);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
          new VentaVisual().setVisible(true);
          this.dispose(); 

    }//GEN-LAST:event_btnVentaActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarBD;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioC;
    private javax.swing.JLabel lblPrecioV;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDirecccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioV;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
