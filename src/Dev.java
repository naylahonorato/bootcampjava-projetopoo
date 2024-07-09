

import java.util.*;

public class Dev {
    private String nome;
    private final Set<Conteudo> conteudosInscritos = new HashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new HashSet<>();

    public void inscreverEmConteudo(Conteudo conteudo) {
        if (!conteudosInscritos.contains(conteudo)) {
            conteudosInscritos.add(conteudo);
            conteudo.adicionarDev(this);
        }
    }

    public void progredirNoConteudo(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está inscrito neste conteúdo!");
        }
    }
   
    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public double calcularProgressoPercentual() {
        if (!conteudosInscritos.isEmpty()) {
            return (double) conteudosConcluidos.size() / (conteudosInscritos.size() + conteudosConcluidos.size()) * 100;
        } else {
            return 100; // Se não há conteúdos inscritos, progresso é 100%
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

   
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
