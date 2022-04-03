import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner var=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the to check prime number from:");
        n=var.nextInt();
        System.out.print(n+" to ");
        m=var.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            for(count=2;count<i;count++){
            if(i%count==0){
                break;
            }
        }
        if(i==count)
        System.out.print(i+" ");
            }
        }  
}
