package main.main;

import java.util.ArrayList;
import java.util.List;

public class Reports {
  static List<MemberReport> memberReportsArray = new ArrayList<MemberReport>();
  static List<ProviderReport> providerReportsArray = new ArrayList<ProviderReport>();
  
  public Reports() {

  }
  
  /**
   * This function returns the index in the array of the desired member's report.

   * @param memberNum is the members number we are looking for. 

   * @return the index of the report. If doesn't exist, we are going to have to create a new report.
   */
  public int doesMemReportExist(int memberNum) {
    for (int i = 0; i < memberReportsArray.size(); i++) {
      if (memberReportsArray.get(i).theMember.getMemberNumber() == memberNum) {
        return i;
      }
    }
    return -1;
  }
}


