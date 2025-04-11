/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg11.novos.comandos.pkgdo.java.pkgif.scan;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula11NovosComandosDoJavaIfScan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite o numero: ");
        int num = scanner.nextInt();
                
        int resultado = num % 2;
        
        if (resultado == 1){
            System.out.println("O NUMERO DIGITADO E IMPAR");
        }
        else{
            System.out.println("O NUMERO DIGITADO E PAR");
                 
        }
    }
}
   
   
   
   



           
   

   

   
    
    
 
    
    







           
   

   

   
    
    
 
    
    


