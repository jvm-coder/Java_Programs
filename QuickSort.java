class QuickSort	{
	public static void main(String[]args)	{
		int a[]={10,75,-15,17,0,-2};
		QSort(a,0,a.length-1);
		System.out.println("Sorted Array : ");
    System.out.print("[");
		for(int i=0;i<a.length;i++)	{
			if(i == a.length-1)
				System.out.print(a[i]);
      else
        System.out.print(a[i] + ", ")
			}
      System.out.println("]");
	}
	
	public static void QSort(int a[],int l,int h) {
		if(l<h)	{
			int loc=Partion(a,l,h);
			QSort(a,l,loc-1);
			QSort(a,loc+1,h);
		}
	}

	public static int Partion(int a[],int l,int h)	{
		int pivot = a[l];
		int start=l;
		int end=h;int tmp;

		while(start < end)	{
			while(start<=h && a[start]<=pivot)	{
				start++;
			}
			while(a[end]>pivot)	{
				end--;
			}
			if(start<end)	{
				tmp=a[start];
				a[start]=a[end];
				a[end]=tmp;
			}
		}
		
		tmp=a[l];
		a[l]=a[end];
		a[end]=tmp;
		return end;
	}	
}
