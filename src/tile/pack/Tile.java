package tile.pack;
import java.util.*;

import units.pack.Units;


public class Tile {
	private List<Units> unitList;
	public Tile() {
		unitList=new ArrayList<>();
	}
	public  void removeUnit(Units unit) {
		unitList.remove(unit);
	}
	
	public  void removeUnits() {
		unitList.clear();
	}
	

	public void add(Units unit) {
		unitList.add(unit);
		
	}

	public  List<Units> getUnitList() {
		return unitList;
	}
	

}
