package com.pipihi.jzip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Zip {
	
	private Zip mZip;
	
	public static final int UNZIP_ZIP_FILE_PATH_ERROR = 0;
	
	private Zip(){}
	
	public Zip getInstatnce() {
		if(mZip == null) {
			mZip = new Zip();
		}
		return mZip;
	}
	
	public int unzip(String zipFilePath, String toDir) {
		ZipFile file = null;
		try {
			file = new ZipFile(zipFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
