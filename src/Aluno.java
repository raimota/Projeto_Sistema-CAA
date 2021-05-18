/**
 *
 * @author grupo 05
 */
public class Aluno {
    private String nome;
    private char sexo;
    private String preferencial;

    @Override
    public String toString() {
        return "Aluno: " + nome + ", sexo: " + sexo + ", preferencial: " + preferencial;
    }

    public Aluno(String nome, char sexo, String preferencial) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setPreferencial(preferencial);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {        
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(String preferencial) {
        this.preferencial = preferencial;
    }
    
}
