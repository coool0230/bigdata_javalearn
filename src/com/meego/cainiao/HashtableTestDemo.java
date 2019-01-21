/** 
* @author:huyn 
* @version 创建时间：2019年1月18日 上午9:27:10 
* @Des:Hashtable是原始的java.util的一部分， 是一个Dictionary具体的实现 。
* 然而，Java 2 重构的Hashtable实现了Map接口，因此，Hashtable现在集成到了集合框架中。它和HashMap类很相似，但是它支持同步。
* 像HashMap一样，Hashtable在哈希表中存储键/值对。当使用一个哈希表，要指定用作键的对象，以及要链接到该键的值。
* 然后，该键经过哈希处理，所得到的散列码被用作存储在该表中值的索引。
* 	Hashtable定义了四个构造方法。第一个是默认构造方法：Hashtable()
* 	第二个构造函数创建指定大小的哈希表：				Hashtable(int size)
* 	第三个构造方法创建了一个指定大小的哈希表，并且通过fillRatio指定填充比例。
* 	填充比例必须介于0.0和1.0之间，它决定了哈希表在重新调整大小之前的充满程度：Hashtable(int size,float fillRatio)
* 	第四个构造方法创建了一个以M中元素为初始化元素的哈希表。
*	哈希表的容量被设置为M的两倍。：Hashtable(Map m)
*/ 

package com.meego.cainiao;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTestDemo {

	public static void main(String[] args) {
	      // Create a hash map
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;
	      //Object put(Object key, Object value)
	      //将指定 key 映射到此哈希表中的指定 value。
	      balance.put("Zara", new Double(3434.34));
	      balance.put("Mahnaz", new Double(123.22));
	      balance.put("Ayan", new Double(1378.00));
	      balance.put("Daisy", new Double(99.22));
	      balance.put("Qadir", new Double(-19.08));

	      // Show all balances in hash table.
	      //Enumeration elements( )
	      //返回此哈希表中的值的枚举。
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
	      System.out.println();
	      // Deposit 1,000 into Zara's account
	      bal = ((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal+1000));
	      System.out.println("Zara's new balance: " +
	      balance.get("Zara"));
	      
	      //Object clone( )
	      //创建此哈希表的浅表副本。
	      
	      Object ban = balance.clone();
	      System.out.println(ban);
	      
	      
	      //boolean contains(Object value)
	      //测试此映射表中是否存在与指定值关联的键。
	      System.out.println("测试此映射表中是否存在与指定值关联的键。");
	      System.out.println(balance.contains(-19.08));
	      System.out.println(balance.containsKey("Zara"));
	      System.out.println(balance.containsValue(-19.08));
	      
	      
	      //	Object get(Object key)
	      
	      //返回指定键所映射到的值，如果此映射不包含此键的映射，则返回 null. 
	      //更确切地讲，如果此映射包含满足 (key.equals(k)) 的从键 k 到值 v 的映射，则此方法返回 v；否则，返回 null。
	      System.out.println("更确切地讲，如果此映射包含满足 (key.equals(k)) 的从键 k 到值 v 的映射，则此方法返回 v；否则，返回 null。");
	      System.out.println(balance.get("Zara"));
	      System.out.println(balance.get("ara"));
	      
	      //boolean isEmpty( )
	      //测试此哈希表是否没有键映射到值。
	      System.out.println(balance.isEmpty());
	      
	      
	      //void rehash( )
	      //增加此哈希表的容量并在内部对其进行重组，以便更有效地容纳和访问其元素。
	      System.out.println(balance);
//	      balance.rehash();
	      System.out.println(balance);
	      
	      
	      //	Object remove(Object key)
	      //从哈希表中移除该键及其相应的值。
	      balance.remove("Zara");
	      System.out.println(balance);
	      
	      
	      //int size( )
	      //返回此哈希表中的键的数量。
	      System.out.println(balance.size());
	      
	      //void clear( )
	      //将此哈希表清空，使其不包含任何键。
	      balance.clear();
	      System.out.println(balance.size());
	      System.out.println(balance.isEmpty());
	}

}

