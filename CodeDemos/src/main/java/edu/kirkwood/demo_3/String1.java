package edu.kirkwood.demo_3;

public class String1 {

    /**
     * @param name a string name, e.g. "Bob"
     * @return return a greeting of the form "Hello Bob!".
     */
    public String helloName(String name) {
        return String.format("Hello %s!", name);
    }


    /**
     * @param out string length 4, such as "&lt;&lt;&gt;&gt;"
     * @param word a string
     * @return a new string where the word is in the middle of the out string, e.g. "&lt;&lt;word&gt;&gt;".
     */
    public String makeOutWord(String out, String word) {
        String outLeft = out.substring(0, 2);
        String outRight = out.substring(2);
        return outLeft + word + outRight;
    }


    /**
     * @param str a string of even length
     * @return return the first half. So the string "WooHoo" yields "Woo"
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


    /**
     * @param str a non-empty string
     * @param front a boolean
     * @return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
     */
    public String theEnd(String str, boolean front) {
        return front ? str.charAt(0) + "" : str.charAt(str.length() - 1) + "";
  /*
  if(front) {
    return str.charAt(0) + "";
  } else {
    return str.charAt(str.length() - 1) + "";
  }
  */
    }


    /**
     * @param str a string
     * @return return true if it ends in "ly".
     */
    public boolean endsLy(String str) {
        return str.endsWith("ly");
//        if(str.length() < 2) {
//            return false;
//        }
//        String lastTwo = str.substring(str.length() - 2);
//        return lastTwo.equals("ly");
    }


    /**
     * @param str a string of odd length, at least 3.
     * @return return the string length 3 from its middle, so "Candy" yields "and"
     */
    public String middleThree(String str) {
        // return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

        int middle = str.length() / 2;
        int start = middle - 1;
        int end = middle + 2;
        return str.substring(start, end);
    }


    public String minCat(String a, String b) {
        String shorter = a;
        int shorterLen = a.length();
        if(b.length() < a.length()) {
            shorter = b;
            shorterLen = b.length();
            return a.substring(a.length() - b.length()).concat(b);
        } else {
            return a.concat(b.substring(b.length() - a.length()));
        }
    }

    public String withoutX2(String str) {
        // If str has fewer than 2 characters, and no x's
        if(str.length() < 2 && str.indexOf("x") < 0) {
            return str;
        }
        if(str.length() < 2) {
            return str.replace("x", "");
        }
        if(str.substring(0, 2).equals("xx")) {
            return str.substring(2);
        }
        // if index 1 is an x, remove index 1
        if(str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }
        // if index 0 is an x, remove index 0
        if(str.charAt(0) == 'x') {
            return str.substring(1);
        }
        return str;
    }








}
