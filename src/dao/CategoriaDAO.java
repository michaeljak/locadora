
package dao;

import bean.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CategoriaDAO {
    
    private Connection conexao;
    
    public CategoriaDAO(Connection conexao){
        this.conexao=conexao;  
        
    }
    
    public int create(Categoria cat) throws SQLException {
            Statement stm = this.conexao.createStatement();
            String sql = "INSERT INTO CATEGORIA (NOME, direção, BANCO, ARCONDICIONADO, VIDRO, TAXAKM, PRECOFIXO) VALUES ('"+cat.getNome()+"','"+cat.getDireção()+"','"+cat.getBanco()+"','"+cat.getArcondicionado()+"','"+cat.getVidro()+"',"+cat.getTaxakm()+","+cat.getPrecofixo()+")";
           int e = stm.executeUpdate(sql);
           return e;
        }
    
    
    public ResultSet retrive () throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM CATEGORIA";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    public ResultSet retrive2(String nome) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM CATEGORIA WHERE nome = '"+nome+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }
    
    
    public String retriveNome (String fk_cat) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT NOME FROM CATEGORIA WHERE id = "+fk_cat+"";
            rs = stm.executeQuery(sql);
            
            String nome = null;
            while(rs.next()){
                nome = rs.getString("nome");
            }
            return nome;
    }
   
    
    public void update (Categoria cat) throws SQLException{
            String sql = "UPDATE CATEGORIA SET DIREÇÃO='"+cat.getDireção()+"', BANCO='"+cat.getBanco()+"',ARCONDICIONADO='"+cat.getArcondicionado()+"',VIDRO='"+cat.getVidro()+",TAXAKM="+cat.getTaxakm()+",PRECOFIXO="+cat.getPrecofixo();
            Statement stm = conexao.createStatement();
            stm.executeUpdate(sql);
    }
    
    public int delete(String nome) throws SQLException {
        Statement stm = this.conexao.createStatement();
        ResultSet rs;        
        String sql = "DELETE FROM CATEGORIA WHERE NOME='"+nome+"'";
        int i = stm.executeUpdate(sql);
        return i;
    }
    
}
