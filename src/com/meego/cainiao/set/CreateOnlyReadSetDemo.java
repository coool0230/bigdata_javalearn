/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午3:05:04 
* @Des:使用 Collection 类的 Collections.unmodifiableList() 方法来设置集合为只读
*/ 

package com.meego.cainiao.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreateOnlyReadSetDemo {

	public static void main(String[] args) {
		List init_list = Arrays.asList(new String[] {"aaa","bbb","ccc"});
		List ll = Arrays.asList(init_list);
		System.out.println(ll);
		ll = Collections.unmodifiableList(ll);
		try {
			ll.set(0, "999");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Set hs_init_set = new HashSet(init_list);
		hs_init_set = Collections.unmodifiableSet(hs_init_set);
		System.out.println(hs_init_set);
		
		Map hs_init_map = new HashMap();
		hs_init_map = Collections.unmodifiableMap(hs_init_map);
		try {
			hs_init_map.put("qqq", "12237");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

