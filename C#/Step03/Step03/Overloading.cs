using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step03
{
    internal class Overloading
    {
        static void Plus(int n1, int n2, out int result)
        {
            result = n1 + n2;
        }
        static void Plus(double n1, double n2, out double result)
        {
            result = n1 + n2;
        }
        static void Main()
        {
            int a = 3;
            int b = 4;
            int resultA = 0;

            Plus(a, b, out resultA);
            Console.WriteLine(resultA);

            double x = 3.14523;
            double y = 123.345436;
            double resultB = 0.0;
            Plus(x, y, out resultB);
            Console.WriteLine(resultB);
        }
    }
}
