

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Aprenda Java do básico ao avançado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Aprenda JavaScript basico");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Arquitetura de Software");
        mentoria.setDescricao("Sessão de mentoria sobre práticas avançadas de arquitetura de software");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp focado em Java para desenvolvedores");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverEmConteudo(curso1);
        devMaria.inscreverEmConteudo(mentoria);
        devMaria.progredirNoConteudo(curso1);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("Progresso Maria: " + devMaria.calcularProgressoPercentual() + "%");
        System.out.println("XP total Maria: " + devMaria.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverEmConteudo(curso1);
        devJoao.inscreverEmConteudo(mentoria);
        devJoao.progredirNoConteudo(mentoria);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Progresso João: " + devJoao.calcularProgressoPercentual() + "%");
        System.out.println("XP total João: " + devJoao.calcularTotalXp());

    }

}