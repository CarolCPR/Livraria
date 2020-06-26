public class Hq extends Livro{
    private String genero; //pode ser herois, infantil, manga, etc

    public Hq(String nome, String autor, Double valor, String genero, Boolean vendido){
        super(nome, autor, valor, vendido);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Hq{" +
                "genero='" + genero + '\'' +
                '}';
    }
}
