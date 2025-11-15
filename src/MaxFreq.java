import java.util.*;
public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine().toLowerCase();
        int[] count = new int[26];
        for(char ch:word.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[ch - 'a']++;
            }
        }
        int maxCount = 0;
        char maxChar = '\0';
        for(int i = 0 ; i<26; i++){
            if(count[i] >maxCount){
                maxCount = count[i];
                maxChar = (char)(i+'a');
            }
        }
        if(maxCount>1){
            System.out.println("Letter "+ maxChar+" is repeated maximum times : "+maxCount);
        }else{
            System.out.println("No repeated letters in the word");
        }
        sc.close();
    }
}
