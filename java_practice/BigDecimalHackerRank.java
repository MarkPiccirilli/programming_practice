import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        //sort big decimal array with insertion sort
        for(int i = 1; i < n; i++) {
            //System.out.println("i: " + i);
            int j = i - 1;
            BigDecimal b = new BigDecimal(s[i]);
            //System.out.println("b: " + b);
            while(j >= 0 && b.compareTo(new BigDecimal(s[j])) > 0) {
                //System.out.println("s[j]: " + s[j]);
                //System.out.println("bw: " + b);
                //System.out.println("j: " + j);
                String temp = s[j];
                s[j] = s[j+1];
                s[j+1] = temp;
                j--;
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
