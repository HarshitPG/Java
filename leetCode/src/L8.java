import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class L8 {
    public static void main(String[] args) {
       int ans = myAtoi("    +    413");
       System.out.println(ans);

    }

    public static int myAtoi(String s) {
        String str = s;
        String[] strSplits =  str.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplits));
        ArrayList<String> strFinal = new ArrayList<String>();
        boolean isSign = false;
        boolean isWhiteSpace = false;

        for (int i = 0; i < strList.size(); i++) {
            if(i==0){
            if (strList.isEmpty()) {
                return 0;
            }
            if (strList.get(0).equals(" ") && !isSign) {
                strList.remove(0);
                i = -1;
                isWhiteSpace =true;
                continue;
            }
            if (strList.get(0).equals(" ") && isWhiteSpace && isSign ) {
                return 0;
            }
            if (strList.get(0).equals("-") && !isSign) {
                strFinal.add(0, strList.get(i));
                strList.remove(0);
                isSign = true;
                i = -1;
                continue;
            }
            if (strList.get(0).equals("+") && !isSign) {
                strList.remove(0);
                isSign = true;
                i = -1;
                continue;
            }
            if ((strList.get(0).equals("+") || strList.get(0).equals("-")) && isSign) {
                return 0;
            }
            if (strList.get(0).equals("0")) {
                strList.remove(0);
                i = 0;
            }
        }
            if(strList.get(i).matches("^[0-9]+$") && i>=0){
                strFinal.add(strList.get(i));
            }else {
                break;
            }
        }
        if (strFinal.isEmpty()) {
            return 0;
        }
        if((Objects.equals(strFinal.get(0), "-") || Objects.equals(strFinal.get(0), "+")) && strFinal.size() ==1){
            return  0;
        }
        String listString = "";
        for (String element : strFinal) {
            listString += element;
        }
//        String numStr = listString.toString();
        long value;
        try {
            value = Long.parseLong(listString);
        } catch (NumberFormatException e) {
            return (strFinal.get(0).equals("-")) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        if (value > Integer.MAX_VALUE) {
            return (strFinal.get(0).equals("-")) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }
}
