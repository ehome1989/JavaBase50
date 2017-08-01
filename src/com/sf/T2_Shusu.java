package com.sf;
/*【程序2】 
题目：判断101-200之间有多少个素数，并输出所有素数。 

素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。
 * */
public class T2_Shusu {

	public static void main(String[] args) {
		T2_Shusu t2 = new T2_Shusu();
		t2.getSushu(101, 200); 
	}

	public void getSushu(int min,int max){
		for(int i=min; i<max; i++){
			if(isSushu(i)){
				System.out.print(i+",");
			}
		}
	}
	public boolean isSushu(int i){
		int j=2;
		while(i > j){
			if(i%j == 0){
				return false;
			}
			j ++;
		}
		return true;
	}
}
