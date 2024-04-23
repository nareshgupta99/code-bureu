public class DiagonalDifference{
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n=arr.size();
        int lsum=0,rsum=0;
        for(int i=0;i<n;i++){
          lsum+=arr.get(i).get(i);
          rsum+=arr.get(i).get(n-(i+1));
        }
        return    Math.abs(lsum-rsum);
        
    
    }

}