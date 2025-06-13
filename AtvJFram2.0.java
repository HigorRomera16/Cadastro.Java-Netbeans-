/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvjfram;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Aluno
 */
public class AtvJFram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame janela = new JFrame();
        JButton botao = new JButton("LOGIN");
        JLabel titulo = new JLabel("LOGIN");  
        JLabel sobtitulo = new JLabel("Usuário: ");
        JLabel senha = new JLabel("Senha: ");
        JTextField nome = new JTextField();
        JTextField box = new JTextField();
        
        
        janela.setVisible(true);
        botao.setVisible(true);
        titulo.setVisible(true);
        sobtitulo.setVisible(true);
        senha.setVisible(true);
        nome.setVisible(true);
        box.setVisible(true);
        
        janela.add(titulo);
        janela.add(sobtitulo);
        janela.add(senha);
        janela.add(botao);
        janela.add(nome);
        janela.add(box);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setBounds(0, 0, 600, 400);
        
        botao.setBounds(250, 180, 100, 40);
        
        titulo.setBounds(250, 0, 100, 50);
        sobtitulo.setBounds(250, 0, 75, 120);
        senha.setBounds(250, 0, 75, 240);
        
        nome.setBounds(250, 70, 120, 30);
        box.setBounds(250, 130, 120, 30);
        
        botao.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("teste");
                

 String teste = titulo.getText();
                System.out.println(teste);

            }
        }
        );
        
        
        
        
    }
    
}
