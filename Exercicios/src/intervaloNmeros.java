import java.util.Scanner;

public class intervaloNmeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro número do intervalo");
        int a = entrada.nextInt();
        System.out.println("Informe o segundo número do intervalo");
        int b = entrada.nextInt();
        int soma = 0;
        for (int i = a; i < b; i++) {
            System.out.println(i);
            soma = soma + i;
            //System.out.println(soma);
        }
        System.out.println(soma);
        entrada.close();
    }
    
}
