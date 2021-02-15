package first.String;

public class RegularExpressionMatching {
    private static boolean isMatch(String s, String p){
        return isTomatch(s, p, '\0');
    }
    private static boolean isTomatch(String s, String p, char prec){
        if(s.length()==0){

        }
        else if(p.length()==0){
            return false;
        }
        else if(prec !='\0'){
            if(s.charAt(0)==prec){
                return isTomatch(s.substring(1),p,prec) || isTomatch(s,p.substring(1),'\0');
            }
            else{
                return isTomatch(s,p.substring(1),'\0');
            }

        }
        else if(p.length()> 1 && p.charAt(1)== '*'){
            return isTomatch(s,p.substring(1),p.charAt(0));
        }
        else if(p.charAt(0)==s.charAt(0) || p.charAt(1)=='.'){
            return isTomatch(s.substring(1),p.substring(1),'\0');
        }
        else return false;
        return true;
    }
    public static void main(String[] args) {

    }
}
