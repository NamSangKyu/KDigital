using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step07
{
    public class CustomException : Exception
    {
        public CustomException(string message) : base(message)
        {
        }
    }
    internal class ThrowTest
    {
        static void sum(int n1, int n2)
        {
            if (n1 == 0 || n2 == 0)
                throw new Exception("0을 입력하면 안됩니다.");
            if (n1 < 0 || n2 < 0)
                throw new CustomException("음수를 입력하면 안됩니다.");
            Console.WriteLine(n1 + " " + n2);
            Console.WriteLine(n1 + n2);
        }
        static void Main(string[] args)
        {
            try
            {
                sum(10, 2);
                sum(14, -45);
                sum(10, 0);
                sum(11, 44);
                sum(20, 68);

            }
            catch (CustomException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.WriteLine("메인 종료");
        }
    }
}
