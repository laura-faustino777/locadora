package Model;

public class Filme {

    private String titulo;
    private String genero;
    private String valorAluguel;

    public Filme(String titulo, String genero, String valorAluguel) {
        this.titulo = titulo;
        this.genero = genero;
        this.valorAluguel = valorAluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void exibadetalhes(){

    }
    public void AplicarDesconto() {

    }
}
