
public class Fahrenheit extends Temperatura {

    //Construtor
    public Fahrenheit(double graustemp) {
        super(graustemp);
    }
    //Método para converter de fahrenhit para celsius

    public double paraCelsius() {
        return (getGraus() - 32) * 5 / 9;
    }

    //Converte de fahrenheit para kelvin
    public double paraKelvin() {
        return (getGraus() - 32) * 9 / 5 + 273.15;
    }
}
