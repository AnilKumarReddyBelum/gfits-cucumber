package com.gsyw.gfits.utils;

import java.io.File;

import com.gsyw.gfits.constants.BrowserDriver;

public class ChromeBrowserDriverPath implements DriverPath {

	public String getPath() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(BrowserDriver.CHROME_DRIVER.getExeFileName()).getFile());
		return file.getAbsolutePath();
	}

}
