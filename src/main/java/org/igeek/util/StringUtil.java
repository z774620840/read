package org.igeek.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author J&Y
 *处理字符串
 */
public class StringUtil {
	/**
	 * 
	 * @param string
	 * @return
	 * 将权限拆分
	 */
	public static List<Integer> ParseToInteger(String string)
	{
		String strings[]=string.split(",");
		List<Integer> roles=new ArrayList<Integer>();
		for(int i=0;i<strings.length;i++)
		{
			roles.add(Integer.parseInt(strings[i]));
		}
		return roles;
	}
	
}
