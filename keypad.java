package problems;

import java.util.ArrayList;

public class keypad {
    public static void main(String[] args) {
        
    }
    static ArrayList<String> sol(String str, String ans){
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        String temp = getString(ch);
        ArrayList<String> mr = new ArrayList<>();
        for(int i =0;i<temp.length();i++){
            char ch1 = temp.charAt(i);
            ArrayList<String> res = sol(str.substring(1),ans+ch);
            for(int j=0;j<res.size();j++){
                mr.add(res.get(j));
            }
            
        }
        return mr;
        
    }
    private static String getString(char ch) {
        return null;
    }
}
