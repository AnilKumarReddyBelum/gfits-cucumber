package com.gsyw.gfits.constants;

public enum BrowserDriver {

	CHROME_DRIVER("chromedriver.exe");

	BrowserDriver(String exeFileName) {
		this.exeFileName = exeFileName;
	}

	String exeFileName;

	public String getExeFileName() {
		return exeFileName;
	}

}
