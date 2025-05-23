import java.util.Scanner;

public class somaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int media = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe cinco números");
            int num = entrada.nextInt();
            soma = soma + num;
            media = soma /5;
        }
        System.out.println("A soma dos números é igual a " + soma + " e a média é igual a " + media);
        entrada.close();
    }
    
}
