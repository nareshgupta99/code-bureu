import java.util.Scanner;
public class Armstrong {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=""+n;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			rem=(int)Math.pow(rem,s.length());
			sum=sum+rem;
			n=n/10;
		}
		if(sum==Integer.parseInt(s))
			System.out.println(true);
		else
			System.out.println(false);

	}
}
