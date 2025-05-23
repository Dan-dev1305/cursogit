import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a população de A");
        int populaçãoA = entrada.nextInt();
        System.out.println("Informe a taxa de crescimento de A");
        double taxaA = entrada.nextDouble() / 100;
        System.out.println("Informe a população de B");
        int populaçãoB = entrada.nextInt();
        System.out.println("Informe a taxa de crescimento de B");
        double taxaB = entrada.nextDouble() / 100;
       // double taxaA = crescimentoA /100;
        //double taxaB = crescimentoB /100;
        int cont = 0;

        while (populaçãoA < populaçãoB) {
            populaçãoA += populaçãoA * taxaA;
            populaçãoB += populaçãoB * taxaB;
            cont ++;
            
        }
        System.out.println("População a passsa a b em " + cont + " anos");
        
    }
    
}
