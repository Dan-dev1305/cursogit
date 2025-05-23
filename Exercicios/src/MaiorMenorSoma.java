import java.util.Scanner;

public class MaiorMenorSoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int num = 0;
        System.out.println("Informe a quantidade de números a serem calculados");
        int cont = entrada.nextInt();
        for (int i = 0; i < cont; i++) {
            System.out.println("Número" + i);
            num = entrada.nextInt();
            if (num > maior) {
                maior = num;
            }else if (num < maior) {
                menor = num;
            }
            soma = soma + num;            
        }
        System.out.println("O maior número é o " + maior);
        System.out.println("O menor número é o " + menor);
        System.out.println("A soma de todos eles dá " + soma);
        entrada.close();
    }
    
}
