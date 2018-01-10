package org.igeek.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author J&Y
 *
 */
public class PackageUtil { 

	static List<String> classPaths = new ArrayList<String>();
	public static List<String> searchClass(String packageName) throws ClassNotFoundException {
		String basePack = packageName;
		//先把包名转换为路径,首先得到项目的classpath
		String classpath = PackageUtil.class.getResource("/").getPath();
		//然后把我们的包名basPach转换为路径名
		basePack = basePack.replace(".", File.separator);
		//然后把classpath和basePack合并
		String searchPath = classpath + basePack;
		doPath(new File(searchPath));
		//这个时候我们已经得到了指定包下所有的类的绝对路径了。我们现在利用这些绝对路径和java的反射机制得到他们的类对象
		List<String> classes=new ArrayList<String>();
		for (String s : classPaths) {
			//把 D:\work\code\20170401\search-class\target\classes\com\baibin\search\a\A.class 这样的绝对路径转换为全类名com.baibin.search.a.A
			s = s.replace(classpath.replace("/","\\").replaceFirst("\\\\",""),"").replace("\\",".").replace(".class","");
			classes.add(s);
		}
		return classes;
	}

	/**
	 * 该方法会得到所有的类，将类的绝对路径写入到classPaths中
	 * @param file
	 */
	private static void doPath(File file) {
		if (file.isDirectory()) {//文件夹
			//文件夹我们就递归
			File[] files = file.listFiles();
			for (File f1 : files) {
				doPath(f1);
			}
		} else {//标准文件
			//标准文件我们就判断是否是class文件
			if (file.getName().endsWith(".class")) {
				//如果是class文件我们就放入我们的集合中。
				classPaths.add(file.getPath());
			}
		}
	}
}