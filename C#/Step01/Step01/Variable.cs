using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class Variable
    {
        static void Main(string[] args)
        {
            int i1 = 100;

            Console.WriteLine(i1);
            Console.WriteLine("i1 : "+i1);
            Console.WriteLine($"i1 : {i1}");

            sbyte a = -10; //부호가 있음 -128 ~ 127 - 1byte
            byte b = 40; //부호가 없음 0~255 - 1byte

            Console.WriteLine($"a={a}, b={b}");

            short c = -30000;//부호가 있음 - 2byte
            ushort d = 60000;//부호가 없음 - 2byte
            Console.WriteLine($"c={c}, d={d}");

            uint e = 300000;//부호가 없음 - 4byte
            Console.WriteLine($"e={e}");

            long f = -50000000000000;
            ulong g = 50_000_000_000_000;
            Console.WriteLine($"f={f}, g={g}");

            byte num = 240; //10진수 리터럴
            Console.WriteLine($"num={num}");
            num = 0b1111_0000;//2진수 리터럴
            Console.WriteLine($"num={num}");
            num = 0xF0;//16진수 리터럴
            Console.WriteLine($"num={num}");

            uint unum = uint.MaxValue;//최대값
            Console.WriteLine($"unum = {unum}");
            unum = unum + 1;
            Console.WriteLine($"unum = {unum}");

            float f1 = 3.1415f;
            double d1 = 3.1415;
            Console.WriteLine($"f1={f1},d1={d1}");

            char c1 = 'A';
            char c2 = 'B';
            Console.WriteLine($"{c1},{(int)c1}");
            Console.WriteLine($"{c2},{(int)c2}");

            bool flag = true;
            Console.WriteLine($"{flag}");
            flag = false;
            Console.WriteLine($"{flag}");
        }
    }
}
