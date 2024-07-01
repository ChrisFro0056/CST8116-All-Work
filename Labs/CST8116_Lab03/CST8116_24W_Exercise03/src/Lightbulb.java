public class Lightbulb {
    private double wattage;
    private String socket;
    private boolean testPassed;

    public Lightbulb(){
    }

    public Lightbulb(double wattage, String socket){
        this.wattage = wattage;
        this.socket = socket;
    }

    public double getWattage() {
        return wattage;
    }
    public void setWattage(double wattage){
        this.wattage = wattage;
    }
    public String getSocket(){
        return socket;
    }
    public void setSocket(String socket){
        this.socket = socket;
    }
    public boolean getTestPassed(){
        return testPassed;
    }
    public void setTestPassed(boolean testPassed){
        this.testPassed = testPassed;
    }
    public double estimateLifeSpan(){
        return 90.0/wattage;
    }
    public String toString(){
        String test;
        test = "Wattage: "+ wattage +"W Socket: "+socket+" Lifespan: "+estimateLifeSpan()+ " years Test: "+testPassed;
        return test;
    }

}
