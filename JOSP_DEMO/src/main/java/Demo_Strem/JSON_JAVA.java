package Demo_Strem;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import entity.SamPham;

public class JSON_JAVA {

	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		 String jsonString = "{\"id\":1,\"Name\":\"VT\",\"loaiSP\":\"DienTu\",\"xuatXu\":[\"China\",\"USA\"]}";

		ObjectMapper objectMapper = new ObjectMapper();
		// tuần tự hóa JSON thành đối tượng SamPham
		SamPham samPham= objectMapper.readValue(jsonString, SamPham.class);
		 System.out.println(samPham);
	}

}
