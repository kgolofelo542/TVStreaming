
package tvstreaming;

import java.util.ArrayList;
import java.util.Scanner;

public class Series extends SeriesModel {

    public Series() {
    }

public boolean isAgeRes(int ageRestriction){
    boolean isValid = true;
    
    if((ageRestriction < 2) || (ageRestriction > 18)){
        isValid = false;
    }
    
    return isValid;
}  
    
    public Series(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {
        super(seriesId, seriesName, seriesAge, seriesNumberOfEpisodes);
    }
    
    public void captureSeries(ArrayList<Series> model,Series newSeries){
  
        
        model.add(newSeries);
         
        System.out.println("Series Processed successfully!!!");
        
    }
    public Series searchSeries(ArrayList<Series> model,String seriesId ){
        
        Series searchedSeries = new Series();
        
        for (int i = 0; i < model.size(); i++){
            
            
            Series currentSeries = model.get(i);
               
            if (currentSeries.getSeriesId().equalsIgnoreCase(seriesId)){
                  
                searchedSeries.setSeriesId(currentSeries.getSeriesId());
                searchedSeries.setSeriesName(currentSeries.getSeriesName());
                searchedSeries.setSeriesAge(currentSeries.getSeriesAge());
                searchedSeries.setSeriesNumberOfEpisodes(currentSeries.getSeriesNumberOfEpisodes());       
            }
        } 
        return searchedSeries;
    }
    public void updateSeries(Series searchedSeries,String seriesname,String ageRes, String numEpisodes){
        searchedSeries.setSeriesName(seriesname);
        searchedSeries.setSeriesAge(ageRes);
        searchedSeries.setSeriesNumberOfEpisodes(numEpisodes);    
    }
    public void deleteSeries(ArrayList<Series> model,String answer,String id,Series newmodel){
        if(answer.equalsIgnoreCase("y")){       
            model.remove(newmodel);
                
            System.out.println("---------------------------------------------------");
            System.out.println("Series with Series Id: " + id + " was deleted!");
            System.out.println("---------------------------------------------------");
        }
         
    }
    public void seriesReport(ArrayList<Series> model){
        for (int i = 0; i < model.size(); i++) {
            System.out.println("Series " + (i+1));
            System.out.println("---------------------------------------------------");
                
            System.out.println("SERIES ID: " + model.get(i).getSeriesId() );
            System.out.println("SERIES NAME: " + model.get(i).getSeriesName() );
            System.out.println("SERIES AGE RESTRICTION: " + model.get(i).getSeriesAge() );
            System.out.println("SERIES OF EPISODES: " + model.get(i).getSeriesNumberOfEpisodes() );
                
            System.out.println("---------------------------------------------------");
        }    
    }
    public void exitSeriesApplication(){
        System.exit(0);
    }
}
