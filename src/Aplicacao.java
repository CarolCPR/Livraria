import java.util.ArrayList;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("=          LIVRARIA          =");
        System.out.println("==============================");

        Livraria livraria = new Livraria("Aviaras", "rua dos bobos, 0", null, new ArrayList<Livro>(), new ArrayList<Hq>(), null); //é saraiva ao contrario
        livraria.inicio();
    }
}
