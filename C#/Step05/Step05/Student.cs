using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step05
{
    public class Student
    {
        //학번, 이름, 학과, 평점
        private readonly string studentNo;
        private string name;
        private string major;
        private double score;

        public Student(string studentNo, string name, string major, double score)
        {
            this.studentNo = studentNo;
            Name = name;
            Major = major;
            Score = score;
        }

        public string StudentNo { get=>studentNo; }
        public string Name { get=>name; set=>name=value; }
        public string Major { get=>major; set=>major=value; }
        public double Score { get => score; set=>score=value; }
        
        //학생정보 출력 메서드
        public void PrintStudentInfo()
        {
            Console.WriteLine($"{StudentNo} {Name} {Major} {Score}");
        }

        public override string ToString()
        {
            return $"{StudentNo} {Name} {Major} {Score}";
        }
    }
}
