import java.util.HashSet;
import java.util.Set;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private final Set<Dev> devsInscritos = new HashSet<>();

    public abstract double calcularXp();

    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
    }

    public void removerDev(Dev dev) {
        devsInscritos.remove(dev);
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
} 
