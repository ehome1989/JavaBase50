package com.sf;
/*【程序4】 
题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。 
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。 */
public class T4_fjzys {

	public static void main(String[] args) {
		T4_fjzys t4 = new T4_fjzys();
		System.out.println(t4.fjzys(100));
	}
	
	public String fjzys(int num){
		String str = "1";
		int k = 2;
		if(num == 1){
			return "1";
		}
		while(k<=num){
			if(num%k == 0){
				str = str + "*"+k;
				num = num/k;
			}else{
				k ++;
			}
		} 
		return str;
	}
}
