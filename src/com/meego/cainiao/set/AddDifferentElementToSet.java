/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午4:43:13 
* @Des:在集合类中添加不同类型的元素
*/ 

package com.meego.cainiao.set;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class AddDifferentElementToSet {

	public static void main(String[] args) {
		List lnkLst  = new LinkedList();
		lnkLst.add("element1");
		lnkLst.add("element2");
		lnkLst.add("element3");
		lnkLst.add("element4");
		displayAll(lnkLst);
		
		List aryLst = new ArrayList();
		aryLst.add("x");
		aryLst.add("y");
		aryLst.add("z");
		aryLst.add("q");
		displayAll(aryLst);
		
		
		HashSet hshSet = new HashSet();
		hshSet.add("1");
		hshSet.add("2");
		hshSet.add("3");
		hshSet.add("4");
		displayAll(hshSet);
		
		
		TreeSet srtSet = new TreeSet();
		srtSet.add("srtSet1");
		srtSet.add("srtSet2");
		srtSet.add("srtSet3");
		srtSet.add("srtSet4");
		displayAll(srtSet);
		
		
		LinkedHashSet lnkHshSet = new LinkedHashSet();
		lnkHshSet.add("lnkHshSet1");
		lnkHshSet.add("lnkHshSet2");
		lnkHshSet.add("lnkHshSet3");
		lnkHshSet.add("lnkHshSet4");
		displayAll(lnkHshSet);
		
		
		Map mapDemo1 = new HashMap();
		mapDemo1.put("1", "one");
		mapDemo1.put("2", "two");
		mapDemo1.put("3", "three");
		mapDemo1.put("4", "four");
		displayAll(mapDemo1.values());
		displayAll(mapDemo1.keySet());
		
		SortedMap srtMap = new TreeMap();
		srtMap.put("srtMap_1", "srtMap_one");
		srtMap.put("srtMap_2", "srtMap_two");
		srtMap.put("srtMap_3", "srtMap_three");
		srtMap.put("srtMap_4", "srtMap_four");
		displayAll(srtMap.values());
		displayAll(srtMap.keySet());
		
		
		LinkedHashMap lnkHashMap = new LinkedHashMap();
		
		lnkHashMap.put("lnkHashMap_1", "lnkHashMap_one");
		lnkHashMap.put("lnkHashMap_2", "lnkHashMap_two");
		lnkHashMap.put("lnkHashMap_3", "lnkHashMap_three");
		lnkHashMap.put("lnkHashMap_4", "lnkHashMap_four");
		displayAll(lnkHashMap.values());
		displayAll(lnkHashMap.keySet());
		
		
		

	}
	static void displayAll(Collection col) {
		Iterator iter = col.iterator();
		while(iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str + "");
		}
		System.out.println("");
	}

}

