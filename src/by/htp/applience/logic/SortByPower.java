package by.htp.applience.logic;

import java.util.Comparator;

import by.htp.applience.entity.ElectricalAppliances;

public class SortByPower implements Comparator<ElectricalAppliances> {

	@Override
	public int compare(ElectricalAppliances arg0, ElectricalAppliances arg1) {
		int power1 = arg0.getPowerConsuption();
		int power2 = arg1.getPowerConsuption();
		if (power1 > power2) {
            return 1;
        } else if (power1 < power2) {
            return -1;
        } else {
            return 0;
        }
	}

}
