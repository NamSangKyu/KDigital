using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step08
{
    class Profile
    {
        public string Name { get; set; }
        public int Height { get; set; }
    }
    class Product
    {
        public string Title { get; set; }
        public string Star { get; set; }
    }
    internal class LINQ_5
    {
        static void Main(string[] args)
        {
            Profile[] arrProfile =
            {
                new Profile(){Name="정우성", Height=186},
                new Profile(){Name="김태희", Height=158},
                new Profile(){Name="고현정", Height=172},
                new Profile(){Name="이문세", Height=178},
                new Profile(){Name="하하", Height=167}
            };
            Product[] arrProduct =
            {
                new Product(){Title="비트",        Star="정우성"},
                new Product(){Title="CF 다수",     Star="김태희"},
                new Product(){Title="아이리스",    Star="김태희"},
                new Product(){Title="모래시계",    Star="고현정"},
                new Product(){Title="Solo 예찬",   Star="이문세"}
            };
            var listProfile =
                from profile in arrProfile
                join product in arrProduct on profile.Name equals product.Star
                select new
                {
                    Name = profile.Name,
                    Height = profile.Height,
                    Work = product.Title
                };
            //내부 조인 - 일치하는 데이터만 조회
            foreach (var p in listProfile)
                Console.WriteLine($"{p.Name},{p.Height},{p.Work}");

            listProfile =
                from profile in arrProfile
                join product in arrProduct on profile.Name equals product.Star into ps
                from sub_product in ps.DefaultIfEmpty(new Product() { Title = "없음"})
                select new
                {
                    Name = profile.Name,
                    Height = profile.Height,
                    Work =sub_product.Title
                };
            foreach (var p in listProfile)
                Console.WriteLine($"{p.Name},{p.Height},{p.Work}");
        }
    }
}
