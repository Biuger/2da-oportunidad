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
public abstract class Cuadrilatero {
    protected double X1;
    protected double Y1;
    protected double X2;
    protected double Y2;
    protected double X3;
    protected double Y3;
    protected double X4;
    protected double Y4;
    
    public abstract void area();

    public Cuadrilatero(double X1, double Y1, double X2, double Y2, double X3, double Y3, double X4, double Y4) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        this.X3 = X3;
        this.Y3 = Y3;
        this.X4 = X4;
        this.Y4 = Y4;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getY1() {
        return Y1;
    }

    public void setY1(double Y1) {
        this.Y1 = Y1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public double getY2() {
        return Y2;
    }

    public void setY2(double Y2) {
        this.Y2 = Y2;
    }

    public double getX3() {
        return X3;
    }

    public void setX3(double X3) {
        this.X3 = X3;
    }

    public double getY3() {
        return Y3;
    }

    public void setY3(double Y3) {
        this.Y3 = Y3;
    }

    public double getX4() {
        return X4;
    }

    public void setX4(double X4) {
        this.X4 = X4;
    }

    public double getY4() {
        return Y4;
    }

    public void setY4(double Y4) {
        this.Y4 = Y4;
    }
   
}
