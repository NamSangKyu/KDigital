package log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintLog {
	private static PrintLog instance = new PrintLog();
	private FileWriter fw;
	private PrintWriter pw;
	
	private PrintLog() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		File file = new File(sdf.format(cal.getTime())+".txt");
		try {
			fw = new FileWriter(file,true);
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printLog(String msg) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		msg = sdf.format(cal.getTime())+"_"+msg;
		pw.println(msg);
		pw.flush();
	}
	
	public void close() {
		try {
			if(pw!=null)pw.close();
			if(fw!=null)fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static PrintLog getInstance() {
		if(instance == null)
			instance = new PrintLog();
		return instance;
	}

}







