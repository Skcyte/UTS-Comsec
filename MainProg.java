import java.util.*;
public class MainProg{
  public static void main(String[] args) {
    Library on = new Library();
    ShiftArray mov = new ShiftArray();
    on.fill();
    on.cloning();
    on.displayLib();
    System.out.println();
    mov.shiftRightRow1(2);
    System.out.println();
    mov.shiftUpCol1(1);
  }
}
