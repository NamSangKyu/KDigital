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

        internal bool deleteStudent(string studentNo)
        {
            StudentVO studentVO = new StudentVO(studentNo, null, null, 0);
            return list.Remove(studentVO);
        }

        internal StudentVO searchStudent(string name)
        {
            foreach (StudentVO student in list)
            {
                if (student.Name.Contains(name))
                    return student;
            }
            return null;
        }

        public static StudentService Instance { get { return instance; } }

        public bool insertStudent(StudentVO studentVO)
        {
            if(list.Contains(studentVO)) return false;
            list.Add(studentVO);
            return true;
        }
    }
}
