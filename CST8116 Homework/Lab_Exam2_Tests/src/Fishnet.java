public class Fishnet {
    private double largeFishCount;
    private double mediumFishCount;

    public Fishnet(int largeFishCount, int mediumFishCount){
        this.largeFishCount = largeFishCount;
        this.mediumFishCount = mediumFishCount;
    }

        // getter for large fish count
        public int getLargeFishCount() { return (int) largeFishCount;
        }
// setter for large fish count
        public void setLargeFishCount(int largeFishCount) {
            this.largeFishCount = largeFishCount;
        }
// getter for medium fish count
        public int getMediumFishCount() { return (int) mediumFishCount;
        }
// setter for medium fish count
        public void setMediumFishCount(int mediumFishCount) {
            this.mediumFishCount = mediumFishCount;
        }

        public String calculateValue(){
        double totalFishValue = (getLargeFishCount() * 42.50) + (getMediumFishCount() * 15.50) ;
        String value;

            value = "The total value of large fish is: " + getLargeFishCount();
            value = "The total value of medium fish is: "+ getMediumFishCount();
            value = "The total value of the catch is "+ totalFishValue;

            return value;


        }
}
