
package multiplicación;

import java.util.Scanner;

public class Multiplicación {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa opcion: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
        multiplicacion multiplicacion = new multiplicacion(); 
        
        System.out.println("La multiplicacion es "+multiplicacion.calculadora(a,b));
    }
    
}
