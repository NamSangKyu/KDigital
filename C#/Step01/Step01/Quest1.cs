using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class Quest1
    {
        static void Main(string[] args)
        {
            /*
             직사각형의 가로 길이, 세로 길이를 입력 받아서
             해당 직사각형의 넓이를 계산해서 출력
             */
            Console.Write("가로 길이 입력 > ");
            int width = int.Parse(Console.ReadLine());
            Console.Write("세로 길이 입력 > ");
            int height = int.Parse(Console.ReadLine());

            Console.WriteLine($"직사각형의 넓이 : {width * height}");
        }
    }
}
