public class MissingNumInArray {
    /*expectedSum= 
{(n+1)×(n+2) }/2
 */
    public static int missingnum(int arr[]){
        int n = arr.length ;
        int expectedSum = (n+1) * (n+2) / 2 ; 

        //calculate the sum of elements im array 
        int actualSum = 0 ;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];            
        }
        return expectedSum - actualSum ;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,5,6}; // array where num is missing 
        int missingNumber = missingnum(arr) ;
        System.out.println("The missing number is: " +missingNumber);
    }
}
