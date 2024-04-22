
public class ReverseBits {
	public static long reverseBits(long n) {
		// calculate binary string 
		String s="";
		long ans=0;
		while(n!=0){
			long rem=n%2;
			s=s+rem;
			n=n/2;
		}
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'){
				ans=ans+(long)Math.pow(2, 31-i);
			}
		}
		return ans;
	}
   
}
