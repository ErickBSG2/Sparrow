package Clases;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ErickBSG
 */
public class Producto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private int cveCategoria;
    private int cantidad;
    private double precioC;
    private double precioV;
    private int cveProveedor;

    private ResultSet rs;
    private String consulta;

    Conexion conn = new Conexion();

    //ESTE ES EL CONSTRUCTOR
    public Producto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cod) {
        codigo = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String desc) {
        descripcion = desc;
    }

    public int getCveCategoria() {
        return cveCategoria;
    }

    public void setCveCategoria(int cveCat) {
        cveCategoria = cveCat;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double preC) {
        precioC = preC;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double preV) {
        precioV = preV;
    }

    public int getCveProveedor() {
        return cveProveedor;
    }

    public void setCveProveedor(int cveProv) {
        cveProveedor = cveProv;
    }

    public int buscarProducto(String cod) {

        int ban = 0;

        consulta = "SELECT 1 FROM Producto WHERE codigo=" + cod;

        if (conn.siExiste(consulta)) {
            consulta = "SELECT nombre, descripcion, cveCategoria, cantidad, precioCompra, "
                    + "precioVenta, cveProveedor " + " FROM Producto WHERE codigo=" + cod;
            rs = conn.busqueda(consulta);

            try {
                while (rs.next()) {
                    this.setNombre(rs.getString(1));
                    this.setDescripcion(rs.getString(2));
                    this.setCveCategoria(rs.getInt(3));
                    this.setCantidad(rs.getInt(4));
                    this.setPrecioC(rs.getDouble(5));
                    this.setPrecioV(rs.getDouble(6));
                    this.setCveProveedor(rs.getInt(7));
                }
                ban = 1;
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return ban;
    }
}


