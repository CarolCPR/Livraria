import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("=          LIVRARIA          =");
        System.out.println("==============================");

        Livraria livraria = new Livraria("Aviaras", "rua dos bobos 0", null, null); //é saraiva ao contrario

        Scanner in = new Scanner(System.in);
        System.out.println("Cliente digite 1");
        System.out.println("Administrador digite 0");
        int escolha = in.nextInt();

        if(escolha == 1) {
            livraria.addCliente();
            livraria.menu();
        }else if(escolha == 0)
            livraria.modoAdmin();

    }

}
