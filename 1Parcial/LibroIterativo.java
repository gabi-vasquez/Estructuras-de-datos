
public class LibroIterativo {
   public static void main(String[] args) {
    int libros []= {50, 100, 150, 70, 250};
    sumaLibro calcular = new sumaLibro();
    int resultado = calcular.calcularSuma(libros);
    System.out.println("La suma de los libros es: " + resultado);
   }

   public static class sumaLibro {
    public int calcularSuma(int[] libros) {
        int suma = 0;
        for (int libro : libros) {
            suma += libro;
        }
        return suma;
    }
}
}