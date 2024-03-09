package Demo_QuanLi;

import java.io.StringReader;

import entity.QuanLi;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class JSON_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "{\"Name\":\"NguyenDangTruong\",\"phone\":12346,"
				+ "\"diaChi\":[{\"soNha\":300,\"Duong\":\"LyThuongKiet\",\"Quan\":\"Quan11\",\"Tp\":\"Tp.HoChiMinh\"}]}";
		QuanLi quanLi = fromJson(json);
		System.out.println(quanLi);
	}
	private static QuanLi fromJson(String json) {
		StringReader s = new StringReader(json);
		JsonReader reader = Json.createReader(s);
		JsonObject jo = reader.readObject();
		JsonObject diaChi = jo.getJsonArray("diaChi").getJsonObject(0);
		return new QuanLi(jo.getString("Name"),jo.getInt("phone")
				,diaChi.getInt("soNha"),diaChi.getString("Duong"),diaChi.getString("Quan"),diaChi.getString("Tp"));
		}
}
