
import java.util.Scanner;

public class EjerciciosRecursivos {

    // Ejercicio 1: Suma de los primeros N números naturales
    public static int suma(int n) {
        if (n == 0)
            return 0;
        else
            return n + suma(n - 1);
    }

    // Ejercicio 2: Contar regresivamente desde n hasta 1
    public static void contar(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        contar(n - 1);
    }

    // Ejercicio 3: Producto de los dígitos de un número
    public static int producto(int n) {
        if (n < 10)
            return n;
        else
            return (n % 10) * producto(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ RECURSIVIDAD =====");
            System.out.println("1. Suma de los primeros N números");
            System.out.println("2. Contar regresivamente");
            System.out.println("3. Producto de los dígitos de un número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int n1 = sc.nextInt();
                    System.out.println("Resultado: " + suma(n1));
                    break;

                case 2:
                    System.out.print("Ingrese un número: ");
                    int n2 = sc.nextInt();
                    System.out.println("Contando regresivamente:");
                    contar(n2);
                    break;

                case 3:
                    System.out.print("Ingrese un número: ");
                    int n3 = sc.nextInt();
                    System.out.println("Producto de los dígitos: " + producto(n3));
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
