
public class Fahrenheit extends Temperatura {

    public Fahrenheit(double valorGraus) {
        //SUPER = CLASSE PAI
        super(valorGraus);
    }

    //METODO QUE COVERTE F PARA C
    public double paraCelsius() {
        return (getGraus() - 32) * 5 / 9;
    }

    //METODO COVERTE DE F PARA K
    public double paraKelvin() {
        return paraCelsius() + 273;
    }

}
