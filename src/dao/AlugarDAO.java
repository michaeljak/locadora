package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlugarDAO {
    private Connection conexao;
    
    public AlugarDAO(Connection conexao){
        this.conexao=conexao;  
    }
    
    public void create(String rg, String placa, int kmatual) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs;
    Date d = new Date(System.currentTimeMillis());
    SimpleDateFormat df;
    df = new SimpleDateFormat("dd/MM/yyyy");
    String data = df.format(d);
    String sql = "INSERT INTO ALUGA (FK_CLIENTE,FK_VEICULO,DTALUGUEL,KMATUAL) VALUES ('"+rg+"','"+placa+"','"+data+"',"+kmatual+")";
  
    String sql1 = "UPDATE VEICULO SET DISPONIVEL = 'N' WHERE placa = '"+placa+"'"; 
    int i = stm.executeUpdate(sql1);
    int a = stm.executeUpdate(sql);
    }
    
    public boolean retriveExistente (String rg) throws SQLException{
        Statement stm = this.conexao.createStatement();
        ResultSet rs;
        System.out.println(rg +"oioioi");
        String sql = "SELECT fk_cliente FROM ALUGA";
        String RG= "";
        rs = stm.executeQuery(sql);
        while (rs.next()){
            RG = rs.getString("fk_cliente");
        }
            if (RG.equals(rg)){
                return true;
            }else{
                return false;
            }
        
    }
    
    public void devolver(String rg) throws SQLException{
    Statement stm = this.conexao.createStatement();
    ResultSet rs, rs1, rs2;

    String sql = "SELECT * FROM ALUGA WHERE fk_cliente = '"+rg+"'";
            String placa = null;
            rs = stm.executeQuery(sql);
            while(rs.next()){
                placa = rs.getString("fk_veiculo");
            }
    
    
        String sql1 = "UPDATE VEICULO SET DISPONIVEL = 'S' WHERE placa = '"+placa+"'"; 
       int i = stm.executeUpdate(sql1);

    String sql2 = "DELETE FROM ALUGA WHERE fk_cliente = '"+rg+"'"; 
    int j = stm.executeUpdate(sql2);
    
    }
    
    
      public ResultSet retriveAluga (String rg) throws SQLException{
            Statement stm = this.conexao.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM ALUGA WHERE fk_cliente = '"+rg+"'";
            rs = stm.executeQuery(sql);
            return rs;
    }

      
}
