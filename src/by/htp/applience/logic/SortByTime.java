package by.htp.applience.logic;

import java.util.Comparator;

import by.htp.applience.entity.ElectricalAppliances;

public class SortByTime implements Comparator<ElectricalAppliances> {

	@Override
	public int compare(ElectricalAppliances arg0, ElectricalAppliances arg1) {
		double time1 = arg0.getPowerConsuption();
		double time2 = arg1.getPowerConsuption();
		if (time1 > time2) {
            return 1;
        } else if (time1 < time2) {
            return -1;
        } else {
            return 0;
        }
	}
}
