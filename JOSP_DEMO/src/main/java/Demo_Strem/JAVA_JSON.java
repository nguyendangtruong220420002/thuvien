package Demo_Strem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import entity.SamPham;
import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;

public class JAVA_JSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> xuatXuatList = Arrays.asList("Chia", "USA");
		SamPham samPham = new SamPham(1,"VT" , "DienTu", xuatXuatList);
		String json = toJson(samPham);
		PrintWriter out = new PrintWriter(new FileWriter("json/sampham.json"));
		out.println(json);
		out.close();
		System.out.println(json);
	}

	private static String toJson(SamPham samPham) {
		
		StringWriter writer = new StringWriter();
		JsonGenerator jsonGenerator = Json.createGenerator(writer);
		jsonGenerator.writeStartObject();
		jsonGenerator.write("id", samPham.getId());
		jsonGenerator.write("Name", samPham.getName());
		jsonGenerator.write("loaiSP", samPham.getLoaiSP());
		
		jsonGenerator.writeStartArray("xuatxu");
		for (String xx : samPham.getXuatXu()) {
			jsonGenerator.write(xx);
		}
		jsonGenerator.writeEnd();
		jsonGenerator.writeEnd();
		jsonGenerator.close();
;		
		return writer.toString();
		
	}
}
