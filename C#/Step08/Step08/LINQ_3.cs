﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step08
{
    class Class
    {
        public string Name { get; set; }
        public int[] Score { get; set; }
    }
    internal class LINQ_3
    {
        static void Main(string[] args)
        {
            Class[] arrClass =
            {
                new Class(){Name="연두반", Score=new int[]{99, 80, 70, 24}},
                new Class(){Name="분홍반", Score=new int[]{60, 45, 87, 72}},
                new Class(){Name="파랑반", Score=new int[]{92, 30, 85, 94}},
                new Class(){Name="노랑반", Score=new int[]{90, 88, 0, 17}}
            };
            var classes = from c in arrClass
                          from s in c.Score
                          where s < 750
                          orderby s
                          select new { Name = c.Name, Lowset = s };
            foreach (var c in classes)
                Console.WriteLine($"낙제 : {c.Name} , {c.Lowset}");
        }
    }
}
