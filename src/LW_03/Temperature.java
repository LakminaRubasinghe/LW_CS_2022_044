package LW_03;

public class Temperature {
    private double Celcius;
    private double Fahrenheit;

    public double getCelcius() {
        return Celcius;
    }

    public void setCelcius(double celcius) {
        this.Celcius = celcius;
        this.Fahrenheit=(Celcius*9/5)+32;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit() {
    }

    public Temperature() {
    }

    public Temperature(double celcius) {
        setCelcius(celcius);
    }

}
