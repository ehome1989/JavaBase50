package com.sf;
/*【程序5】 
题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
的用C表示。 
Java 的if语句只会执行其中一个分支。 90 虽满足 score>=60，score>=90.遇到第一个判断，执行了输出B,就不会往下执行
*/
public class T5_score {

	public static void main(String[] args) {
		int score=90;         //分数的值可以随便修改  
	       if(score>=60){  
	           System.out.println("B");  
	       }  
	       else if(score>=90){  
	           System.out.println("A");  
	       }  
	       else{  
	           System.out.println("C");  
	       }  
	}

}
