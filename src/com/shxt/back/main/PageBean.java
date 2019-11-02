package com.shxt.back.main;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PageBean {
	public static void conMap(int pages,Map<String, Object> map,int num,HttpServletRequest request,Object obj){
		String name = obj.getClass().getSimpleName().toLowerCase();
		int beg = (pages-1)*5;
		map.put("beg", beg);
		map.put("pages", pages);
		map.put("num", num);
		map.put(name, obj);
		map.put("url", request.getServletPath().substring(1));
	}
	public static void serMap(Map<String, Object> map,int count,List<?> list,Class<?> clazz){
		String name = clazz.getSimpleName().toLowerCase();
		int num = Integer.parseInt(map.get("num").toString());
		int sumPage = (count%num==0)?(count/num):(count/num+1);
		map.put(name+"List", list);
		map.put("count", count);
		map.put("sumPage", sumPage);
	}
}
