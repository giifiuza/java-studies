package Telas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login {

    public Login() {
        App();
    }
    private void App(){
        JFrame tela = new JFrame("Coffee Cove");
        tela.setSize(650, 500);
        tela.setLocation(300, 250);
        tela.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
        //ImageIcon icon = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\fundo.png");
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
        panelInput.setBounds(280,0,280,380);
        panel.add(panelInput);

        ImageIcon imagem = new ImageIcon("C:\\Users\\37076111837\\Desktop\\java-studies\\Delivery\\src\\Imagens\\coffe.jpg");
        //ImageIcon imagem = new ImageIcon("C:\\Users\\ct67ca\\Desktop\\java-studies\\Delivery\\src\\Imagens\\coffe.jpg");
        JLabel img = new JLabel(imagem);
        img.setBounds(0,-20, 280, 380);
        img.setLayout(null);
        panelImage.add(img);

        JLabel title = new JLabel("Coffee Cove");
        title.setBounds(90, 0, 120, 100);
        Color cor = new Color(192, 149, 105);
        title.setLayout(null);
        title.setForeground(cor);
        title.setFont(new Font("Arial", 1, 20));
        panelInput.add(title);

        JLabel titleUser = new JLabel("User");
        titleUser.setBounds(50, 60, 120, 100);
        titleUser.setLayout(null);
        titleUser.setForeground(cor);
        titleUser.setFont(new Font("Arial", 1, 15));
        panelInput.add(titleUser);

        JTextField inputUser = new JTextField();
        inputUser.setBounds(50, 130, 170, 30);
        inputUser.setForeground(Color.black);
        inputUser.setBorder(new LineBorder(Color.white, 2));
        inputUser.setLayout(null);
        panelInput.add(inputUser);

        JLabel titlePassword = new JLabel("Password");
        titlePassword.setBounds(50, 125, 120, 100);
        titlePassword.setLayout(null);
        titlePassword.setForeground(cor);
        titlePassword.setFont(new Font("Arial", 1, 15));
        panelInput.add(titlePassword);

        JTextField inputPassword = new JTextField();
        inputPassword.setBounds(50, 190, 170, 30);
        inputPassword.setForeground(Color.black);
        inputPassword.setLayout(null);
        inputPassword.setBorder(new LineBorder(Color.white, 2));
        panelInput.add(inputPassword);

        JButton btn = new JButton("Login");
        btn.setBounds(80, 250, 120, 35);
        btn.setFont(new Font("Arial", 1, 14));
        btn.setForeground(Color.white);
        btn.setBorder(new LineBorder(cor, 2));
        btn.setBackground(cor);
        panelInput.add(btn);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(80, 300, 120, 35);
        btnRegister.setFont(new Font("Arial", 1, 14));
        Color corBtn = new Color(238,238,238,255);
        btnRegister.setForeground(cor);
        btnRegister.setBackground(corBtn);
        btnRegister.setBorder(new LineBorder(corBtn, 2));
        panelInput.add(btnRegister);

        tela.setVisible(true);
    }

}
