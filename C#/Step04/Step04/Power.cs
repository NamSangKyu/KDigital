using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public interface Power
    {
        void PowerOn();
        void PowerOff();
    }
    public interface UpDown
    {
        void Up();
        void Down();
    }
    public class Aircon : Power, UpDown
    {
        public void Down()
        {
            Console.WriteLine("온도 Down");
        }
        public void Up()
        {
            Console.WriteLine("온도 Up");
        }

        public void PowerOff()
        {
            Console.WriteLine("AirCon Off");
        }

        public void PowerOn()
        {
            Console.WriteLine("AirCon On");
        }

    }
}
