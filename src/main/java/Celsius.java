
public class Celsius extends Temperatura {

    //Construtor
    public Celsius(double graus) {
        super(graus);
    }

    //Converter para Kelvin
    public double paraKelvin() {
        return getGraus() + 273.15;
    }

    //Converter para Fahrenheit
    public double setGraus() {
        return (getGraus() * 9 / 5) + 32;
    }
}
