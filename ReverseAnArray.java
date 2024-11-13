public class ReverseAnArray {
    static void reverse(int arr[]){
        int n = arr.length ; //total length of array to n 
        //concept of n/2 because we only want to the middle as it will automatically reverse the array
        for(int i = 0 ; i < n/2 ; i++){
            int temp = arr[i]; //temp stores value of current index 
            arr[i] = arr[n-i-1]; //sets the value at start to the corresponding value at end
            //ex i=0 ; n=5 ; arr[0] = arr[5-0-1] = 4 ; arr[0] = arr[4] 
            arr[n-i-1] = temp ; //stores the initially stored value of arr[i] in temp to the corresponding value at end    
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        reverse(arr); //calling the mehtod
        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
