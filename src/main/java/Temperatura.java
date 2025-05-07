
public class Temperatura {

    //Atributo privado
    private double graus;
    
    //Construtor
    public Temperatura(double graustemp){
        this.graus = graustemp;
    }
    
    //Getter
    public double getGraus(){
        return graus;
    }
    
    //Seter
    public void seterGraus(double novoGraus){
        this.graus = novoGraus;
    }
}
