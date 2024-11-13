class Searching_inArray{

    //Function to implment
    //searchoperation 
    static int findElement (int arry[], int n , int key){
        for(int i = 0;i<n;i++)
        {
                if(arry[i] == key)
                return i;
        }
        //if key not found 
        return -1;
    }

    public static void main(String[] args) {
        int arry[] ={12,34,10,6,40};
        int n = arry.length;

        //using a last element as search element 
        int key = 40;

        //function call 

        int position = findElement(arry, n, key);

        if (position == -1 ) {
            System.out.println("Element not found");

        }
        else{
            System.out.println("Element found at position: " + (position+1));
        }
    }

}






























