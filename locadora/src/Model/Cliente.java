package Model;

public class Cliente{


    private String Nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        Nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}



