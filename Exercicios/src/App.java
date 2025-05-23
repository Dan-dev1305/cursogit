import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = entrada.nextInt();
        while (numero >= 0 && numero <= 10) {
            System.out.println("Informe um número");
            numero = entrada.nextInt();                     
        }
        System.out.println("Valor Inválido");
        entrada.close();

    }
}
