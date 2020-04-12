import java.util.Scanner;
import java.lang.Math;
class Kanak
{
     static int fun(int n)
    {
        int height,length,add=0;
        for(length=1;length<=(int)(Math.sqrt(n));length++)
        {
            height=length;
            while(height*length<=n)
            {
                add=add+1;
                height=height+1;
            }
        }
        return add;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int n=sc.nextInt();
        int w=fun(n);
        System.out.println(w);

    }
}



