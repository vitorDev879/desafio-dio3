import java.util.Objects;

public class Heroi {

    private String nome;
    private int idade;
    private String tipo;



    public Heroi() {
    }

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void atacar() {

        String ataque = "";
        switch (tipo) {
            case "mago":
                ataque = "magia";
            break;
            case "guerreiro":
                ataque = "espada";
            break;
            case "monge":
                ataque = "artes marciais";
            break;
            case "ninja":
                ataque = "shuriken";
            break;
            default:
                System.out.println("Não foi digitado nenhuma opção");
        }
        System.out.println("Jogador: " + getNome());
        System.out.println("Idade do jogador: " + getIdade());
        System.out.println("Herói escolhido: " + getTipo());
        System.out.println("O " + getTipo() + " atacou usando " + ataque);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroi heroi = (Heroi) o;
        return tipo.equals(heroi.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }
}