
public class Fishnet {

    int fishnumber;
    double averageweightPerFish;
    double total;

    public int getFishnumber(){
        return fishnumber;
    }
    public void setFishnumber(int fishnumber){
        this.fishnumber = fishnumber;
    }
    public double getAverageweightPerFish(){
        return averageweightPerFish;
        }
    public void setAverageweightPerFish(double averageweight){
        this.averageweightPerFish = averageweight;
    }

    public Fishnet(){
       total = fishnumber*averageweightPerFish;
    }

}
