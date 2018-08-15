package Clases;

import Conexion.Conexion;
import java.sql.Connection;
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
    
    private String codigo2;
    private String nombre2;
    private int cantidad2;
    private double precio2;
    private double total2;

    private ResultSet rs;
    private String consulta;

    Conexion conn = new Conexion();
    Connection cn = conn.ConectarBD();

    //ESTE ES EL CONSTRUCTOR
    public Producto() {

    }
    
    public int guardarProducto(){
        int res = 0;
        
        consulta = "INSERT INTO Producto (codigo, nombre, descripcion, cveCategoria, "
                + "cantidad, precioCompra, precioVenta, cveProveedor ) "
                + "VALUES('"
                + getCodigo() +  "','"
                + getNombre() +  "','"
                + getDescripcion() +  "',"
                + getCveCategoria() +  ","
                + getCantidad() +  ","
                + getPrecioC() +  ","
                + getPrecioV() +  ","
                + getCveProveedor() +  ")";
                
                res = conn.Insertar(consulta);
                return res;
    }
    
    public int guardarProducto2(){
        int res = 0;
        
        consulta = "INSERT INTO Ventas (codigo, nombre, "
                + "cantidad, precio, total ) "
                + "VALUES('"
                + getCodigo2() +  "','"
                + getNombre2() +  "',"
                + getCantidad2() +  ","
                + getPrecio2() +  ","
                + getTotal2() +  ")";
                
                res = conn.Insertar(consulta);
                return res;
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

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String cod2) {
        codigo2 = cod2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nom2) {
        nombre2 = nom2;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int can2) {
        cantidad2 = can2;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double pre2) {
        precio2 = pre2;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double tot2) {
        total2 = tot2;
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


