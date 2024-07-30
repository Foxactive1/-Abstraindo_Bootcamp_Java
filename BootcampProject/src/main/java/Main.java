public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp InNovaIdeia");
        Curso cursoPython = new Curso("Python para Iniciantes", "Aprenda Python do zero", 40);
        Mentoria mentoriaJunior = new Mentoria("Mentoria para Juniors", "Carlos Silva", 2);
        Dev devJoao = new Dev("João", "joao@example.com");

        bootcamp.adicionarCurso(cursoPython);
        bootcamp.adicionarMentoria(mentoriaJunior);

        devJoao.inscreverCurso(cursoPython);
        devJoao.inscreverMentoria(mentoriaJunior);

        bootcamp.adicionarDev(devJoao);

        System.out.println(bootcamp.getCursos().get(0).mostrarDetalhes());
        System.out.println(bootcamp.getMentorias().get(0).mostrarDetalhes());
        System.out.println(bootcamp.getDevs().get(0).mostrarDetalhes());
    }
}