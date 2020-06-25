import java.util.Objects;

public class Cliente{

    private String nome;
    private String email;
    private String CPF;
    private String endereco;

    public Cliente(String nome, String email, String CPF, String endereco){
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", CPF=" + CPF +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public void comprarLivro(){}

    public void consultaLivro(){}
}
