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
        
    System.out.print("Ano Atual: ");
    int x = scanner.nextInt();
    
      System.out.print("Ano de Nascimento: ");
      int y = scanner.nextInt();
      
     System.out.print("Idade calculada: ");
      System.out.println(x - y);
       
      
    
