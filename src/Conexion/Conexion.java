/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author ErickBSG
 */
public class Conexion {

    Connection con;
    Statement smt;
    ResultSet rs;

    public Connection ConectarBD() {
        try {
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc://localhost/tic03", "root", "root");
        } catch (ClassNotFoundException error) {
            System.out.println("Error En La Conexion: " + error);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.driver");
            con = DriverManager.getConnection("jdbc://localhost/tic03", "root", "root");
        } catch (ClassNotFoundException error) {
            System.out.println("Error En La Conexion: " + error);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Desconectar() {
        try {
            con.close();
        } catch (SQLException error) {
            System.out.println("Error Al Desconectar La Base De Datos:" + error.getMessage());
        }
    }

    public ResultSet busqueda(String consulta) {
        Conectar();

        try {
            smt = con.createStatement();
            rs = smt.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("Error En La Consulta: " + e.getMessage());
        }
        return rs;
    }

    public int Insertar(String consulta) {
        int resultado = 0;

        Conectar();

        try {
            smt = con.createStatement();
            resultado = smt.executeUpdate(consulta);
        } catch (SQLException e) {
            System.out.println("Error En La Consulta:" + e.getMessage());
        }
        Desconectar();
        return resultado;
    }

}
