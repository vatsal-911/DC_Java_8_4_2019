package com.Testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Testing.Base.Base;

public class Screenshot extends Base {

	public static void CaptureScreenshot(ChromeDriver driver, String path) throws IOException {
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
		
	}
}
