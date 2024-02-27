/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carproject;

/**
 *
 * @author FIC
 */
public class Carproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro car = new Carro(2010," Argo "," Amarelo ");
        Carro car2 = new Carro(2012," Uno "," Azul ");
        Carro car3 = new Carro(2013," Palio "," Preto ");
        Carro car4 = new Carro (2014," Touro "," Cinza ");
        
        System.out.println(Carro.modelo + car.marca + car.cor + car.ano );
        System.out.println(Carro.modelo + car.marca + car.cor + car2.ano );
        System.out.println(Carro.modelo + car.marca + car.cor + car3.ano );
        System.out.println(Carro.modelo + car.marca + car.cor + car4.ano );
        // Projeto onde foi usado conceito Abstrato
    }
    
}
