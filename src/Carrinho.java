import java.util.ArrayList;

public class Carrinho {
    private String prazoEntrega;
    private Double valor;
    private ArrayList<Livro> livros;
    private ArrayList<Hq> hqs;
    private String tipoPagamento;

    public Carrinho(String prazoEntrega, Double valor, ArrayList<Livro> livros, ArrayList<Hq> hqs, String tipoPagamento){

        this.prazoEntrega = prazoEntrega;
        this.valor = valor;
        this.livros = livros;
        this.hqs = hqs;
        this.tipoPagamento = tipoPagamento;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public ArrayList<Hq> getHqs() {
        return hqs;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setHqs(ArrayList<Hq> hqs) {
        this.hqs = hqs;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String toString() {
        return "Carrinho{" +
                "prazoEntrega='" + prazoEntrega + '\'' +
                ", valor=" + valor +
                ", livros=" + livros +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                '}';
    }

    public void calculaFrete(){}

    public void calculaPrazoEntrega(){}

    public void calculaValorTot(){}

}
