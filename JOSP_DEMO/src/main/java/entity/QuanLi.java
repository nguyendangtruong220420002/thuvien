package entity;

public class QuanLi {
private String Name;
private int phone;
private String diaChi;
private int soNha;
private String Duong;
private String Quan;
private String Tp;
public QuanLi() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return Name;
}
@Override
public String toString() {
	return "QuanLi [Name=" + Name + ", phone=" + phone + ", diaChi=" + diaChi + ", soNha=" + soNha + ", Duong=" + Duong
			+ ", Quan=" + Quan + ", Tp=" + Tp + "]";
}
public QuanLi(String name, int phone, int soNha, String duong, String quan, String tp) {
	super();
	Name = name;
	this.phone = phone;
	this.soNha = soNha;
	Duong = duong;
	Quan = quan;
	Tp = tp;
}
public void setName(String name) {
	Name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public int getSoNha() {
	return soNha;
}
public void setSoNha(int soNha) {
	this.soNha = soNha;
}
public String getDuong() {
	return Duong;
}
public void setDuong(String duong) {
	Duong = duong;
}
public String getQuan() {
	return Quan;
}
public void setQuan(String quan) {
	Quan = quan;
}
public String getTp() {
	return Tp;
}
public void setTp(String tp) {
	Tp = tp;
}
}
