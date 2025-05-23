import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o mnúmero para gerar a tabuada");
        int nun = entrada.nextInt();
        System.out.println("informe a opeação a ser executada");
        String operacao = entrada.next();
        if (operacao.equalsIgnoreCase("soma")) {
            for (int i = 0; i < 10; i++) {
                System.out.println( nun + " + " + i + " = " + (nun + i));
            }
        }if (operacao.equalsIgnoreCase("subtracao")) {
            for (int i = 0; i < 10; i++) {
                System.out.println( nun + " - " + i + " = " + (nun - i));
            }
        }if (operacao.equalsIgnoreCase("multiplicacao")) {
            for (int i = 0; i < 10; i++) {
                System.out.println( nun + " * " + i + " = " + (nun * i));
            }
        }if (operacao.equalsIgnoreCase("divisao")) {
            for (int i = 0; i < 10; i++) {
                System.out.println( nun + " / " + i + " = " + (nun / i));
            }
        }
        entrada.close();
    }
    
}
