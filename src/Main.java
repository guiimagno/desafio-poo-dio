import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(20);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("descricao mentoria java");

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Guilherme"+ devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteúdos inscritos Guilherme"+ devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Guilherme"+ devGuilherme.getConteudosConcluidos());
        System.out.println("XP: "+ devGuilherme.calcularTotalXp());

        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos Joao"+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());


    }
}
