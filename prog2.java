

import java.util.*;

 

class TestClass {

    public static void main(String args[] ) throws Exception {

        /*

         * Read input from stdin and provide input before running

         * Use either of these methods for input

 

        //BufferedReader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int N = Integer.parseInt(line);

*/

        //Scanner

      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

 

        for (int i = 0; i < t; i++) {

           int n= sc.nextInt();

           int k = sc.nextInt();

           int arr[] = new int[n];

           

             for(int j=0; j<n;j++){

              arr[j]=sc.nextInt();

               

             }

             

            int min=arr[0];

            for(int j=0;j<n;j++ ){

                if(min>arr[j]){

                    min=arr[j];

                }

            }

            

          if(min<k) 

         System.out.println(k-min);

         else

         System.out.println(0);   

        }

        

    }

}
