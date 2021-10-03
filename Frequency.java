import java.util.*;
class Frequency{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>Digits=new ArrayList<Integer>();
		int input[]=new int[4];
		int i, temp, result;
		for(i=0;i<4;i++)
			input[i]=sc.nextInt();
		for(i=0;i<4;i++){
			while(input[i]>0){
				Digits.add(input[i]%10);
				input[i]=input[i]/10;
			}
		}
		temp=Collections.frequency(Digits,Digits.get(0));
		result=Digits.get(0);
		for(i=1;i<Digits.size();i++){
			if(temp<Collections.frequency(Digits,Digits.get(i))){
				temp=Collections.frequency(Digits,Digits.get(i));
				result=Digits.get(i);
			}
			else if(temp==Collections.frequency(Digits,Digits.get(i))&& Digits.get(i)>result){
				temp=Collections.frequency(Digits,Digits.get(i));
				result=Digits.get(i);
			}
		}
		System.out.println(result);
	}
}