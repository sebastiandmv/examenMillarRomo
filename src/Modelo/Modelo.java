
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo extends JFrame {
    
    Conexion con;

    public boolean Insertar(int codigo, String rut, String nombre, String apellido, int celular, String email,int sueldo_bruto, String est_civil, String nom_depto) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " insert into empleados (codigo, rut, nombre, apellido, celular, email, sueldo_bruto, est_civil, nom_depto) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);
            stmt.setString(2, rut);
            stmt.setString(3, nombre);
            stmt.setString(4, apellido);
            stmt.setInt(5, celular);
            stmt.setString(6, email);
            stmt.setInt(7, sueldo_bruto);
            stmt.setString(8, est_civil);
            stmt.setString(9, nom_depto);

            stmt.executeUpdate();
            System.out.println("Ingreso exitoso");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Ingreso exitoso");
            return true;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            return false;
        }
    }
    
    public boolean Modificar(int codigo, String rut, String nombre, String apellido, int celular, String email,int sueldo_bruto, String est_civil, String nom_depto) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " update empleados set  rut=?, nombre=?, apellido=?, celular=?, email=?, sueldo_bruto=?, est_civil=?, nom_depto=? where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);

            
            stmt.setString(1, rut);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setInt(4, celular);
            stmt.setString(5, email);
            stmt.setInt(6, sueldo_bruto);
            stmt.setString(7, est_civil);
            stmt.setString(8, nom_depto);
            stmt.setInt(9, codigo);

            stmt.executeUpdate();
            System.out.println("Modificación exitosa");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Modificación exitosa");
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            return false;
        }
    }
    public boolean Buscar(int codigo, javax.swing.JTextField nombre, javax.swing.JTextField rut, javax.swing.JTextField apellido, javax.swing.JTextField celular, javax.swing.JTextField email, javax.swing.JTextField sueldo_bruto, javax.swing.JComboBox est_civil, javax.swing.JComboBox nom_depto) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        boolean resultado = false;

        try {

            String query = " select rut, nombre, apellido, celular, email, sueldo_bruto, est_civil, nom_depto from  empleados where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                rut.setText(rs.getString("rut"));
                nombre.setText(rs.getString("nombre"));
                apellido.setText(rs.getString("apellido"));
                celular.setText(rs.getString("celular"));
                email.setText(rs.getString("email"));
                sueldo_bruto.setText(rs.getString("sueldo_bruto"));
                est_civil.setSelectedItem(rs.getString("est_civil"));
                nom_depto.setSelectedItem(rs.getString("nom_depto"));
              
                

                System.out.println("Busqueda exitosa");

                resultado = true;
                // print the results
            }
            

            con.disconnect();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
            resultado = false;

        }
        return resultado;
    


}
    public void Eliminar(int codigo) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = "delete from empleados where codigo=?";
            PreparedStatement stmt = con.connect().prepareStatement(query);
            stmt.setInt(1, codigo);

            stmt.executeUpdate();
            System.out.println("Registro eliminado");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Registro eliminado");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
        }
    }
    
     public DefaultTableModel Buscaremp(int codigo) {
        con = new Conexion();
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Código", "Rut","Nombre","Apellido", "Celular", "Email", "Sueldo_bruto", "Est_civil", "Nom_depto"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = con.connect().prepareStatement("SELECT count(*) as total FROM empleados where codigo=?");
            pstm.setInt(1, codigo);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][9];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = con.connect().prepareStatement("SELECT * FROM empleados where codigo=?");
            pstm.setInt(1, codigo);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("rut");
                data[i][2] = res.getString("nombre");
                data[i][3] = res.getString("apellido");
                data[i][4] = res.getString("celular");
                data[i][5] = res.getString("email");
                data[i][6] = res.getString("sueldo_bruto");
                data[i][7] = res.getString("est_civil");
                data[i][8] = res.getString("nom_depto");
              
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;

    }
    
     public DefaultTableModel Mostrar() throws ClassNotFoundException, SQLException {
        con = new Conexion();
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Rut", "Nombre", "Apellido", "Celular", "Email", "Sueldo_bruto", "Est_civil", "Nom_depto"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = con.connect().prepareStatement("SELECT count(*) as total FROM empleados");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][9];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = con.connect().prepareStatement("SELECT * FROM empleados order by codigo");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("rut");
                data[i][2] = res.getString("nombre");
                data[i][3] = res.getString("apellido");
                data[i][4] = res.getString("celular");
                data[i][5] = res.getString("email");
                data[i][6] = res.getString("sueldo_bruto");
                data[i][7] = res.getString("est_civil");
                data[i][8] = res.getString("nom_depto");
            
                 
                
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    

     public DefaultTableModel MostrarDepto(String categoria) throws ClassNotFoundException, SQLException {
        con = new Conexion();
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Rut", "Nombre", "Apellido", "Celular", "Email", "Sueldo_bruto", "Est_civil", "Nom_depto"};
        //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = con.connect().prepareStatement("SELECT count(*) as total FROM empleados where Nom_depto=?");
            pstm.setString(1, categoria);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][9];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = con.connect().prepareStatement("SELECT * FROM empleados where Nom_depto=?");
            pstm.setString(1, categoria);
            ResultSet res = pstm.executeQuery();
            
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("rut");
                data[i][2] = res.getString("nombre");
                data[i][3] = res.getString("apellido");
                data[i][4] = res.getString("celular");
                data[i][5] = res.getString("email");
                data[i][6] = res.getString("sueldo_bruto");
                data[i][7] = res.getString("est_civil");
                data[i][8] = res.getString("nom_depto");
                 
                
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
     
     public void Eliminar120() throws ClassNotFoundException, SQLException {
        con = new Conexion();
        try {

            String query = " delete from empleados where sueldo_bruto=120000";
            PreparedStatement stmt = con.connect().prepareStatement(query);
          

            stmt.executeUpdate();
            System.out.println("Los empleados con sueldo bruto igual a $120.000 fueron eliminados");
            con.disconnect();
            JOptionPane.showMessageDialog(this, "Los empleados con sueldo bruto igual a $120.000 fueron eliminados");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Algo falló");
        }
    }
}
