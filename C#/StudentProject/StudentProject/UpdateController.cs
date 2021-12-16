using System;

namespace StudentProject
{
    internal class UpdateController : Controller
    {
        public void execute()
        {
            Console.WriteLine("학생정보 수정을 시작합니다.....");
            Console.Write("수정할 학번 : ");
            string studentNo = Console.ReadLine();

            StudentVO vo = StudentService.Instance.searchNoStudent(studentNo);

            if (vo == null)
            {
                Console.WriteLine("수정할 학생정보가 없습니다.");
                return;
            }

            Console.Write("이름 : ");
            vo.Name = Console.ReadLine();
            Console.Write("학과 : ");
            vo.Major = Console.ReadLine();
            Console.Write("평점 : ");
            vo.Score = double.Parse(Console.ReadLine());
        }
    }
}