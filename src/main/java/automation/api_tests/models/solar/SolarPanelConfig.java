package automation.api_tests.models.solar;

import java.util.ArrayList;

public class SolarPanelConfig {
    private int panelsCount;
    private double yearlyEnergyDcKwh;
    private ArrayList<RoofSegmentSummary> roofSegmentSummaries;
    
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
    public ArrayList<RoofSegmentSummary> getRoofSegmentSummaries() {
        return roofSegmentSummaries;
    }
    public void setRoofSegmentSummaries(ArrayList<RoofSegmentSummary> roofSegmentSummaries) {
        this.roofSegmentSummaries = roofSegmentSummaries;
    }
    
}
