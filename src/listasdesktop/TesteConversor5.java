/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdesktop;

/**
 *
 * @author evefa
 */
public class TesteConversor5 {
    public static void main(String[] args){
        Conversor5 conversor = new Conversor5();
        //Testes
        System.out.println("Celsius para Fahrenheit: " + conversor.celsiusParaFahrenheit(25));
        System.out.println("Fahrenheit para Celsius: " + conversor.fahrenheitParaCelsius(77));
        System.out.println("Celsius para Kelvin: " + conversor.celsiusParaKelvin(25));
        System.out.println("Kelvin para Celsius: " + conversor.kelvinParaCelsius(298.15));
        System.out.println("Fahrenheit para Kelvin: " + conversor.fahrenheitParaKelvin(77));
        System.out.println("Kelvin para Fahrenheit: " + conversor.kelvinParaFahrenheit(298.15));
        
    }
}
