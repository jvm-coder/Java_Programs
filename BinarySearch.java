class BinSearch{
    public void BinarySearach(int[] arr,int left,int right,int val){

        while(left <= right){

            int mid = (left + right)/2;

            if(val == arr[mid]){
                System.out.println("Element found at index : " + mid);
                break;
            }

            else if(arr[mid] < val){
                left = val + 1;
            }

            else{
                right = mid-1;
            }

            if(left > right){
                System.out.println("Element Not Found");
            }

        }

    }
}

public class BinarySearch{
    public static void main(String[] args) {
        BinSearch bs = new BinSearch();

        int[] arr = {1,2,3,4,5};

        bs.BinarySearach(arr, 0, arr.length-1, 3);
        bs.BinarySearach(arr, 0, arr.length-1, 7);
    }
}