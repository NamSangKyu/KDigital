using System;

namespace StudentProject
{
    internal class DeleteController : Controller
    {
        public void execute()
        {
            Console.WriteLine("학생정보 삭제를 시작합니다.....");
            Console.Write("삭제할 학번 : ");
            string studentNo = Console.ReadLine();
            bool result = StudentService.Instance.deleteStudent(studentNo);
            if (result)
                Console.WriteLine("학생정보 삭제 완료");
            else
                Console.WriteLine("학생정보 삭제 실패");
        }
    }
}