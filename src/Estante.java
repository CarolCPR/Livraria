import java.util.ArrayList;

public class Estante {
    private int numero;
    private ArrayList<Livro> livros;

    public Estante(int numero, ArrayList<Livro> livros){
        this.numero = numero;
        this.livros = livros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String toString() {
        return "Estante{" +
                "numero=" + numero +
                ", livros=" + livros +
                '}';
    }
}
