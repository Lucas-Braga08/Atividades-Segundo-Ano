import java.util.Scanner;

public class AtividadeBhaskara {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       double delta, x1, x2;
       
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        
        delta = Math.pow(b,2) - (4 * a * c);
        System.out.println("Delta = " + delta);
        
         x1 = (-b + Math.sqrt(delta) ) / (2 * a);
         x2= (-b - Math.sqrt(delta) ) / (2 * a);
         
          System.out.println("x1 = " + x1);
          System.out.println("x2 = " + x2);
    }
}
