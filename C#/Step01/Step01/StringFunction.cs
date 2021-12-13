using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step01
{
    internal class StringFunction
    {
        static void Main(string[] args)
        {
            //            0123456789
            string str = "Hello World Test World C#";

            Console.WriteLine(str.IndexOf("World"));
            Console.WriteLine(str.IndexOf("World",7));
            Console.WriteLine(str.LastIndexOf("World"));
            Console.WriteLine(str.LastIndexOf("World",15));
            Console.WriteLine(str.StartsWith("World"));
            Console.WriteLine(str.StartsWith("Hello"));
            Console.WriteLine(str.EndsWith("C#"));
            Console.WriteLine(str.EndsWith("Hello"));
            Console.WriteLine(str.Contains("Test"));
            Console.WriteLine(str.Replace("Test","AAAA"));
            Console.WriteLine(str.ToLower());
            Console.WriteLine(str.ToUpper());
            Console.WriteLine(str.Length);
            Console.WriteLine(str.Insert(10,"BBBB"));
            Console.WriteLine(str.Remove(10,5));

            string str2 = "            AAAAA            ";
            Console.WriteLine(str2.Length);
            Console.WriteLine(str2.Trim().Length);
            Console.WriteLine(str2.TrimStart().Length);
            Console.WriteLine(str2.TrimEnd().Length);

            string str3 = "JAVA,HTML,CSS,JS,SPRING";
            Console.WriteLine(str3.Substring(0,4));

            string[] arr = str3.Split(new string[] { "," }, StringSplitOptions.None); 
            foreach (string s in arr)
                Console.WriteLine(s);

            Console.WriteLine("-------------------");
            //                                        0      1      2
            Console.WriteLine("{0,20}{1,15}{2,30}","NAME","SCORE","MAJOR");
            Console.WriteLine("{0,-20}{1,-15}{2,-30}","홍길동",99,"경제학과");
            Console.WriteLine("{0,20}{1,15}{2,30}","김철수",100,"경영학과");
            Console.WriteLine("{0,20}{1,15}{2,30}","이영희",89,"컴퓨터공학과");

            //날짜 서식
            DateTime dt = DateTime.Now;
            Console.WriteLine(dt.ToString());
            Console.WriteLine(dt.ToString("yyyy_MM_dd_HH_mm_ss"));
            Console.WriteLine(dt.ToString("yyyy/MM/dd(ddd) HH:mm:ss"));
            Console.WriteLine(dt.ToString("yyyy/MM/dd(dddd) HH:mm:ss"));

            

        }
    }
}
