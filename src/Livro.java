public class Livro {
    private String nome;
    private String autor;
    private Double valor;
    private Boolean vendido;

    public Livro(String nome, String autor, Double valor, Boolean vendido){
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
        this.vendido = vendido;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public Boolean getVendido() {
        return vendido;
    }

    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }

    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", valor=" + valor +
                '}';
    }
}
