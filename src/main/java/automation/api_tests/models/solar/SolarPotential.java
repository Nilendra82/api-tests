package automation.api_tests.models.solar;

import java.util.ArrayList;

public class SolarPotential {
    private int maxArrayPanelsCount;
    private double maxArrayAreaMeters2;
    private double maxSunshineHoursPerYear;
    private double carbonOffsetFactorKgPerMwh;
    private WholeRoofStats wholeRoofStats;
    private ArrayList<RoofSegmentStat> roofSegmentStats;
    private ArrayList<SolarPanelConfig> solarPanelConfigs;
    private int panelCapacityWatts;
    private double panelHeightMeters;
    private double panelWidthMeters;
    private int panelLifetimeYears;
    
    public int getMaxArrayPanelsCount() {
        return maxArrayPanelsCount;
    }
    public void setMaxArrayPanelsCount(int maxArrayPanelsCount) {
        this.maxArrayPanelsCount = maxArrayPanelsCount;
    }
    public double getMaxArrayAreaMeters2() {
        return maxArrayAreaMeters2;
    }
    public void setMaxArrayAreaMeters2(double maxArrayAreaMeters2) {
        this.maxArrayAreaMeters2 = maxArrayAreaMeters2;
    }
    public double getMaxSunshineHoursPerYear() {
        return maxSunshineHoursPerYear;
    }
    public void setMaxSunshineHoursPerYear(double maxSunshineHoursPerYear) {
        this.maxSunshineHoursPerYear = maxSunshineHoursPerYear;
    }
    public double getCarbonOffsetFactorKgPerMwh() {
        return carbonOffsetFactorKgPerMwh;
    }
    public void setCarbonOffsetFactorKgPerMwh(double carbonOffsetFactorKgPerMwh) {
        this.carbonOffsetFactorKgPerMwh = carbonOffsetFactorKgPerMwh;
    }
    public WholeRoofStats getWholeRoofStats() {
        return wholeRoofStats;
    }
    public void setWholeRoofStats(WholeRoofStats wholeRoofStats) {
        this.wholeRoofStats = wholeRoofStats;
    }
    public ArrayList<RoofSegmentStat> getRoofSegmentStats() {
        return roofSegmentStats;
    }
    public void setRoofSegmentStats(ArrayList<RoofSegmentStat> roofSegmentStats) {
        this.roofSegmentStats = roofSegmentStats;
    }
    public ArrayList<SolarPanelConfig> getSolarPanelConfigs() {
        return solarPanelConfigs;
    }
    public void setSolarPanelConfigs(ArrayList<SolarPanelConfig> solarPanelConfigs) {
        this.solarPanelConfigs = solarPanelConfigs;
    }
    public int getPanelCapacityWatts() {
        return panelCapacityWatts;
    }
    public void setPanelCapacityWatts(int panelCapacityWatts) {
        this.panelCapacityWatts = panelCapacityWatts;
    }
    public double getPanelHeightMeters() {
        return panelHeightMeters;
    }
    public void setPanelHeightMeters(double panelHeightMeters) {
        this.panelHeightMeters = panelHeightMeters;
    }
    public double getPanelWidthMeters() {
        return panelWidthMeters;
    }
    public void setPanelWidthMeters(double panelWidthMeters) {
        this.panelWidthMeters = panelWidthMeters;
    }
    public int getPanelLifetimeYears() {
        return panelLifetimeYears;
    }
    public void setPanelLifetimeYears(int panelLifetimeYears) {
        this.panelLifetimeYears = panelLifetimeYears;
    }
    public BuildingStats getBuildingStats() {
        return buildingStats;
    }
    public void setBuildingStats(BuildingStats buildingStats) {
        this.buildingStats = buildingStats;
    }
    public ArrayList<SolarPanel> getSolarPanels() {
        return solarPanels;
    }
    public void setSolarPanels(ArrayList<SolarPanel> solarPanels) {
        this.solarPanels = solarPanels;
    }
    private BuildingStats buildingStats;
    private ArrayList<SolarPanel> solarPanels;
    
}
