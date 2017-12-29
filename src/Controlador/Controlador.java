package Controlador;

import Modelo.Modelo;

import Vista.Agregar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Menu;
import Vista.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Controlador extends JFrame implements ActionListener, MenuListener{
    
    Menu menu;
    Agregar agregar;
    Eliminar eliminar;
    Modificar modificar;
    Listar listar;
    Modelo m;
    
    public Controlador(Menu menu, Agregar agregar, Eliminar eliminar, Modificar modificar, Listar listar, Modelo m) {
        this.menu = menu;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        this.listar = listar;
        this.m = m;

        menu.getjAgregar().addMenuListener(this);
        menu.getjListar().addMenuListener(this);
        menu.getjEliminar().addMenuListener(this);
        menu.getjModificar().addMenuListener(this);

        agregar.getjAgregar().addMenuListener(this);
        agregar.getjListar().addMenuListener(this);
        agregar.getjEliminar().addMenuListener(this);
        agregar.getjModificar().addMenuListener(this);
        agregar.getBtnLimpiar().addActionListener(this);

        agregar.getBtnAgregar().addActionListener(this);

        eliminar.getjAgregar().addMenuListener(this);
        eliminar.getjListar().addMenuListener(this);
        eliminar.getjEliminar().addMenuListener(this);
        eliminar.getjModificar().addMenuListener(this);
        eliminar.getBtnbuscar().addActionListener(this);
        eliminar.getBtnEliminar2().addActionListener(this);

        modificar.getjAgregar().addMenuListener(this);
        modificar.getjListar().addMenuListener(this);
        modificar.getjEliminar().addMenuListener(this);
        modificar.getjModificar().addMenuListener(this);
        modificar.getBtnBuscar().addActionListener(this);
        modificar.getBtnModificar().addActionListener(this);
        modificar.getBtnLimpiar().addActionListener(this);

        listar.getjAgregar().addMenuListener(this);
        listar.getjListar().addMenuListener(this);
        listar.getjEliminar().addMenuListener(this);
        listar.getjModificar().addMenuListener(this);
        actualizarMostrar();
        listar.getjDepto().addActionListener(this);
        listar.getjEjecutarConsulta().addActionListener(this);
        listar.getjConsulta1().addActionListener(this);

    }
    
    public void ingresar() {
        menu.setTitle("Menú | Empleados");
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        menu.setResizable(false);

        agregar.setTitle("Agregar Empleado | Empleados");
        agregar.setLocationRelativeTo(null);
        agregar.setVisible(false);
        agregar.setResizable(false);

        eliminar.setTitle("Eliminar Empleado | Empleados");
        eliminar.setLocationRelativeTo(null);
        eliminar.setVisible(false);
        eliminar.setResizable(false);

        modificar.setTitle("Modificar Empleado | Empleados");
        modificar.setLocationRelativeTo(null);
        modificar.setVisible(false);
        modificar.setResizable(false);

        listar.setTitle("Listar Empleado | Empleados");
        listar.setLocationRelativeTo(null);
        listar.setVisible(false);
        listar.setResizable(false);

    }

    public void buscarEmpleado() {

        eliminar.getTblBuscar().setModel(m.Buscaremp(Integer.parseInt(eliminar.getTxtCodigo().getText())));

    }

    public void eliminarEmpleado() throws ClassNotFoundException, SQLException {

        m.Eliminar(Integer.parseInt(eliminar.getTxtCodigo().getText()));
        buscarEmpleado();
    }

    public void buscar() throws ClassNotFoundException, SQLException {
       
        boolean buscar = m.Buscar(Integer.parseInt(modificar.getTxtCodigo().getText()), modificar.getTxtNombre(),modificar.getTxtRut(),modificar.getTxtApellido(), modificar.getTxtCelular(),modificar.getTxtEmail(),modificar.getTxtSueldo_Bruto(),modificar.getTxtEstado_Civil(), modificar.getTxtNom_Depto());

    }

    public void actualizarMostrar() {
        if (listar.getjDepto().getSelectedItem().toString().equals("Mostrar Todos")) {
            try {
                listar.getTblMostrar().setModel(m.Mostrar());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            try {
                listar.getTblMostrar().setModel(m.MostrarDepto(listar.getjDepto().getSelectedItem().toString()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }


    
    
    @Override
    public void actionPerformed(ActionEvent e) {
              
        
        if (listar.getjEjecutarConsulta() == e.getSource()) {
            
            if(listar.getjConsulta1().isSelected()){
                agregar.setVisible(true);
                listar.setVisible(false);
            }
            
            if(listar.getjConsulta2().isSelected()){
                listar.getjDepto().setSelectedItem("Redes");
            }
            
            if(listar.getjConsulta3().isSelected()){
                try {
                    m.Eliminar120();
                    actualizarMostrar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(listar.getjConsulta4().isSelected()){
                try {
                    m.ModificarSueldos();
                    actualizarMostrar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         
        
        
        if (listar.getjDepto()== e.getSource()) {
            actualizarMostrar();
        }


        if (modificar.getBtnLimpiar() == e.getSource()) {
            limpiarModificar();
        }

         if (agregar.getBtnLimpiar() == e.getSource()) {
            limpiarAgregar();
        }

        if (modificar.getBtnModificar() == e.getSource()) {
            if (validacionesModificar()) {
                try {
                    m.Modificar(Integer.parseInt(modificar.getTxtCodigo().getText()), modificar.getTxtRut().getText(), modificar.getTxtNombre().getText(), modificar.getTxtApellido().getText(), Integer.parseInt(modificar.getTxtCelular().getText()), modificar.getTxtEmail().getText(), Integer.parseInt(modificar.getTxtSueldo_Bruto().getText()), modificar.getTxtEstado_Civil().getSelectedItem().toString(), modificar.getTxtNom_Depto().getSelectedItem().toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (modificar.getBtnBuscar() == e.getSource()) {
            if (true) {
                try {
                    buscar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (eliminar.getBtnEliminar2() == e.getSource()) {

            try {
                eliminarEmpleado();
                limpiarModificar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (eliminar.getBtnbuscar() == e.getSource()) {

            buscarEmpleado();

        }

        if (agregar.getBtnAgregar() == e.getSource()) {
            if (validaciones() == true) {
                try {
                    m.Insertar(Integer.parseInt(agregar.getTxtCodigo().getText()), agregar.getTxtRut().getText(), agregar.getTxtNombre().getText(), agregar.getTxtApellido().getText(), Integer.parseInt(agregar.getTxtCelular().getText()), agregar.getTxtEmail().getText(), Integer.parseInt(agregar.getTxtSueldo_Bruto().getText()), agregar.getTxtEstado_Civil().getSelectedItem().toString(), agregar.getTxtNom_Depto().getSelectedItem().toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menuSelected(MenuEvent e) { 

        if  (menu.getjAgregar() == e.getSource() || agregar.getjAgregar() == e.getSource() || listar.getjAgregar() == e.getSource() || eliminar.getjAgregar() == e.getSource() || modificar.getjAgregar() == e.getSource()) {
            agregar.setVisible(true);
            menu.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);
            modificar.setVisible(false);
            
        }

        if (menu.getjEliminar() == e.getSource() || agregar.getjEliminar() == e.getSource() || listar.getjEliminar() == e.getSource() || eliminar.getjEliminar() == e.getSource() || modificar.getjEliminar() == e.getSource()) {
            eliminar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);

            modificar.setVisible(false);
        }

        if (menu.getjListar() == e.getSource() || agregar.getjListar() == e.getSource() || listar.getjListar() == e.getSource() || eliminar.getjListar() == e.getSource() || modificar.getjListar() == e.getSource()) {
            actualizarMostrar();
            listar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);

            eliminar.setVisible(false);
            modificar.setVisible(false);
            

        }

        if (menu.getjModificar() == e.getSource() || agregar.getjModificar() == e.getSource() || listar.getjModificar() == e.getSource() || eliminar.getjModificar() == e.getSource() || modificar.getjModificar() == e.getSource()) {
            modificar.setVisible(true);
            menu.setVisible(false);
            agregar.setVisible(false);
            listar.setVisible(false);
            eliminar.setVisible(false);

        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void menuDeselected(MenuEvent e) {
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validaciones() {
        boolean validador = true;
        if (Integer.parseInt(agregar.getTxtCodigo().getText()) < 0) {
            JOptionPane.showMessageDialog(this, "El código debe ser mayor a 0 y/o menor a 100");
            validador = false;
        }
        if (Integer.parseInt(agregar.getTxtCodigo().getText()) > 100) {
            JOptionPane.showMessageDialog(this, "El código debe ser mayor a 0 y/o menor a 100");
            validador = false;
        }
        if (agregar.getTxtRut().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Rut no debe estar en blanco");
            validador = false;
        }
        if (agregar.getTxtNombre().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Nombre no debe estar en blanco");
            validador = false;
        }
        if (agregar.getTxtApellido().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Apellido no debe estar en blanco");
            validador = false;
        }
        if (agregar.getTxtCelular().getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "El celular debe contener 9 dígitos");
            validador = false;
        }
        if (Integer.parseInt(agregar.getTxtSueldo_Bruto().getText()) < 120000 || agregar.getTxtSueldo_Bruto().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El sueldo bruto debe ser mayor a $120.000");
            validador = false;
        }
        if (agregar.getTxtEstado_Civil().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un estado civil");
            validador = false;
        }
        if (agregar.getTxtNom_Depto().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un departamento");
            validador = false;
        }
     
        return validador;

    }

    public boolean validacionesModificar() {
        boolean validador = true;
        //  if (Integer.parseInt(agregar.getTxtCodigo().getText())<=999) {
        //     JOptionPane.showMessageDialog(this, "El código debe tener 3 digitos");
        //     validador = false;
        //  }

        if (modificar.getTxtRut().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Rut no debe estar en blanco");
            validador = false;
        }
        if (modificar.getTxtNombre().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Nombre no debe estar en blanco");
            validador = false;
        }
        if (modificar.getTxtApellido().getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Apellido no debe estar en blanco");
            validador = false;
        }
        if (modificar.getTxtCelular().getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "El celular debe contener 9 dígitos");
            validador = false;
        }
        if (Integer.parseInt(modificar.getTxtSueldo_Bruto().getText()) < 120000 || modificar.getTxtSueldo_Bruto().getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El sueldo bruto debe ser mayor a $120.000");
            validador = false;
        }
        if (modificar.getTxtEstado_Civil().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un estado civil");
            validador = false;
        }
        if (modificar.getTxtNom_Depto().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un departamento");
            validador = false;
        }
        return validador;

    }
    
       public void limpiarModificar() {
        System.out.println("Se limpia todo excepto el código");
        modificar.getTxtRut().setText("");
        modificar.getTxtNombre().setText("");
        modificar.getTxtApellido().setText("");
        modificar.getTxtCelular().setText("0");
        modificar.getTxtEmail().setText("");
        modificar.getTxtSueldo_Bruto().setText("0");
        modificar.getTxtEstado_Civil().setSelectedItem(" ");
        modificar.getTxtNom_Depto().setSelectedItem(" ");


    }

    public void limpiarAgregar() {
        agregar.getTxtCodigo().setText("");
        agregar.getTxtRut().setText("");
        agregar.getTxtNombre().setText("");
        agregar.getTxtApellido().setText("");
        agregar.getTxtCelular().setText("0");
        agregar.getTxtEmail().setText("");
        agregar.getTxtSueldo_Bruto().setText("0");
        agregar.getTxtEstado_Civil().setSelectedItem(" ");
        agregar.getTxtNom_Depto().setSelectedItem(" ");
        agregar.getTxtCodigo().requestFocus();

    }
}
