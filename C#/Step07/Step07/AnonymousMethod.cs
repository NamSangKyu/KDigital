using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step07
{
    delegate void Compare(int n1, int n2);
    internal class AnonymousMethod
    {
        static void Run(int a, int b,Compare compare)
        {
            compare(a, b);
        }

        static void Main(string[] args)
        {
            int n1 = 10, n2 = 7;
            Run(n1, n2, delegate (int a, int b)
              {
                  if (a > b)
                      Console.WriteLine(a);
                  else
                      Console.WriteLine(b);
              });
            Run(n1, n2, delegate (int a, int b)
             {
                 int result = a - b;
                 if (result < 0) result = -result;
                 Console.WriteLine(result);
             });

        }
    }
}
