/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacase;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class JavaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        instrucoes();
        
               Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        
        //SWITCH CASE COMEÇA AQUI
        switch(dia){
            case 1:
                System.out.println("O dia selecionado foi segunda-feira");
                break;
            case 2:
                System.out.println("O dia selecionado foi terça-feira");
                break;
            case 3:
                System.out.println("O dia selecionado foi quarta-feira");
                break;
            case 4:
                System.out.println("O dia selecionado foi quinta-feira");
                break;
            case 5: 
                System.out.println("O dia selecionado foi sexta-feira");
                break;
            case 6:
                System.out.println("O dia selecionado foi sabado");
                break;
            case 7:
                System.out.println("O dia selecionado foi domingo");
                break;
            default:
                System.out.println("O nimero digitado é inválido");
            
        }
        //SWITCH CASE TERMINA AQUI
    }
    public static void instrucoes(){
        System.out.println("Ola! digite 1 para selecionar"
                + "segunda-feira e 7 para selecionar domingo");
    }
}
