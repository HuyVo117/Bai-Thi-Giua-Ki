package QL_PTGT;

public class Xe_Tai extends Xe {
private double Trong_Luong;

public Xe_Tai(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String color, double trong_Luong) {
	super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, color);
	this.Trong_Luong = trong_Luong;
}

@Override
public void showInfo() {
	super.showInfo();
	System.out.println("Trong luong : "+Trong_Luong);
}

}
