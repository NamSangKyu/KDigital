using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentProject
{
    public class StudentService
    {
        private static readonly StudentService instance = new StudentService();
        private List<StudentVO> list;
        private StudentService()
        {
            list = new List<StudentVO>();
        }
        public static StudentService Instance { get { return instance; } }
    }
}
