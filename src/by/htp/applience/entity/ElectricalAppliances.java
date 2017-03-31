package by.htp.applience.entity;
import java.util.Comparator;
import java.util.Scanner;


public class ElectricalAppliances {

	private String name;
	private int powerConsuption;
	private double useTime;


	public static ElectricalAppliances[] getAppliances() {
		return appliances;
	}

	public static void setAppliances(ElectricalAppliances[] appliances) {
		ElectricalAppliances.appliances = appliances;
	}

	private static ElectricalAppliances appliances[];
	
	public ElectricalAppliances(String name, int powerConsuption, double useTime) {
		this.name = name;
		this.powerConsuption = powerConsuption;
		this.useTime = useTime;
	}

	public ElectricalAppliances(ElectricalAppliances appliances[]) {
		this.appliances=appliances;
		}
	
	public static ElectricalAppliances getAppliences(int a) {
		return appliances[a];
	}
	
	public double getUseTime() {
		return useTime;
	}

	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}
	
	public int getPowerConsuption() {
		return powerConsuption;
	}

	public void setPowerConsuption(int powerConsuption) {
		this.powerConsuption = powerConsuption;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getLenth() {
		return appliances.length;
	}
	
	@Override
	public String toString() {
		return "ElectricalAppliances [name=" + getName() + ", powerConsuption="
				+ getPowerConsuption() + "]";
	}
}
	

