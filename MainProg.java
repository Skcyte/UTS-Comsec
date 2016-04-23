import java.util.*;
public class MainProg{
  public static void main(String[] args) {
    Library on = new Library();
    ShiftArray mov = new ShiftArray();
    on.fill();
    on.cloning();
    //on.cloning2();
    //on.displayLib();
    /*for(int i=0;i<8;i++){
    mov.shiftRight(i,i);
    mov.shiftDown(i,i);
    System.out.println();*/
    Enkrip baru = new Enkrip();
    baru.encrypted();
    //}
  }
}
