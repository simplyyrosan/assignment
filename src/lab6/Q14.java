package lab6;

public class Q14 {
    public static String toTitleCase(String str) {
        str = str.toLowerCase();                                // Title case all letters are lower except first one
        String title = "";                                      // to Store title case
        boolean isSpace = false;                                // pointer
        title += Character.toUpperCase(str.charAt(0));   // First letter Capital 
        for (int i = 1; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch==' ') isSpace = true;
            if (isSpace && Character.isLetter(ch)) {            // This condition so we wont perform operation on Num
                title += Character.toUpperCase(ch);             // Dont forget to update pointer
                isSpace = false;
            } else title+=ch;                                   // Add rest as it is
        }
        return title;
    }

    public static void main(String[] args) {
        System.out.println(toTitleCase("helo bDSh kke 234"));
    }
} 
