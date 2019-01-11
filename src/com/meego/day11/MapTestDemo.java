/**
* Filename : MapTestDemo.java
* Author : huyn
* Creation time : 下午10:00:03 - 2019年1月9日
* Description :
*/
package com.meego.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String>  map = new HashMap<Integer,String>();
		map.put(100, "tom100");
		map.put(200, "tom200");
		map.put(300, "tom300");
		
		System.out.println(map.size());
		
		//迭代map
		Set<Entry<Integer,String>> entrys = map.entrySet();
		for(Entry<Integer, String> entry : entrys){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "---" + value);
			
		}
		
		System.out.println(map.get(100));
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys){
			System.out.println(key + "---" + map.get(key));
		}
		System.out.println(map.remove(100));
		

	}

}
