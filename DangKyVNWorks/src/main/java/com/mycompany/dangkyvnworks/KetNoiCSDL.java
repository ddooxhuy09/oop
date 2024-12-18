
package com.mycompany.dangkyvnworks;

import java.sql.*;

public class KetNoiCSDL {
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=DANGKY;encrypt=true;trustServerCertificate=true;";
    private static final String user = "sa";
    private static final String pw = "1111";
    
    public static Connection layKetNoi(){
        Connection ketNoi = null;
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ketNoi = DriverManager.getConnection(url, user, pw);
        System.out.println("Ket noi thanh cong!");
        } catch(ClassNotFoundException e){
            System.out.println("Khong tim thay driver!");
            e.printStackTrace();
        } catch(SQLException ex){
            System.out.println("Khong tim thay SQL!");
            ex.printStackTrace();
        }
        
        return ketNoi;
    }
    
    public static void main(String[] arg){
        layKetNoi();
    }
}
