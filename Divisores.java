import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        
        for(int i = n; i > 0; i--){
            int calc = n % i;
            if(calc == 0){
                System.out.println(i);
            }

        }

        sc.close();
    }
}
