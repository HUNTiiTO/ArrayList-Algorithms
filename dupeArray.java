import java.util.*;

//Class:
public class dupeArray{

  //Method:
  public static boolean findDupe (ArrayList<Integer> arr){
    boolean found = false;
    for(int i = 0; i < arr.size()-1; i++){
      for(int j = i+1; j < arr.size(); j++){
        if (arr.get(i) == arr.get(j)){
          found = true;
        }
      }
    }
    return found;
  }
}