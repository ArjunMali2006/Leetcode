class Solution {
    public boolean checkDivisibility(int n) {
        int number=n;
        int sum=0;
        int product=1;
        while(number>0){
            int digit=number%10;
            sum+=digit;
            product*=digit;
            number=number/10;
        }
        int totalsum=sum+product;
        if((n%totalsum)==0){
            return true;
        }
    return false;
    }
}