import java.util.Locale;
import java.util.Scanner;

public class segundos {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int segundos, horas, minutos, segundos2;
        char resp;
        do{
            System.out.println("Digite a duração em segundos: ");
            segundos = sc.nextInt();

            horas = segundos / 3600;
            minutos = (segundos / 60) % 60;
            segundos2 = segundos % 60;

            System.out.printf("%d : %02d : %02d%n", horas, minutos, segundos2);
            System.out.println();
            System.out.println("Deseja repetir?: ");
            resp = sc.next().charAt(0);
            System.out.println();

        } while(resp == 's' || resp == 'S');
        

        sc.close();
    }
}