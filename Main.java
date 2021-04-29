import java.util.*;
class Main {
  public static void main(String[] args) {
    int[][]array = {{1,5,4,5,7,3},{2,4,3,5,7,6},{2,4,3,3,6,0},{9,8,9,9,4,1}};
for(int [] row:array)
System.out.println(Arrays.toString(row));
System.out.println();
System.out.println("New Array");
Unit8_1a test = new Unit8_1a();
for(int [] row: test.modifyRows(array))
System.out.println(Arrays.toString(row));

  }
}

//output should be
//1 5 4 8 7 3
//1 5 4 8 7 3
//2 4 3 3 6 0
//9 4 3 3 6 0