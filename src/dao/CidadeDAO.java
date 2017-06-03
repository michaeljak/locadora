package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CidadeDAO {
    private Connection conexao;
    
    public CidadeDAO(Connection conexao){
        this.conexao=conexao;  
    }
    
    public ResultSet retrive(int id) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT NOME FROM CIDADE WHERE FK_ESTADO="+id;
    rs = stm.executeQuery(sql);
    return rs;
    }
    
    public ResultSet retriveN(int id) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    String sql = "SELECT * FROM CIDADE WHERE ID="+id;
    rs = stm.executeQuery(sql);
    return rs;
    }
    
    public int retriveid (String nome) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    int i=-1;
    String sql = "SELECT ID FROM CIDADE WHERE NOME='"+nome+"'";
    rs = stm.executeQuery(sql);
    while(rs.next()){
        i = rs.getInt("id");
    }
    return i;
    }
}
