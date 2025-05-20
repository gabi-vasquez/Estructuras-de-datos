public class Recursion {
    public static void main(String[] args) {
        int libros []= {50, 100, 150, 70, 250};
        Recursion calcular = new Recursion();
        int resultado = calcular.sumaRecursiva(libros, 0);
        System.out.println("La suma de los libros es: " + resultado);
       }

    public int sumaRecursiva(int[] arreglo, int indice){
        if (indice == arreglo.length) {
            return 0;
        }
        return arreglo[indice] + sumaRecursiva(arreglo, indice + 1); //Suma el valor actual y llama recursivamente
    }
}
