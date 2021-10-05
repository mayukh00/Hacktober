class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] units = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        for (int i = 0; i < units.length; i++) {
            int unit = units[i];
            if (num >= unit) {
                int n = num / unit;
                for (int j = 0; j < n; j++) {
                    sb.append(strs[i]);
                }
                num %= unit;
            }    
        }
        return sb.toString();
    }
}
