import java.util.*;

//Class:
public class sumArray{

  //Method:
  public static int sum (ArrayList<Integer> arr){
    int sum = 0;
    for(int i: arr){
      sum += i;
    }
    return sum;
  }
}