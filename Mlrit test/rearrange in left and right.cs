// See https://aka.ms/new-console-template for more information
using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;
using System.Security.Cryptography;

namespace sss {
    class dim {
        public static void Main(String[] args)
        {
        
            //PROGRAM 1
            
            string str=Console.ReadLine();
            int pos=Convert.ToInt32(Console.ReadLine());
            string dir = Console.ReadLine();
            string res = "";
            if (dir == "L")
            {
                for (int i = pos;i < str.Length; i++) {
                    res += str[i];
                }
                for (int i = 0; i < pos; i++)
                {
                    res += str[i];
                }
            }
            else if (dir == "R") {

                int d=str.Length-pos;
                for (int i = d; i < str.Length; i++)
                {
                    res += str[i];
                }
                for (int i = 0; i < d; i++)
                {
                    res += str[i];
                }

            }
            Console.WriteLine(res);
            
        }
    }
}