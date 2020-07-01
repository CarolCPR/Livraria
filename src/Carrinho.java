import java.util.ArrayList;

public class Carrinho {
    private Double valor;
    private ArrayList<Livro> livros;
    private ArrayList<Hq> hqs;

    public Carrinho() {
    }

    public Carrinho(Double valor, ArrayList<Livro> livros, ArrayList<Hq> hqs) {
        this.valor = valor;
        this.livros = livros;
        this.hqs = hqs;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<Hq> getHqs() {
        return hqs;
    }

    public void setHqs(ArrayList<Hq> hqs) {
        this.hqs = hqs;
    }


    public String toString() {
        return "Carrinho{" +
                "valor=" + valor +
                ", livros=" + livros + '\'' +
                '}';
    }

    public void calculaValorTot() {
        double soma = 0.0;
        for (Livro livro : getLivros()){
            soma += livro.getValor();
        }
        for (Hq hq : getHqs()){
            soma += hq.getValor();
        }
        this.valor = soma;
    }

    public void addLivros(Livro livro) {
        this.livros.add(livro);
    }

    public void removeLivros(int possicao) {
        this.livros.remove(possicao);
    }

    public void addHqs(Hq hq) {
        this.hqs.add(hq);
    }

    public void removeHqs(int possicao) {
        this.livros.remove(possicao);
    }

    public void comprarLivro() {
        for (int i = 0; i < getLivros().size(); i++) {
            this.livros.remove(i);
        }
        System.out.println("Compra finalizada!\n");
    }

}
