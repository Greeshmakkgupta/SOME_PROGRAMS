Problem statement:ou are given N unit squares (squares with side length 1 unit), and you are asked to make rectangles using these squares. You have to count the number of rotationally unique rectangles than you can make. What does rotationally unique mean? Well, two rectangles are rotationally unique if one can’t be rotated to become equivalent to the other one.

Example – The 4×2 rectangle can be rotated 90 degrees clockwise to make it the exact same as the 2×4 rectangle and so these are not rotationally unique.



Solution:
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



