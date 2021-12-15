using System;

namespace StudentProject
{
    internal class SearchController : Controller
    {
        public void execute()
        {
            Console.WriteLine("학생정보 검색을 시작합니다.....");
            Console.Write("이름 : ");
            string name = Console.ReadLine();

            StudentVO vo = StudentService.Instance.searchStudent(name);

            if(vo != null)
            {
                Console.WriteLine(vo.ToString());
            }
            else
            {
                Console.WriteLine("검색 결과가 없습니다.");
            }


        }
    }
}