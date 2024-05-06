import java.util.Objects;

/**
 *
 * @author muril
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double media;
    private long matricula;
    
    public Aluno(String nome, double media, long matricula) {
        this.nome = nome;
        this.media = media;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + media + ", matricula=" + matricula + "]";
    }

     @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Aluno aluno)) return false;
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMatricula());
  }

    @Override
    public int compareTo(Aluno aluno) {
        // TODO Auto-generated method stub
        return nome.compareTo(aluno.getNome());
    }

    
}
