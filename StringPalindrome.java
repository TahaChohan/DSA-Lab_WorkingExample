public class StringPalindrome {
    public static boolean checkingIfPalindrome(String str){
        int n = str.length(); //returns the number of character present in the string 
        str = str.toLowerCase(); //coverts the character of string to lower case 
        //checking till middle only because it will save time
        for (int i = 0; i < n/2 ; i++) {
            //this will compare all the characters from the start with the characters from the end 
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false ; //since any of the character doesn't match 
            }
        }
        return true; //since every character has matched the mehtod will return true
    }
    public static void main(String[] args) {
        String str = "RaceCar";//initialing the var str with the string race car 
        if(checkingIfPalindrome(str)){
            System.out.println("The string is a palindrome"); //if is checking if the mehotd is returning true value 
        }
        else{
            System.out.println("String is not a palindrome");//else is checking if the mehotd is returning false value 
        }
    }
}
