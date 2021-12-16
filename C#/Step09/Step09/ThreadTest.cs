using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Step09
{
    internal class ThreadTest
    {
        static void sum()
        {
            int s = 0;
            for (int i = 1; i <= 10; i++)
                s += i;
            Console.WriteLine(s);
        }
        static void Main(string[] args)
        {
            Action action = () =>
            {
                for(int i = 0; i < 20; i++)
                {
                    Console.WriteLine("run : " + i);
                    Thread.Sleep(1000);
                }
                Console.WriteLine("run End");
            };
            Thread t1 = new Thread(new ThreadStart(action));
            Thread t2 = new Thread(new ThreadStart(sum));
            t1.Start();
            t2.Start();
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Main : " + i);
                Thread.Sleep(1000);
            }
            Console.WriteLine("Main End");
        }
    }
}
