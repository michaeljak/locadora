package bean;

public class Categoria {
    
    private String nome;
    private String direção;
    private String banco;
    private String arcondicionado;
    private String vidro;
    private int taxakm;
    private int precofixo;
    
    public Categoria(String nome, String direção, String banco, String arcondicionado, String vidro, int taxakm,int precofixo){
        
        this.arcondicionado = arcondicionado;
        this.banco = banco;
        this.direção = direção;
        this.nome = nome;
        this.precofixo = precofixo;
        this.taxakm = taxakm;
        this.vidro = vidro;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireção() {
        return direção;
    }

    public void setDireção(String direção) {
        this.direção = direção;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(String arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public String getVidro() {
        return vidro;
    }

    public void setVidro(String vidro) {
        this.vidro = vidro;
    }

    public int getTaxakm() {
        return taxakm;
    }

    public void setTaxakm(int taxakm) {
        this.taxakm = taxakm;
    }

    public int getPrecofixo() {
        return precofixo;
    }

    public void setPrecofixo(int precofixo) {
        this.precofixo = precofixo;
    }
    
    
    
}
