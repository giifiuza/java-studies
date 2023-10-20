import javax.swing.*;
import java.awt.*;

public class PrimeiraTela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Basico.janela");
        janela.setSize(400, 400);
        janela.setLocation(300, 250);
        janela.setDefaultCloseOperation(3);
        janela.setLayout((LayoutManager)null);
        JLabel rotulo = new JLabel("Olá");
        rotulo.setBounds(160, 2, 300, 200);
        rotulo.setForeground(Color.BLACK);
        rotulo.setFont(new Font("Arial", 1, 40));
        janela.add(rotulo);
        JTextField campoTexto = new JTextField();
        campoTexto.setSize(200, 50);
        campoTexto.setLocation(100, 135);
        janela.add(campoTexto);
        JButton botao = new JButton("Click here!");
        botao.setBounds(140, 200, 120, 60);
        botao.setFont(new Font("Arial", 1, 14));
        botao.setForeground(Color.pink);
        botao.setBackground(Color.GRAY);
        botao.addActionListener((e) -> {
            acao(campoTexto);
        });
        janela.add(botao);

        JLabel label2 = new JLabel();
        label2.setBounds(160, 100, 300, 200);
        label2.setForeground(Color.magenta);
        label2.setFont(new Font("Arial", 1, 40));
        label2.setText("Settei esse txt");
        janela.setVisible(true);
    }

    public static void acao(JTextField campo) {
        System.out.println("You clicked!");
        System.out.println(campo.getText());
    }
}
