public class SearchInUnsortedArray {
    //function to implement search operation 
    static int findElement(int arr[] , int n , int key ){
        //loop to go through each element in each element
        for (int i = 0; i < n ; i++) {
            if (arr[i] == key) {
                return i; //if the current element matches the key , then return its indexl
            }
        }    
        return -1; //if key not found return -1 
    }

    public static void main(String[] args) {
        //declaration & initialization of array
        int arr[] = {12,13,34,40};
        int n = arr.length; //size of the array 
        int key = 40; //value to find in the array 
        int position = findElement(arr, n, key); //calling the mehtod 
        if (position == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (position+1));//+1 because the index starts from 0 
        }
        
    }
}
