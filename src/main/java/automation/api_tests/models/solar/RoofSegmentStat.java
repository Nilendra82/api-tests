package automation.api_tests.models.solar;

public class RoofSegmentStat {
    private double pitchDegrees;
    private double azimuthDegrees;
    private Stats stats;
    
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
    public Stats getStats() {
        return stats;
    }
    public void setStats(Stats stats) {
        this.stats = stats;
    }
    public Center getCenter() {
        return center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }
    public double getPlaneHeightAtCenterMeters() {
        return planeHeightAtCenterMeters;
    }
    public void setPlaneHeightAtCenterMeters(double planeHeightAtCenterMeters) {
        this.planeHeightAtCenterMeters = planeHeightAtCenterMeters;
    }
    private Center center;
    private BoundingBox boundingBox;
    private double planeHeightAtCenterMeters;
}
