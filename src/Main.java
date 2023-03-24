import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootvamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devYgho = new Dev();
        devYgho.setNome("Ygho");
        devYgho.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ygho" + devYgho.getConteudoInscritos());
        devYgho.progredir();
        devYgho.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ygho" + devYgho.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Ygho" + devYgho.getConteudosConcluidos());
        System.out.println("XP:" + devYgho.calcularTotalXp());

        System.out.println("----------");

        Dev devChris = new Dev();
        devChris.setNome("Chris");
        devChris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Chris" + devChris.getConteudoInscritos());
        devChris.progredir();
        devChris.progredir();
        devChris.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Chris" + devChris.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Chris" + devYgho.getConteudosConcluidos());
        System.out.println("XP:" + devChris.calcularTotalXp());

    }
}