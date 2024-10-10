/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdesktop;

/**
 *
 * @author evefa
 */
public class Conversor5 {
    public double celsiusParaFahrenheit(double c){
        return (9.0 * c / 5.0) + 32;
    }
    
    public double fahrenheitParaCelsius(double f){
        return(5.0 * (f - 32.0)) / 9.0;
    }
    
    public double celsiusParaKelvin(double c){
        return c + 273.15;
    }
    
    public double kelvinParaCelsius(double k){
        return k - 273.15;
    }
    
    public double fahrenheitParaKelvin(double f){
        return (5.0 * (f - 32.0)) / 9.0 + 273.15;
    }
    
    public double kelvinParaFahrenheit(double k){
        return (9.0 * (k - 273.15) / 5.0) + 32.0;
    }
}
