package dio.retornos;

public class Quadrilateros {
    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }
    public static double area(double ladoMaior, double ladoMenor, double altura){
        return ((ladoMaior+ladoMenor)*altura)/2;
    }

}
