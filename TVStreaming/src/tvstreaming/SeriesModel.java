package tvstreaming;

public class SeriesModel {
    public String seriesId;
    public String seriesName;
    public String seriesAge;
    public String seriesNumberOfEpisodes;

    public SeriesModel() {
    }

       
    public SeriesModel(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.seriesAge = seriesAge;
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getSeriesAge() {
        return seriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return seriesNumberOfEpisodes;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public void setSeriesAge(String seriesAge) {
        this.seriesAge = seriesAge;
    }

    public void setSeriesNumberOfEpisodes(String seriesNumberOfEpisodes) {
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
        
        
    }

    @Override
    public String toString() {
        return "SeriesModel{" + "seriesId=" + seriesId + ", seriesName=" + seriesName + ", seriesAge=" + seriesAge + ", seriesNumberOfEpisodes=" + seriesNumberOfEpisodes + '}';
    }

    
    
    
    
}
  