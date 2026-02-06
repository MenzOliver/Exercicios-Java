import java.util.Locale;
import java.util.Scanner;


public class retangulo {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double base, altura, area, perimetro, diagonal;
        char resp;


        do{
            System.out.println("Base do retangulo: ");
            base = sc.nextDouble();
            System.out.println("Altura do retangulo: ");
            altura = sc.nextDouble();


            area = base * altura;
            perimetro = 2 * (base + altura);
            diagonal = Math.sqrt((altura * altura) + (base * base));


            System.out.println();
            System.out.println("Area = " + String.format("%.3f", area));
            System.out.println("Perimetro = " + String.format("%.3f", perimetro));
            System.out.println("Diagonal = " + String.format("%.3f", diagonal));


            System.out.print("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while(resp == 's');


        sc.close();
    }
}
