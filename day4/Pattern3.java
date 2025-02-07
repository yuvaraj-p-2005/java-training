// public class Pattern3 {
//     public static void main(String[] args){
//         for(int row=1;row<=5;row++)
//         {
//             for(int col=5;col>=row;col--)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }


 public class Pattern3 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<=5;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}