package by.htp.applience.logic;

import java.util.Comparator;

import by.htp.applience.entity.ElectricalAppliances;

public class SortByName implements Comparator<ElectricalAppliances> {

	@Override
	public int compare(ElectricalAppliances o1, ElectricalAppliances o2) {
		
		String str1 = o1.getName();
        String str2 = o2.getName();
       
        return str1.compareTo(str2);
        
	}

}
