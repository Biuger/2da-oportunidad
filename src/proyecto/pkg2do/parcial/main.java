/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2do.parcial;

import java.util.Scanner;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opcion;
        boolean resp = true;
        
        Cuadrado cuadrado = new Cuadrado(0,0,0,0,0,0,0,0);
        Rectangulo rectangulo = new Rectangulo(0,0,0,0,0,0,0,0);
        Trapecio trapecio = new Trapecio(0,0,0,0,0,0,0,0);
        
        
        System.out.println("1- obtener area de un cuadrado: ");
        System.out.println("2- obtener area de un rectangulo:");
        System.out.println("3- obtener area de un trapecio");
        System.out.println("0- salir ");
        
        do{
        System.out.print("opcion a ejecutar: ");
        opcion = t.nextInt();
        if (opcion==1) {
            resp = false;
            System.out.println("===> CUADRADO <===");
            System.out.print("valor de x1: ");
            cuadrado.setX1(t.nextDouble());
            System.out.print("valor de y1: ");
            cuadrado.setY1(t.nextDouble());
            System.out.print("valor de x2: ");
            cuadrado.setX2(t.nextDouble());
            System.out.print("valor de y2: ");
            cuadrado.setY2(t.nextDouble());
            System.out.print("valor de x3: ");
            cuadrado.setX3(t.nextDouble());
            System.out.print("valor de y3: ");
            cuadrado.setY3(t.nextDouble());
            System.out.print("valor de x4: ");
            cuadrado.setX4(t.nextDouble());
            System.out.print("valor de y4: ");
            cuadrado.setY4(t.nextDouble());
            
            cuadrado.area();
        }
        else if (opcion==2) {
            resp = false;
            System.out.println("===> RECTANGULO <===");
            System.out.print("valor de x1: ");
            rectangulo.setX1(t.nextDouble());
            System.out.print("valor de y1: ");
            rectangulo.setY1(t.nextDouble());
            System.out.print("valor de x2: ");
            rectangulo.setX2(t.nextDouble());
            System.out.print("valor de y2: ");
            rectangulo.setY2(t.nextDouble());
            System.out.print("valor de x3: ");
            rectangulo.setX3(t.nextDouble());
            System.out.print("valor de y3: ");
            rectangulo.setY3(t.nextDouble());
            System.out.print("valor de x4: ");
            rectangulo.setX4(t.nextDouble());
            System.out.print("valor de y4: ");
            rectangulo.setY4(t.nextDouble());
            
            rectangulo.area();
        }
        else if (opcion==3) {
            resp = false;
            System.out.println("===> TRAPECIO <===");
            System.out.print("valor de x1: ");
            trapecio.setX1(t.nextDouble());
            System.out.print("valor de y1: ");
            trapecio.setY1(t.nextDouble());
            System.out.print("valor de x2: ");
            trapecio.setX2(t.nextDouble());
            System.out.print("valor de y2: ");
            trapecio.setY2(t.nextDouble());
            System.out.print("valor de x3: ");
            trapecio.setX3(t.nextDouble());
            System.out.print("valor de y3: ");
            trapecio.setY3(t.nextDouble());
            System.out.print("valor de x4: ");
            trapecio.setX4(t.nextDouble());
            System.out.print("valor de y4: ");
            trapecio.setY4(t.nextDouble());  
            
            trapecio.area();
        }
        else if (opcion==0) {
            System.out.println("programa finalizado");
            System.exit(0);
        }
        else{
            System.out.println("opcion no valida");
            resp = false;
        }
        }while(resp==false);
    }
}
