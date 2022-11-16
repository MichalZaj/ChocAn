package main.main;

import java.util.ArrayList;
import java.util.List;

/** Record information for providers.

 * @author Cristina Paier */

public class ProviderRecords extends Records {
  static List<Provider> providerRecordsArray;
  static boolean validProvider;
  static Provider provider;
  Provider newProvider;
  
  /** Constructor. */
  public ProviderRecords() {
    List<Provider> providerRecordsArray = new ArrayList<>();
    validProvider = false;
  }
  
  /** Finds provider. 

 * @throws Exception 
  * If provider does not exist. */
  public static Provider getProvider(int[] number) {
    int[] providerNumber;
    int index = 0;
    while (index < providerRecordsArray.size()) {
    	providerNumber = providerRecordsArray.get(index).getProviderNumber();
      if (providerNumber == number) {
    	provider = providerRecordsArray.get(index);
        validProvider = true;
      }
    }
    if (validProvider == false) {
      throw new Exception("Invalid Provider");
    }
    return provider;
  }
  
  /** Edits provider.
   * Not sure what goes here yet???? */
  public static void editRecord(Provider provider) {
    
  }

  /** Deletes provider. */
  public static void deleteProvider(Provider provider) {
	  providerRecordsArray.remove(provider);
  }
  
  /** Adds provider. */
  public void addProvider(int[] number) {
	Provider newProvider = new Provider();
    newProvider.addProvider(number);
    providerRecordsArray.add(newProvider);
  }
  
  public static void main(String[] args) {
    
  }

  

}
