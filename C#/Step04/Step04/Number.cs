using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public class Number
    {
        private static Number instance = new Number();
        private int num;
        private Number()
        {
            num = 0;
        }

        public static Number GetInstance()
        {
            instance.num++;
            if(instance == null)
                instance = new Number();
            return instance;
        }
        public int GetNum() { return num; }
    }
}
