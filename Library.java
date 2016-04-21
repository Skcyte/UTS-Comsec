import java.util.*;
public class Library{
	private char[][] lib;
    private char[][] backupRow, backupCol;
	public Library(){
		//System.out.println(Arrays.deepToString(fill()));
        lib = new char[8][8];
        backupRow = new char[8][8];
        backupCol = new char[8][8];
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
	public void cloning(){
		for (int i=0; i<lib.length; i++){
			for (int j=0; j<lib[i].length; j++){
				backupRow[i][j] = lib[i][j];
                backupCol[i][j] = lib[i][j];
            }
		}
		getBackupCol();
        getBackupRow();
	}
	public char[][] getLib(){
		return fill();
	}
    public char[][] getBackupRow(){
        return backupRow;
    }
    public char[][] getBackupCol(){
        return backupCol;
    }
	public void displayLib(){
		//Cuma cara teknik print tok
		Arrays.stream(lib).forEach(System.out::println);
		//System.out.println();
		//Arrays.stream(backupRow).forEach(System.out::println);
        //System.out.println();
        //Arrays.stream(backupCol).forEach(System.out::println);
	}
}

//NOTE: Method cloning() tidak dipakai.