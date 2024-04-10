package QL_PTGT;

public class Oto extends Xe {
private int So_Cho_Ngoi;
private String Kieu_Dong_Co;
public Oto(int iD, String hang_San_Xuat, int nam_San_Xuat, double gia_Ban, String color, int so_Cho_Ngoi,
		String kieu_Dong_Co) {
	super(iD, hang_San_Xuat, nam_San_Xuat, gia_Ban, color);
	this.So_Cho_Ngoi = so_Cho_Ngoi;
	this.Kieu_Dong_Co = kieu_Dong_Co;
}
@Override
public void showInfo() {
	 super.showInfo();
	 System.out.println("So Cho Ngoi: "+So_Cho_Ngoi);
	 System.out.println("Kieu Dong Co: "+Kieu_Dong_Co);
}

}
