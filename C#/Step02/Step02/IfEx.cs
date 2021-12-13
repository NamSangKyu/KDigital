using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class IfEx
    {
        static void Main(string[] args)
        {
            int n = 10;

            if (n % 2 == 0)
                Console.WriteLine("짝수");
            if (n % 2 == 1)
                Console.WriteLine("홀수");
        }
    }
}
