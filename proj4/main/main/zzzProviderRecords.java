package main.main;

import java.util.ArrayList;
import java.util.List;

/** Record information for providers.

 * @author Cristina Paier */

public class zzzProviderRecords extends zzzRecords {
  static List<Provider> providerRecordsArray;
  static boolean validProvider;
  static Provider provider;
  Provider newProvider;
  
  /** Constructor. */
  public zzzProviderRecords() {
    List<Provider> providerRecordsArray = new ArrayList<>();
    validProvider = false;
  }
  
  public static List<Provider> getProviderRecords() {
    return providerRecordsArray;
  }
  
  /** Finds provider. */
  public static Provider getProvider(int[] number) {
    int[] providerNumber;
    int index = 0;
    while (index < providerRecordsArray.size()) {
      providerNumber = providerRecordsArray.get(index).getProNumber();
      if (providerNumber == number) {
        provider = providerRecordsArray.get(index);
        validProvider = true;
      }
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
  public void addProvider(Provider providerToAdd) {
    Provider newProvider = new Provider();
    newProvider.addProvider(providerToAdd);
    providerRecordsArray.add(newProvider);
  }
  

}
