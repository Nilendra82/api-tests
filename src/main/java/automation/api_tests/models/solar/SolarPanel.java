package automation.api_tests.models.solar;

public class SolarPanel {
    private Center center;
    private String orientation;
    private double yearlyEnergyDcKwh;
    private int segmentIndex;

    public Center getCenter() {
        return center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
    public String getOrientation() {
        return orientation;
    }
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
    public double getYearlyEnergyDcKwh() {
        return yearlyEnergyDcKwh;
    }
    public void setYearlyEnergyDcKwh(double yearlyEnergyDcKwh) {
        this.yearlyEnergyDcKwh = yearlyEnergyDcKwh;
    }
    public int getSegmentIndex() {
        return segmentIndex;
    }
    public void setSegmentIndex(int segmentIndex) {
        this.segmentIndex = segmentIndex;
    }
}
