package main.main;

import java.util.ArrayList;
import java.util.List;
/** Class is a total report of weekly financial transactions.

 * @author Gabe Gros */

public class SummaryReport {
<<<<<<< HEAD
  Provider[] listOfProvdersToBePaid  =  null;
  int[] totalConsultationPerProviderArray  =  null;
  float[] feePerProviderArray  =  null;
  Provider[] listOfProvidersWhoProvideService  =  null;
  int totalNumberOfConsultations  =  0;
  int overallFee  =  0;

  /** Class prints the report.

   * @author Gabe Gros */
  public void printSummary() {
    for (int i = 0; i < listOfProvdersToBePaid.length; i++) {
      System.out.println(listOfProvdersToBePaid[i] + "has " + totalConsultationPerProviderArray[i]
          + " consultations for $" + feePerProviderArray[i]);
    }
    System.out.println("All current providers: ");
    for (int i = 0; i < listOfProvidersWhoProvideService.length; i++) {
      System.out.println(listOfProvidersWhoProvideService[i]);
    }
    System.out.println("This week there were " + totalNumberOfConsultations
        + " consultations.");
    System.out.println("These consultations were for a total of $" + overallFee);
  }
=======
  public List<String> providersToBePaid; 
  public List<Integer> numConsultsPerProvider; 
  public List<Double> feePerProvider;
  int numProvidersWithService;
  int totalConsultations;
  double overallFee;

  public SummaryReport() {
    providersToBePaid = new ArrayList<String>();
    numConsultsPerProvider = new ArrayList<Integer>();
    feePerProvider = new ArrayList<Double>();
    numProvidersWithService = 0;
    totalConsultations = 0;
    overallFee = 0;
  }
  
  public void populateReport() {
    int runningNumConsults = 0;
    double runningFee = 0.0;
    for (int i = 0; i < Reports.providerReportsArray.size(); i++) {
      runningNumConsults += Reports.providerReportsArray.get(i).serviceArray.size();
      runningFee += Reports.providerReportsArray.get(i).getFee();
      
      providersToBePaid.add(Reports.providerReportsArray.get(i).theProvider.getProviderName());
      numConsultsPerProvider.add(Reports.providerReportsArray.get(i).serviceArray.size());
      feePerProvider.add(Reports.providerReportsArray.get(i).getFee());
      
    }
    numProvidersWithService = providersToBePaid.size();
    totalConsultations = runningNumConsults;
    overallFee = runningFee;
  }
  
  public void print() {
    System.out.println("===Summary Report===");
    System.out.println("Provider | Number of Consults | Fee due");
    for (int i = 0; i < providersToBePaid.size(); i++) {
      System.out.print(providersToBePaid.get(i) + " | " + numConsultsPerProvider.get(i));
      System.out.println(" | $" + feePerProvider.get(i));
    }
    System.out.println("---Overall Statistics---");
    System.out.println("Total number of Providers providing Service: " + numProvidersWithService);
    System.out.println("Total consultations: " + totalConsultations);
    System.out.println("Total fee for this week: $" + overallFee);
  }
  
  public void clear() {
    providersToBePaid.clear();
    numConsultsPerProvider.clear();
    feePerProvider.clear();
    numProvidersWithService = 0;
    totalConsultations = 0;
    overallFee = 0;
    
  }
  
  

>>>>>>> branch 'master' of https://bitbucket.org/tklocklear/Fall2022Team17.git
}


