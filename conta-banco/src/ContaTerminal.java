import java.util.Scanner;
import java.util.Locale; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero; 
        String agencia; 
        String nomeCliente; 
        double saldo;  

        Scanner input = new Scanner(System.in); 

        input.useLocale(Locale.ENGLISH); 


        System.out.print("\nPor favor, digite o Número da Agencia: ");
        numero = input.nextInt(); 
        input.nextLine(); //consumir a quebra de linha pendente 

        System.out.print("\nPor favor, insira qual a sua Agência: ");
        agencia = input.nextLine();

        System.out.print("\nPor favor, insira o seu Nome: ");
        nomeCliente = input.nextLine();

        System.out.print("\nSaldo: ");
        saldo = input.nextDouble(); 


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia + " Conta: " + numero + " e seu Saldo: " + saldo + " já está disponível para saque.");
         
         
    }
}
