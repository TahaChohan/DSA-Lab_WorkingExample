public class InsertAtEnd {
    //function to insert a given key in the array. this fuctio returns n+1
    //if insertion is successful else n.
    static int insertEnd(int arr[] , int n ,  int key , int capacity){
        if(n > capacity){                  //checking if there is place for new element 
            return n;                      //if array is full n will be returneds as the size showing no place
        }

        arr[n] = key; //value to the key of index n. which is next available position 
        return(n+1);
    }

    public static void main(String[] args) {
        int arr[] = new int[20]; 
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;

        int capacity = 20 ; // capacity & current size of array 
        int n = 6 ; //current size of the array that is filled 
        int key = 26 ; //element that has to be inserted at the end of the arrray 
        System.out.println("Before insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        n = insertEnd(arr,n,key,capacity);//calling the mehtod to see if there is place and
        //also update the value of the key that is 26 at the end of the array.
        System.out.println("\nAfter insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ " ");
            
        }
        
    }
    

}
