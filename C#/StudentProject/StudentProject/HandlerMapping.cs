using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentProject
{
    public class HandlerMapping
    {
        private static readonly HandlerMapping instance = new HandlerMapping();
        

        private HandlerMapping()
        {
           
        }

        public static HandlerMapping Instance { get => instance; }

        public Controller CreateController(int no)
        {
            Controller controller = null;
            return controller;
        }
    }
}
