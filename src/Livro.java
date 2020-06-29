public class Livro {
    private String nome;
    private String autor;
    private Double valor;

    public Livro(String nome, String autor, Double valor){
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
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

    public String toString(){
        return "Nome autor:" + getAutor() + "\nTítulo: " + getNome() + "\nValor: R$ " + getValor();
    }
}
