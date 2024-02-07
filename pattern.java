
// Multiple pattern


import java.util.*;


public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=5;
        int ch=sc.nextInt();
        System.out.println("Enter your choice:");
        // for(int j=1;j<=i;j+=)  for printing in inc order
        switch(ch){
            case 1:
            {
            for(int i=1;i<=n;i++){                 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
            break;
        }
        case 2:
        {
            for(int i=1;i<=n;i++){
                for(int j=4;j>=i;j--){
                    System.out.print("*");

                }
                System.out.println();

            }
            break;
        }
        case 3:
        {
            for(int i=1;i<=n;i++){
                for( int j=4;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
        }
        case 4:
        {
            for(int i=1;i<=n;i++){
                for( int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int k=5;k>=i;k--){
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
        }
        case 5:
        {
            for(int i=1;i<=n;i++){                 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                for(int j=4;j>=i;j--){
                    System.out.print("*");

                }
                System.out.println();

            }
            break;

        }
       
        
       
    }
    
    sc.close();
}
}
