import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("=          LIVRARIA          =");
        System.out.println("==============================");

        ArrayList<Estante> listaEstantes = new ArrayList<>();
        ArrayList<Livro> listaLivros = new ArrayList<>();
        ArrayList<Livro> listaCompra = new ArrayList<>();
        ArrayList<Hq> listaHqs = new ArrayList<>();

        Carrinho carrinho = new Carrinho("", 10.00, listaCompra, listaHqs, "");

        Cliente cliente = new Cliente("carol", "carol@email.com", "55555555255", "rua dos cravos, 321", carrinho);

        listaLivros.add(new Livro("Orgulho e preconceito", "Jane Austen", 10.00));
        listaLivros.add(new Livro("O poder do hábito", "Charles Duhigg", 44.90));

        listaEstantes.add(new Estante(1, listaLivros));

        Livraria livraria = new Livraria("Aviaras", "rua dos bobos 0", cliente, listaEstantes); //é saraiva ao contrario

        int i = -1;
        while(i != 0){
            printMenu();
            i = menu(listaLivros);
        }
    }

    public static int menu(ArrayList<Livro> livros){
        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt();
        switch (escolha){
            case 1:
                int i=0;
                Livro livro;
                System.out.println("---------------------");
                System.out.println("-      Livros:      -");
                System.out.println("---------------------");
                while(i < livros.size()){
                    livro = livros.get(i);
                    System.out.println("Autor: " + livro.getAutor() + "\nTítulo: " + livro.getNome() + "\nValor: R$ " + livro.getValor() + "\n");
                    i++;
                }
                break;
            /*case 2:
                break;
            case 3:
                break;
            case 4:
                break;*/
            case 0:
                return 0;
            default:
                System.out.println("Escolha errada, tente novamente");
        }
        return -1;
    }

    public static void printMenu(){
        System.out.println("\nPor favor, selecione a opção desejada:\n");
        System.out.println("1) Livros");
        /*System.out.println("2) Seu Carrinho");
        System.out.println("3) Fazer cadastro");
        System.out.println("4) Especial: Comprar HQs");
        System.out.println("5) Modo admin");*/
        System.out.println("0) Sair");
        //System.out.println("\n 4) ");
    }

    public static void modoAdmin(){
        System.out.println("1) Adicionar livros");
        System.out.println("2) Adicionar estante");
        System.out.println("3) Adicionar HQs");
        System.out.println("4) Alterar dados livraria");
    }
}
