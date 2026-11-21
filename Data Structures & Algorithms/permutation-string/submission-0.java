class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m){
            return false;
        }
        int[] count = new int[26];
        for(int i =0; i < n;i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i =0; i < m;i++){
            count[s2.charAt(i)-'a']--;
           if(i >= n){
            count[s2.charAt(i-n)-'a']++;
           }
           if(i >= n-1){
            boolean found = true;
            for(int j =0;j < 26;j++){
                if(count[j] != 0){
                    found = false;
                    break;
                }
            }
            if(found){
                return true;
            }
           }
        }
        return false;
    }
}
