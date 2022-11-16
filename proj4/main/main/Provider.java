package main.main;

import java.util.Random;

public class Provider {
  //member variables
  int[] providerNumber;
  String providerName;
  
  public Provider() {
    Provider provider = new Provider();
    provider.providerName = null;
    provider.providerNumber = new int[9];
    
  }
  
  public int[] getProNumber() {
    return providerNumber;
  }
  
  /** Adds provider. */
  public static void addProvider(Provider providerToAdd) {
    Provider newProvider = new Provider();
    newProvider.providerName = providerToAdd.providerName;
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      newProvider.providerNumber[i] = rand.nextInt(9);
    }
  }
  
}
