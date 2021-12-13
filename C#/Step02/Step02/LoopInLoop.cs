using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class LoopInLoop
    {
        static void Main(string[] args)
        {
            //구구단 2단~9단 출력
            for(int i = 2; i < 10; i++)
            {
                Console.WriteLine($"----{i}단----");
                for(int j=1;j < 10; j++)
                {
                    Console.WriteLine($"{i} * {j} = {i * j}");
                }
                Console.WriteLine();
            }
        }
    }
}
