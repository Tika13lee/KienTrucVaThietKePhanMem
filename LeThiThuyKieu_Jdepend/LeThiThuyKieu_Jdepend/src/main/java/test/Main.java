package test;

import java.io.IOException;
import java.io.PrintWriter;

import jdepend.xmlui.JDepend;

/**
 * @author: Le Thi Thuy Kieu
 * @date: Mar 7, 2024
 * @description:
 * 
 **/

public class Main {
	public static void main(String[] args) throws IOException {
		JDepend depend = new JDepend(new PrintWriter("report/report.xml"));
		depend.addDirectory("D:\\KT_TKPM\\ThucHanh\\LeThiThuyKieu_Jdepend\\Library-Assistant-master");
		depend.analyze();
		System.out.println("DONE");
	}
}
