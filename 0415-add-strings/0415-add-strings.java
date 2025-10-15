class Solution {
    public String addStrings(String num1, String num2) {
        int i= num1.length()-1, j= num2.length()-1;
        int carry =0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry != 0){
            int dig1 = (i>=0)? num1.charAt(i)-'0' : 0;
            int dig2 = (j>=0)? num2.charAt(j)-'0' : 0;
            int sum = dig1+dig2+carry;
            result.append(sum%10);
            carry = sum / 10;
            i--; j--;
        }
        return result.reverse().toString();
    }
}