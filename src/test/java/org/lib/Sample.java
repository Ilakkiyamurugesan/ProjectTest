package org.lib;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Sample extends LibGlobal {
	public static void main(String[] args) throws IOException {
		Sample s=new Sample();
		s.browserconfig();
		s.openurl("http://adactinhotelapp.com/");
		WebElement txtname = s.locateById("username");
		s.type(txtname,s.excelread("C:\\Users\\Ilakkiya\\eclipse-workspace\\MarvenPjt\\Excel\\Employee details.xlsx", "Sheet1",1, 1));
		WebElement pass = s.locateById("password");
		s.type(pass, s.excelread("C:\\Users\\Ilakkiya\\eclipse-workspace\\MarvenPjt\\Excel\\Employee details.xlsx", "Sheet1", 1, 2));
		WebElement btnlogin = s.locateByName("login");
		s.click(btnlogin);
	}

	

		
	
}
