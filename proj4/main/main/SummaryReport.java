package main.main;

/** Class is a total report of weekly financial transactions.

 * @author Gabe Gros */

public class SummaryReport {
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
}


