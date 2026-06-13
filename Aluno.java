public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String verificarSituacao() {
        if (nota >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}