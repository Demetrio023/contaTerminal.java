import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá Seja Bem Vindo! ao Banco itau");
         Scanner sc= new Scanner(System.in).useLocale(Locale.US);

         int conta = 0;
         String  agencia = "";
         String nomeUsuario = "";
         double saldo = 237.48;

          
         System.out.println("digite o numero da sua conta ");
           conta = sc.nextInt();

         System.out.println("digite o numero da sua agencia ");
           agencia = sc.next();

         System.out.println("digite o seu nome  ");
           nomeUsuario = sc.next();

           System.out.println("Olá " + nomeUsuario+" Obrigado por criar uma conta em nosso Banco");
           System.out.println("sua Agencia é , Agencia: " + agencia);
           System.out.println("sua Conta é , Conta: " + conta);
           System.out.println("Seu Saldo é , Saldo: " + saldo);
           

         
           

        


        
    }
}
