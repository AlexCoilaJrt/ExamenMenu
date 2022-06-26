package pe.edu.upeu.acj.examen;

import java.util.Scanner;

import pe.edu.upeu.acj.utils.LeerTeclado;

public class ResoluciondeExamen {

        public static void impuestos () {
                Scanner lt = new Scanner(System.in);
                int i, n;
                double categoria_1, categoria_2, categoria_3, clave, costo;
                double impuesto, impuesto_a_pagar;
                categoria_1 = 0;
                categoria_2 = 0;
                categoria_3 = 0;
                impuesto_a_pagar = 0;
                System.out.println("Ingrese cantidad de automoviles: ");
                n = lt.nextInt();
                lt.nextLine();
                for (i=1; i<=n; i++) {
                    System.out.print(i);
                    System.out.println("Ingrese la categoria 1, 2 o 3: ");
                    clave = lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Ingrese el Costo: ");
                    costo = lt.nextDouble();
                    lt.nextLine();
                    impuesto=0;
                    if(clave==1)
                    {
                        impuesto=(costo*12)/100;
                        categoria_1=categoria_1+impuesto;
                    }
                    if(clave==2)
                    {
                        impuesto=(costo*8)/100;
                        categoria_2=categoria_2+impuesto;
                    }
                    if(clave==3)
                    {
                        impuesto=(costo*5)/100;
                        categoria_3=categoria_3+impuesto;
                    }
                    impuesto_a_pagar=impuesto_a_pagar+impuesto;
                    System.out.println("Valor de impuesto: " + impuesto);
                    System.out.println();
                    double tot1 = costo+impuesto_a_pagar;
            
                System.out.println("Impuesto de la categoria 1: " + categoria_1);
                System.out.println("Impuesto de la categoria 2: " + categoria_2);
                System.out.println("Impuesto de la categoria 3: " + categoria_3);
                System.out.println("Total a pagar, incluido el impuesto: " + tot1);
                }
            
                
                
            }


        public static void letrax () {
    
            
            Scanner lt=new Scanner(System.in);
            System.out.println("Introduzca un número mayor a 3 e impar ");
           
            int h=lt.nextInt();
              
            if (h > 3 && h %2!=0){
              for (int fil = 1; fil <= h; fil++){
                for (int col = 1; col <= h; col++){
                  if ((fil == col) || (col == (h-fil)+1)){
                    System.out.print("*");
                  } else {
                    System.out.print(" ");
                  }
                }
                System.out.println();
              }
        
            }else{
              System.out.println("No es un número valido");
            }
          }       
        
          public static void numperfecto() {
            int i, j, suma;
            System.out.println("Primeros Numeros Perfectos: ");
            for(i=1;i <= 10000;i++){      
                suma = 0;
                for(j = 1;j < i;j++){                          
                     if(i % j==0){
                        suma = suma + j; 
                     }
                }
              if(i == suma){                          
                 System.out.println(i);
                 
              }
            }
        }

        public static void decBin() {
            Scanner lt= new Scanner(System.in);
            int n;
            do {
                System.out.println("Introduce numero mayor que 0: ");
                n = lt.nextInt();
            } while (n < 0);
            System.out.println();
            System.out.print("Binario: ");
            decBin(n);
            System.out.println();
        }
    
        public static void decBin(int n) {
            if (n < 2) {
                System.out.print(n);
                return;
            } else {
                decBin(n / 2);
                System.out.print(n % 2);
                return;
            }
        }



    
    }

    

