
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " +saldo+ " já está disponível para saque.");
    
    }

    
}

