package MODULE_7;
public class CompareSearch {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int key = 30;

        // Linear Search
        for(int i=0;i<arr.length;i++)
            if(arr[i]==key)
                System.out.println("Linear index: "+i);

        // Binary Search
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Binary index: "+mid);
                break;
            }
            if(arr[mid]<key) low=mid+1;
            else high=mid-1;
        }

        System.out.println("O(n) vs O(log n)");
    }
}