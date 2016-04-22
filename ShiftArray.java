
import java.util.*;
public class ShiftArray {
  Library op = new Library();
  char[][] pus;
  char[][] temp;
  char[][] tempx;

  public ShiftArray() {
      pus = op.getLib();
      temp = op.getLib();
      tempx = op.getLib();
  }
  public char[][] setDef(char[][] pus, char[][] x){
    for (int i=0; i<pus.length; i++){
      for (int j=0; j<pus[i].length; j++){
        pus[i][j] = x[i][j];
      }
    }
    return pus;
  }
  public char[][] shiftRightRow(int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus.length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n-1 ) {
        i = 0;
      }
      temp[0][i] = pus[0][j];
      counter++;
      i++;
      j++;
    }
    Arrays.stream(temp).forEach(System.out::println);
    return temp;
  }

  public char[][] shiftDownCol(int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus.length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n-1 ) {
        i = 0;
      }
      tempx[i][0] = pus[j][0];
      counter++;
      i++;
      j++;
    }
      setDef(pus, tempx);
    Arrays.stream(tempx).forEach(System.out::println);
    return tempx;
  }
  public char[][] shiftLeftRow(int x){
    int counter = 0;
    int j = pus.length;
    int i = (x % pus.length) - x;
    int n = pus[0].length;
    while (counter != n) {
      if (i <= 0) {
        i = pus.length;
      }
      temp[0][i] = pus[0][j];
      counter++;
      i--;
      j--;
    }
    Arrays.stream(temp).forEach(System.out::println);
    return temp;
  }
  public void ax(){
    int i=0;
    Arrays.stream(temp).forEach(System.out::println);
    while (i !=7){
      System.out.println(temp[0][i]);
      i++;
    }
  }
}
