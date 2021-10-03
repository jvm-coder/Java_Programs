import java.lang.*;
public class BubbleSort{
    public static void main(String arg[])
    {
        int a[]={30,60,35,20,45,32,50};
        System.out.println("Array Before Sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        bubbleSort(a);
        System.out.println("Array after sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static void bubbleSort(int[] a){
        int n = a.length;
        int t = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(a[j-1]>a[j])
                {
                    t = a[j-1];
                    a[j-1] = a[j];
                    a[j]= t;
                }
            }
        }
    }
}