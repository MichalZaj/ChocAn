package main.main;

/**
* operator class.
*
* @author cjmess
*
*/
public class Operator {
  //member variables
  int operatorNumber;

  /**
   * This is the class constructor.

   * @param opNum desired operator number.
   */
  public Operator(int opNum) {
    operatorNumber = opNum;
  }
  
  /**
   * This returns the operator's number.

   * @return operator number.
   */
  public int getOpNumber() {
    return operatorNumber;
  }
  
}
