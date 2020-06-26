import java.util.ArrayList;

public class Carrinho {
    private String prazoEntrega;
    private Double valor;
    private ArrayList<Livro> livros;
    private String tipoPagamento;

    public Carrinho(String prazoEntrega, Double valor, ArrayList<Livro> livros, String tipoPagamento){

        this.prazoEntrega = prazoEntrega;
        this.valor = valor;
        this.livros = livros;
        this.tipoPagamento = tipoPagamento;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public String toString() {
        return "Carrinho{" +
                "prazoEntrega='" + prazoEntrega + '\'' +
                ", valor=" + valor +
                ", livros=" + livros +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                '}';
    }
}
