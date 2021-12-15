using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentProject
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("----학적 관리 프로그램----");
                Console.WriteLine("1. 학생정보추가");
                Console.WriteLine("2. 학생정보검색");
                Console.WriteLine("3. 학생정보삭제");
                Console.WriteLine("4. 학생정보수정");
                Console.WriteLine("5. 전체학생정보 조회");
                Console.WriteLine("0. 프로그램 종료");
                Console.Write("원하시는 번호를 입력하세요>>> ");
                int no = int.Parse(Console.ReadLine()); 

                Controller controller = HandlerMapping.Instance.CreateController(no);
                if(controller != null)
                    controller.execute();
                if (no == 0) break;
            }

        }
    }
}
