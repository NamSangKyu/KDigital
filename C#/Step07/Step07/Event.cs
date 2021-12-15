using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step07
{
    delegate void EventHandler(string message);

    class Mynotifier
    {
        public event EventHandler handler;
        public void run(int number)
        {
            if (number % 2 == 0)
                handler($"{number}는 짝수 입니다.");
        }
    }
    internal class Event
    {
        public static void Handler(string message)
        {
            Console.WriteLine(message);
        }
        static void Main(string[] args)
        {
            Mynotifier notifier = new Mynotifier();
            notifier.handler += Handler;
            notifier.run(10);
        }
    }
}
