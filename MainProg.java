import java.util.*;
public class MainProg{
  public static void main(String[] args) {
    Library on = new Library();
    ShiftArray mov = new ShiftArray();
    on.fill();
    //on.cloning();
    //on.displayLib();
    mov.shiftDownCol(1);
    System.out.println();
    mov.shiftRightRow(2);
    System.out.println();
    //mov.ax();

  }
}
