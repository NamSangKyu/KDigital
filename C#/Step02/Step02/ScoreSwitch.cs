using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class ScoreSwitch
    {
        static void Main(string[] args)
        {
            int score = 0;
            Console.Write("점수하나 입력 >>> ");
            score = int.Parse(Console.ReadLine());

            switch (score / 10)
            {
                case 10:
                case 9:
                    Console.WriteLine("A");
                    break;
                case 8:
                    Console.WriteLine("B");
                    break;
                case 7:
                    Console.WriteLine("C");
                    break;
                case 6:
                    Console.WriteLine("D");
                    break;
                default:
                    Console.WriteLine("F");
                    break;
            }
        }

    }
}
