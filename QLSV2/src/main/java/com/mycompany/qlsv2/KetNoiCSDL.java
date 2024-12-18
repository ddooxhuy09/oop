
package com.mycompany.qlsv2;

import java.sql.*;

public class KetNoiCSDL {
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSACH; encrypt=true;trustServerCertificate=true;";
    private static final String user = "sa";
    private static final String pw = "1111";
    
    public static Connection layKetNoi(){
        Connection ketNoi = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(url, user, pw);
            System.out.println("Ket noi thanh cong!");
        } catch (ClassNotFoundException e){
            System.out.println("Khong tim thay driver!");
            e.getMessage();
        } catch (SQLException ex){
            System.out.println("Khong ket noi duoc SQL");
            ex.getMessage();
        }
        
        return ketNoi;
    }
    
    public static void main (String[] args){
        layKetNoi();
    }
}
