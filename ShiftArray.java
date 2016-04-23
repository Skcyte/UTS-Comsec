
import java.util.*;
public class ShiftArray {
  Library op = new Library();
  char[][] pus, temp, tempx;

  public ShiftArray() {
      pus = op.getLib();
      temp = op.getLib();
      tempx = op.getLib();
  }
  public char[][] shiftRight(int index, int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus[0].length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n-1 )
        i = 0;
      temp[index][i] = tempx[index][j];
      counter++;
      i++;
      j++;
    }
    op.cloning1(tempx, temp);
    //Arrays.stream(temp).forEach(System.out::println);
    return temp;
  }

  public char[][] shiftDown(int index, int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus[0].length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n-1 )
        i = 0;
      tempx[i][index] = temp[j][index];
      counter++;
      i++;
      j++;
    }
    op.cloning2(temp, tempx);
    //Arrays.stream(tempx).forEach(System.out::println);
    return tempx;
  }
  public char[][] shiftLeftRow(int x){
    int counter = 0;
    int j = pus.length;
    int i = (x % pus.length) - x;
    int n = pus[0].length;
    while (counter != n) {
      if (i <= 0)
        i = pus.length;

      temp[0][i] = pus[0][j];
      counter++;
      i--;
      j--;
    }
    Arrays.stream(temp).forEach(System.out::println);
    return temp;
  }
  public void getPus(){
    return pus;
  }
  public void getTemp(){
    return temp;
  }
  public void getTempx(){
    return tempx;
  }
  public void cetakClone(){
    Arrays.stream(tempx).forEach(System.out::println);
  }
}
