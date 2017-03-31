package by.htp.applience.logic;
import java.util.Scanner;

import by.htp.applience.entity.ElectricalAppliances;


public class Operations extends ElectricalAppliances {

public Operations(ElectricalAppliances[] appliances) {
		super(appliances);
		// TODO Auto-generated constructor stub
	}

public static void addAppliences(ElectricalAppliances aplnc){
	
	ElectricalAppliances newAppliances[] = new ElectricalAppliances[getLenth()+1];
	for(int i =0; i<getLenth(); i++){
		newAppliances[i] = getAppliences(i);
	}
	newAppliances[getLenth()] = aplnc;
	ElectricalAppliances.setAppliances(newAppliances);
	
}

public static void showAppliences(){
	for(int j = 0; j < getLenth();j++){
		System.out.println(getAppliences(j).toString());
}

}

public double counUpPowerConsuption(){
	double p =0;
	for(int k = 0; k < getLenth();k++){
		p = p + getAppliences(k).getPowerConsuption()*getAppliences(k).getUseTime();
}
	System.out.println("Потребляемая мощность: " + p);
	return p;
}

public void findAppliences(){

	System.out.println("Введите интервал мощности электроприбора: ");
	Scanner s1 = new Scanner(System.in);
	int f = s1.nextInt();
	Scanner s2 = new Scanner(System.in);
	int l = s2.nextInt();
	for(int i = 0; i < getLenth(); i++){
		if(getAppliences(i).getPowerConsuption()>=f && getAppliences(i).getPowerConsuption()<=l){
			System.out.println(getAppliences(i).getName());
		}
	}
}

/*public void appliencesSort() {
	
	for(int b = 1; b < getLenth(); b++)
	      for(int d = getLenth() - 1; d >= b; d--) {
	        if(getAppliences(d-1).getPowerConsuption() > getAppliences(d).getPowerConsuption()) { 
	                                          
	          ElectricalAppliances t = getAppliences(d-1);
	          ElectricalAppliances n = getAppliences(d);
	          //getAppliences(d-1) = getAppliences(d);
	          //getAppliences(d)= t;
	      }
	    }
		
	System.out.print("Сортировка массива по возрастанию: ");
    for(int i = 0; i < getLenth(); i++)
      System.out.print(" " + getAppliences(i));
    System.out.println();
}*/
}
