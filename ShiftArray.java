import java.util.*;
public class ShiftArray{
  Library op = new Library();
  char[][] pus = op.getLib();
  public ShiftArray(){

  }
  public void shiftRightRow1(int x){
    int n = pus[0].length;
    char temp = pus[0][n-1];
    for(int j=n-1; j>=1; j--){
      pus[0][j] = pus[0][j-1];
      //if(j>=1)
       // j=n-1;
    }
    pus[0][0]=temp;
    Arrays.stream(pus).forEach(System.out::println);
  }
  public void shiftUpCol1(){
    int n = pus[0].length;
    char temp = pus[n-1][0];
    for (int j=n-1; j>=1; j--){
      pus[j][0] = pus [j-1][0];
    }
    pus[0][0] = temp;
    Arrays.stream(pus).forEach(System.out::println);
  }
}

//Iki model e tanpa cloning.