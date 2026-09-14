public class Karatsuba {

    public int multiply(int x, int y){

        if(x<10 && y<10){
            return x*y;
        }

        int m=0;
        int temp1=x;

        while(temp1>=1){
            temp1=temp1/10;
            m++;
        }

        int n=0;
        int temp2=y;

        while(temp2>=1){
            temp2=temp2/10;
            n++;
        }

        int max=Math.max(m,n);

        m=max/2;

        int a = x / (int)Math.pow(10,m);
        int b = x % (int)Math.pow(10,m);

        int c = y / (int)Math.pow(10,m);
        int d = y % (int)Math.pow(10,m);

        int ac = multiply(a, c);
        int bd = multiply(b, d);
        int e = multiply(a+b, c+d)-ac-bd;

        return ac*(int)Math.pow(10,2*m)+e*(int)Math.pow(10,m)+bd;
    }
}
