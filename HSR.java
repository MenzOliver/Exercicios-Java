import java.util.Locale;
import java.util.Scanner;


public class notas {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        double a, b, c, x;
        String escolha1, escolha2 = null;

        /*Rastros*/
        int materRoxo = 0, materVerde, materAzul;
        double caliceRastro, tempoRastro, qtdPoder;

        do{ 
            
            System.out.println("'Simulador de Farm' HSR");
            System.out.println();

            System.out.println("Gostaria de upar o Nivel (do personagem) ou os Rastros?: ");
            escolha1 = sc.next().toLowerCase();

            if (escolha1.equals("rastros")) {
                System.out.println("Quantidade de material roxo necessario: ");
                materRoxo = sc.nextInt();

                materVerde = materRoxo * 9;
                materAzul = materRoxo * 3;
               
                caliceRastro = Math.ceil(materRoxo / 3.5);
                tempoRastro = Math.ceil((caliceRastro * 90) / 60);
                qtdPoder = caliceRastro * 60;

                do { 
                    System.out.printf("Cálices necessários: %d%n", (int) caliceRastro );
                    System.out.printf("Qtd. de P. de Desbravamento %d%n", (int) qtdPoder );
                    System.out.printf("Tempo necessário: %.2fmin %n", tempoRastro );

                    System.out.print("Deseja repetir? Ou mudar para Nivel?: ");
                    resp = sc.next().charAt(0);
                    System.out.println();
                } while (escolha2.equalsIgnoreCase("repetir"));
            }


            System.out.print("Deseja repetir? (s/n): ");
            resp = sc.next().charAt(0);
            System.out.println();

        } while(Character.toLowerCase(resp) == 's');


        sc.close();
    }
}
