/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadedeswitch;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class AtividadedeSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ola! Bem vindo a calculadora de area geometrica"); 
        System.out.println("Por favor, digite do 1 a 4, qual forma geomtrica deseja resolver?");
        System.out.println("1-Retangulo");
        System.out.println("2-Cubos");
        System.out.println("3-Circulos");
        System.out.println("4-Triangulo");
        
        int forma = scanner.nextInt();
        
        System.out.println("Agora coloque os valores desta forma:");
        
        //SWITCH CASE COMEÇA AQUI
        switch(forma){
            case 1: 
                System.out.println("Qual a base do retangulo?");
                int baseR = scanner.nextInt();
                System.out.println("Qual a altura do retangulo?");
                int alturaR = scanner.nextInt();
                int areaR = baseR * alturaR;
                System.out.println("Area do retangulo: " + areaR);
                break;
                
              case 2: 
                System.out.println("Qual a aresta do cubo?");
                int arestaC = scanner.nextInt();
                int areaC = arestaC * arestaC * arestaC;
                System.out.println("Area do cubo: " + areaC);
                break;
                
               case 3: 
                System.out.println("Qual é o raio do circulo?");
                int raioCir = scanner.nextInt();
                int areaCir = 3 * raioCir * raioCir;
                System.out.println("Area do circulo: " + areaCir);
                break;
                
               case 4: 
                System.out.println("Qual é o base do triangulo?");
                int baseT = scanner.nextInt();
                System.out.println("Qual a altura do triangulo?");
                int alturaT = scanner.nextInt();
                int areaT = baseT * alturaT /2;
                System.out.println("Area do retangulo: " + areaT);
                break;
    }
    
    }
}
