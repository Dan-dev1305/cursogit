import java.util.Scanner;

public class QuantidadeImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe 10 números");
            num = entrada.nextInt();
            if (num % 2 == 0) {
                pares++;
            }if (num % 2 != 0) {
                impares++;
            }
        }
        System.out.println("A quantidade de números pares é " + pares);
        System.out.println("A quantidade de números ímpares é " + impares);
        entrada.close();
    }
    
}
