package Dominio;

public class Funcionario {
    
    public Funcionario(String nome, String cpf, String cargo, boolean eGerente){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.eGerente = eGerente;
    }

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
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

    public String getCpf() {
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

    private String cpf;

    private String nome;

    private String cargo;

    private boolean eGerente;
}
