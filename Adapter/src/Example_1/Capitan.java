package Example_1;

public class Capitan implements RowingBoat {

    private RowingBoat rowingBoat;

    public Capitan() {
    }

    public Capitan(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }
}
