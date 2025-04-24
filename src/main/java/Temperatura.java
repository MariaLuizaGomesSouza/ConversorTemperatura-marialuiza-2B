
public class Temperatura {

    //Atributo priado para armarzernar temp-Celsius
    private double tempCelsius;

    //Construtor - criar objeto temp inicial
    public Temperatura(double tempInicialCelsius) {
        this.tempCelsius = tempInicialCelsius;
    }
    //Ler a temp

    public double getTemperaturaCelsius() {
        return tempCelsius;
    }

    //Setter- mudar a temp
    public void setTemperaturaCelsius(double mudarTemperaturaCelsius) {
        this.tempCelsius = mudarTemperaturaCelsius;
    }

    //Método para converter Cesius para Fahrenheit
    public double converteParaFahrenheit() {
        return (tempCelsius * 9 / 5) + 32;
    }
    //Metodo para converter Celsius para Kelvin

    public double converteParaKelvin() {
        return tempCelsius + 273.15;
    }
}
