import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    Scanner inInt = new Scanner(System.in);
    Scanner inLine = new Scanner(System.in);
    private String nome;
    private String endereco;
    private Cliente cliente;
    private ArrayList<Livro> livros;
    private ArrayList<Hq> hqs;
    private Carrinho carrinho;


    public Livraria(String nome, String endereco, Cliente cliente, ArrayList<Livro> livros, ArrayList<Hq> hqs, Carrinho carrinho) {
        this.nome = nome;
        this.endereco = endereco;
        this.cliente = (cliente == null) ? new Cliente() : cliente;
        this.livros = livros;
        this.hqs = hqs;
        this.carrinho = (carrinho == null) ? new Carrinho(0.0, new ArrayList<>(), new ArrayList<>()) : carrinho;
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

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setHqs(ArrayList<Hq> hqs) {
        this.hqs = hqs;
    }

    public ArrayList<Hq> getHqs() {
        return hqs;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public String toString() {
        return "Nome: " + nome + ":\nEndereço: " + endereco + "\nLivros=" + livros + "\nHQs: " + hqs + "\nClientes: " + cliente;
    }

    public void menu() {
        //carrinho.addCarrinho();
        livrosHqsPadrao();
        this.cliente.setCarrinho(carrinho);
        int e = 0;
        int i = 0;

        while (e == 0) {
            printMenu();
            int escolha = inInt.nextInt();
            switch (escolha) {
                case 1:
                    printLivros();
                    break;
                case 2:
                    printHqs();
                    break;

                case 3:
                    if (carrinho.getLivros().isEmpty() && carrinho.getHqs().isEmpty()) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        break;
                    }
                    //double total = 0;
                    System.out.println("-------------------------");
                    System.out.println("-   Finalizar compra    -");
                    System.out.println("-------------------------");
                    for (i = 0; i < carrinho.getLivros().size(); i++) {
                        System.out.println("Livro: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());

                    }
                    for (i = 0; i < carrinho.getHqs().size(); i++) {
                        System.out.println("Hq: " + (i + 1) + "\n" + carrinho.getHqs().get(i).toString());

                    }
                    carrinho.calculaValorTot();
                    System.out.println("Valor total a pagar: " + carrinho.getValor());
                    System.out.println("Digite 1 para confirmar a comprar e 0 para continuar comprando.");
                    escolha = inInt.nextInt();
                    if (escolha == 1)
                        carrinho.comprarLivro();
                    break;
                case 0:
                    e = 1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }

    public void printMenu() {
        System.out.println("\nPor favor, selecione a opção desejada:\n");
        System.out.println("1) Livros");
        System.out.println("2) Especial: Comprar HQs");
        System.out.println("3) Finalizar compra");
        System.out.println("0) Voltar");
        //System.out.println("\n 4) ");
    }

    public void printHqs() {
        int e = 0;
        int i;

        while (e == 0) {

            i = 0;
            System.out.println("---------------------");
            System.out.println("-        Hqs:       -");
            System.out.println("---------------------");
            while (i < hqs.size()) {
                System.out.println("Hqs: " + (i + 1) + "\n" + hqs.get(i).toString() + "\n");
                i++;
            }

            System.out.println("1) Adicionar Hqs ao Carrinho");
            System.out.println("2) Editar carrinho");
            System.out.println("3) Exibir carrinho");
            System.out.println("0) Voltar");
            int escolha = inInt.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("- Adiciona ao carrinho: -");
                    System.out.println("-------------------------");
                    while (true) {
                        System.out.println("Digite o numero do item que você quer adicionar ao carrinho ou digite 0 para sair: ");
                        escolha = inInt.nextInt();
                        if (escolha == 0)
                            break;
                        if (escolha > 0 && escolha <= hqs.size()) {
                            carrinho.addHqs(hqs.get(escolha - 1));
                            hqs.remove(escolha - 1);
                            break;
                        } else System.out.println("Escolha errada! Veja nossas opções digitando 0 e depois 1");
                    }
                    break;
                case 2:
                    if (carrinho.getHqs() == null || carrinho.getHqs().isEmpty()) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        continue;
                    }
                    System.out.println("-------------------------");
                    System.out.println("-    Editar carrinho:   -");
                    System.out.println("-   Digite 0 para sair  -");
                    System.out.println("-------------------------");
                    while (true) {
                        for ( i = 0; i < carrinho.getHqs().size(); i++)
                            System.out.println("Hqs: " + (i + 1) + "\n" + carrinho.getHqs().get(i).toString());
                        System.out.println("Digite o numero do item que você quer excluir do carrinho ou digite 0 para sair: ");
                        escolha = inInt.nextInt();
                        if (escolha == 0)
                            break;
                        if (escolha > 0 && escolha <= carrinho.getHqs().size()) {
                            hqs.add(carrinho.getHqs().get(escolha - 1));
                            carrinho.removeHqs(escolha - 1);
                        } else
                            System.out.println("Escolha errada! Veja seu carrinho abaixo:");
                    }
                    break;
                case 3:
                    if (carrinho.getHqs() == null || carrinho.getHqs().isEmpty()) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        continue;
                    }
                    System.out.println("-------------------------");
                    System.out.println("-   Itens no carrinho:  -");
                    System.out.println("-------------------------");
                    for ( i = 0; i < carrinho.getHqs().size(); i++)
                        System.out.println("Livro: " + (i + 1) + "\n" + carrinho.getHqs().get(i).toString());
                case 0:
                    e = -1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }

    public void printLivros() {
        int e = 0;

        while (e == 0) {

            int i = 0;
            System.out.println("---------------------");
            System.out.println("-      Livros:      -");
            System.out.println("---------------------");
            while (i < livros.size()) {
                System.out.println("Livro: " + (i + 1) + "\n" + livros.get(i).toString() + "\n");
                i++;
            }

            System.out.println("1) Adicionar livros ao Carrinho");
            System.out.println("2) Editar carrinho");
            System.out.println("3) Exibir carrinho");
            System.out.println("0) Voltar");
            int escolha = inInt.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("- Adiciona ao carrinho: -");
                    System.out.println("-------------------------");
                    while (true) {
                        System.out.println("Digite o numero do item que você quer adicionar ao carrinho ou digite 0 para sair: ");
                        escolha = inInt.nextInt();
                        if (escolha == 0)
                            break;
                        if (escolha > 0 && escolha <= livros.size()) {
                            carrinho.addLivros(livros.get(escolha - 1));
                            livros.remove(escolha - 1);
                            break;
                        } else System.out.println("Escolha errada! Veja nossas opções digitando 0 e depois 1");
                    }
                    break;
                case 2:
                    if (carrinho.getLivros() == null || carrinho.getLivros().isEmpty() ) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        continue;
                    }
                    System.out.println("-------------------------");
                    System.out.println("-    Editar carrinho:   -");
                    System.out.println("-   Digite 0 para sair  -");
                    System.out.println("-------------------------");
                    while (true) {
                        for ( i = 0; i < carrinho.getLivros().size(); i++)
                            System.out.println("Livro: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());
                        System.out.println("Digite o numero do item que você quer excluir do carrinho ou digite 0 para sair: ");
                        escolha = inInt.nextInt();
                        if (escolha == 0)
                            break;
                        if (escolha > 0 && escolha <= carrinho.getLivros().size()) {
                            livros.add(carrinho.getLivros().get(escolha - 1));
                            carrinho.removeLivros(escolha - 1);

                        } else
                            System.out.println("Escolha errada! Veja seu carrinho abaixo:");
                    }
                    break;
                case 3:
                    if (carrinho.getLivros() == null || carrinho.getLivros().isEmpty()) {
                        System.out.println("Nada no carrinho, continue comprando.");
                        continue;
                    }
                    System.out.println("-------------------------");
                    System.out.println("-   Itens no carrinho:  -");
                    System.out.println("-------------------------");
                    for ( i = 0; i < carrinho.getLivros().size(); i++)
                        System.out.println("Livro: " + (i + 1) + "\n" + carrinho.getLivros().get(i).toString());
                case 0:
                    e = -1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }

    public void modoAdmin() {
        int e = 0;
        while(e == 0) {
            System.out.println("Digite a senha de admin: ");
            int senha = inInt.nextInt();
            if(senha == 123456)
                e = -1;
            else System.out.println("Senha incorreta.");
        }
        e = 0;
        while (e == 0) {
            System.out.println("1) Adicionar livros");
            System.out.println("2) Adicionar HQs");
            System.out.println("3) Alterar dados livraria");
            System.out.println("0) Voltar");
            int escolha = inInt.nextInt();
            switch (escolha) {
                case 1:
                    addLivros();
                    break;
                case 2:
                    addHqs();
                    break;
                case 3:
                    System.out.println("Dados atuais:");
                    System.out.println(toString());
                    System.out.println("Nome:");
                    nome = inLine.nextLine();
                    System.out.println("Endereço:");
                    endereco = inLine.nextLine();
                    break;
                case 0:
                    e = -1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }

    public void livrosHqsPadrao(){
        livros.add(new Livro("Orgulho e preconceito", "Jane Austen", 10.00));
        livros.add(new Livro("O poder do hábito", "Charles Duhigg", 44.90));
        hqs.add(new Hq("Homem Aranha: Azul", "Jeph Loeb", 44.10, "heróis"));
        hqs.add(new Hq("Homem-aranha: A Última Caçada De Kraven", "J. M. DeMatteis", 28.80,"heróis"));
    }

    public void addLivros() {
        System.out.println("-------------------------");
        System.out.println("-   Adição de livros:   -");
        System.out.println("-------------------------");
        System.out.println("Título: ");
        String titulo = inLine.nextLine();
        System.out.println("Nome do autor: ");
        String autor = inLine.nextLine();
        System.out.println("Valor: ");
        Double valor = inInt.nextDouble();
        livros.add(new Livro(titulo, autor, valor));
    }

    public void addHqs(){
        System.out.println("-------------------------");
        System.out.println("-     Adição de HQs:    -");
        System.out.println("-------------------------");
        System.out.println("Título: ");
        String titulo = inLine.nextLine();
        System.out.println("Nome do autor: ");
        String autor = inLine.nextLine();
        System.out.println("Valor: ");
        Double valor = inInt.nextDouble();
        System.out.println("Genero: ");
        String genero = inLine.nextLine();
        hqs.add(new Hq(titulo, autor, valor, genero));
    }

    public void inicio() {
        int e = 0;

        while (e == 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Para acessar o menu do Cliente, digite 1");
            System.out.println("Administrador, digite 2");
            System.out.println("Para sair digite 0");
            int escolha = in.nextInt();
            switch (escolha) {
                case 1:
                    carrinho = new Carrinho(0.0, new ArrayList<>(), new ArrayList<>());
                    hqs = new ArrayList<>();
                    livros = new ArrayList<>();
                    cliente.addCliente();
                    menu();
                    break;
                case 2:
                    modoAdmin();
                    break;
                case 0:
                    e = -1;
                    break;
                default:
                    System.out.println("Escolha errada, tente novamente");
            }
        }
    }


}
