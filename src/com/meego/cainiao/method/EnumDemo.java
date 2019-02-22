/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午3:38:30 
* @Des:
*/ 

package com.meego.cainiao.method;

enum Ccar {
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
    private int price;
    Ccar(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    } 
}

public class EnumDemo {

    public static void main(String args[]){
        System.out.println("所有汽车的价格：");
        for (Ccar c : Ccar.values())
        System.out.println(c + " 需要 " 
        + c.getPrice() + " 千美元。");
    }

}

