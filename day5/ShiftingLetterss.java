// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class ShiftingLetterss {
    public static void main(String[] args) {
       String s = “zzz”;
       System.out.println(s);
       int[] arr = {3,5,9};
      System.out.println(shiftingLetters(s,arr));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        char[] ans = new char[s.length()];
       for(int i =0;i<ans.length;i++){
           ans[i]=s.charAt(i);
       }
       int sum = 0;
       for(int i =shifts.length-1;i>=0;i--){
           shifts[i]%=26;
           sum+=shifts[i];
           shifts[i]=sum;
       }

         for(int i =0;i<shifts.length;i++){
                shifts[i]%=26;
            ans[i]=(char)(ans[i]+shifts[i]);
            if(ans[i]>'z'){
                int n = ans[i]%'z';
                n+='a'-1;
                ans[i]=(char)n;
           }
       }
       return new String(ans);
    }
}
