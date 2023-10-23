import java.util.Scanner;

public class Program {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome");
        String nome = sc.next();
        System.out.println("Digite a idade");
        int idade = sc.nextInt();
        System.out.println("Digite o tipo de herói (guerreiro, mago, monge ou ninja)");
        String tipo = sc.next();

        Heroi heroiUm = new Heroi(nome, idade, tipo);
        heroiUm.atacar();







    }
}
