import java.util.*;
public class Library{
	private char[][] lib;
    private char[][] clone1, clone2;
	public Library(){
		//System.out.println(Arrays.deepToString(fill()));
        lib = new char[8][8];
        clone1 = new char[8][8];
       	clone2 = new char[8][8];
	}
	public char[][] fill(){
       lib = new char[][]
               {{'0', '1', '2', '3', '4', '5', '6', '7'},
               {'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'},
               {'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'},
               {'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'},
               {'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd'},
               {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'},
               {'m', 'n', 'o', 'p', 'q', 'r', 's', 't'},
               {'u', 'v', 'w', 'x', 'y', 'z', '+', '-'}};
        return lib;
	}
	public char[][] cloning(){
		for (int i=0; i<lib.length; i++){
			for (int j=0; j<lib[i].length; j++){
								clone1[i][j] = lib[i][j];
            }
		}
		return clone1;
	}
	public char[][] cloning1(char[][] clone1,char[][] clone2){
		for (int i=0; i<lib.length; i++){
			for (int j=0; j<lib[i].length; j++){
								clone1[i][j] = clone2[i][j];
            }
		}
		return clone1;
	}
	public char[][] cloning2(char[][] clone2,char[][] clone1){
		for (int i=0; i<lib.length; i++){
			for (int j=0; j<lib[i].length; j++){
								clone2[i][j] = clone1[i][j];
            }
		}
		return clone2;
	}

	public char[][] getLib(){
		return fill();
	}
    public char[][] getBackupRow(){
        return cloning1(clone1, clone2);
    }
    public char[][] getBackupCol(){
        return cloning2(clone2, clone1);
    }
	public void displayLib(){
		for(int i=0; i<lib.length; i++){
			for(int j=0; j<lib[i].length; j++){
				System.out.print(lib[i][j]);
				if(j==lib[i].length-1)
				System.out.println();
			}
		}
	}
	public void displayClone(){
		for(int i=0; i<clone2.length; i++){
			for(int j=0; j<clone2[i].length; j++){
				System.out.print(clone2[i][j]);
				if(j==clone2[i].length-1)
				System.out.println();
			}
		}
	}
}

//NOTE: Method cloning() tidak dipakai.
