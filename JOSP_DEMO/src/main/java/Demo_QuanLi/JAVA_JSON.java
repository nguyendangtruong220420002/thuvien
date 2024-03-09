package Demo_QuanLi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import entity.QuanLi;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
public class JAVA_JSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		QuanLi quanLi = new QuanLi("NguyenDangTruong", 012456, 300 , "LyThuongKiet", "Quan11", "Tp.HoChiMinh");
		String json = toJson(quanLi);
		PrintWriter out = new PrintWriter(new FileWriter("json/quanli.json"));
		out.println(json);
		out.close();
		System.out.println(json);
	}
	public static String toJson (QuanLi quanLi) {
		JsonArrayBuilder jsonBuilder = Json.createArrayBuilder();
		jsonBuilder.add(Json.createObjectBuilder()
				.add("Name",quanLi.getName())
				.add("phone", quanLi.getPhone())
				.add("diaChi", Json.createArrayBuilder()
						.add(Json.createObjectBuilder()
						.add("soNha", quanLi.getSoNha())
						.add("Duong", quanLi.getDuong())
						.add("Quan", quanLi.getQuan())
						.add("Tp", quanLi.getTp())
						)));
			JsonArray jo = jsonBuilder.build();
			StringWriter writer = new StringWriter();
			Json.createWriter(writer).write(jo);			
		return writer.toString();
	}
	
}
