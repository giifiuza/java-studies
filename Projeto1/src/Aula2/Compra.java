package Aula2;

import java.util.ArrayList;
import java.util.Arrays;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void addItem(Item item){
        itens.add(item);
    }

    double obterValorTotal(){
        double total = 0;
        //Cada item na lista (interpretação)
        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
