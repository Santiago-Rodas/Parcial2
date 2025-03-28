
import java.util.Stack;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        met v = new met();
        boolean continuar = true;
        int opt2 = 0;
        Scanner sc = new Scanner(System.in);
        Stack <ObjDispositivo> pila = new Stack<>();
        
        int opt = 0;
        while (continuar) {
            System.out.println("ingrese 1 si desea Registrar, 2 si desea modificar, 3 si desea devolver");
            opt = sc.nextInt();
            switch (opt) {
                case 1:

                    v.Registros();
                    break;
                case 2:
                    v.ModificarDispotivo(pila);
                    break;
                case 3:
                    v.Devolver(pila);
                    break;
                default:
                    System.out.println("pagina en mantenimiento ");
                    break;
            }

            System.out.println("desea continuar con otra accion 1: si ,2: no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }

    }
}
