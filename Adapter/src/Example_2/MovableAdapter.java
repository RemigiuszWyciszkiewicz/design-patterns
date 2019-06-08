package Example_2;

public class MovableAdapter implements MovableKilometers{

    private Movable luxuryCar;

    public MovableAdapter(Movable luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    @Override
    public double getSpeed() {
        return convert(luxuryCar.getSpeed());
    }


    private double convert(double mph)
    {
        return mph * 1.6;
    }
}
