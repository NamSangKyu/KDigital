using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Step09
{
    internal class UseTask
    {
        static int run()
        {
            int total = 0;
            for(int i = 0; i <= 10; i++)
                total+=i;
            return total;
        }
        static void Main(string[] args)
        {
            Action action = () =>
            {
                for (int i = 1; i < 10; i++)
                {
                    Console.WriteLine(i);
                    Thread.Sleep(1000);
                }
            };
            Task task = new Task(action);
            task.Start();
            task.Wait();
            Console.WriteLine("Main End");
            Task<int> task2 = new Task<int>(run);
            task2.Start();
            task2.Wait();
            Console.WriteLine(task2.Result);
        }
    }
}
