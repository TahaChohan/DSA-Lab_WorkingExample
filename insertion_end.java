//insertion at end 
public class insertion_end {
    //Function to insert a given key in the array .This Function 
    //Returns n+1 if insertion is successful, else n.

    static int insertEnd(int array[], int n , int key , int capacity){
        //Cannot insett more element if n is already more then the equal to capacity

        if(n>capacity){
            return n ;
        }
        array[n] = key ;
        return (n+1);
    }

    public static void main(String[] args) {
        int [] array = new int [20];
        array[0] = 12 ;
        array[1] = 16 ;
        array[2] = 20 ;
        array[3] = 40 ;
        array[4] = 50 ;
        array[5] = 70 ;
        int capacity = 20 ;
        int n = 6; 
        int i , key = 26;

        System.out.println("Before insertion: ");
        for(i = 0 ; i < n ;i++){
            System.out.println(array [i] + " ");
        }

        //inserting key 
        n = insertEnd(array, n, key, capacity);
        System.out.println("\n After Insertion");

        for(i = 0 ; i < n ; i++){
            System.out.println(array[i] + " ");
        }
    }










    
}
