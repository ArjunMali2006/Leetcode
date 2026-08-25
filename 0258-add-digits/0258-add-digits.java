class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num<10){
            return num;
        }
        while(num>9){
            int n=num/10;
            int digit=num%10;
            sum=n+digit;
            num=sum;
        }
        return sum;
    }
}