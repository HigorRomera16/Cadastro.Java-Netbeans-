/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocomvetores;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class CadastrocomVetores {

    public static void main(String[] args) {
        
   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos cadastro voce precisa?");
        String Cadastro = scan.next ();
        for (Cadastro = 0; Cadastro < Cadastro; Cadastro++)
        
            
        String[] nome = new String[5];
        int[] idade = new int[5];
        int[] cep = new int[5];
        int[] telefone = new int[5];
        
        
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Qual seu nome?");
            nome[contador] = scan.next();  
            
            System.out.println("Qual sua idade?");
            idade[contador] = scan.nextInt();  
            
            System.out.println("Qual seu CEP?");
            cep[contador] = scan.nextInt();  
            
            System.out.println("Qual seu telefone?");
            telefone[contador] = scan.nextInt(); 
        }
        
        
        System.out.println("Dados do Cadastro:");
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Nome: " + nome[contador]);
            System.out.println("Idade: " + idade[contador]);
            System.out.println("CEP: " + cep[contador]);
            System.out.println("Telefone: " + telefone[contador]);
            System.out.println();  
        } 

        
        
    }
}