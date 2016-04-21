import java.util.*;
public class ShiftArray {
  Library op = new Library();
  char[][] pus = op.getLib();
  char[][] temp = op.getLib();
  char[][] tempx = op.getLib();

  public ShiftArray() {

  }

  public char[][] shiftRightRow1(int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus.length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n - 1) {
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

  public char[][] shiftUpCol1(int x) {
    int counter = 0;
    int j = 0;
    int i = x % pus.length;
    int n = pus[0].length;
    while (counter != n) {
      if (i > n - 1) {
        i = 0;
      }
      tempx[i][0] = temp[j][0];
      counter++;
      i++;
      j++;
    }
    Arrays.stream(tempx).forEach(System.out::println);
    return tempx;
  }
}
