package ex;
import java.util.Scanner;
/*  請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Date: 2016/11/14
 * Author: 105021030 張廷毓
 */
public class ex01{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入個數:");
		int n=sc.nextInt();
		System.out.print(var(n));
	}
	public static float var(int n) {
		Scanner sc=new Scanner(System.in);
		float average=0,sum=0,sum2=0;
		int data[]=new int[n];
		
		for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
			average+=data[i];
		}
		
		average=average/n;
		for(int j=0;j<n;j++){
			sum=data[j]-average;
			sum=sum*sum;
			sum2=sum2+sum;
		}
		return sum2/n;
	}
	
}