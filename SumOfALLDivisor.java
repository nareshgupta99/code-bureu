public class SumOfALLDivisor {
    public static int sumOfAllDivisors(int n){

        //Brute force solution
        int sum=0;
        for(int num=1;num<=n;num++){
            for(int div=1;div<=num;div++){
                if(num%div==0) sum=sum+div;
            }
        }
        return sum;
    }
}