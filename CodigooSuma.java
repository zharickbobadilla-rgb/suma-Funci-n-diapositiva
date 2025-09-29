package sumadigitosrecursivo;

// autor:zb

public class CodigooSuma {

    // Función recursiva para calcular la suma de los dígitos
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    public static String procedimiento(int n) {
        if (n < 10) {
            return String.valueOf(n);
        } else {
            return procedimiento(n / 10) + " + " + (n % 10);
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        
        if (numero < 0) {
            System.out.println("Por favor ingrese un número positivo.");
        } else {
            String paso = procedimiento(numero);
            int resultado = sumaDigitos(numero);
            
            System.out.println("Salida: " + paso);
            System.out.println("La suma de los dígitos es: " + resultado);
        }
    }
}
