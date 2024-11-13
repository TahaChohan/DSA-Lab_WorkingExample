public class InsertAtAnyPos {
    static void insertElement(int arr[] , int n , int x , int pos){
        //mehtod to insert element at a specified position in array
        for(int i =n-1 ; i >= pos ; i-- ){
            //this will insert from last used index and move each elemnt to right
            //to make space to right 
            arr[i+1] = arr[i];//move elemnt i to i+1(one place to right) 
        }
        arr[pos] = x ;   
    }
public static void main(String[] args) {
    //initializing array of size 15 with only 5 elements populated in it 
    int arr[] = new int [15];
    arr[0] = 2;
    arr[1] = 4;
    arr[2] = 1;
    arr[3] = 8;
    arr[4] = 5;

    int n = 5;//num of element populated in array 
    int x = 10; //new value that need to be inserted 
    int pos = 2; //position of index where value need to be added 
    //showing values before insertion 
    System.out.println("Before insertion: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");  
    }
    insertElement(arr, n, x, pos);//calling mehtods to insert value at x position 
    n += 1;
    System.out.println("After insertion: ");
    for (int i = 0; i < n; i++) {
        System.out.println(arr[i] + " ");
    }
}
}

