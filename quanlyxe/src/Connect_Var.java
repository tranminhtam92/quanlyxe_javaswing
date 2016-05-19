/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



//class khai cac bien ve connect can dung va` ket noi
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connect_Var
{
	public Connection cn;
	public Statement s;
	public Connect_Var() throws Exception
	{
		try
		{
                        
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn = DriverManager.getConnection("jdbc:odbc:csdl");
			s = cn.createStatement();
		
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage());
		}
                
	}
    public void SQL(String sql) throws Exception{
        try {
            s.executeUpdate(sql);
            //s.close();
            //cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connect_Var.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
