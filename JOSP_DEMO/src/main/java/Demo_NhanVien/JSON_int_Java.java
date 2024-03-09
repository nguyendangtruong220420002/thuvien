package Demo_NhanVien;

import java.io.StringReader;


import entity.NhanVien;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class JSON_int_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String json = "{\"firstName\":\"Nguyen\", \"lastName\":\"Truong\",\"age\":20,\"diachi\":\"CaMau\",\"email\":\"truong@gamil.com\"}";
		NhanVien nhanVien = fromJson(json);
		System.out.println(nhanVien);

	}
	private static NhanVien fromJson(String json) {
		StringReader s = new StringReader(json);
		JsonReader reader = Json.createReader(s);
		JsonObject jo = reader.readObject();
		return new NhanVien(jo.getString("firstName"),
				jo.getString("lastName"),jo.getInt("age"),jo.getString("diachi"),jo.getString("email"));
		}
}
