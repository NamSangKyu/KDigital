using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public abstract class Gun
    {
        public abstract void shot();
        public virtual void reload()
        {
            Console.WriteLine("reload!!");
        }
    }

    class M16 : Gun
    {
        public override void shot()
        {
            Console.WriteLine("BBang!!");
        }
        
    }
}
