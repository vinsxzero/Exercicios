import java.util.Scanner;

public class testesJava {
    public static void main(String[] args){
        int Numero;
        String Nome;
        String Agencia;
        double Saldo;
        Scanner sc = new Scanner(System.in);
        
        
        
        
        System.out.println("Por favor, digite o número da Agência !");
        Agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu Nome: ") ;
        Nome = sc.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        Saldo = sc.nextDouble();
        System.out.println("Por favor, digite o número da Conta");
        Numero = sc.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque", Nome, Agencia, Numero, Saldo);


    }
}
