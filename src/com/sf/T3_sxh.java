package com.sf;
/*【程序3】
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。*/
public class T3_sxh {

	public static void main(String[] args) {
		T3_sxh t3 = new T3_sxh();
		for(int i=101; i<1000 ; i++){
			if(t3.isSxh(i)){
				System.out.print(i+",");
			}
		}
	}
	
	public boolean isSxh(int num){
		if(num<=100 || num>=1000){
			return false;
		}
		if(p3(num/100) + p3((num/10)%10) + p3(num%10) == num){
			return true;
		}
		return false;
	}
	public int p3(int num){
		return num*num*num;
	}
}
