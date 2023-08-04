package string;

public class CheckPalindromeString {
    public static void printArray(char [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();//New Line
    }
//    // Reversing a String - Logic 1
//    public static String reverseString_1(String s){
//        char [] ch = s.toCharArray();
//        // Reversing a String
//        for (int i = 0; i < ch.length; i++) {
//            System.out.print(ch[ch.length-1-i]);
//            // Holding reverse value in another char []
//        }
//        return s;
//    }
    //  - Logic 2
    public static boolean isPalindrome(char [] ch, int start, int end){
        // If 1st & last index same & keep reducing the size from both end & again compare if it's same then it's True
        while(start<end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "AXA";// It's palindrome
        char [] ch = s.toCharArray();
        // palindrome = Check Original string equals to Reversed String
        // Calling Reverse String Method
        // Logic 2
        System.out.println("If palindrome -> "+isPalindrome(ch,0,ch.length-1));
    }
}
