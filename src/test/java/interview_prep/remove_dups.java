package interview_prep;

public class remove_dups {

    public static void main(String[] args) {

        String str = "AAABBCDDEFF";
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            if(!result.contains(""+ str.charAt(i))){
                result+= "" + str.charAt(i);
            }
        }
    }
}
