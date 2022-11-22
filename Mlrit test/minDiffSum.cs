// See https://aka.ms/new-console-template for more information
using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;
using System.Security.Cryptography;

namespace sss {
    class dim {
        public static void Main(String[] args)
        {

            //PROGRAM 2

            int n=Convert.ToInt32(Console.ReadLine());
            int[] arr=new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i]=Convert.ToInt32(Console.ReadLine());
            }
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = i;j < n; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]=temp;    
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i < n-1; i++)
            {
                sum += arr[i + 1] - arr[i];
            }
            Console.WriteLine(sum); 

        }
    }
}