public class Fahrenheit extends Temperatura{
    //Construtor
    public Fahrenheit(double graustemp) {
        super(graustemp);
    }
     //Coverter kevin para celsius
    public double paraCelsius(){
        return getGraus()-273.15;
    }
    
    //Converte de kelvin para fahrenheit
    public double paraFahrenheit(){
        return ((getGraus()-273.15)*9/5)+32;
    }
}
