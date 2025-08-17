class Pow {
    public double myPow(double x, int n) {
        long temp = n;
        if(n < 0) temp *= -1;
        double ans = 1.0;
        while(temp > 0){
            if(temp%2 == 0){
                x *= x;
                temp /= 2;
            }else{
                ans = ans * x;
                temp -= 1;
            }
        }
	return n < 0 ? (double)1.0/(double)ans: ans;
    }
}