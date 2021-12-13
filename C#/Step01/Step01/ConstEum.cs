using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class ConstEum
    {
        enum Result { YES, NO, CANCEL, OK}
        static void Main(string[] args)
        {
            const int MAX_NUM = 100;
            const int MIN_NUM = 50;
            //MAX_NUM += 100;//상수는 데이터 변경 X
            Console.WriteLine(MAX_NUM);
            Console.WriteLine(MIN_NUM);
        }
    }
}
