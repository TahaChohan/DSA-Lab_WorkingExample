public class MoveZeroToEnd {
public static void movezero(int arr[]){
    int index = 0; //index to placd the next non zero elemnt 
    //moving the non zero elemnts to start 
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[index] = arr[i]; //assigning the value of current array indx to the index value 
            index ++ ; //increaing the index count  
        }
    }
    //putting zero to all the remaining values 
    for(int i = index ; i <arr.length ; i++){
        arr[i] = 0 ;
    }
}
public static void main(String[] args) {
    int arr[] = {0,0,20,0,10,30};
    System.out.println("Before moving zero to end: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] +" ");
    }
    movezero(arr);
    System.out.println("After moving zero to end: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] +" ");
}
}
}
