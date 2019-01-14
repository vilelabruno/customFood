package customfodd;

public class Funcionario {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void seteGerente(boolean eGerente) {
        this.eGerente = eGerente;
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean iseGerente() {
        return eGerente;
    }

    private int cpf;

    private String nome;

    private String cargo;

    private boolean eGerente;
}
