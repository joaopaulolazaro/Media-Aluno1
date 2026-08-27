import java.util.Scanner;

public class MediaAluno {


    public static void main(String[] args){

        int nota1, nota2, nota3;
        double resultado;
        String nome;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Qual é o seu nome: ");
        nome = leia.nextLine();

        System.out.println(" Qual o valor da primeira nota: ");
        nota1 = leia.nextInt();

        System.out.println(" Qual o valor da segunda nota: ");
        nota2 = leia.nextInt();

        System.out.println(" Qual o valor da terceira nota: ");
        nota3 = leia.nextInt();

        resultado = (double) (nota1 + nota2 + nota3) /3;

        System.out.println( nome + " a média das suas notas é  " + resultado);

    }
}
