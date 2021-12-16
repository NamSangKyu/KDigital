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
    internal class LINQ_4
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
            var listProfile = from profile in arrProfile
                              orderby profile.Height
                              group profile by profile.Height < 175 into g
                              select new { key = g.Key, value = g };

            foreach(var Group in listProfile)
            {
                Console.WriteLine($"175cm 미만? {Group.key}");
                foreach(var profile in Group.value)
                {
                    Console.WriteLine($"   {profile.Name}, {profile.Height}");
                }
            }

        }
    }
}
