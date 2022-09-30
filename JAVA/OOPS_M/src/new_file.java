import java.util.*;
public class new_file{
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        longestCommonPrefix(str);
    }
    public static String longestCommonPrefix(String[] stra) {
        if(stra.length==0){
            return "";
        }
        String prefix = stra[0];
        for(int i=1;i<stra.length;i++){
            while(stra[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
            
        }
        return prefix;
    }
}