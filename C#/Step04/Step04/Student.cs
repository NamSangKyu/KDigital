using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    /*
        학번, 이름, 학과, 평점
        
        생성자
        학생정보 출력하는 메서드
     */
    public class Student
    {
        private string StudentNo;
        private string Name;
        private string Major;
        private double Score;
        public Student(string studentNo, string name, 
            string major, double score) 
        {
            StudentNo = studentNo;
            Name = name;
            Major = major;
            Score = score;
        }

        public override bool Equals(object obj)
        {
            return obj is Student student &&
                   StudentNo == student.StudentNo &&
                   Name == student.Name &&
                   Major == student.Major &&
                   Score == student.Score;
        }

        public override string ToString()
        {
            return $"{StudentNo}\t{Name}\t{Major}\t{Score}";
        }

        public void PrintInfo()
        {
            Console.WriteLine($"{StudentNo}\t{Name}\t{Major}\t{Score}");
        }
    }
}
