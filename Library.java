import java.util.*;
public class Library{
	private char[][] lib;
	private char[][] backup;
	public Library(){
		//System.out.println(Arrays.deepToString(fill()));
		lib = new char[8][8];
	}
	public char[][] fill(){
		return new char[][]{ 	{'0','1','2','3','4','5','6','7'},
											{'8','9','A','B','C','D','E','F'},
										 	{'G','H','I','J','K','L','M','N'},
											{'O','P','Q','R','S','T','U','V'},
											{'W','X','Y','Z','a','b','c','d'},
											{'e','f','g','h','i','j','k','l'},
											{'m','n','o','p','q','r','s','t'},
											{'u','v','w','x','y','z','+','-'} };
	}
	public char[][] cloning(){
		char[][] backup = new char[lib.length][];
		for (int i=0; i<lib.length ;i++ ) {
			backup[i] = Arrays.copyOf(lib[i], lib[i].length);
		}
		return backup;
	}
	public char[][] getLib(){
		return fill();
	}
	public void displayLib(){
		//Cuma cara teknik print tok
		Arrays.stream(fill()).forEach(System.out::println);
	}
}
