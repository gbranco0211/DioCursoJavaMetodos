package dio.retornos;

import dio.sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {

        double areaQuadrado =  Quadrilateros.area(5);
        double areaRetangulo  = Quadrilateros.area(7,5);
        double areaTrapezio = Quadrilateros.area(6,3,5);

        System.out.println("Área do Quadardo: " + areaQuadrado);
        System.out.println("Área do Retangulo: " + areaRetangulo);
        System.out.println("Área do Trapézio: " + areaTrapezio);
    }
}
