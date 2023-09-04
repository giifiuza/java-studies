package Aula1;

public class Circulo {
    static double pi = 3.14;
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        return pi*raio*raio;
    }

    static double calcularArea(double meuraio){
        return pi*meuraio*meuraio;
    }
}
