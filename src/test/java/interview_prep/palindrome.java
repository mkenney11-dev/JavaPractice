package interview_prep;

public class palindrome {

    public static void main(String[] args) {

        String str = "racecarii";
        String reverse ="";

        for(int i = str.length()-1; i >=0; i--){
            reverse+=str.charAt(i);
        }
        if (reverse.equals(str)){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
