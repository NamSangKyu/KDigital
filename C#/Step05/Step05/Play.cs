using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step05
{
    //프로퍼티도 오버라이딩을 강제화가 가능
    public interface Play
    {
        bool power { get; set; }
    }

    class Gom : Play
    {
        public bool power { get ; set; }
    }
}
