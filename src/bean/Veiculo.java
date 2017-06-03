package bean;

public class Veiculo {
    
    private String placa;
    private int fk_unidade;
    private String fk_categoria;
    private String cor;
    private int numportas;
    private int ano;
    private char disponivel;
    private String modelo;
    
    public Veiculo(char disponivel,int ano,int numportas,String cor,String fk_categoria,int fk_unidade,String placa,String modelo){
        this.ano=ano;
        this.cor=cor;
        this.disponivel=disponivel;
        this.fk_categoria=fk_categoria;
        this.fk_unidade=fk_unidade;
        this.modelo=modelo;
        this.numportas=numportas;
        this.placa=placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getFk_unidade() {
        return fk_unidade;
    }

    public void setFk_unidade(int fk_unidade) {
        this.fk_unidade = fk_unidade;
    }

    public String getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(String fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumportas() {
        return numportas;
    }

    public void setNumportas(int numportas) {
        this.numportas = numportas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(char disponivel) {
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
}
