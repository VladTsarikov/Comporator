package by.htp.applience.launcher;

import java.util.Arrays;

import by.htp.applience.entity.ElectricalAppliances;
import by.htp.applience.logic.Operations;
import by.htp.applience.logic.SortByName;
import by.htp.applience.logic.SortByPower;
import by.htp.applience.logic.SortByTime;

public class Main {

	public static void main(String[] args){
		ElectricalAppliances appliances[] = new ElectricalAppliances[4];
		appliances[0] = new ElectricalAppliances("Kettle",1500,1);
		appliances[1] = new ElectricalAppliances("MicrowaveOven",1200,0.5);
		appliances[2] = new ElectricalAppliances("Refrigerator",800,24);
		appliances[3] = new ElectricalAppliances("CoffeeMaker",1000,1.5);
		
		Operations apl = new Operations(appliances);
		apl.counUpPowerConsuption();
		apl.addAppliences(new ElectricalAppliances("ElectricStove",2500,2));
		apl.counUpPowerConsuption();
		apl.showAppliences();
		//apl.appliencesSort();
		//Arrays.sort(ElectricalAppliances.getAppliances(), new SortByName());
		//apl.showAppliences();
		//Arrays.sort(ElectricalAppliances.getAppliances(), new SortByPower());
		//apl.showAppliences();
		//Arrays.sort(ElectricalAppliances.getAppliances(), new SortByTime());
		//apl.showAppliences();
		//apl.findAppliences();
}
}
