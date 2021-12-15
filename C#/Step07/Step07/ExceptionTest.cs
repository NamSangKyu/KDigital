using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step07
{
    internal class ExceptionTest
    {
        static void Main(string[] args)
        {
            try
            {
                //숫자 두개 입력 받아서 나눈 몫을 출력
                Console.Write("숫자 입력 >>> ");
                int n1 = int.Parse(Console.ReadLine());
                Console.Write("숫자 입력 >>> ");
                int n2 = int.Parse(Console.ReadLine());

                Console.WriteLine(n1 / n2);
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                Console.WriteLine("finally 영역");
            }

            Console.WriteLine("메인 종료");
        }
    }
}
