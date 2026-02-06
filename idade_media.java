import java.util.Locale;
import java.util.Scanner;


public class idade_media {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int pessoas, idade;
        String nome; 
        char resp;
        double media;


        do{
        System.out.println("Quantas pessoas? ");
        pessoas = sc.nextInt();


        String[] nomes = new String[pessoas];
        int[] idades = new int[pessoas];


       
        // limpeza
        sc.nextLine(); 
        for (int i = 0; i < pessoas; i++) {
            System.out.println("Insira o nome: ");
            nomes[i] = sc.nextLine();
            System.out.println("Insira a idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }


        // a matriz, sempre deve estar dentro da estrutura for. Para armazenar o valor de uma matriz, e ela ser usada num cáculo por exemplo, deve-se
        // 1. Criar uma nova variável 
        // 2. Criar a estrutura "for" da mesma forma que as outras
        // 3. Usar o operador "+=" para atribuir o valor com a somada matriz na nova variável


        double Idades = 0;
        for (int i = 0; i < pessoas; i++) {
            Idades += idades[i];
        }


        media = Idades / pessoas;


        for (int i = 0; i < pessoas; i++) {
                System.out.println("A idade de " + nomes[i] + " e de " + idades[i] + " anos");
        }
            System.out.println();
        
            System.out.println("idade média das " + pessoas + " pessoas " + "e de " + String.format("%.1f", media) + " anos");


            System.out.print("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while(resp == 's');


        sc.close();
    }
}
