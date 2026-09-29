package travel;

public class Car extends Vehicle {
    private int numDoors;

    public int GetNumDoors(){
        return this.numDoors;
    }

    public void SetNumDoors(int newNumDoors){
        this.numDoors = newNumDoors;
    }
}