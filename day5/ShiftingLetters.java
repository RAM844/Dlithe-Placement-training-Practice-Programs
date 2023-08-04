// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class ShiftingLetters {
    public static void main(String[] args) {
       String s = “abc”;
       char[] ans = new char[s.length()];
       for(int i =0;i<ans.length;i++){
           ans[i]=s.charAt(i);
       }
       System.out.println(ans);
       System.out.println(" ");
       int[] shifts = {3,5,9};
       for(int i =0;i<shifts.length;i++){
           for(int j =0;j<=i;j++){
            ans[j]=(char)(ans[j]+shifts[i]);
           }
       }
       System.out.println(ans);
    }
}




