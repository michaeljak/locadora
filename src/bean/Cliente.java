package bean;

public class Cliente {
    
    private long  rg;
    private int fk_endereco;
    private String cpf;
    private String nome;
    private String email;
    private String dtnascimento;
    private String telefone;
    
    public Cliente(long rg,int fk_endereco,String cpf,String nome,String email, String dtnascimento, String telefone){
        this.cpf = cpf;
        this.dtnascimento = dtnascimento;
        this.email = email;
        this.fk_endereco = fk_endereco;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public int getFk_endereco() {
        return fk_endereco;
    }

    public void setFk_endereco(int fk_endereco) {
        this.fk_endereco = fk_endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
