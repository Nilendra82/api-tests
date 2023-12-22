package automation.api_tests.models.solar;

import java.util.ArrayList;

public class WholeRoofStats {
    private double areaMeters2;
    private ArrayList<Double> sunshineQuantiles;
    private double groundAreaMeters2;
    
    public double getAreaMeters2() {
        return areaMeters2;
    }
    public void setAreaMeters2(double areaMeters2) {
        this.areaMeters2 = areaMeters2;
    }
    public ArrayList<Double> getSunshineQuantiles() {
        return sunshineQuantiles;
    }
    public void setSunshineQuantiles(ArrayList<Double> sunshineQuantiles) {
        this.sunshineQuantiles = sunshineQuantiles;
    }
    public double getGroundAreaMeters2() {
        return groundAreaMeters2;
    }
    public void setGroundAreaMeters2(double groundAreaMeters2) {
        this.groundAreaMeters2 = groundAreaMeters2;
    }   
}
