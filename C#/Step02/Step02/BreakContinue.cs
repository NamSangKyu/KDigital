using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step02
{
    internal class BreakContinue
    {
        static void Main(string[] args)
        {
            int i = 1;
            while (true)
            {
                if (i % 2 == 1)
                {
                    i++;
                    continue;
                }
                Console.WriteLine(i);
                if (i == 100) break;
                i++;
            }
        }
    }
}
