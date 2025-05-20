//El ultimo elemento en entrar es el primero en salir
//Haganlo con una persona, sacar y meter una persona apilado con una clase persona
public class Pila{
    public static void main(String[] args) {
        MetodoPila pila = new MetodoPila(); // Crea una nueva pila
        pila.apilar(10); // Agrega el valor 10 a la pila
        pila.apilar(20); // Agrega el valor 20 a la pila
        pila.apilar(30); // Agrega el valor 30 a la pila
        pila.apilar(40); // Agrega el valor 40 a la pila
        pila.apilar(50); // Agrega el valor 50 a la pila
        pila.mostrarPila(); // Muestra los elementos de la pila
    }
}