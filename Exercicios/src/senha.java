import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu login:");
        String login = entrada.next();
        System.out.println("Informe a sua senha");
        String senha = entrada.next();
        while (senha.equals(login)) {
            System.out.println("A senha não pode ser igual ao login");
            System.out.println("Informe novos login e senha");
            System.out.println("Informe o seu login:");
            login = entrada.next();
            System.out.println("Informe a sua senha");
            senha = entrada.next();
        }
        System.out.println("Sennha e login válidos");
        entrada.close();

    }

}
