using System;
namespace StudentProject
{
    internal class InsertController : Controller
    {
        public void execute()
        {
            Console.WriteLine("학생정보 등록을 시작합니다.....");
            Console.Write("학번 : ");
            string studentNo = Console.ReadLine();
            Console.Write("이름 : ");
            string name = Console.ReadLine();
            Console.Write("학과 : ");
            string major= Console.ReadLine();
            Console.Write("평점 : ");
            double score = double.Parse(Console.ReadLine());

            bool result = StudentService.Instance.insertStudent(new StudentVO(studentNo, name, major, score));
            if (result)
                Console.WriteLine("학생정보 추가 성공");
            else
                Console.WriteLine("학생정보 추가 실패");
                
            
        }
    }
}