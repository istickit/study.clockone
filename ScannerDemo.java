//导包
import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入整数");
		//接收数据
		int i = sc.nextInt();
		
		System.out.println(i);
	}
}