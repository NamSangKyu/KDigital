using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step07
{
    internal class FunctionTest
    {
        static void Main(string[] args)
        {
            //Func 대리자는 리턴 타입이 있음
            //맨 마지막 타입이 반환형
            //매개변수 X, 리턴 타입 int
            Func<int> func1 = () => 10;
            Console.WriteLine(func1());
            //매개변수 1개, 리턴타입 int
            Func<int,int> func2 = (x) => x*2;
            Console.WriteLine(func2(5));
            //매개변수 2개, 리턴타입 double
            Func<double, double, double> func3 = (x, y) => x /  y;
            Console.WriteLine(func3(3.34,1.3));
        }
    }
}



