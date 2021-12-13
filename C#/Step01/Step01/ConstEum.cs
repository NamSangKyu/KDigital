using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class ConstEum
    {
        //열거형 : 사용할려는 상수들을 나열,
        //첫번째 상수는 별다른 값을 지정하지 않으면 0
        //두번째 상수 부터는 값을 지정하지 않으면 이전 상수 + 1
        enum Result { YES, NO=100, CANCEL, OK}
        static void Main(string[] args)
        {
            const int MAX_NUM = 100;
            const int MIN_NUM = 50;
            //MAX_NUM += 100;//상수는 데이터 변경 X
            Console.WriteLine(MAX_NUM);
            Console.WriteLine(MIN_NUM);

            Console.WriteLine(Result.YES);
            Console.WriteLine(Result.NO);
            Console.WriteLine(Result.CANCEL);
            Console.WriteLine(Result.OK);
            Console.WriteLine((int)Result.YES);
            Console.WriteLine((int)Result.NO);
            Console.WriteLine((int)Result.CANCEL);
            Console.WriteLine((int)Result.OK);

            Result n = Result.YES;
            Result s = (Result)104;
            Console.WriteLine(Result.YES == n);
            Console.WriteLine(Result.NO == s);
            Console.WriteLine(Result.CANCEL == s);
            Console.WriteLine(Result.OK == n);
        }
    }
}
