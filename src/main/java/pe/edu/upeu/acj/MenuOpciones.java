package pe.edu.upeu.acj;

import java.util.Scanner;

import pe.edu.upeu.acj.examen.ResoluciondeExamen;
import pe.edu.upeu.acj.utils.LeerTeclado;

public class MenuOpciones{
    ResoluciondeExamen i = new ResoluciondeExamen();
    LeerTeclado leerT = new LeerTeclado();
   

/*public void menuPrincipal() {
    
    int opciones;
    boolean salir =false;
    Scanner ln = new Scanner(System.in);
   
    while (!salir){
    System.out.println("1. - Pago Impuestos");
    System.out.println("2. - Letra X con asteriscos");
    System.out.println("3. - Números Perfectos");
    System.out.println("4. - Convertir decimal a binario");
    System.out.println("5. - Salir");
    
    System.out.println("------------------------------------------------------------------");
    System.out.println("Por favor digite una opción");
    System.out.println("------------------------------------------------------------------");

    
    opciones = ln.nextInt();
  
        switch (opciones) {
            case 1:
            i.impuestos(); 
               break;
            case 2:
            i.letrax();
               break;
            case 3: 
            i.numperfecto();
               break;
            case 4: 
            i.decBin();
               break;
            case 5:
            salir=true;
               break;
            
            default: System.out.println("Opcion Invalida!"); break;
            
        }
    }
   


}*/

public void menuPrincipal() {
    System.out.println("------------------------------------Elija una Opción------------------------------");
    int opciones = 1;
    String menu = "";
    menu += "1. Pago impuestos\n";
    menu += "2. Letra X con asteristos\n";
    menu += "3. Numeros perfectos\n";
    menu += "4. Convertir decimal a binario\n";
    System.out.println(menu);
    do {
        switch (opciones) {
            case 1:
            i.impuestos(); 
               break;
            case 2:
            i.letrax();
               break;
            case 3: 
            i.numperfecto();
               break;
            case 4: 
            i.decBin();
               break;
            

            default: System.out.println("Opcion Invalida!"); break;
        }
        String continuar=leerT.leer("", "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
        if (continuar.charAt(0)=='S') {
            opciones=leerT.leer(0, "Eliga una operacion:\n"+menu);
        }else{opciones=0;}
    } while (opciones != 0);
}


}