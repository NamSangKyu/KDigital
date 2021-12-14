using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step03
{
    internal class DefaultParam
    {
        public static int sum(int n)
        {
            return n + n;
        }
        public static int sum(int n1=10,int n2=20)
        {
            return n1 + n2;
        }
        static void Main(string[] args)
        {
            Console.WriteLine(sum(10, 20));
            Console.WriteLine(sum());
            Console.WriteLine(sum(10));
        }
    }
}
