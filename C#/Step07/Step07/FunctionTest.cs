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
            Func<int, int> func2 = (x) => x * 2;
            Console.WriteLine(func2(5));
            //매개변수 2개, 리턴타입 double
            Func<double, double, double> func3 = (x, y) => x / y;
            Console.WriteLine(func3(3.34, 1.3));

            //Action 대리자는 리턴 타입이 없음
            Action act1 = () => Console.WriteLine("Action()");
            act1();

            int result = 0;
            Action<int> act2 = (x) => result = x * x;

            act2(3);
            Console.WriteLine($"result : {result}");

            Action<double, double> act3 = (x, y) =>
            {
                double pi = x / y;
                Console.WriteLine($"Action<T1, T2>({x}, {y}) : {pi}");
            };

            act3(22.0, 7.0);
        }
        
    }
}



