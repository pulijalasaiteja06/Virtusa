// See https://aka.ms/new-console-template for more information
using System;

namespace ring {
    class test1 {
        public static void Main(String[] args) {
            int n=Convert.ToInt32(Console.ReadLine());
            int[] arr=new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i]=Convert.ToInt32(Console.ReadLine());
            }

            Array.Sort(arr);
            
            //for (int i = 0; i < n; i++) { 
            //    Console.WriteLine(arr[i]);
            //}
            int count = 1;
            int[] res = new int[n];
            //int j = 0;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] == arr[i + 1])
                {
                    count += 1;
                }
                else {
                    res[i] = count;
                    count = 1;
                }
            }
            
            int b = res.Max();
            Console.WriteLine(b/2+1);

        }
    }

}