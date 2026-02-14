public class task {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String senhaCorreta = "admin123";
        String senhaDigitada;

        int tentativas = 0;
        int maxTentativas = 3;

        System.out.print("Digite a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senhaDigitada.equals(senhaCorreta) && tentativas < maxTentativas - 1) {

            tentativas++;
            System.out.println("Senha incorreta!");

            System.out.print("Digite a senha novamente: ");
            senhaDigitada = sc.nextLine();
        }

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Conta bloqueada!");
        }

        sc.close();
    }
}
