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

            switch (no)
            {
                case 1:
                    controller = new InsertController();
                    break;
                case 2:
                    controller = new SearchController();
                    break;
                case 3:
                    controller = new DeleteController();
                    break;
                case 4:
                    controller = new UpdateController();
                    break;
                case 5:
                    controller = new PrintAllController();
                    break;

            }

            return controller;
        }
    }
}
