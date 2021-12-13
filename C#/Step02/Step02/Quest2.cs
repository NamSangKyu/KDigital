using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class Quest2
    {
        static void Main(string[] args)
        {
            /*
             *  줄 개수를 입력 하세요 : -1
             *  0보다 작거나 같은 수를 입력할수 없습니다.
             *  
             *  줄 개수를 입력 하세요 : 5
             *      *
             *     **
             *    ***
             *   ****
             *  *****
             */
            int n;

            while (true)
            {
                Console.Write("줄 개수를 입력 하세요 : ");
                n = int.Parse(Console.ReadLine());
                if (n > 0) break;
                Console.WriteLine("0보다 작거나 같은 수를 입력할수 없습니다.");
            }

            for(int i= 0; i < n; i++)
            {
                for(int j= 0; j < n - i - 1; j++)
                    Console.Write(' ');
                for(int j = 0; j <= i; j++)
                    Console.Write('*');
                Console.WriteLine();
            }
        }
    }
}
