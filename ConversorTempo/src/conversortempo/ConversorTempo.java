package conversortempo;
import java.util.Scanner;
import java.time.Duration;

public class ConversorTempo {  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor em segundos: ");
        long entrada = Long.valueOf(input.nextLine());
        
        Duration duracao = Duration.ofSeconds(entrada);
        long horas = duracao.toHours();
        int minutos = (int) duracao.minusHours(horas).toMinutes();
        int segundos = (int) duracao.minusHours(horas).minusMinutes(minutos).getSeconds();
        System.out.printf("Horas: %d%nMinutos: %d%nSegundos: %d%n", horas, minutos, segundos);
    }
}
   
