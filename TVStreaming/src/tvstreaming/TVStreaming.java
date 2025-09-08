package tvstreaming;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TVStreaming {
  
    public static void main(String[] args) {     
        
        ArrayList<Series> model = new ArrayList<>();
        model.add(new Series("t123", "Dawn of the dead", "18", "10"));
        model.add(new Series("t456", "Clutter", "12", "2"));
        model.add(new Series("t678", "fast and furious", "6", "7"));
             
        for(;;){         
            int choice = 0;
            int menuOption = 0;
            
            Scanner scan = new Scanner(System.in);

            System.out.println("LATEST SERIES - 2025");
            System.out.println("**********************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");

            try{
                choice = scan.nextInt();
            }catch(InputMismatchException e){
                System.out.println("The choice you entered is not a number, please enter a valid number");
            }

            if(choice != 1){
                System.exit(0);
            }else{
                System.out.println("\n------ SERIES MENU ------");
                System.out.println("1) Capture New Series");
                System.out.println("2) Search for Series");
                System.out.println("3) Update Series Age Restriction");
                System.out.println("4) Delete Series");
                System.out.println("5) Print Series Report - 2025");
                System.out.println("6) Exit");

                try{
                    menuOption = scan.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("The choice you entered is not a number, please enter a valid number");
                }

            if(menuOption == 1){
                System.out.println("CAPTURE A NEW SERIES");
                System.out.println("****************************");
                System.out.print("Enter the series id:");
                scan.nextLine();
                String seriesId = scan.nextLine();
              
                System.out.print("Enter the series name:");
                String seriesname = scan.nextLine();
                System.out.print("Enter the series age restriction:");
                String ageRes = scan.nextLine();

                int ageRestriction = 0;

                try{
                    ageRestriction = Integer.parseInt(ageRes);
                }catch(NumberFormatException e){
                    System.out.println("value entered for the age is invalid");
                }
                   
                Series newSeries = new Series();
                boolean isValid = newSeries.isAgeRes(ageRestriction);
                
                while (isValid == false){
                    System.out.println("you have entered a incorrect series age!!!" +
                    "Please re-enter the series Age" );
                    ageRes = scan.nextLine();
                    
                    try{
                     ageRestriction = Integer.parseInt(ageRes);
                    }catch(NumberFormatException e){
                       System.out.println("value entered for the age is invalid");
                    }
                    
                    isValid = newSeries.isAgeRes(ageRestriction);
                }

                System.out.print("Enter the number of episodes:");
                String numEpisodes = scan.nextLine();

                newSeries = new Series(seriesId, seriesname, ageRes, numEpisodes);

                newSeries.captureSeries(model,newSeries);

            }else if(menuOption == 2){

                System.out.println("Enter the series id to search:");
                scan.nextLine();
                String seriesId = scan.nextLine();

                Series searchedSeries = new Series();

                searchedSeries = searchedSeries.searchSeries(model, seriesId);

                if(searchedSeries.getSeriesId().equalsIgnoreCase(seriesId)){
                    System.out.println("Series Id: " + searchedSeries.getSeriesId());
                    System.out.println("Series Name: " + searchedSeries.getSeriesName());
                    System.out.println("Series Age restriction: " + searchedSeries.getSeriesAge());
                    System.out.println("Series Number of episodes: " + searchedSeries.getSeriesNumberOfEpisodes());
                }else{
                    System.out.println("Series with Id: " + seriesId + "was not found");
                }
            }else if(menuOption == 3){
                
                System.out.print("Enter the series id to update:");
                scan.nextLine();
                String seriesId = scan.nextLine();

                Series searchedSeries = new Series();

                searchedSeries = searchedSeries.searchSeries(model, seriesId);

                System.out.print("Enter the series name:");
                String seriesname = scan.nextLine();
                System.out.print("Enter the series age restriction:");
                String ageRes = scan.nextLine();
                System.out.print("Enter the series number of episodes: ");
                String numEpisodes = scan.nextLine();

                searchedSeries.updateSeries(searchedSeries, seriesname, ageRes, numEpisodes);              
                
                System.out.println("Series updated successfully!!");

            } else if(menuOption == 4 ){ 

                Series newmodel = new Series();

                System.out.print("Enter Series ID to delete: ");
                scan.nextLine();
                String id = scan.nextLine();

                newmodel = newmodel.searchSeries(model, id);

                System.out.println("Are you sure you want to delete series " + id + "from the system? yes (y) to delete");
                String answer = scan.nextLine();

                newmodel.deleteSeries(model, answer, id, newmodel);    

            }else if(menuOption == 5){

                Series report = new Series();
                report.seriesReport(model);
                
            }else if(menuOption == 6){
               Series exitSeriesApplication = new Series();
               exitSeriesApplication.exitSeriesApplication();
            }
        } 
        }
    }     
}    


   
