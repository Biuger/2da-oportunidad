/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2do.parcial;

/**
 *
 * @author INFO-ANGELDAVIDMEDIN
 */
public class Cuadrado extends Cuadrilatero{
    private double areaCuadrado;

    public Cuadrado(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4) {
        super(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
    }
    public void setAreaCuadrado(double areaCuadrado){
        this.areaCuadrado = areaCuadrado;
    }
    public double getAreaCuadrado(){
        return areaCuadrado;
    }

    @Override
    public void area() {
        areaCuadrado = Math.abs(((X1*Y2)+(X2*Y3)+(X3*Y4)+(X4*Y1))-((X1*Y4)+(X4*Y3)+(X3*Y2)+(X2*Y1)))/2;
        System.out.println("El area total del cuadrado es de: "+ areaCuadrado);
    }
}
