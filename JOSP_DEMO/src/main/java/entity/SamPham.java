package entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SamPham {
private int id;
@JsonProperty("Name")
private String Name;
private String loaiSP;
private List<String> xuatXu;	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLoaiSP() {
	return loaiSP;
}
public void setLoaiSP(String loaiSP) {
	this.loaiSP = loaiSP;
}
public List<String> getXuatXu() {
	return xuatXu;
}
public void setXuatXu(List<String> xuatXu) {
	this.xuatXu = xuatXu;
}
@Override
public String toString() {
	return "SamPham [id=" + id + ", Name=" + Name + ", loaiSP=" + loaiSP + ", xuatXu=" + xuatXu + "]";
}
public SamPham(int id, String name, String loaiSP, List<String> xuatXu) {
	super();
	this.id = id;
	Name = name;
	this.loaiSP = loaiSP;
	this.xuatXu = xuatXu;
}
public SamPham() {
	super();
	// TODO Auto-generated constructor stub
}
}
