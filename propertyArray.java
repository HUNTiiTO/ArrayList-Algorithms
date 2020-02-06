import java.util.*;

//Class:
public class propertyArray{

  //Method:
  public static boolean findProp (ArrayList<String> arr, int size){
    boolean found = false;
    for(String i: arr){
      if (i.length() == size){
        found = true;
      }
    }
    return found;
  }
}