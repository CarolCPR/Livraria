import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    private String nome;
    private String endereco;

    private Cliente cliente;

    private ArrayList<Livro> livros;


    public Livraria(String nome, String endereco, Cliente cliente, ArrayList<Livro> livros){
        this.nome = nome;
        this.endereco = endereco;
        this.cliente = cliente;
        this.livros = livros;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Livro> getlivros() {
        return livros;
    }

    public void setlivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String toString() {
        return "Livraria{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cliente=" + cliente +
                ", livros=" + livros +
                '}';
    }

    public void menu(){
        ArrayList<Livro> livros = getlivros();
        Carrinho carrinho = addCarrinho();
        this.cliente.setCarrinho(carrinho);
        int e = 0;
        while(e == 0) {
            printMenu();
            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt();
            switch (escolha) {
                case 1:
                    int i = 0;
                    System.out.println("---------------------");
                    System.out.println("-      Livros:      -");
                    System.out.println("---------------------");
                    while(i<livros.size()){
                        System.out.println("Numero: " + (i + 1) + "\n" + livros.toString());
                        i++;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("-------------------------");
                        System.out.println("- Adiciona ao carrinho: -");
                        System.out.println("-  Digite 0 para sair   -");
                        System.out.println("-------------------------");
                        System.out.println("Digite o numero do item que você quer adicionar ao carrinho: ");
                        escolha = in.nextInt();
                        if (escolha == 0)
                            break;
                        carrinho.addLivros(livros.get(escolha - 1));
                    }
                    break;
                case 3:
                    if (carrinho.getLivros().size() > 0) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        break;
                    }
                    while (true) {
                        System.out.println("-------------------------");
                        System.out.println("-    Editar carrinho:   -");
                        System.out.println("-   Digite 0 para sair  -");
                        System.out.println("-------------------------");
                        for (i = 0; i < carrinho.getLivros().size(); i++)
                            System.out.println("Numero: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());
                        System.out.println("Digite o numero do item que você quer excluir do carrinho: ");
                        escolha = in.nextInt();
                        if (escolha == 0)
                            break;
                        carrinho.removeLivros(livros.get(escolha - 1));
                    }
                    break;
                case 4:
                    if (carrinho.getLivros().size() > 0) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        break;
                    }
                    System.out.println("-------------------------");
                    System.out.println("-   Itens no carrinho:  -");
                    System.out.println("-------------------------");
                    for (i = 0; i < carrinho.getLivros().size(); i++)
                        System.out.println("Numero: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());
                    break;
                case 5:
                    if (carrinho.getLivros().size() > 0) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        break;
                    }
                    //double total = 0;
                    System.out.println("-------------------------");
                    System.out.println("-   Finalizar compra    -");
                    System.out.println("-------------------------");
                    for (i = 0; i < carrinho.getLivros().size(); i++)
                        System.out.println("Numero: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());
                    System.out.println("Valor total a pagar: " + carrinho.calculaValorTot());
                    System.out.println("Digite 1 para confirmar a comprar e 0 para continuar comprando.");
                    escolha = in.nextInt();
                    if (escolha == 1) carrinho.comprarLivro();
                    break;
                case 0:
                    e = 1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }

    public void printMenu(){
        System.out.println("Olá, " + cliente.getNome() + "!");
        System.out.println("\nPor favor, selecione a opção desejada:\n");
        System.out.println("1) Livros");
        System.out.println("2) Adicionar ao Carrinho");
        System.out.println("3) Editar carrinho");
        System.out.println("4) Exibir carrinho");
        System.out.println("5) Finalizar compra");
        /*System.out.println("6) Especial: Comprar HQs");
        System.out.println("7) Modo admin");*/
        System.out.println("0) Sair");
        //System.out.println("\n 4) ");
    }

    public void modoAdmin(){
        System.out.println("1) Adicionar livros");
        addLivros();
        System.out.println("2) Adicionar estante");
        System.out.println("3) Adicionar HQs");
        System.out.println("4) Alterar dados livraria");
    }

    public void addCliente(){
        Cliente cliente = new Cliente("carol", "carol@email.com", "55555555255", "rua dos cravos, 321", null);
        /*Cliente cliente = new Cliente("", "", "", "", carrinho);
        Scanner in = new Scanner(System.in);
        System.out.println("Seu nome:");
        cliente.setNome(in.nextLine());
        System.out.println("E-mail:");
        cliente.setEmail(in.nextLine());
        System.out.println("CPF:");
        cliente.setCPF(in.nextLine());
        System.out.println("Endereço:");
        cliente.setEndereco(in.nextLine());*/
        setCliente(cliente);
    }

    public Carrinho addCarrinho(){
        ArrayList<Livro> listaCompra = new ArrayList<>();
        ArrayList<Hq> listaHqs = new ArrayList<>();
        return new Carrinho(0.0, listaCompra, listaHqs);
    }

    public void addLivros(){
        ArrayList<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(new Livro("Orgulho e preconceito", "Jane Austen", 10.00));
        listaLivros.add(new Livro("O poder do hábito", "Charles Duhigg", 44.90));
        setlivros(listaLivros);
    }

}
