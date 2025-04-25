/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg25.pkg04.atividade.hr;
import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class Aula2504AtividadeHR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int crepeticao;
        for(crepeticao=1;crepeticao <= 4;crepeticao++){
        
        System.out.println("Qual seu nome?");
        String nome = scan.next ();
      
        System.out.println("Qual sua idade?");
        String idade = scan.next ();
       
        System.out.println("Qual seu CEP?");
        String cep = scan.next ();
        
        System.out.print("Numero de telefone: ");
        String número = scan.next (); 
        
        System.out.println("Dados do Cadastro:");
        
        System.out.println(nome); 
        System.out.println(idade);    
        System.out.println(cep);    
        System.out.println(número);
        
    }
    
    }
}
