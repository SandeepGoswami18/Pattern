
import java.util.Scanner;

public class pattern1 {
    void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void print5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void print6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void print7(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void print8(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    void print9(int n){
        for(int i=1;i<=n;i++){
            //upper right
             //space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        //lower right 
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    void print10(int n){
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            if(i>n) star=2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    void print11(int n){
        int start=1;
        for(int i=0;i<n;i++){
                if(i%2==0) start=1;
                else  start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    void print12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern1 obj = new pattern1();
        obj.print12(n);
        
    }
}
