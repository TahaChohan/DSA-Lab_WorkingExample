public class MinValue {
    public static int min_value_finding(int arr[]){
        int min = arr[0]; //setting arr[0] value as minimum to compare
        //will start with 1 because arr[0] is already defined as smallest 
        for (int i = 1; i < arr.length; i++) {
            // the condition will compare if the current value of the array is larger then the min value 
            if (arr[i]<min) {
                min = arr[i]; 
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,25,7,1,50}; //declaring and initializing array 
        int minValue = min_value_finding(arr); //calling mehtod to find the minimum value
        System.out.println("Minimum value in the array is: " + minValue);
    }
}
