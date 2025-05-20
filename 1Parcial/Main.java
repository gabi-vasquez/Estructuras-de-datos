public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Digite un numero");
        int numero =factorial.resultadoFactorial();
        int resultado = factorial.factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
