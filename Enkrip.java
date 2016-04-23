import java.util.*;
public class Enkrip{
  ShiftArray go = new ShiftArray();
  private char[] key, teks;
  private int[] tmpt;
  private char[][] tempx, pus;
  public Enkrip(){
    teks = new char[100];
  }
  public String inputKey(){
    System.out.println("Masukkan key: (Panjangnya 8, nilainya 0-9)");
    Scanner sc = new Scanner(System.in);
    String key = sc.nextLine();
    return key;
  }
  public String inputPlain(){
    System.out.println("Masukkan plaintext. ");
    Scanner plain = new Scanner(System.in);
    String teks = plain.nextLine();
    teks = teks.replaceAll("\\s", "");
    return teks;
  }
  public char[] getTeks(){
    return teks;
  }
  public int[] getValue(){
    tmpt = new int[8];
    String g = inputKey();
      if(g.length()==8){
        for (int i=0; i<8 ;i++ ) {
          tmpt[i]=g.charAt(i);
        }
      }
      else if(g.length()>8 || g.length()<8){
        System.out.println("Key kurang/lebih.");
      }
      return tmpt;
  }
  public void encrLib(){
    for (int i=0; i<8 ;i++ ) {
      int x = tmpt[i] % tmpt.length;
      go.shiftRight(i, x);
      go.shiftDown(i, x);
    }
    //go.cetakClone();
    System.out.println(teks);
  }
  public void swap(){
    encrLib();
    inputPlain();
    go.getPus();
    go.getTempx();
    int count=0;
    while(count != teks.length){
      //py corone setiap index teks di cek di array asli (library)
      //if value index teks == value index array asli (library)
      //print value encryptedlib
      count++;
    }
      System.out.print(teks);
  }
  public void encrypted(){
    getValue();
    swap();
  }
}
