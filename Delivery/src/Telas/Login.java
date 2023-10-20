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

        ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        JLabel label = new JLabel(icon);
        tela.add(label);
        tela.setVisible(true);

        JLabel section = new JLabel();
        section.setBounds(160, 2, 300, 200);
        section.setForeground(Color.red);
        tela.add(section);

        JPanel panel = new JPanel();
        panel.setForeground(Color.red);
        panel.setBounds(140, 200, 120, 60);
        tela.add(panel);
        tela.setVisible(true);


//        JButton botao = new JButton("Click here!");
//        botao.setBounds(140, 200, 120, 60);
//        botao.setBackground(Color.red);
//        tela.add(botao);
    }
    public void Section(){
        JLabel section = new JLabel("Olá");
        section.setBounds(160, 2, 300, 200);
        section.setForeground(Color.white);

    }

}
