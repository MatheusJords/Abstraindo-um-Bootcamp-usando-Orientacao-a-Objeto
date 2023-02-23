package org.example;

import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursosDisponiveis = new ArrayList<>();
        List<Mentoria> mentoriasDisponiveis = new ArrayList<>();

        //Testando herança
        Conteudo conteudo = new Curso();

        //Adicionando cursos
        Curso cursoAngular = new Curso("Curso de Angular","Curso completo de Angular 2+",10);
        Curso cursoJava = new Curso("Curso de Java","Curso completo de Java EE",10);

        //Adicionando mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java","mentoria com Java", LocalDate.now());

        cursosDisponiveis.add(cursoAngular);
        cursosDisponiveis.add(cursoJava);

        mentoriasDisponiveis.add(mentoriaJava);

        System.out.println("Cursos disponíveis");
        for (Curso curso: cursosDisponiveis) {
            System.out.println(curso.getTitulo());
        }

        System.out.println("-------------------------------");

        System.out.println("Mentorias disponíveis");
        for (Mentoria mentoria: mentoriasDisponiveis) {
            System.out.println(mentoria.getTitulo());
        }

        //Instanciando objeto bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoAngular);
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        //Instanciando objeto dev
        Dev matheusDev = new Dev("Matheus Jordan");
        matheusDev.inscreverBootcamp(bootcamp);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Conteudos em que você está inscrito : ");
        matheusDev.getConteudosInscritos()
                .stream()
                .forEach(conteudoInscrito -> {System.out.println(conteudoInscrito.getTitulo());});

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Concluindo bootcamp ....");

        matheusDev.progredir();


        System.out.println("Conteúdos concluídos:");
        matheusDev.getConteudosConcluidos()
                .stream()
                .forEach(conteudoConcluido -> {System.out.println(conteudoConcluido.getTitulo());});
    }
}