import java.util.*;

//Class:
public class reverseArray{

  //Method:
  public static ArrayList<Integer> reverse (ArrayList<Integer> arr){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i = arr.size()-1; i >= 0; i--){
      temp.add(arr.get(i));
    }
    return temp;
  }
}