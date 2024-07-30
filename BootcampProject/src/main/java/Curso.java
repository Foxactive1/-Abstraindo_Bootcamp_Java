public class Curso {
    private String titulo;
    private String descricao;
    private int duracao; // em horas

    public Curso(String titulo, String descricao, int duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String mostrarDetalhes() {
        return "Curso: " + titulo + ", Descri��o: " + descricao + ", Dura��o: " + duracao + " horas";
    }

    public String getTitulo() {
        return titulo;
    }
}