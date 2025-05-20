import java.util.Scanner;

    public class Factorial {
    public int factorial(int numero) {
        if (numero == 0) {
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }

    public int resultadoFactorial(){
        Scanner scanner = new Scanner(System.in);
        return factorial(scanner.nextInt());
    }
}
        
