// See https://aka.ms/new-console-template for more information
using System;

namespace ring {
    class test1 {
        public static void Main(String[] args) {
            int k = Convert.ToInt32(Console.ReadLine());
            int n=Convert.ToInt32(Console.ReadLine());
            int[] arr=new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i]=Convert.ToInt32(Console.ReadLine());
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] - k > 0)
                {
                    arr[i] -= k;
                }
                else { 
                    arr[i] += k;
                }
            }
            Console.WriteLine(arr[n-1]-arr[0]);
        }
    }

}