
public class ComparacionAlgoritmos {
    public static void main(String[] args) {
        int[] numerosParaProbar = {100, 1000, 10000, 100000, 1000000, 10000000};

        System.out.println("Comparacion de tiempos para sumar 1 hasta N(nanosegunfos): \n");
        System.out.printf("%-12s %-25s %-25s %-20s \n", "N", "Bucle", "Formula", "Suma");

        //Iteramos sobre cada valor de N para probar
        for(int n : numerosParaProbar){
            long tiempoInicioBucle, tiempoFinBucle, duracionBucle;
            long tiempoInicioFormula, tiempoFinFormula, duracionFormula;
            long resultadoBucle, resultadoFormula;

            //Medir tiempo del Bucle
            tiempoInicioBucle = System.nanoTime(); //Tiempo antes de ejecutar
            resultadoBucle = CalculadorSuma.sumaConBucle(n);
            tiempoFinBucle = System.nanoTime();//Tiempo despues de ejecutar
            duracionBucle = (tiempoFinBucle - tiempoInicioBucle); //Diferencia

            //Medir tiempo de formula
            tiempoInicioFormula = System.nanoTime(); //Tiempo antes de ejecutar
            resultadoFormula = CalculadorSuma.sumaConFormula(n);
            tiempoFinFormula = System.nanoTime();//Tiempo despues de ejecutar
            duracionFormula = (tiempoFinFormula - tiempoInicioFormula); //Diferencia

            //--- Imprimir resultados--
            //Imprime la fila con los datos formateados
            System.out.printf("%-12d %-25d %-25d %-20d \n", n, duracionBucle, duracionFormula, resultadoFormula);
        }
    }
}