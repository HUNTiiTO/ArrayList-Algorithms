import java.util.*;

//Class:
public class consecutiveArray{

  //Method:
  public static ArrayList<Integer> findConsec (ArrayList<Integer> arr){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i = 0; i < arr.size()-1; i++){
      if(arr.get(i) == arr.get(i+1)){
        temp.add(arr.get(i));
        temp.add(arr.get(i+1));
      }
    }
    return temp;
  }
}