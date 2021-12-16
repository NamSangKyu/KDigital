using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step08
{
    internal class LINQ_1
    {
        /*
         * from 데이터 집합
         * where 조건
         * orderby 정렬
         * select 추출할 데이터
         */
        static void Main(string[] args)
        {
            int[] numbers = { 9, 2, 6, 4, 5, 3, 7, 8, 1, 10 };

            var result = from n in numbers
                         where n % 2 == 0
                         orderby n descending   
                         select n;

            foreach (int n in result)
                Console.Write($"{n} ");


        }
    }
}
