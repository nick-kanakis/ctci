package Hard.Q11;

/**
 * Created by Nicolas on 25/1/2018.
 */
public class LocationPair {
    public int position1, position2;

    public LocationPair(int position1, int position2) {
        this.position1 = position1;
        this.position2 = position2;
    }

    public void setLocations(LocationPair pair){
        this.position1 = pair.position1;
        this.position2 = pair.position2;
    }

    public int distance(){
        return Math.abs(position1 - position2);
    }

    public boolean isValid(){
        return position1>0 && position2>0;
    }

    public void updateMin(LocationPair other){
        if(!isValid() || other.distance()<distance())
            setLocations(other);
    }

    public void setLocations(Integer position1, Integer position2) {
        this.position1 = position1;
        this.position2 = position2;
    }
}
