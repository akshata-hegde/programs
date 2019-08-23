
/*2. Micro and Array Update
Micro purchased an array A having N integer values. After playing it for a while, he got
bored of it and decided to update value of its element. In one second he can increase
value of each array element by 1. He wants each array element's value to become greater
than or equal to K. Please help Micro to find out the minimum amount of time it will take,
for him to do so.

*/


 

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

/*Input:
First line consists of a single integer, T, denoting the number of test cases.
First line of each test case consists of two space separated integers denoting N and K.
Second line of each test case consists of N space separated integers denoting the array
A.

Output:
For each test case, print the minimum time in which all array elements will become
greater than or equal to K. Print a new line after each test case.

sample input:
2
3 4
1 2 5
3 2
1 2 5

sample output:
3
0

*/
