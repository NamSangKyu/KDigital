using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step06
{
    internal class ArrayListTest
    {
        static void Main(string[] args)
        {
            ArrayList list = new ArrayList();
            for(int i=0;i<5;i++)
                list.Add(i+1);

            for(int i=0;i<list.Count;i++)
                Console.WriteLine(list[i]);
            Console.WriteLine("-----");
            list.RemoveAt(2);//인덱스로 삭제
            for (int i = 0; i < list.Count; i++)
                Console.WriteLine(list[i]);
            Console.WriteLine("-----");
            //추가
            list.Insert(1, 100);
            foreach(int i in list)
                Console.WriteLine(i);
            Console.WriteLine("-----");
            Console.WriteLine(list.Contains(51));
            Console.WriteLine(list.Contains(5));
            Console.WriteLine("-----");
            List<string> list2 = new List<string>();
            list2.Add("JAVA");
            list2.Add("Spring");
            list2.Add("HTML");
            list2.Add("javascript");

            foreach(string s in list2)
                Console.WriteLine(s);



        }
    }
}
