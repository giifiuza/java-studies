package Aula3.Jogo;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    boolean andar(Direcao direcao){
        switch (direcao){
            case NORTE -> y++;
            case SUL -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
        return true;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(this.x-oponente.x);
        int deltaY = Math.abs(this.y-oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida-=10;
        } else{
            return false;
        }
        return true;
    }
}

