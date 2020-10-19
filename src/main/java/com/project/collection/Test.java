package com.project.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
	List<Money> list= new ArrayList<Money>();
	
		Money money=new Money();
		BigDecimal nBigDecimal=new BigDecimal("1.20");
		money.setAllMoney(nBigDecimal);
		money.setMerchantName("商户1");
		list.add(money);
		
		Money money1=new Money();
		BigDecimal nBigDecimal11=new BigDecimal("1.22");
		money1.setAllMoney(nBigDecimal11);
		money1.setMerchantName("商户2");
		list.add(money1);
		
		Money money2=new Money();
		BigDecimal nBigDecimal2=new BigDecimal("1.0");
		money2.setAllMoney(nBigDecimal2);
		money2.setMerchantName("商户3");
		list.add(money2);
		
		//转换前
		for(Money mon:list){
			System.out.println("商户名："+mon.getMerchantName()+",	余额:"+mon.getAllMoney()+"元");
		}
		
		
		//排序
		Collections.sort(list,new Comparator<Money>(){
			
			@Override
			public int compare(Money o1, Money o2) {
				/*a<b, 返回-1
				  a=b, 返回0
			      a>b, 返回1
				*/
				//降序
				//int i = o2.getAllMoney().compareTo(o1.getAllMoney());
				//升序
				int i = o2.getAllMoney().compareTo(o1.getAllMoney());
								
				return i;
			}
			
		});
		
		//
		System.out.println("排序后------------");
				for(Money mon:list){
					System.out.println("商户名："+mon.getMerchantName()+",	余额:"+mon.getAllMoney()+"元");
				}
		
		
		
		
		
		
		
		
		
		
		
	}
}
