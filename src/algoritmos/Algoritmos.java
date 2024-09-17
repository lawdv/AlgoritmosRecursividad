/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

/**
 *
 * @author lawdv
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Ejemplo de uso:
        int resultado = suma(6);
        int resultadomultiplicar = multiplicar(4);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("El resultado de la multiplicacion es: " + resultadomultiplicar);

    }
    public static int suma(int n) {
    int res = 0;
    if (n > 0) {
        res = suma(n - 1);  // Llama a la función recursiva
        if (n % 2 == 0) {   // Si el número es par (n % 2 == 0)
            // Antes de sumar para mostra el valor de Pila
            System.out.println(res +" + " + n);
            res = res + n;  // Agrega el número a la suma
            
             System.out.println(res);
        }
    }
           

    return res;
}
    public static int multiplicar(int n) {
    int res = 0;
    if (n > 0) {
        res = multiplicar(n - 1);  // Llama a la función recursiva          
            // Antes de sumar para mostra el valor de Pila
            System.out.println(res +" + ( " + n+ "*2)");
            res = res+(n*2); // Agrega el número a la multiplicacion
            
             System.out.println(res);
        
    }
           

    return res;
}
    
}
