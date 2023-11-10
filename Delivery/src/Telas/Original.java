package Telas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Original {

    public Original() {
        App();
    }
    private void App(){
        JFrame tela = new JFrame("Coffee Cove");
        tela.setSize(650, 500);
        tela.setLocation(300, 250);
        tela.setLayout(null);

//        ImageIcon icon = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        JLabel label = new JLabel(icon);
        label.setBounds(0,0, 800, 473);
        label.setLayout(null);
        tela.add(label);

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBounds(40, 43, 560, 360);
        label.add(panel);

        tela.setVisible(true);
    }

}
