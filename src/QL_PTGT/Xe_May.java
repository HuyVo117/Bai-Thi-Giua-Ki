package QL_PTGT;

public class Xe_May extends Xe{
private double Cong_Suat;

public Xe_May(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String color, double cong_Suat) {
	super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, color);
	this.Cong_Suat = cong_Suat;
}

@Override
public void showInfo() {
	super.showInfo();
	 System.out.println("Cong Suat: "+Cong_Suat);
}


}
