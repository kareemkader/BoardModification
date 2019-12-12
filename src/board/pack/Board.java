package board.pack;
import tile.pack.*;
import java.util.*;
import units.pack.Units;

public class Board {
	//Borad Class

	private int height,width,Xposition,Yposition;
	private Tile[][]tiles ;
	
	public Board(int height,int width ) {
		this.height=height;
		this.width=width;
		Xposition=width-1;
		Yposition=height-1;
		tiles=new Tile[Xposition][Yposition];
		initialize();
		
	}
	
	public void initialize() {
		for (int i = 0; i < Xposition; i++) {
			for (int j=0;j<Yposition;j++) {
				tiles[i][j]=new Tile();
			}
		}
	}
	public void addTileAtGivenPosition(int h,int w,Units unit) {
		tiles[h][w]=new Tile();
	}
	public Tile getTileAtGivenPostion(int Xpos,int Ypos) {
		return tiles[Xpos][Ypos];
	}
	
	public void addUnitsToATile(int x,int y,Units unit)
	{
		Tile tile=getTileAtGivenPostion(x, y);
		tile.add(unit);
	}
	
	public void removeUnitFromTile(int x,int y,Units unit) {
		Tile tile=getTileAtGivenPostion(x, y);
		tile.removeUnit(unit);
	}
	
	public void removeAllUnitsFromTile(int x,int y) {
		Tile tile=getTileAtGivenPostion(x, y);
		tile.removeUnits();
	}
	
	public List<Units> getUnits(int x,int y){
		Tile tile=getTileAtGivenPostion(x, y);
		return tile.getUnitList();
	}
	
	 public void printRectangle(int h, int w) 
	    { 
		 
		 
		 for (int i = 0; i < h; i++) 
	        { 
	            System.out.println(); 
	            for (int j = 0; j < w; j++) 
	            { 
	                // Print @ if this is first  
	                // row or last row. Or this 
	                // column is first or last. 
	                if (i == 0 || i == h-1 || 
	                    j== 0 || j == w-1) 
	                   System.out.print("@"); 
	                else
	                {
	                	
	                	
	                for(Units result:getTileAtGivenPostion(j-1, i-1).getUnitList()) {
//	                	   System.out.print(result.getUnitValue());
	                	   }
	                	}
	                }
	        } 
 
	    } 
	
	@Override
	public String toString() {
		
		printRectangle(height, width);
		return "\n final result";
		
		
		
		
	}
}