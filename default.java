import java.util.Locale;
import java.util.Scanner;


public class default {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int  ;
        String ; 
        char resp;
        double ;


        do{

            System.out.print("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while(Character.toLowerCase(resp) == 's');


        sc.close();
    }
}
