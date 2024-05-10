package iniciador;
import dominios.Bootcamp;
import dominios.Curso;
import dominios.Dev;
import dominios.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java POO");
        curso.setDescricao("Aprenda POO com Java");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Js");
        mentoria.setDescricao("Aprenda Js");
        mentoria.setData(LocalDate.now());
        /*
        System.out.println(curso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java DEV");
        bootcamp.setDescricao("Descrição BootCamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devMurillo = new Dev();
        devMurillo.setNome("Murillo");
        devMurillo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMurillo.getConteudoInscrito());
        devMurillo.progredir();
        devMurillo.progredir();
        System.out.println("Conteúdos inscritos: " + devMurillo.getConteudoInscrito());
        System.out.println("Conteúdos concluidos: " + devMurillo.getConteudoConcluido());
        System.out.println("XP= " + devMurillo.calcularTotalXp());
        

        System.out.println("------------");

        Dev devMalu = new Dev();
        devMalu.setNome("Malu");
        devMalu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devMalu.getConteudoInscrito());
        devMalu.progredir();        
        System.out.println("Conteúdos inscritos: " + devMalu.getConteudoInscrito());
        System.out.println("Conteúdos concluidos: " + devMalu.getConteudoConcluido());
        System.out.println("XP= " + devMalu.calcularTotalXp());


    }
    
}
