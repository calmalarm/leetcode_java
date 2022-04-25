package valid_number_65;

public class Solution {
    public static boolean isNumber(String s) {
        char[] a = s.toCharArray();
        byte dots = 0;
        byte es = 0;
        boolean hasDigits = false;
        boolean aiIsE=false, aiIsDigit=false, aiIsSign=false, ahIsE=false, ahIsDigit=false, ahIsSign=false;

        for (int i=0; i<a.length; i++) {
            if (a[i]=='.') dots++;          if (dots>1) return false;
            aiIsE = a[i]=='e'||a[i]=='E';
            if (aiIsE) es++;     if (es>1) return false;
            aiIsDigit = a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9';
            if (aiIsDigit)  hasDigits = true;
            aiIsSign = a[i]=='+'||a[i]=='-';

            if (i==0) {
                if (i==a.length-1 && !aiIsDigit) return false;
                if (!(aiIsDigit || aiIsSign || a[i]=='.')) return false;
            }
            else if (i==a.length-1) {
                if (!(aiIsDigit || a[i]=='.')) return false;
            }

            if (i>0) {
                if (!(     (    ( a[i-1]=='.' || ahIsSign || ahIsE || ahIsDigit )   && aiIsDigit    )
                        || (    ahIsDigit   && aiIsE )
                        || (    a[i-1]=='.' && hasDigits    && aiIsE )
                        || (    ahIsE   && aiIsSign )
                        || (    ahIsDigit   && a[i]=='.'    && es==0 )
                        || (    ahIsSign    && a[i]=='.'    && es==0    && i<a.length-1 )
                    ))
                    return false;
            }
            ahIsDigit = aiIsDigit;
            ahIsSign = aiIsSign;
            ahIsE = aiIsE;
        }
        return true;
    }
}
