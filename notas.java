import java.util.Locale;
import java.util.Scanner;


public class notas {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int  redac = 0; 
        double somaNotas, res = 0 ;
        char resp;

        do{
            double[] notas = new double[4];
            
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a nota: ");
                notas[i] = sc.nextDouble();
            }
            System.out.println("Digite a nota de Redacao: ");
            redac = sc.nextInt();

            somaNotas = 0;
            for (int i = 0; i < 4; i++) {
                somaNotas += notas[i];
            }

            res = (somaNotas + (int)redac) / 5;

            System.out.println();
            System.out.printf("Media geral: %.2f%n",res);
            
            System.out.print("Deseja repetir? (s/n): ");
            resp = sc.next().charAt(0);
            System.out.println();
        } while(Character.toLowerCase(resp) == 's');


        sc.close();
    }
}
