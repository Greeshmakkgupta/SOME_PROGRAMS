import java.util.Scanner;
class Kanak
{
    static int myfunction(int a[],int st) {
      int b[]=new int[st];
      int c[]=new int[st];
      int first=a[0];
      int m=0;
      for(int j=1;j<st;j++)
      {
          int r=a[j]-a[j-1];
          b[j]=r;
      }
      c[0]=b[0];
      for(int k=1;k<st;k++)
      {
          if(b[k]!=b[k-1])
          {
              c[k]=b[k];
          }
      }
        for(int l=0;l<st;l++)
        {
            if(c[l]==1)
            {
                m++;
            }
        }
     return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int s = sc.nextInt();
            arr[i] = s;
        }
        int w=myfunction(arr,size);
        System.out.println(w);
    }
}