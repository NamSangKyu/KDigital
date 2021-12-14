using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step03
{
    internal class Reference
    {
        static void Swap(int a, int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        static void RefSwap(ref int a, ref int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        static int add = 0;
        static ref int AddNum()
        {
            add++;
            return ref add;
        }
        /*
         *  메서드에서 숫자 두개, 참조자 변수 두개를 받음
         *  두숫자의 나눗 몫과 나머지를 참조자로 받은 변수에 저장
         *  
         *  메인에서는 몫과 나머지를 출력
         *  
         *  메서드명 : divide
         */
        static void Divide(int n1, int n2, ref int q, ref int m)
        {
            q = n1 / n2;
            m = n1 % n2;
        }
        static void Main(string[] args)
        {
            int n1 = 10, n2 = 20;
            Swap(n1, n2);
            Console.WriteLine($"{n1} , {n2}");
            RefSwap(ref n1, ref n2);
            Console.WriteLine($"{n1} , {n2}");
            Console.WriteLine("--------------------");
            ref int n = ref AddNum();
            n++;
            Console.WriteLine($"{add} , {n}");
            Console.WriteLine("--------------------");
            int q=0, m=0;
            Divide(10,3,ref q, ref m);
            Console.WriteLine($"{q},{m}");

        }
    }
}
