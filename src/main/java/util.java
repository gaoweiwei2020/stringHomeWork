public class util {

    public static String trimAll(String str){
        StringBuilder trimString = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == ' '){
                continue;
            }
            trimString = trimString.append(c);
        }
        return trimString.toString();
    }

    public static String reverseString(String str){

        StringBuilder str1 = new StringBuilder(str.length());
        for(int i = 0 ; i < str.length() ; i++){
            str1.append(str.charAt(str.length() - 1 - i)) ;
        }

        return str1.toString();
    }
}
