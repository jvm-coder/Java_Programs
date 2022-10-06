class FibonacciSeries {
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a count : ");
        count=scanner.nextInt();


        //printing 0 and 1
        if(count<2){
            System.out.print(n1+" "+n2);
        }


        //loop starts from 2 because 0 and 1 are already printed
        for(i=2;i<=count;++i)  {
            System.out.print(n1+" "+n2);
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
