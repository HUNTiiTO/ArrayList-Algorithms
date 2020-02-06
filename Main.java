import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList <Integer> arrI = new ArrayList <Integer>();
    arrI.add(57);
    arrI.add(53);
    arrI.add(50);
    arrI.add(30);
    arrI.add(38);
    arrI.add(92);
    arrI.add(62);
    arrI.add(94);
    arrI.add(50);
    arrI.add(50);

    ArrayList <String> arrS = new ArrayList <String>();
    arrS.add("collection");
    arrS.add("history");
    arrS.add("construction");
    arrS.add("law");
    arrS.add("internet");
    arrS.add("paper");
    arrS.add("engine");
    arrS.add("amusement");
    arrS.add("ink");
    arrS.add("yarn");

    System.out.println();

    //Problem 1:
    System.out.println("#1:  insertElements");
    System.out.println( insertElements.insert(arrI, 1000, 3) );
    System.out.println();
    System.out.println();


    //Problem 2:
    System.out.println("#2:  deleteElements");
    System.out.println( deleteElements.delete(arrI, 3) );
    System.out.println();
    System.out.println();


    //Problem 3:
    System.out.println("#3:  determineMaxValue");
    System.out.println("Max: " + determineMaxValue.findMax(arrI) );
    System.out.println();
    System.out.println();


    //Problem 4:
    System.out.println("#4:  sumArray");
    System.out.println("Sum: " + sumArray.sum(arrI) );
    System.out.println();
    System.out.println();


    //Problem 5:
    System.out.println("#5:  findElement");
    System.out.println("Val: " + findElement.find(arrI, 3) );
    System.out.println();
    System.out.println();


    //Problem 6:
    System.out.println("#6:  propertyArray");
    System.out.println("Found: " + propertyArray.findProp(arrS, 5) );
    System.out.println();
    System.out.println();


    //Problem 7:
    System.out.println("#7:  consecutiveArray");
    System.out.println("Consecutive: " + consecutiveArray.findConsec(arrI) );
    System.out.println();
    System.out.println();


    //Problem 8:
    System.out.println("#8:  dupeArray");
    System.out.println("Dupe: " + dupeArray.findDupe(arrI) );
    System.out.println();
    System.out.println();


    //Problem 9:
    System.out.println("#9:  numPropertyArray");
    System.out.println("Num of Prop: " + numPropertyArray.findNumProp(arrS, 5) );
    System.out.println();
    System.out.println();


    //Problem 10:
    System.out.println("#10:  shiftArray");
    System.out.println("Array: " + shiftArray.shift(arrI) );
    System.out.println();
    System.out.println();


    //Problem 11:
    System.out.println("#11:  reverseArray");
    System.out.println("Array: " + reverseArray.reverse(arrI) );
    System.out.println();
    System.out.println();
  }
}