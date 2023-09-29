package SegundaTela;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,800,800);

        ImageIcon iconeAmplicado = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Projeto-interface\\src\\Imagens\\testeee.gif");
        iconeAmplicado.setImage(iconeAmplicado.getImage().getScaledInstance(600,600, Image.SCALE_DEFAULT));
        JLabel label = new JLabel(iconeAmplicado);
        frame.add(label);
        frame.setVisible(true);
//        Janela janela = new Janela("Titulo da Janela");
//        Rotulo rotulo = new Rotulo();
//        CampoTexto campo = new CampoTexto();
//        Botao botao = new Botao("botao");
//
//        botao.addActionListener(e->rotulo.setText(campo.getText()));
//        janela.add(rotulo);
//        janela.add(campo);
//        janela.add(botao);
//        janela.setVisible(true);
    }
}
