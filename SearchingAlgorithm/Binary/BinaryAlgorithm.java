
public class BinaryAlgorithm {

    public static int binarySearch(int mac [], int target ){
    int low = 0; int high = mac.length-1; 
    while (high>= low){
       int  mid = low + (high-low)/2;
    

       if(mac[mid] == target)
        return mid ;

        if(mac[mid]<=target)
        low = mid +1;
       
        else
        high = mid-1;
    }
    return -1;
    }

    public static void main(String[] args) {
        int mac [] = { 4,5,6,7,0,1,2};
        int  target = 2;
        int result = binarySearch(mac, target);
        if(result == -1)
            System.out.println("Element not present ");
            else
            System.out.println("Element is present at "+ "index " + result );
        
    }

}

//Always Works When Array is Sorted only Else won't work 