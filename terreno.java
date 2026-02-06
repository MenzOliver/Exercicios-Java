import java.util.Locale;
import java.util.Scanner;


public class terreno {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double largura, compri, valor, area, preco;
        char resp;


        do{
            System.out.println("Digite a largura do terreno: ");
            largura = sc.nextDouble();
            System.out.println("Digite o comprimento do terreno: ");
            compri = sc.nextDouble();
            System.out.println("Digite o valor do metro quadrado: ");
            valor = sc.nextDouble();


            area = largura * compri;
            preco = area * valor;


            System.out.println();
            System.out.println("Area do terreno = " + String.format("%.2f", area));
            System.out.println("Preco do terreno = " + String.format("%.2f", preco));


            System.out.print("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while(resp == 's');


        sc.close();
    }
}
