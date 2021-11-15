//temp blueprint

public class Temperature2 {

    // set ftemp variable
    private int ftemp;

    // ftemp constuructor
    public Temperature2(int ftemp) {
        this.ftemp = ftemp;
    }

    // fahrenheit method
    public double getFahrenheit() {

        return ftemp;

    }

    // celcius method
    public double getCelcius() {

        return 5.0 / 9.0 * (ftemp - 32);

    }

    // kelvin method
    public double getKelvin() {

        return 273 + 5.0 / 9.0 * (ftemp - 32);

    }
}
