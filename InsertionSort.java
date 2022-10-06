import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		a=InsertionSort(a);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static int [] InsertionSort(int [] a) {
		int n=a.length;

		for(int i=1;i<n;i++) {
			int check=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>check) {
				a[j+1]=a[j];
				j-=1;
			}
			a[j+1]=check;
			
		}
		return a;
	}
}
