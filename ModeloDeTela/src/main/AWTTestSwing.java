package main;

import javax.swing.*;
import java.awt.*;

public class AWTTestSwing {
    public static void main(String[] args) {
        // Cria uma janela com o título "AWT Test"
        JFrame frame = new JFrame("AWT Test");
        
        // Define a operação padrão para fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela
        frame.setSize(400, 200);
        
        // Define o layout da janela
        frame.setLayout(new BorderLayout());
        
        JLabel label1 = new JLabel("Label1"); // comando para criar o titulo 
        JTextField textField1 = new JTextField(15); // comando para criar o campo de texto e define o limite de colunas
        
        // cria o espaço para para colocar o campo de texto e o titulo
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout()); // deixa o campo de texto na horizontal
        
        // Adiciona o titulo e o campo de texto no painel
        topPanel.add(label1);
        topPanel.add(textField1);
        
        // Cria três botões
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2"); 
        JButton button3 = new JButton("Button 3");
        
        // Cria um painel para os botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // deixa os botões na horizontal
        
        // Adiciona os botões ao painel dos botões
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        
        // Adiciona os painéis à janela principal nas suas posições
        frame.add(topPanel, BorderLayout.NORTH); // Painel superior no topo
        frame.add(buttonPanel, BorderLayout.CENTER); // Painel dos botões no centro
        
        // deixa a janela visivel
        frame.setVisible(true);
    }
}