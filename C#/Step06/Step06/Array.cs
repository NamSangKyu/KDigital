using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step06
{
    internal class Array
    {
        static void Main(string[] args)
        {
            int[] arr1 = new int[5];
            arr1[0] = 1;
            arr1[1] = 2;
            arr1[2] = 3;
            arr1[3] = 4;
            arr1[4] = 5;

            for(int i=0; i<arr1.Length; i++)
                Console.WriteLine(arr1[i]);

            Console.WriteLine("-------");
            
            int[] arr2 = new int[5] {1,2,3,4,5};
            
            foreach(int n in arr2)
                Console.WriteLine(n);
            
            Console.WriteLine("-------");

            int[] arr3 = new int[] {1,2,3,4,5};

            foreach(int n in arr3)
                Console.WriteLine(n);
        }
    }
}
