import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe cinco números");
            int n = entrada.nextInt();
            if (n > maior) {
                maior = n;                
            }
        }
        System.out.println("O maior número é o " + maior);
        entrada.close();
    }

}
