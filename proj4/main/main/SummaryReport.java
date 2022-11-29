package main.main;

import java.util.ArrayList;
import java.util.List;
/** Class is a total report of weekly financial transactions.

* @author Gabe Gros */

public class SummaryReport {
  public List<String> providersToBePaid; 
  public List<Integer> numConsultsPerProvider; 
  public List<Double> feePerProvider;
  int numProvidersWithService;
  int totalConsultations;
  double overallFee;
  
  /**
   * Summary Report creates space for all of the info for the report.
   */

  public SummaryReport() {
    providersToBePaid = new ArrayList<String>();
    numConsultsPerProvider = new ArrayList<Integer>();
    feePerProvider = new ArrayList<Double>();
    numProvidersWithService = 0;
    totalConsultations = 0;
    overallFee = 0;
  }
  
  /**
   * PopulateReport adds info to the report.
   */
  
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
  
  /**
   * Print prints out the report.
   */
  
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
  
  /**
   * Clear clears all of the report info.
   */
  
  public void clear() {
    providersToBePaid.clear();
    numConsultsPerProvider.clear();
    feePerProvider.clear();
    numProvidersWithService = 0;
    totalConsultations = 0;
    overallFee = 0;
    
  }
  
  

}
