import java.util.Scanner;

public class Cliente{

    private String nome;
    private String email;
    private String CPF;
    private String endereco;
    private Carrinho carrinho;

    public Cliente(){}

    public Cliente(String nome, String email, String CPF, String endereco, Carrinho carrinho){
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.endereco = endereco;
        this.carrinho = carrinho;
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

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", CPF=" + CPF +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public Cliente addCliente() {
        Cliente cliente = new Cliente("carol", "carol@email.com", "55555555255", "rua dos cravos, 321", null);
//        Cliente cliente = new Cliente("", "", "", "", carrinho);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Seu nome:");
//        cliente.setNome(in.nextLine());
//        System.out.println("E-mail:");
//        cliente.setEmail(in.nextLine());
//        System.out.println("CPF:");
//        cliente.setCPF(in.nextLine());
//        cliente.setEndereco(in.nextLine());
//        System.out.println("Endereço:");
        System.out.println("Olá, " + cliente.getNome() + "!");

        return cliente;
    }


}
