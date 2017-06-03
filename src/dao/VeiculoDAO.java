
package dao;

import bean.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VeiculoDAO {
    
    private Connection conexao;
    
    public VeiculoDAO(Connection conexao){
        this.conexao=conexao;  
        
    }
    
    public boolean disponivel(String placa) throws SQLException{
        Statement stm = this.conexao.createStatement();
        ResultSet rs;
        String dis = null;
        String sql = "SELECT disponivel FROM veiculo WHERE placa = '"+placa+"'";
        rs = stm.executeQuery(sql);
        
        while(rs.next()){
            dis = rs.getString("disponivel");
        }
        
        if("N".equals(dis)){
            return false;
        }else {
            return true;
        }
        
    }
    
    public String retriveCategoria(String placa) throws SQLException{
            Statement stm = this.conexao.createStatement();
            String categoria = null;
            ResultSet rs;
            String sql = "SELECT fk_categoria FROM VEICULO WHERE placa = '"+placa+"'";
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                categoria = rs.getString("fk_categoria");
            }
            
            return categoria;
    }
    
    
    public int create(Veiculo v) throws SQLException {
            Statement stm = this.conexao.createStatement();
            String sql = "INSERT INTO VEICULO (PLACA, fk_unidade, fk_categoria, cor, numportas, ano, disponivel, modelo) VALUES ('"+v.getPlaca()+"', "+v.getFk_unidade()+", '"+v.getFk_categoria()+"', '"+v.getCor()+"', "+v.getNumportas()+", "+v.getAno()+", '"+v.getDisponivel()+"', '"+v.getModelo()+"')";
            int i = stm.executeUpdate(sql);
            return i;
        }
    
    
    public ResultSet retrive () throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public ResultSet retrivePlaca (String placa) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO WHERE PLACA ='"+placa+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public ResultSet retriveAno (String ano) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO WHERE ANO ="+ano;
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public ResultSet retrivePlacaD (String placa) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO WHERE PLACA ='"+placa+"'AND DISPONIVEL='S'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public ResultSet retriveAnoD (String ano) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO WHERE ANO ="+ano+"AND DISPONIVEL='S'";
            rs = stm.executeQuery(sql);
            return rs;
    }
   
    public int delete(String placa) throws SQLException {
        Statement stm = this.conexao.createStatement();
        ResultSet rs;        
        String sql = "DELETE FROM VEICULO WHERE PLACA='"+placa+"'";
        int i = stm.executeUpdate(sql);
        return i;
    }
    
}
