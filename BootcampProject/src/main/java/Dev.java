import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private String email;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;

    public Dev(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
    }

    public void inscreverCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public String mostrarDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Dev: ").append(nome).append(", Email: ").append(email);
        detalhes.append(", Cursos: ");
        for (Curso curso : cursos) {
            detalhes.append(curso.getTitulo()).append(", ");
        }
        detalhes.append(", Mentorias: ");
        for (Mentoria mentoria : mentorias) {
            detalhes.append(mentoria.getTitulo()).append(", ");
        }
        return detalhes.toString();
    }
}