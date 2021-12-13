using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class Operator2
    {
        static void Main(string[] args)
        {
            int n1 = 10, n2 = 7;
            //비교 연산 > < >= <= == !=
            Console.WriteLine($"n1 > n2 : {n1 > n2}");
            Console.WriteLine($"n1 < n2 : {n1 < n2}");
            Console.WriteLine($"n1 >= n2 : {n1 >= n2}");
            Console.WriteLine($"n1 <= n2 : {n1 <= n2}");
            Console.WriteLine($"n1 == n2 : {n1 == n2}");
            Console.WriteLine($"n1 != n2 : {n1 != n2}");

            //논리 연산자 : &&   ||   !
            //AND : && --> 양쪽의 조건식이 둘다 True여야 True가 되는 연산자
            //OR : || --> 양쪽의 조건식 중 하나라도 True면 True가 되는 연산자
            //NOT : ! --> True-->False, False --> True 결과를 뒤집는 연산자
            Console.WriteLine(n1 > 10 && n2 < 10);
            Console.WriteLine(n1 > 10 || n2 < 10);
            Console.WriteLine(!(n1 > 10 || n2 < 10));

            //삼항 연산자
            // 조건식 ? 참일때 값 : 거짓일때 값
            Console.WriteLine(n1 % 2 == 0 ? "짝수" : "홀수") ;
        }
    }
}
