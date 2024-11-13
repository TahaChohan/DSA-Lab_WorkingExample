public class FindSecondMax {
    public static int second_max(int arr[]){
        //initializing both variables as index[1] 
        int max = arr[0] ;
        int secondmax = arr[0] ;

        for (int i = 1; i < arr.length; i++) {
            //checking if arr[i] > max 
            if (arr[i] > max) {
                secondmax = max; //assinging max value to second max before 
                max = arr[i];    // changing max value to arr[i]
            }
            //checking if the arr[i] is greater then second max but not equal to 0
            else if (arr[i] > secondmax && arr [i] != max) {
                secondmax = arr[i];    
                }
            }
            return secondmax;
        }
       
    public static void main(String[] args) {
        int arr[] = {10,2,25,7,1,50}; //declaring and initializing array 
        int second_max = second_max(arr); //calling mehtod to find the second max value
        System.out.println("Second max value in the array is: " + second_max);
    }
}
