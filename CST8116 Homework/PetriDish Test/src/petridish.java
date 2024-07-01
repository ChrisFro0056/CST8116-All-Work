public class petridish {

   //Instance Variables
    private int bact,min,sec;
    double total;
    //accessor for bact
    public int getBact() {
        return bact;
    }
    //mutator for b
    public void setBact(int bact) {
        this.bact = bact;
    }
    //accessor for min
    public int getMin() {
        return min;
    }
    //mutator for min
    public void setMin(int min) {
        this.min = min;
    }
    //accessor for sec
    public int getSec() {
        return sec;
    }
    //mutator for s
    public void setSec(int sec) {
        this.sec = sec;
    }

    //accessor for total
    public double getTotal() {
            return total;
        }

        //mutator for total
        public void setTotal(double conversion) {
            this.total = bact * (Math.pow(2, conversion));
    }
}

