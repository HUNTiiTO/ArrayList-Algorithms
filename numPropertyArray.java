import java.util.*;

//Class:
public class numPropertyArray{

  //Method:
  public static int findNumProp (ArrayList<String> arr, int size){
    int count = 0;
    for(String i: arr){
      if (i.length() == size){
        count++;
      }
    }
    return count;
  }
}