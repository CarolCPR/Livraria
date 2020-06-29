public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("=          LIVRARIA          =");
        System.out.println("==============================");

        Livraria livraria = new Livraria("Aviaras", "rua dos bobos, 0", null, null); //é saraiva ao contrario
        livraria.addLivros();
        livraria.inicio();
    }
}
