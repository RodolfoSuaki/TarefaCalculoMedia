import java.util.Scanner;

public class Main {
        static float num1;
        static float num2;
        static float num3;
        static float num4;

    public static void main(String[] args) {


        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        num1 = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        num2 = entrada2.nextInt();

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        num3 = entrada3.nextInt();

        Scanner entrada4 = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        num4 = entrada4.nextInt();

        System.out.println("\n A média dos 4 números é: " + calculoMedia());

}

    public static float calculoMedia() {

        return (num1+num2+num3+num4)/4;
    }
}

