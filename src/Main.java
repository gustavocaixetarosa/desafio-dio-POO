import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Se aprimore em mais um curso de Java", 14);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria("Angular", "Mergulhe em profundidade em Angular");

        System.out.println(mentoria);
    }
}