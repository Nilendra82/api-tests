package automation.api_tests.models.solar;

public class RoofSegmentSummary {
    private double pitchDegrees;
    private double azimuthDegrees;
    private int panelsCount;
    private double yearlyEnergyDcKwh;
    private int segmentIndex;
    
    public double getPitchDegrees() {
        return pitchDegrees;
    }
    public void setPitchDegrees(double pitchDegrees) {
        this.pitchDegrees = pitchDegrees;
    }
    public double getAzimuthDegrees() {
        return azimuthDegrees;
    }
    public void setAzimuthDegrees(double azimuthDegrees) {
        this.azimuthDegrees = azimuthDegrees;
    }
    public int getPanelsCount() {
        return panelsCount;
    }
    public void setPanelsCount(int panelsCount) {
        this.panelsCount = panelsCount;
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
