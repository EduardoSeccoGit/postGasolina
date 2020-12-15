/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Secco
 */
public class conexao {
      private Connection conexao;
   public conexao() throws Exception{
       Class.forName("net.sourceforge.jtds.jdbc.Driver");
       String url = "jdbc:jtds:sqlserver://DESKTOP-Q9O48KF:1433/posto";
       conexao = DriverManager.getConnection(url,"admin","admin");
   }
    public Connection getConexao(){
        return conexao; 
    }
}
