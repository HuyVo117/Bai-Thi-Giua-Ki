package QL_PTGT;

import java.io.Serializable;

public class Xe implements Xe_Interface,Serializable{
private static final long serialVersionUID=1L;
protected int ID;
protected String Hang_San_Xuat;
protected int Nam_San_Xuat;
protected double Gia_Ban;
protected String Color;
public Xe(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String color) {
	
	this.ID = iD;
	Hang_San_Xuat = hang_San_Xuat;
	Nam_San_Xuat = nam_San_Xuat;
	Gia_Ban = gia_Ban;
	Color = color;
}
@Override
public void showInfo() {
	System.out.println("ID: "+ID);
	System.out.println("Hang San Xuat: "+Hang_San_Xuat);
	System.out.println("Nam San Xuat: "+Nam_San_Xuat);
	System.out.println("Gia Ban: "+Gia_Ban);
	System.out.println("Mau Xe: "+Color);
}


}
