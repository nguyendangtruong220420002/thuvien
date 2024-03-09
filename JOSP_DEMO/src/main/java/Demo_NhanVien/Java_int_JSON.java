package Demo_NhanVien;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import entity.NhanVien;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;


public class Java_int_JSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		NhanVien nhanVien = new NhanVien("Nguyen","Truong",24,null, "HoChiMinh");
		NhanVien nhanVien2 = new NhanVien("Nguyen","Truong",24,"truong@gmail.com", "HoChiMinh");
		
		String json = toJson(nhanVien2);
		//file
		PrintWriter out = new PrintWriter(new FileWriter("json/nhanvien2.json"));
		out.println(json);
		out.close();
		
		System.out.println(json);
	}
	private static String toJson( NhanVien nhanVien) {
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("firstName", nhanVien.getFirstName())
				.add("lastName", nhanVien.getLastName())
				.add("age", nhanVien.getAge())
				.add("diachi", nhanVien.getDiachi());
				if(nhanVien.getEmail() == null)
					builder.addNull("email");
				else
					builder.add("email", nhanVien.getEmail());
				JsonObject jo = builder.build();
				
				StringWriter writer = new StringWriter();
		        Json.createWriter(writer).write(jo);
		    return writer.toString();
	}

}
