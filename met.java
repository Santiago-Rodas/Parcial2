import java.util.Scanner;
import java.util.Stack;

public class met {
     int opt = 0;
    Scanner sc = new Scanner(System.in);
    int opcion=0;
    public Stack<ObjDispositivo> Registros() {
        Stack<ObjDispositivo> pila = new Stack<>();
        Boolean bandera = true;
        

        System.out.println("Ingrese 1 si desde agregar un Pc o 2 si desdea agregar una tablet.");
        opcion = sc.nextInt();
        while(opcion == 1){

        while (bandera) {
            ObjDispositivo o = new ObjDispositivo();
            System.out.println("ingrese el serial del dispositivo: ");
            o.setSerial(sc.nextInt());
            System.out.println("ingrese la marca del dispositivo: ");
            o.setMarca(sc.next());
            System.out.println("ingrese la capacidad de la Memoria Ram del dispositivo: ");
            o.setMemoriaRam(sc.nextInt());
            System.out.println("ingrese la capacidad del Disco Duro del dispositivo: ");
            o.setDiscoDuro(sc.nextInt());
            System.out.println("ingrese el precio del dispositivo: ");
            o.setPrecio(sc.nextDouble());
            System.out.println("ingrese el nombre de usuario del dispositivo: ");
            o.setNombreUsuario(sc.next());
            o.setDisponible(true);
            

            pila.push(o);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("Opcion Incorrecta ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }
        }
    }
    while(opcion==2){
        while (bandera) {
            ObjDispositivo o = new ObjDispositivo();
            System.out.println("ingrese el serial del dispositivo: ");
            o.setSerial(sc.nextInt());
            System.out.println("ingrese la marca del dispositivo: ");
            o.setMarca(sc.next());
            System.out.println("ingrese el tamaño del dispositivo: ");
            o.setTamaño(sc.nextInt());
            System.out.println("ingrese el precio del dispositivo: ");
            o.setPrecio(sc.nextDouble());
            System.out.println("ingrese el nombre de usuario del dispositivo: ");
            o.setNombreUsuario(sc.next());
            o.setDisponible(true);
            

            pila.push(o);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("Opcion Incorrecta ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }
        }
    
    }
        return pila;
    }

    public void ModificarDispotivo(Stack<ObjDispositivo> pila) {
        int serial = 0;
        System.out.println("ingrese el numero serial del dispositivo que desea modificar");
        serial = sc.nextInt();
        for (ObjDispositivo Obj : pila) {
            if (Obj.getSerial()==(serial)) {

                System.out.println("ingrese el precio: ");
                Obj.setPrecio(sc.nextInt());
                System.out.println("Ingrese el nombre de usuario: ");
                Obj.setNombreUsuario(sc.next());
                System.out.println("Ingrese si el dispositivo esta disponible: ");
                Obj.setDisponible(sc.hasNextBoolean());
                }
                else{
                    System.out.println("El dispositivo ingresado no existe.");
                }
        }
      //  MostrarPila(pila);
    }

    public void MostrarPilaPc(Stack<ObjDispositivo> pila) {
        if (opcion == 1){
        for (ObjDispositivo o : pila) {
            System.out.println(o.getSerial());
            System.out.println(o.getMarca());
            System.out.println(o.getMemoriaRam());
            System.out.println(o.getDiscoDuro());
            System.out.println(o.getPrecio());
            System.out.println(o.getNombreUsuario());
            System.out.println(o.getDisponible());
        }
    }
}

public void MostrarPilaTablet(Stack<ObjDispositivo> pila) {
    if (opcion ==2){
    for (ObjDispositivo o : pila) {
        System.out.println(o.getSerial());
        System.out.println(o.getMarca());
        System.out.println(o.getTamaño());
        System.out.println(o.getPrecio());
        System.out.println(o.getNombreUsuario());
        System.out.println(o.getDisponible());
    }
}
}
public void Devolver (Stack<ObjDispositivo> pila) {
    int serial = 0;
    System.out.println("ingrese el numero serial del dispositivo que desea devolver ");
    serial = sc.nextInt();
    for (ObjDispositivo Obj : pila) {
        if (Obj.getSerial()==(serial)) {

            if (Obj.getDisponible()) {
                Obj.setDisponible(true);
}
            
            else{
                System.out.println("El dispositivo ingresado no esta disponible.");
            }
    }
  //  MostrarPila(pila);
}

}
}
