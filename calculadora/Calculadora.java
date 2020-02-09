/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) 
    {
        new aplicacion().setVisible(true);
        
       metodos calculadora = new metodos();
       Scanner entrada = new Scanner(System.in);
       int n1, n2, resultado,opcion ;
       boolean op=true;
       while(op)
       {
           
           System.out.println("****************");
           System.out.println("Menu");
           System.out.println("1. sumar");
           System.out.println("2. restar");
           System.out.println("3. multiplicar");
           System.out.println("4. dividir");
           System.out.println("5. porcentaje");
           System.out.println("6. seno");
           System.out.println("7. coseno");
           System.out.println("8. tangente");
           System.out.println("9. salir");
           System.out.println("Selecione la opcion: ");
           opcion = entrada.nextInt();
           
           if(opcion ==9)
           {
               System.out.println("finalizó...");
               break;
           }
           else
           {
               switch (opcion)
               {
                   case 1:
                       System.out.print("Ingrese el primer valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("Ingrese el segundo valor: ");
                       n2 = entrada.nextInt();
                       resultado = calculadora.sumar(n1,n2);
                       System.out.print("El resultado es: " + resultado);
                       break;  
                       
                   case 2:
                       System.out.print("Ingrese el primer valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("Ingrese el segundo valor: ");
                       n2 = entrada.nextInt();
                       resultado = calculadora.restar(n1,n2);
                       System.out.print("El resultado es: " + resultado);
                       break;
                       
                    case 3:
                       System.out.print("Ingrese el primer valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("Ingrese el segundo valor: ");
                       n2 = entrada.nextInt();
                       resultado = calculadora.multiplicar(n1,n2);
                       System.out.print("El resultado es: " + resultado);
                       break;
                    
                    case 4:
                       System.out.print("Ingrese el primer valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("Ingrese el segundo valor: ");
                       n2 = entrada.nextInt();
                       resultado = calculadora.dividir(n1,n2);
                       System.out.print("El resultado es: " + resultado);
                       break;
                    
                    case 5:
                       System.out.print("Ingrese el primer valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("Ingrese el porcentaje: ");
                       n2 = entrada.nextInt();
                       resultado = calculadora.porcentaje(n1,n2);
                       System.out.print("El porcentaje del numero es: " + resultado);
                       break;
                       
                    case 6:
                       System.out.print("Ingrese el valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("El resultado es: " + Math.sin(n1));
                       break; 
                       
                    case 7:
                       System.out.print("Ingrese el valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("El resultado es: " + Math.cos(n1));
                       break;
                       
                    case 8:
                       System.out.print("Ingrese el valor: ");
                       n1 = entrada.nextInt();
                       System.out.print("El resultado es: " + Math.tan(n1));
                       break;   
                       
                    default:
                        System.out.print("Opcion no valida...");
               }
           }
        }   
    }
    
}
