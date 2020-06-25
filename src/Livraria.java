import java.util.ArrayList;

public class Livraria {
    public String nome;
    public String endereco;

    ArrayList<Cliente> clientes;

    public Livraria(String nome, String endereco, ArrayList<Cliente> clientes){
        this.nome = nome;
        this.endereco = endereco;
        this.clientes = clientes;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public String toString() {
        return "Livraria{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
