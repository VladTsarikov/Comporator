package by.htp.applience.logic;
import java.util.Scanner;

import by.htp.applience.entity.ElectricalAppliances;


public class Operations extends ElectricalAppliances {

public Operations(ElectricalAppliances[] appliances) {
		super(appliances);
		// TODO Auto-generated constructor stub
	}

public static void addAppliences(ElectricalAppliances aplnc){
	
	ElectricalAppliances newAppliances[] = new ElectricalAppliances[appliances.length+1];
	for(int i =0; i<appliances.length; i++){
		newAppliances[i] = appliances[i];
	}
	newAppliances[appliances.length] = aplnc;
	appliances = newAppliances;
}


public static void showAppliences(){
	for(int j = 0; j < appliances.length;j++){
		System.out.println(appliances[j].toString());
}
	;
}

public double counUpPowerConsuption(){
	double p =0;
	for(int k = 0; k < appliances.length;k++){
		p = p + appliances[k].getPowerConsuption()*appliances[k].getUseTime();
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
	for(int i = 0; i < appliances.length; i++){
		if(appliances[i].getPowerConsuption()>=f && appliances[i].getPowerConsuption()<=l){
			System.out.println(appliances[i].getName());
		}
	}
}

public void appliencesSort() {
	
	for(int b = 1; b < appliances.length; b++)
	      for(int d = appliances.length - 1; d >= b; d--) {
	        if(appliances[d - 1].getPowerConsuption() > appliances[d].getPowerConsuption()) { 
	                                          
	          ElectricalAppliances t = appliances[d - 1];
	          appliances[d - 1] = appliances[d];
	          appliances[d] = t;
	      }
	    }
		
	System.out.print("Сортировка массива по возрастанию: ");
    for(int i = 0; i < appliances.length; i++)
      System.out.print(" " + appliances[i]);
    System.out.println();
}
}
