/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午3:35:02 
* @Des:
* Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
*/ 

package com.meego.cainiao.method;
enum Car {
    lamborghini,tata,audi,fiat,honda
}
public class EnumAndSwitchDemo {

	public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch(c) {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }
    }
}

