import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Curso curso = new Curso();
        Bootcamp bootcamp = new Bootcamp();

        System.out.print("Quantos cursos deseja adicionar? ");
        int N = sc.nextInt();
        sc.nextLine();

        if (N != 0) {
            for (int i = 0; i < N; i++) {
                System.out.print("Digite o título do curso: ");
                String titulo = sc.nextLine();
                curso.setTitulo(titulo);

                System.out.print("Digite a descrição do curso: ");
                String descricao = sc.nextLine();
                curso.setDescricao(descricao);

                System.out.print("Digite a carga horária: ");
                int cargaHoraria = sc.nextInt();
                sc.nextLine();
                curso.setCargaHoraria(cargaHoraria);
                bootcamp.getConteudos().add(curso);
                System.out.println();
            }

            Mentoria mentoria = new Mentoria();
            System.out.print("Digite o nome da mentoria: ");
            String nomeMentoria = sc.nextLine();
            mentoria.setTitulo(nomeMentoria);
            System.out.print("Digite a descrição da mentoria: ");
            String descricaoMentoria = sc.nextLine();
            mentoria.setDescricao(descricaoMentoria);
            System.out.print("Digite a data da mentoria (exemplo: dia/mês/ano): ");
            Date data = sdf.parse(sc.next());
            mentoria.setData(data);

            System.out.println("\n************************************");

            System.out.print("Digite o nome do Bootcamp: ");
            String nomeBootcamp = sc.nextLine();
            bootcamp.setNome(nomeBootcamp);
            System.out.print("Digite a descrição do Bootcamp: ");
            String descricaoBootcamp = sc.nextLine();
            bootcamp.setDescricao(descricaoBootcamp);
            bootcamp.getConteudos().add(mentoria);

            System.out.println("\n************************************");

            Dev dev = new Dev();
            System.out.print("Olá Dev, qual o seu nome? ");
            String nome = sc.nextLine();
            dev.setNome(nome);
            dev.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos de " + nome + ": " + dev.getConteudosInscritos());
            dev.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila:" + dev.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila:" + dev.getConteudosConcluidos());
            System.out.println("XP:" + dev.calcularTotalXp());
            System.out.println("************************************");

        }
    }
}