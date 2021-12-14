package AreaTriangle;

import static java.lang.Math.sqrt;

public class AreaTriangleFunction {
    static double a;
    static double b;
    static double c;

    public static void main(String[] args) {
        try {
            calcAreaTriangle(1,2,3);
        } catch (Exception e) {
            //System.out.println("Стороны треугольника должны быть больше 0!");
            System.out.println(e);
        }
    }

    public static double calcAreaTriangle(double a, double b, double c) throws MyException {
        double p = (a + b + c) / 2;
        if (a < 0 || b < 0 || c < 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new MyException("Такой трегольник не существует! ");
        } else {
            double s = sqrt(p * (p - a) * (p - b) * (p - c));
            s = Math.round(s * 100.0) / 100.0;
            System.out.println("Площадь треугольника равна " + s);
            return s;
        }
    }
}