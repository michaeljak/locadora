package dao;

import bean.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {
    private Connection conexao;
    
    public ClienteDAO(Connection conexao){
        this.conexao=conexao;  
        
    }
    
    public void create(Cliente clie) throws SQLException {
            Statement stm = this.conexao.createStatement();
            String sql = "INSERT INTO CLIENTE (RG,FK_ENDERECO,CPF,NOME,EMAIL,DTNASCIMENTO,TELEFONE) VALUES ("+clie.getRg()+","+clie.getFk_endereco()+",'"+clie.getCpf()+"','"+clie.getNome()+"','"+clie.getEmail()+"','"+clie.getDtnascimento()+"','"+clie.getTelefone()+"')";
            stm.executeUpdate(sql); 
        }
    
    
    public ResultSet retriverg (String rg) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM CLIENTE WHERE RG='"+rg+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    
     public ResultSet retrive () throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM CLIENTE";
            rs = stm.executeQuery(sql);
            return rs;
    }
     
    
    public ResultSet retriveNome (String nome) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM CLIENTE WHERE NOME='"+nome+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public void update (Cliente clie) throws SQLException{
            String sql = "UPDATE CLIENTE SET CPF='"+clie.getCpf()+"', NOME='"+clie.getNome()+"', EMAIL='"+clie.getEmail()+"', DTNASCIMENTO='"+clie.getDtnascimento()+"', TELEFONE='"+clie.getTelefone()+"'  WHERE RG='"+clie.getRg()+"'";
            Statement stm = conexao.createStatement();
            stm.executeUpdate(sql);
    }
    
    public int delete(String rg) throws SQLException {
        Statement stm = this.conexao.createStatement();
        ResultSet rs;
        int fk=-1;
        String sql = "SELECT FK_ENDERECO FROM CLIENTE WHERE RG='"+rg+"'";
        
        rs = stm.executeQuery(sql);
        while(rs.next()){
        fk = rs.getInt("fk_endereco");
        
        }
        
        sql = "DELETE FROM CLIENTE WHERE RG=?";
        PreparedStatement pst = this.conexao.prepareStatement(sql);
        pst.setString(1, rg);
        pst.executeUpdate();
        pst.close();
        return fk;
    }

}