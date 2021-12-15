using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentProject
{
    public class StudentVO
    {
        public string StudentNo { get; set; }
        public string Name { get; set; }
        public string Major{ get; set; }
        public double Score { get; set; }

        public StudentVO(string studentNo, string name, string major, double score)
        {
            StudentNo = studentNo;
            Name = name;
            Major = major;
            Score = score;
        }

        public override string ToString()
        {
            return $"{StudentNo} {Name} {Major} {Score}";
        }

        public void PrintInfo()
        {
            Console.WriteLine(ToString());
        }

        public override bool Equals(object obj)
        {
            return obj is StudentVO vO &&
                   StudentNo == vO.StudentNo;
        }
    }
}
