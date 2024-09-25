import java.util.Scanner;
public class Main
{
   public static void main(String[] args){
       Scanner scanner = new Scanner (System.in);
       
       System.out.println("Qual Modelo Deseja Adquirir? : Astra / Golf (importado) ?");
       String modelo = scanner.nextLine();
        
       System.out.println("Adicionar :  Cambio Automatico");
       String cambio = scanner.nextLine();
       
       System.out.println("Adicionar :  Teto Solar");
       String tetosolar = scanner.nextLine();
       
       System.out.println("Adicionar :  Alarme");
       String alarme = scanner.nextLine();
       
       System.out.println("Adicionar :  Kit Multimidia");
       String kitmultimidia = scanner.nextLine();
       
       System.out.println("Adicionar :  Potencia No Motor de 120CV");
       String potenciamotor = scanner.nextLine();
       
       Carro carro = new Carro(modelo , cambio , tetosolar , alarme , kitmultimidia , potenciamotor);
       
       System.out.println("Total Da Compra : " + carro.CalcularValor());
   }
}
