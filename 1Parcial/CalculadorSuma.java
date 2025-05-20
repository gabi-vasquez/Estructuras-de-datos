
public class CalculadorSuma {


    public static long sumaConBucle(int numero){
        long suma = 0;
        for(int i = 0; i < numero; i++){
            suma+=i;
        }
        return suma;
    }

    public static long sumaConFormula(int numero){
        if (numero <1) {
            return 0;
        }
        //Convertimos a long ANTES de multiplicar para evitar desbordamiento intermediario
        long numeroLong= numero;
        return numeroLong * (numeroLong + 1) / 2;
    }
    


}
