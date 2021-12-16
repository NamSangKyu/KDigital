using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Step09
{
    class Person
    {
        readonly object thisLock;
        public Person()
        {
            thisLock = new object();
        }
        public void GetMoney()
        {
            lock (thisLock)
            {
                Thread.Sleep(1000);
                if (Syncronize.money < 1000)
                    Console.WriteLine("잔액이 없습니다. - " + Syncronize.money);
                else
                {
                    Syncronize.money -= 1000;
                    Console.WriteLine("인출 성공" + Syncronize.money);
                }
            }
        }
    }
    internal class Syncronize
    {
        public static int money = 2000;

        static void Main(string[] args)
        {
            Person p1 = new Person();
            Person p2 = new Person();
            Person p3 = new Person();

            Thread t1 = new Thread(new ThreadStart(p1.GetMoney));
            Thread t2 = new Thread(new ThreadStart(p2.GetMoney));
            Thread t3 = new Thread(new ThreadStart(p3.GetMoney));

            t1.Start();
            t2.Start();
            t3.Start();

           
        }
    }
}
