using System;

namespace StudentProject
{
    internal class PrintAllController : Controller
    {
        public void execute()
        {
            foreach(StudentVO vo in StudentService.Instance.List)
            {
                vo.PrintInfo();
            }
        }
    }
}