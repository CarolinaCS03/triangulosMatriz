
package triangulosmatriz;
import java.util.Scanner;
/*
@author CAROLINA CEVALLOS
 */
public class Triangulo {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Matriz matriz = new Matriz();
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar Triángulo A");
            System.out.println("2. Mostrar Triángulo B");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    matriz.imprimirTrianguloA(5);
                    break;
                case 2:
                    matriz.imprimirTrianguloB(5);
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no incorrecta intentelo de nuevo");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}

    

