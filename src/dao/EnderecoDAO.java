package dao;

import bean.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDAO {
       private Connection conexao;
    
    public EnderecoDAO(Connection conexao){
        this.conexao=conexao;  
        
    }
    
    public int create(Endereco end) throws SQLException {
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            int fk=0;
            String sql = "INSERT INTO ENDERECO (FK_CIDADE,RUA,NUMERO,COMPLEMENTO,CEP,BAIRRO) VALUES ("+end.getFk_cidade()+",'"+end.getRua()+"',"+end.getNumero()+",'"+end.getComplemento()+"','"+end.getCep()+"','"+end.getBairro()+"')";
            stm.executeUpdate(sql);
            sql = "SELECT ID FROM ENDERECO ORDER BY ID DESC";
            rs = stm.executeQuery(sql);
            while(rs.next()){
            fk = rs.getInt("id");
            break;}
            return fk;
        }
    
    
    public ResultSet retrive (int id) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM ENDERECO WHERE ID='"+id+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public void update (Endereco end,int id) throws SQLException{

           String sql = "UPDATE ENDERECO SET FK_CIDADE="+end.getFk_cidade()+", RUA='"+end.getRua()+"', NUMERO="+end.getNumero()+", COMPLEMENTO='"+end.getComplemento()+"', CEP='"+end.getCep()+"', BAIRRO='"+end.getBairro()+"'  WHERE ID="+id;       
           Statement stm = conexao.createStatement();
           stm.executeUpdate(sql);
    }
    
    public void delete(int id) throws SQLException {
        System.out.println(id);
        String sql = "DELETE FROM ENDERECO WHERE ID="+id;
        Statement stm= conexao.createStatement();
        stm.executeUpdate(sql);
        
    }

    
}
