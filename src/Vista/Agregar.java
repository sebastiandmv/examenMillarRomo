/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Duoc UC
 */
public class Agregar extends javax.swing.JFrame {

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo_emp2.png"));


        return retValue;
    }
    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jApellido = new javax.swing.JLabel();
        jEstado_Civil = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtEstado_Civil = new javax.swing.JComboBox<>();
        txtCelular = new javax.swing.JTextField();
        jCodigo = new javax.swing.JLabel();
        jCelular = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtNom_Depto = new javax.swing.JComboBox<>();
        jNom_Depto = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtSueldo_Bruto = new javax.swing.JTextField();
        jSueldo_Bruto = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAgregar = new javax.swing.JMenu();
        jListar = new javax.swing.JMenu();
        jEliminar = new javax.swing.JMenu();
        jModificar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jApellido.setText("Apellido");

        jEstado_Civil.setText("Estado Civil");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtEstado_Civil.setMaximumRowCount(3);
        txtEstado_Civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "C","S","V" }));
        txtEstado_Civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstado_CivilActionPerformed(evt);
            }
        });

        txtCelular.setText("0");

        jCodigo.setText("Código");

        jCelular.setText("Celular");

        btnLimpiar.setText("Limpiar");

        txtNom_Depto.setMaximumRowCount(4);
        txtNom_Depto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Informática","Redes","Administración","Finanzas y Bienestar" }));
        txtNom_Depto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_DeptoActionPerformed(evt);
            }
        });

        jNom_Depto.setText("Nombre Depto");

        jNombre.setText("Nombre");

        jRut.setText("Rut");

        txtSueldo_Bruto.setText("0");

        jSueldo_Bruto.setText("Sueldo Bruto");

        jEmail.setText("Email");

        jAgregar.setText("Agregar");
        jMenuBar1.add(jAgregar);

        jListar.setText("Listar");
        jMenuBar1.add(jListar);

        jEliminar.setText("Eliminar");
        jMenuBar1.add(jEliminar);

        jModificar.setText("Modificar");
        jMenuBar1.add(jModificar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEstado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jNom_Depto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom_Depto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRut, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSueldo_Bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSueldo_Bruto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo_Bruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSueldo_Bruto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEstado_Civil)
                    .addComponent(txtEstado_Civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNom_Depto)
                    .addComponent(txtNom_Depto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEstado_CivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstado_CivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstado_CivilActionPerformed

    private void txtNom_DeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_DeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_DeptoActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JMenu jAgregar;
    private javax.swing.JLabel jApellido;
    private javax.swing.JLabel jCelular;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JMenu jEliminar;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEstado_Civil;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jModificar;
    private javax.swing.JLabel jNom_Depto;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jRut;
    private javax.swing.JLabel jSueldo_Bruto;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtEstado_Civil;
    private javax.swing.JComboBox<String> txtNom_Depto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSueldo_Bruto;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnAgregar
     */
    public javax.swing.JButton getBtnAgregar() {
        return btnAgregar;
    }

    /**
     * @param btnAgregar the btnAgregar to set
     */
    public void setBtnAgregar(javax.swing.JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    /**
     * @return the btnLimpiar
     */
    public javax.swing.JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    /**
     * @param btnLimpiar the btnLimpiar to set
     */
    public void setBtnLimpiar(javax.swing.JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    /**
     * @return the jAgregar
     */
    public javax.swing.JMenu getjAgregar() {
        return jAgregar;
    }

    /**
     * @param jAgregar the jAgregar to set
     */
    public void setjAgregar(javax.swing.JMenu jAgregar) {
        this.jAgregar = jAgregar;
    }

    /**
     * @return the jApellido
     */
    public javax.swing.JLabel getjApellido() {
        return jApellido;
    }

    /**
     * @param jApellido the jApellido to set
     */
    public void setjApellido(javax.swing.JLabel jApellido) {
        this.jApellido = jApellido;
    }

    /**
     * @return the jCelular
     */
    public javax.swing.JLabel getjCelular() {
        return jCelular;
    }

    /**
     * @param jCelular the jCelular to set
     */
    public void setjCelular(javax.swing.JLabel jCelular) {
        this.jCelular = jCelular;
    }

    /**
     * @return the jCodigo
     */
    public javax.swing.JLabel getjCodigo() {
        return jCodigo;
    }

    /**
     * @param jCodigo the jCodigo to set
     */
    public void setjCodigo(javax.swing.JLabel jCodigo) {
        this.jCodigo = jCodigo;
    }

    /**
     * @return the jEliminar
     */
    public javax.swing.JMenu getjEliminar() {
        return jEliminar;
    }

    /**
     * @param jEliminar the jEliminar to set
     */
    public void setjEliminar(javax.swing.JMenu jEliminar) {
        this.jEliminar = jEliminar;
    }

    /**
     * @return the jEmail
     */
    public javax.swing.JLabel getjEmail() {
        return jEmail;
    }

    /**
     * @param jEmail the jEmail to set
     */
    public void setjEmail(javax.swing.JLabel jEmail) {
        this.jEmail = jEmail;
    }

    /**
     * @return the jEstado_Civil
     */
    public javax.swing.JLabel getjEstado_Civil() {
        return jEstado_Civil;
    }

    /**
     * @param jEstado_Civil the jEstado_Civil to set
     */
    public void setjEstado_Civil(javax.swing.JLabel jEstado_Civil) {
        this.jEstado_Civil = jEstado_Civil;
    }

    /**
     * @return the jListar
     */
    public javax.swing.JMenu getjListar() {
        return jListar;
    }

    /**
     * @param jListar the jListar to set
     */
    public void setjListar(javax.swing.JMenu jListar) {
        this.jListar = jListar;
    }

    /**
     * @return the jMenuBar1
     */
    public javax.swing.JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    /**
     * @param jMenuBar1 the jMenuBar1 to set
     */
    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    /**
     * @return the jModificar
     */
    public javax.swing.JMenu getjModificar() {
        return jModificar;
    }

    /**
     * @param jModificar the jModificar to set
     */
    public void setjModificar(javax.swing.JMenu jModificar) {
        this.jModificar = jModificar;
    }

    /**
     * @return the jNom_Depto
     */
    public javax.swing.JLabel getjNom_Depto() {
        return jNom_Depto;
    }

    /**
     * @param jNom_Depto the jNom_Depto to set
     */
    public void setjNom_Depto(javax.swing.JLabel jNom_Depto) {
        this.jNom_Depto = jNom_Depto;
    }

    /**
     * @return the jNombre
     */
    public javax.swing.JLabel getjNombre() {
        return jNombre;
    }

    /**
     * @param jNombre the jNombre to set
     */
    public void setjNombre(javax.swing.JLabel jNombre) {
        this.jNombre = jNombre;
    }

    /**
     * @return the jRut
     */
    public javax.swing.JLabel getjRut() {
        return jRut;
    }

    /**
     * @param jRut the jRut to set
     */
    public void setjRut(javax.swing.JLabel jRut) {
        this.jRut = jRut;
    }

    /**
     * @return the jSueldo_Bruto
     */
    public javax.swing.JLabel getjSueldo_Bruto() {
        return jSueldo_Bruto;
    }

    /**
     * @param jSueldo_Bruto the jSueldo_Bruto to set
     */
    public void setjSueldo_Bruto(javax.swing.JLabel jSueldo_Bruto) {
        this.jSueldo_Bruto = jSueldo_Bruto;
    }

    /**
     * @return the txtApellido
     */
    public javax.swing.JTextField getTxtApellido() {
        return txtApellido;
    }

    /**
     * @param txtApellido the txtApellido to set
     */
    public void setTxtApellido(javax.swing.JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    /**
     * @return the txtCelular
     */
    public javax.swing.JTextField getTxtCelular() {
        return txtCelular;
    }

    /**
     * @param txtCelular the txtCelular to set
     */
    public void setTxtCelular(javax.swing.JTextField txtCelular) {
        this.txtCelular = txtCelular;
    }

    /**
     * @return the txtCodigo
     */
    public javax.swing.JTextField getTxtCodigo() {
        return txtCodigo;
    }

    /**
     * @param txtCodigo the txtCodigo to set
     */
    public void setTxtCodigo(javax.swing.JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    /**
     * @return the txtEmail
     */
    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    /**
     * @param txtEmail the txtEmail to set
     */
    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    /**
     * @return the txtEstado_Civil
     */
    public javax.swing.JComboBox<String> getTxtEstado_Civil() {
        return txtEstado_Civil;
    }

    /**
     * @param txtEstado_Civil the txtEstado_Civil to set
     */
    public void setTxtEstado_Civil(javax.swing.JComboBox<String> txtEstado_Civil) {
        this.txtEstado_Civil = txtEstado_Civil;
    }

    /**
     * @return the txtNom_Depto
     */
    public javax.swing.JComboBox<String> getTxtNom_Depto() {
        return txtNom_Depto;
    }

    /**
     * @param txtNom_Depto the txtNom_Depto to set
     */
    public void setTxtNom_Depto(javax.swing.JComboBox<String> txtNom_Depto) {
        this.txtNom_Depto = txtNom_Depto;
    }

    /**
     * @return the txtNombre
     */
    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    /**
     * @param txtNombre the txtNombre to set
     */
    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    /**
     * @return the txtRut
     */
    public javax.swing.JTextField getTxtRut() {
        return txtRut;
    }

    /**
     * @param txtRut the txtRut to set
     */
    public void setTxtRut(javax.swing.JTextField txtRut) {
        this.txtRut = txtRut;
    }

    /**
     * @return the txtSueldo_Bruto
     */
    public javax.swing.JTextField getTxtSueldo_Bruto() {
        return txtSueldo_Bruto;
    }

    /**
     * @param txtSueldo_Bruto the txtSueldo_Bruto to set
     */
    public void setTxtSueldo_Bruto(javax.swing.JTextField txtSueldo_Bruto) {
        this.txtSueldo_Bruto = txtSueldo_Bruto;
    }
}
