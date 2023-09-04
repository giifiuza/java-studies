package Aula3.Jogo;

public class Bruxo extends Jogador {
    @Override
    public boolean atacar(Jogador oponente) {
        super.atacar(oponente);
        super.atacar(oponente);
        super.atacar(oponente);
        return true;
    }
}
