import java.util.Scanner;

public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        int i;
        System.out.println("Enter "+n+" Elements");
        for(int k=0;k<n;k++)
            arr[k]=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                {
                    if(j!=i)
                        {
                            arr1[i]=arr[i]*arr[j];
                        }
        }
        for(int j=0;j<n;j++)
            System.out.println(arr1[j]);

    }

}
}