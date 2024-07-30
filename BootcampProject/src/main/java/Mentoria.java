public class Mentoria {
    private String titulo;
    private String mentor;
    private int duracao; // em horas

    public Mentoria(String titulo, String mentor, int duracao) {
        this.titulo = titulo;
        this.mentor = mentor;
        this.duracao = duracao;
    }

    public String mostrarDetalhes() {
        return "Mentoria: " + titulo + ", Mentor: " + mentor + ", Duração: " + duracao + " horas";
    }

    public String getTitulo() {
        return titulo;
    }
}