import Example_1.Capitan;
import Example_1.FishingBoatAdapter;
import Example_2.BugattiVeyron;
import Example_2.Movable;
import Example_2.MovableAdapter;
import Example_2.MovableKilometers;

public class Main {

    public static void main(String[] args){

        //Example_1
        Capitan capitan=new Capitan(new FishingBoatAdapter());
        capitan.row();

        //Example_2
        Movable movable=new BugattiVeyron();
        MovableKilometers movableKilometers=new MovableAdapter(movable);

        System.out.println(movableKilometers.getSpeed());

    }
}
