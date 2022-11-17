package main.main;

import java.util.ArrayList;
import java.util.List;

public class RecordsController {
  static List<aMember> memberRecordsArray = new ArrayList<aMember>();
  static List<Provider> providerRecordsArray = new ArrayList<Provider>();
  
  public RecordsController() {

  }
  
  public void addMember(String name) {
    aMember addition = new aMember(name);
    memberRecordsArray.add(addition);
  }
  
  public boolean removeMember(int num) {
    

    return false;
  }
  
  public void printMemberList() {
    for (int i = 0; i < memberRecordsArray.size(); i++) {
      memberRecordsArray.get(i).printMember();;
    }
  }
}
