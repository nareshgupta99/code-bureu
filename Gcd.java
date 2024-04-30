public class Gcd {
    public static int calcGCD(int n, int m){
        // int min=(n<m?n:m);
        // int gcd=0;
        // int low=1;
        // while(low<=min){
        //     if(n%low==0 && m%low==0){
        //         gcd=(gcd>low?gcd:low);
        //     }
        //     low++;
        // }
        // return gcd;

        //by eucliden

        while(n>0 && m>0 ){
            if(n>m) n=n%m;
            else m=m%n;
        }
        return (n==0?m:n);
    }
}