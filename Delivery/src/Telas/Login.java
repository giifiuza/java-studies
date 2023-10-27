package Telas;

import javax.swing.*;
import java.awt.*;

public class Login {

    public Login() {
        App();
    }
    public void App(){
        JFrame tela = new JFrame("Coffee Cove");
        tela.setSize(650, 500);
        tela.setLocation(300, 250);
        tela.setLayout(null);

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

        JPanel panelImage = new JPanel();
        panelImage.setLayout(null);
        panelImage.setBounds(0,0,280,380);
        panel.add(panelImage);

        JPanel panelInput = new JPanel();
        panelInput.setLayout(null);
        panel.setBackground(Color.white);
        panelInput.setBounds(0,0,280,380);
        panel.add(panelInput);

        ImageIcon imagem = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\coffe.jpg");
        JLabel img = new JLabel(imagem);
        img.setBounds(0,0, 280, 380);
        img.setLayout(null);
        panelImage.add(img);

        JLabel title = new JLabel();
        title.setBounds(160, 100, 300, 200);
        title.setForeground(Color.magenta);
        title.setFont(new Font("Arial", 1, 40));
        title.setText("Settei esse txt");
        panelInput.setVisible(true);


        tela.setVisible(true);
    }

}
