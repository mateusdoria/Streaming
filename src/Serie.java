public class Serie {
    public  String titulo;
    public  String genero;
    public String diretor;
    public int temporada;
    private String imprime;

    public Serie(String titulo, String genero, String diretor, int temporada) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.temporada =  temporada;

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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String imprimir(){
        return "Titulo:" + titulo + "\nGenero:" + genero + "\nTemporada:"
                + temporada + "\nDiretor:"+ diretor;
    }
}
