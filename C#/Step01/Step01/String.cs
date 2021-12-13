using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class String
    {
        static void Main(string[] args)
        {
            string str1 = "안녕하세요";
            Console.WriteLine(str1);

            Console.Write("문자열 입력 : ");
            string str2 = Console.ReadLine();
            Console.WriteLine(str2);

            Console.Write("숫자 입력 : ");
            int num = int.Parse(Console.ReadLine());
            Console.WriteLine(num * 2);
        }
    }
}
