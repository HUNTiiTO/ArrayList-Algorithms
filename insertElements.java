import java.util.*;

//Class:
public class insertElements{

  //Method:
  public static ArrayList<Integer> insert (ArrayList<Integer> arr, int val, int ind){
    arr.add(ind, val);
    return arr;
  }
}