
public class Celsius extends Temperatura {

    public Celsius(double valorGraus) {
        super(valorGraus);
    }

    //CRIANDO METODOS PARA CONVERTER
    public double paraFahrenheit() {
        return (getGraus() * 9 / 5) + 32;
    }

    //METODO DE CELCIUS PARA KELVIN
    public double paraKelvin() {
        return getGraus() + 273;

    }

}
