package com.sf;
/*
 * 【程序1】
題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * */
public class T1_Rabbit {

	public static void main(String[] args) {
		T1_Rabbit t1 = new T1_Rabbit();
		t1.calculateRabbits();
	}
	
	public void calculateRabbits(){
		int i;
		long[] l = new long[36];
		l[0] = 1;
		l[1] = 1;
		for(i=2 ; i<36; i++){
			l[i] = l[i-1] + l[i-2];
			System.out.println("第"+(i+1)+"个月兔子有"+l[i]+"对"+",总数是"+l[i]*2+"只");
		}
	}

}
