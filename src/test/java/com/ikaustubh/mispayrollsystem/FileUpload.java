package com.ikaustubh.mispayrollsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class FileUpload {
	
	@Autowired
	//ExpenditureHelper expenditureHelper;
	
	@Test
	public void testFileUpload() throws FileNotFoundException {
		File file = new File("F:\\Kapil\\MIS\\Mumbai HQ 1_Data Entry_sheet.xlsx");
		InputStream fis=new FileInputStream(file);
		/*MultipartFile mltprt    
		expenditureHelper.uploadExpenditureDataFile( fis );*/
	}
}
