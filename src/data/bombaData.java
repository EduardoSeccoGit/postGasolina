/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.PreparedStatement;
import models.bomba;
import java.sql.ResultSet;

/**
 *ps.setFloat(1, objbomba.getValorLitro());
 * @author Secco
 */
public class bombaData {
     conexao con;
    public bomba pegarValorLitro1(int Id ) throws Exception{
        con = new conexao();
        bomba objbomba=null;
        String SQL = "select valorlitro from bomba where id=1 (?)";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1,Id);
        ResultSet rs = ps.executeQuery();
            while (rs.next()){
                objbomba= new bomba();
                objbomba.setValorLitro(rs.getFloat("valorlitro")); 
            }
            return objbomba;
    }
}
