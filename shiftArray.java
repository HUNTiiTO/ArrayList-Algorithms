import java.util.*;

//Class:
public class shiftArray{

  //Method:
  public static ArrayList<Integer> shift (ArrayList<Integer> arr){
    int temp = arr.get(arr.size()-1);
    for(int i = arr.size()-1; i > 0; i--){
      arr.set(i, arr.get(i-1));
    }
    arr.set(0, temp);
    return arr;
  }
}