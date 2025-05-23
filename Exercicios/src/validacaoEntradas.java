import java.util.Scanner;

public class validacaoEntradas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um nome");
        String nome = entrada.next();
        while (nome.length() < 3) {
            System.out.println("Nome invalido, digite novamente");
            nome = entrada.next();           
        }
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida. Digite novamente");
            idade = entrada.nextInt();            
        }
        System.out.println("Informe o seu salário");
        double salario = entrada.nextDouble();
        while (salario < 0) {
            System.out.println("O salário não pode ser negativo. Digite novamente");
            salario = entrada.nextDouble();            
        }
        System.out.println("Informe o seu gênero");
        char genero = entrada.next().charAt(0);
        while (genero != 'm' && genero != 'f') {
            System.out.println("Gênero inválido, digite novamente");
            genero = entrada.next().charAt(0);            
        }
        entrada.close();


    }
    
}
