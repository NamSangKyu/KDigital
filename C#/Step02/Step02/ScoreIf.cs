using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class ScoreIf
    {
        static void Main(string[] args)
        {
            /*
             *  정수형 변수 하나 선언하여
             *  점수를 하나 입력을 받고
             *  점수에 해당하는 성적 등급을 출력
             *  100~90 A
             *   89~80 B
             *   79~70 C
             *   69~60 D
             *   59~ 0 F
             */
            int score = 0;
            Console.Write("점수하나 입력 >>> ");
            score = int.Parse(Console.ReadLine());

            if (score >= 90)
                Console.WriteLine("A");
            else if (score >= 80)
                Console.WriteLine("B");
            else if (score >= 70)
                Console.WriteLine("C");
            else if (score >= 60)
                Console.WriteLine("D");
            else
                Console.WriteLine("F");
            
        }
    }
}
