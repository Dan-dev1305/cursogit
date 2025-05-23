import java.util.Scanner;

public class crescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*   System.out.println("Informe a população de A");
        int populaçãoA = entrada.nextInt();
        System.out.println("Informe a taxa de crescimento de A");
        double crescimentoA = entrada.nextDouble() / 100;
        System.out.println("Informe a população de B");
        int populaçãoB = entrada.nextInt();
        System.out.println("Informe a taxa de crescimento de B");
        double crescimentoB = entrada.nextDouble() / 100;
       // double taxaA = crescimentoA /100;
        //double taxaB = crescimentoB /100;
        int cont = 0;

        while (crescimentoA < crescimentoB) {
            populaçãoA += populaçãoA * crescimentoA;
            populaçãoB += populaçãoB * crescimentoB;
            cont ++;
            
        }
        System.out.println("População a passsa a b em " + cont + " anos"); */
        System.out.print("Digite a população inicial do país A: ");
        int populacaoA = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento anual do país A (em %): ");
        double taxaA = scanner.nextDouble() / 100;

        System.out.print("Digite a população inicial do país B: ");
        int populacaoB = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento anual do país B (em %): ");
        double taxaB = scanner.nextDouble() / 100;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
        scanner.close();
    }

}
