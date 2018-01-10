package org.igeek.util;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.igeek.Rbac.Rbac;


public class RabcUtil {

	public static void parseAaction(String Package)
	{
		try {
			HashMap<Integer,String> roleTable=new HashMap<>();
			int ruleId=1;
			//根据包名获取包下所有的类
			List<String> classes=PackageUtil.searchClass("org.PMS.web.cn");
			//System.out.println(classes);
			for(String className:classes)
			{
				Class<?> c = Class.forName(className);
				Annotation[] annotations=c.getDeclaredAnnotations();
				for(Annotation annotation:annotations){
					if(annotation instanceof Rbac){  //instanceof  就是当前实例是否属于  后边参数的实例 或者后边参数子类的实例
						Rbac rbacAnnotation=(Rbac) annotation;
						String url=rbacAnnotation.url();
						String name=rbacAnnotation.name();
						int[] classRoles=rbacAnnotation.role();
						//后面需要将这条语句转换为SQL插入到数据库表rules
						System.out.printf("rule_id:%d name:%s url:%s\n",ruleId,name,url);

						//将角色具有权限的rule的编号拼接成逗号分隔的字符串，存放到HashMap
						for(int role:classRoles){
							if(roleTable.containsKey(role)){
								String s=roleTable.get(role);
								roleTable.put(role, s+","+ruleId);
							}else{
								roleTable.put(role, String.valueOf(ruleId));
							}
						}
						ruleId++;
					}
				}
			}
			//后面需要将下面的输出语句转换为SQL插入到数据库表Roles
			Set<Integer> roleIds = roleTable.keySet();
			for(int roleId:roleIds){
				System.out.printf("role_id:%d rules:%s\n",roleId,roleTable.get(roleId));
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
