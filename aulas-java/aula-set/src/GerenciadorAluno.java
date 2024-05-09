
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    private Set<Aluno> alunoSet;
    //Publiquei o construtor de GerenciadorAluno
    public GerenciadorAluno(){
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, media, matricula));
    }
    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;

                }
                
            }
            
        } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
        }
        public void exibirAlunosPorNome(){
            Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
            if (!alunoSet.isEmpty()) {
                System.out.println(alunosPorNome);
            } else {
                System.out.println("O conjunto está vazio!");
            }
        }
        public void exibirAlunosPorNota() {
            Set<Aluno> alunosPorNota = new TreeSet<>();
            if (!alunoSet.isEmpty()) {
              alunosPorNota.addAll(alunoSet);
              System.out.println(alunosPorNota);
            } else {
              System.out.println("O conjunto está vazio!");
            }
          }
        public static void main(String[] args) {
            GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

            gerenciadorAluno.adicionarAluno("João", 123456L, 7.5);
            gerenciadorAluno.adicionarAluno("Maria", 123457L, 9.0);
            gerenciadorAluno.adicionarAluno("Carlos", 123458L, 5.0);
            gerenciadorAluno.adicionarAluno("Ana", 123459L, 6.8);

            System.out.println("Alunos no gerenciador:");
            System.out.println(gerenciadorAluno.alunoSet);

            gerenciadorAluno.removerAluno(000L);
            gerenciadorAluno.removerAluno(123457L);
            System.out.println(gerenciadorAluno.alunoSet);

            // Exibindo alunos ordenados por nome
            gerenciadorAluno.exibirAlunosPorNome();

            // Exibindo alunos ordenados por nota
            gerenciadorAluno.exibirAlunosPorNota();
                }


}



