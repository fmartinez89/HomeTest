package utils;

import java.io.File;
import java.util.List;

/**
* This class has the methods to manage files
*
* @author  Fernando Martinez
* @version 1.0
*/
public class FileDownloader {

	/**
	
	 * This method checks if all of the files that belong to the fileList
	 * exist into the downloadPath 
	 *
	 * @param  downloadPath Path where you want to search the files
	 * @param  fileList List of files to be searched into the path
	 * @return      boolean
	 */
	public static boolean isFileDownloaded(String downloadPath, List<String> fileList) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	for(String fileName : fileList) {
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().contains(fileName))
	            return flag=true;
	            }
	  	}
	    return flag;
	}
	
}
