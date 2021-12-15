using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*
 *  대리자
 *      메서드를 참조하여 직접 메서드를 실행하는 것이 아니라
 *      간접적으로 호출하게끔 할때 사용하는 기능
 */
namespace Step07
{
    delegate int CustomDelegate(int n1, int n2);
    class Calculator
    {
        public int sum(int a, int b)
        {
            Console.WriteLine("sum");
            return a + b;
        }

        public int mul(int a, int b)
        {
            Console.WriteLine("mul");
            return a * b;
        }
    }
    internal class DelegateTest
    {
        static void Main(string[] args)
        {
            Calculator calculator = new Calculator();
            CustomDelegate customDelegate;

            customDelegate = new CustomDelegate(calculator.sum);
            Console.WriteLine(customDelegate(10,20));

            customDelegate = calculator.mul;
            Console.WriteLine(customDelegate(10,20));

            Console.WriteLine("-------------");

            CustomDelegate c = null;
            c += calculator.sum;
            c += calculator.mul;

            Console.WriteLine(c(10,20));
        }
    }
}
