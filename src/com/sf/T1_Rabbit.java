package com.sf;
/*
 * 【程序1】
題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * */
public class T1_Rabbit {

	public static void main(String[] args) {
		T1_Rabbit t1 = new T1_Rabbit();
//		t1.calculateRabbits();
		t1.getRabbitsCount(5);
		t1.getRabbitsCount(0);
		t1.getRabbitsCount(11);
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

	public void getRabbitsCount(int month){
		System.out.println("========》》"+month);
		if(month <= 0){
			System.out.println("请输入大于0的整数！");
			return;
		}
		if(month==1 || month==2){
			System.out.println("第"+month+"个月兔子有"+	1+"对"+",总数是"+2+"只");
		}
		long[] l = new long[month];
		l[0] = 1;
		l[1] = 1;
		for(int i=2 ; i<month ;i++){
			l[i] = l[i-1]+l[i-2];
		}
		System.out.println("第"+month+"个月兔子有"+	l[month-1]+"对"+",总数是"+2*l[month-1]+"只");
	}
}
