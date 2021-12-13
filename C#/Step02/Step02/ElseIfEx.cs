using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class ElseIfEx
    {
        static void Main(string[] args)
        {
            int n = 6;

            if (n % 3 == 0)
                Console.WriteLine("이 숫자는 3의 배수 입니다.");
            else if (n % 5 == 0)
                Console.WriteLine("이 숫자는 5의 배수 입니다.");
            else
                Console.WriteLine("이 숫자의 배수를 모릅니다.");
        }
    }
}
