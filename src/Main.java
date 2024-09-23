import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Se aprimore em mais um curso de Java", 14);

        Mentoria mentoria = new Mentoria("Angular", "Mergulhe em profundidade em Angular");

        Conteudo conteudo = new Mentoria("Nova mentoria", "gosto muito dessa");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Melhor do Brasil");
        bootcamp.setDescricao("Bootcamp completo para amantes da Programacao");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(conteudo);

        Dev devGustavo = new Dev("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println(devGustavo.getConteudosInscritos());
        devGustavo.progredir();

        System.out.println(devGustavo.getConteudosInscritos());
        System.out.println(devGustavo.getConteudosConcluidos());
        Dev devFernando = new Dev("Fernando");


//        System.out.println(bootcamp.getConteudos());
    }
}