//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("\"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth\""));
    }
    public static String longestPalindrome(String s)
    {
        boolean equal = s.equals(revers(s));
        if(equal)
        {
            return  s;
        }
        else
        {
            return checkPalindrom(s);
        }
    }
    public static String revers(String s)
    {
        String reversedstring = new String();
        for(int i = s.length()-1; i >= 0; i--)
        {
            reversedstring += s.charAt(i);
        }
        return  reversedstring;
    }
    public static String checkPalindrom(String s) {
        String result = "";
        // Check all possible substrings from longest to shortest
        for (int len = s.length(); len > 0; len--) {
            for (int start = 0; start <= s.length() - len; start++) {
                String substring = s.substring(start, start + len);
                if (substring.equals(revers(substring))) {
                    return substring;
                }
            }
        }
        return s.substring(0, 1); // If no palindrome found, return first character
    }


}