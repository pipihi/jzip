package com.pipihi.jzip;

import java.io.IOException;
import java.util.zip.ZipFile;

public class Zip {
	public static final int UNZIP_ZIP_FILE_PATH_ERROR = 0;
	public int unzip(String zipFilePath, String toDir) {
		ZipFile file;
		try {
			file = new ZipFile(zipFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
