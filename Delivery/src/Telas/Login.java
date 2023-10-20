package Telas;

import javax.swing.*;
import java.awt.*;

public class Login {

    public Login() {
        App();
    }
    public void App(){
        JFrame tela = new JFrame("Coffee Cove");
        tela.setSize(800, 473);
        tela.setLocation(300, 250);
        tela.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        JLabel label = new JLabel(icon);
        label.setBounds(0,0, 800, 473);
        label.setLayout(null);
        tela.add(label);

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(115, 43, 550, 350);
        label.add(panel);

//        JButton botao = new JButton("Click here!");
//        botao.setBounds(140, 200, 120, 60);
//        botao.setBackground(Color.red);
//        tela.add(botao);
        tela.setVisible(true);
    }

}
