import java.util.*;
public class Enkrip{
  ShiftArray go = new ShiftArray();
  private char[] key;
  private int[] tmpt;
  public Enkrip(){

  }
  public String inputan(){
    System.out.println("Masukkan key: (Panjangnya 8, nilainya 0-9)");
    Scanner sc = new Scanner(System.in);
    String key = sc.nextLine();
    return key;
  }
  public String inputPlain(){
    System.out.println("Masukkan plaintext. ");
    Scanner plain = new Scanner(System.in);
    String teks = plain.nextLine();
    return teks;
  }
  public int[] getValue(){
    tmpt = new int[8];
    String g = inputan();
      if(g.length()==8){
        for (int i=0; i<8 ;i++ ) {
          tmpt[i]=g.charAt(i);
          //System.out.println("Index" + i + "= " + tmpt[i]);
        }
      }
      else{
        System.out.println("Key kurang/lebih.");
      }
      return tmpt;
  }
  public void solved(){
    for (int i=0; i<8 ;i++ ) {
      go.shiftRight(i, tmpt[i]%8);
      //System.out.println();
      go.shiftDown(i, tmpt[i]%8);
    }
    go.cetakClone();
  }
  public void encrypted(){
    char[][] tempx, pus;
    go.getTempx();
    go.getPus();

  }
}
