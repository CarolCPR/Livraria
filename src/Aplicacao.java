import java.util.ArrayList;

public class Aplicacao {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        listaClientes.add(new Cliente("Fernanda", "fernanda@email.com", "55855555555", "rua das flores, 123"));
        listaClientes.add(new Cliente("carol", "carol@email.com", "55555555255", "rua dos cravos, 321"));
        listaClientes.add(new Cliente("raiva", "odroga@email.com", "55955555555", "rua maneira, 258"));

        Livraria livraria = new Livraria("Saraiva", "rua dos bobos 0", listaClientes);
    }
}
