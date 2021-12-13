using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class Operator1
    {
        static void Main(string[] args)
        {
            //숫자 두개 입력
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());

            //사칙 연산자 + - * / %
            //입력한 두 숫자의 사칙연산 결과를 출력
            Console.WriteLine(n1+n2);
            Console.WriteLine(n1-n2);
            Console.WriteLine(n1*n2);
            Console.WriteLine(n1/n2);
            Console.WriteLine(n1%n2);

            Console.WriteLine("----------------");
            //복합 대입 연산자 += -= *= /= %=
            int result = 10;
            result += n1;
            Console.WriteLine(result);
            result -= n2;
            Console.WriteLine(result);

            Console.WriteLine("----------------");
            int n = 10;
            Console.WriteLine(n);//10
            Console.WriteLine(n++);//10
            Console.WriteLine(n);//11

            n = 10;
            Console.WriteLine(n);//10
            Console.WriteLine(++n);//11
            Console.WriteLine(n);//11
        }
    }
}




