
public class Carro
{
    String modelo;
    String cambio;
    String tetosolar;
    String alarme;
    String kitmultimidia;
    String potenciamotor;
    
    
    public Carro(String modelo ,String cambio ,String tetosolar , String alarme , String kitmultimidia, String potenciamotor){
        this.modelo = modelo;
        this.cambio = cambio;
        this.tetosolar = tetosolar;
        this.alarme = alarme;
        this.kitmultimidia = kitmultimidia;
        this.potenciamotor = potenciamotor;
        
    }
    
    public double CalcularValor(){
         double total = 0 ;
         boolean importado = false;
         boolean ipi = false;
         if(modelo.equalsIgnoreCase("Astra")){
             total +=  40000;
             ipi = true;
         }
         if(modelo.equalsIgnoreCase("Golf")){
             total +=  45000;
             importado = true;
         }
         if(cambio.equalsIgnoreCase("Sim")){
            total += 5000;
         }
         if(tetosolar.equalsIgnoreCase("Sim")){
            total += 10000;
         }
         if(alarme.equalsIgnoreCase("Sim")){
            total += 4500;
         }
         if(kitmultimidia.equalsIgnoreCase("Sim")){
            total += 5000;
         }
         if(potenciamotor.equalsIgnoreCase("Sim")){
            total += 10000;
         }
         if(importado == true){
            total += total * 20 / 100;    
         }
         if(ipi == true){
             total -= total * 10/100;
         }
         return total;
    }
}
