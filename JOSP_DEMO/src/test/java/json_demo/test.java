package json_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Demo_QuanLi.JAVA_JSON;
import entity.QuanLi;

public class test {
	@Test
	@DisplayName("testQuanLi")
	void testQuanLi() {
		QuanLi quanLi = new QuanLi("NguyenDangTruong", 012456, 300 , "LyThuongKiet", "Quan11", "Tp.HoChiMinh");
		String string = JAVA_JSON.toJson(quanLi);
			assertEquals("NguyenDangTruong", quanLi.getName(), " Name mong doi");
			assertEquals(012456, quanLi.getPhone(), " Phone mong doi");
			assertEquals(300, quanLi.getSoNha(), " SoNha mong doi");
			assertEquals("LyThuongKiet", quanLi.getDuong(), " Duong mong doi");
			assertEquals("Quan11", quanLi.getQuan(), " Quan mong doi");
			assertEquals("Tp.HoChiMinh", quanLi.getTp(), " Tp mong doi");
			
			System.out.println("TestQuali: PASSED");
		
	}
}

