/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午2:03:39 
* @Des:使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序
* vt.洗牌;曳脚而行;搬移;搁置，随手放
* vi.推诿;曳脚走;跳曳步舞;移动
* n.洗牌，混乱，蒙混;拖着脚走
*/ 

package com.meego.cainiao.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpsetElementSetDemo {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		for(int i  = 0;i < 10;i ++) {
			ll.add(i);
		}
		System.out.println(ll);
		for(int j = 1;j <= 6;j ++) {
			Collections.shuffle(ll);
			System.out.println("第"+j + "次打乱后后:"+ll);
		}
		
	}

}

