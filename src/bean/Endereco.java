package bean;

public class Endereco {
    private int fk_cidade;
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    
    public Endereco(String bairro,String cep,String complemento,int numero,String rua,int fk_cidade){
        this.bairro=bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.fk_cidade = fk_cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public int getFk_cidade() {
        return fk_cidade;
    }

    public void setFk_cidade(int fk_cidade) {
        this.fk_cidade = fk_cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    
    
}
