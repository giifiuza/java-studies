package Aula3.Jogo;

import Aula3.Jogo.Bruxo;
import Aula3.Jogo.Paladino;

public class Main {
    public static void main(String[] args) {
        Bruxo b1 = new Bruxo();
        b1.x = 10;
        b1.y = 10;

        Paladino p2 = new Paladino();
        p2.x = 10;
        p2.y = 11;

        System.out.println(b1.vida);
        System.out.println(p2.vida);

        b1.atacar(p2);

        System.out.println(b1.vida);
        System.out.println(p2.vida);
    }
}