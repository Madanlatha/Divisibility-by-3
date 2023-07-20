package divisiblityThree;

import java.util.Scanner;

public class QuestionThree {
	public static int Threedivisbility(int arr[]) {
		
		int ans=0,pow=1;
		for(int i=arr.length-1;i>0;i--) {
			ans=(ans+((arr[i]%3)*pow)%3);
			pow=(pow*10)%3;                                                   
		}
		if(ans%3==0) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		int value=Threedivisbility(arr);
		System.out.println(value);

	}

}
