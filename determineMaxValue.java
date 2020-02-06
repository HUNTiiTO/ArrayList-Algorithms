import java.util.*;

//Class:
public class determineMaxValue{

  //Method:
  public static int findMax (ArrayList<Integer> arr){
    int maxValue = arr.get(0);
    for(int i: arr){
      if (i > maxValue){
        maxValue = i;
      }
    }
    return maxValue;
  }
}