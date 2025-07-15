//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
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
    public static String checkPalindrom(String s)
    {
        String result = "";
        for(int i = 0; i < s.length(); i++)
        {
            String newvalue = stringcut(s.length() - i,s);
            boolean equal = newvalue.equals(revers(newvalue));
            //System.out.println(equal);
            //System.out.println(newvalue + "==" + revers(newvalue));
            if(equal && newvalue.length() > 1)
            {
                result =  newvalue;
                break;
            }
        }
        if(result.length() == 0)
        {
            for(int i = 0; i < s.length(); i++)
            {
                String newvalue = stringcut(s.length() - i,s);
                boolean equal = revers(newvalue).equals(newvalue);
                //System.out.println(equal);
                //System.out.println(newvalue + "==" + revers(newvalue));
                if(equal && newvalue.length() > 1)
                {
                    result =  newvalue;
                    break;
                }
            }
            if (result.length() == 0)
            {
                String a = "";
                for(int i = 0; i < s.length(); i++)
                {
                    String append = s.charAt(i) + "";
                    for(int j = 1; j < s.length(); j++)
                    {
                        if(s.charAt(i) == s.charAt(j))
                        {
                            append += s.charAt(j);
                            a = append;

                        }
                        boolean equal = a.equals(revers(a));
                        if(equal && append.length() > 1)
                        {
                            return  a;
                        }
                    }
                }
                result = a;
            }
        }

        return result;
    }
    public static String stringcut(int n, String s)
    {
        String newstring = new String();
        for(int i = 0; i < n; i++)
        {
            newstring += s.charAt(i);
        }
        return newstring;
    }

}