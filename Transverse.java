public class Transverse {
    /*Algorithm A1: travers(arr[])
    1. Start
    2. for i = 0 to N repeat step 3
    3. PRINT arr[i]*/
    public static void main(String[] args) {
        int a[] = new int [3];
        a[0] = 10; //initializing 
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}