using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class Object
    {
        static void Main(string[] args)
        {
            object a = 100;
            object b = 3.1415;
            object c = false;
            object d = "Hello World";
            object e = 'A';

            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.WriteLine(c);
            Console.WriteLine(d);
            Console.WriteLine(e);

            int n = 100;
            object f = (object)n;//박싱
            int i = (int)f;//언박싱
            Console.WriteLine(n);
            Console.WriteLine(f);
            Console.WriteLine(i);

        }
    }
}
