public class DeletefromUnsortedArray {
    //searching for the element to be deleted in an array 
    static int findElement(int arr[] , int n , int key){
        for(int i =0 ; i< n ; i++ ){
            //checking if the key is equal to the element in array 
            if (arr[i] == key){
                return i ;  // index number where it is found 
            }
        }
        return -1; //when the loop is finished and still the key is not found return -1 
    }
    static int deleteElement(int arr [] , int n , int key){
        //calling the find element function to find the index of the elemnt if present in the array 
        // and update it to the pos variable 
        int pos = findElement(arr, n, key);
        //if element not found 
        if (pos == -1 ) {
            System.out.println("Element not found");
            return n; //no deletation happens if the element is not found 
        }
        //Shifting elements to left after deletion if the element pos is found 
        for(int i = pos ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        return n-1 ; //returns new size of the array 
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,60}; //declaration & initializing of array
        int n = arr.length;//total length to be sent to n 
        int key = 30 ;
        System.out.println("Before Deletion: ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        n = deleteElement(arr, n, key);//updating value of n 
        System.out.println("After Deletion: ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
