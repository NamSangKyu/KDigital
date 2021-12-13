using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class Loop
    {
        static void Main(string[] args)
        {
            int i = 0;

            while (i < 5)
            {
                Console.WriteLine("Hello World");
                i++;
            }
            Console.WriteLine("----------");
            i = 0;
            do
            {
                Console.WriteLine("Hello World");
                i++;
            }while(i < 5);
            Console.WriteLine("----------");
            for(int j=0; j < 5; j++)
            {
                Console.WriteLine("Hello World");
            }

        }
    }
}