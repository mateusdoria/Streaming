public class Filme {

    private String titulo;
    private String genero;
    private int duração;
    private String diretor;

    public Filme(String titulo, String genero, String diretor, int duração) {
        this.titulo = titulo;
        this.genero = genero;
        this.duração = duração;
        this.diretor = diretor;
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

    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String imprimir(){
        return "Titulo:" + titulo + "\nGenero:" + genero + "\nDuração:"
                + duração + "\nDiretor:"+ diretor;
    }

}

