using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*
 *  람다식
        익명 메소드라 부르며 매개변수와 식으로 구현된 식을 말함
 */
namespace Step07
{
    delegate int Calculate(int a, int b);
    delegate string Concatnate(string[] args);

    class StringList
    {
        private List<string> list = new List<string>();

        public void Add(string str) => list.Add(str);
        public void Remove(string str) => list.Remove(str);
        public void PrintAll()
        {
            foreach (string str in list)
                Console.WriteLine(str);
        }
        public StringList() => Console.WriteLine("생성자");
        ~StringList() => Console.WriteLine("소멸자");
    }

    internal class Lamda
    {
        static void Main(string[] args)
        {
            Calculate calc = (a, b) => a + b;
            Console.WriteLine($"3+4={calc(3, 4)}");

            string[] arr = new string[]
            {
                "Hello", "JAVA", "TEST"
            };
            Concatnate concatnate = (a) =>
            {
                string result = "";
                foreach (string s in a)
                    result += s;
                return result;
            };
            Console.WriteLine(concatnate(arr));
            Console.WriteLine("-------");
            StringList list = new StringList();
            list.Add("Hello");
            list.Add("JAVA");
            list.Add("js");
            list.Add("Spring");
            list.PrintAll();


        }
    }
}
