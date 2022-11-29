package main.main;

import java.util.ArrayList;
import java.util.List;

/**
 * EFT report class.
 *
 * @author mpzajac
 *
 */

public class EftReport {
  public List<String> providerArray;
  public List<Double> feeArray;
  
  
  /**

   * Default constructor.

   */

  public EftReport() {
    providerArray = new ArrayList<String>();
    feeArray = new ArrayList<Double>();
  }
  
  /**
   * This function populates the Eft report.
   */
  public void populateReport() {
    for (int i = 0; i < Reports.providerReportsArray.size(); i++) {
      providerArray.add(Reports.providerReportsArray.get(i).theProvider.getProviderName());
      feeArray.add(Reports.providerReportsArray.get(i).getFee());
    }
  }
  
  /**
   * This function prints the Eft report.
   */
  public void printReport() {
    System.out.println("===EFT Report===");
    System.out.println("Provider Name | Fee due");
    for (int i = 0; i < providerArray.size(); i++) {
      System.out.println(providerArray.get(i) + " | $" + feeArray.get(i));
    }
  }
  
  /**
   * This function clears the report.
   */
  public void clear() {
    providerArray.clear();
    feeArray.clear();
  }
}
