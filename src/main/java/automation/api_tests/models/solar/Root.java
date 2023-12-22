package automation.api_tests.models.solar;

public class Root {
    private String name;
    private Center center;
    private ImageryDate imageryDate;
    private String regionCode;
    private SolarPotential solarPotential;
    private BoundingBox boundingBox;
    private String imageryQuality;
    private ImageryProcessedDate imageryProcessedDate;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Center getCenter() {
        return center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
    public ImageryDate getImageryDate() {
        return imageryDate;
    }
    public void setImageryDate(ImageryDate imageryDate) {
        this.imageryDate = imageryDate;
    }
    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    public SolarPotential getSolarPotential() {
        return solarPotential;
    }
    public void setSolarPotential(SolarPotential solarPotential) {
        this.solarPotential = solarPotential;
    }
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }
    public String getImageryQuality() {
        return imageryQuality;
    }
    public void setImageryQuality(String imageryQuality) {
        this.imageryQuality = imageryQuality;
    }
    public ImageryProcessedDate getImageryProcessedDate() {
        return imageryProcessedDate;
    }
    public void setImageryProcessedDate(ImageryProcessedDate imageryProcessedDate) {
        this.imageryProcessedDate = imageryProcessedDate;
    }
}
