using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public class Parent
    {
        protected string name;

        public Parent()
        {
            Console.WriteLine("Parent()");
        }

        public Parent(string name)
        {
            this.name = name;
        }
        ~Parent()
        {
            Console.WriteLine("~Parent()");
        }
        //오버라이딩을 할려면 virtual 키워드를 부모 메서드에서 지정
        public virtual void PrintParentInfo()
        {
            Console.WriteLine($"Parent 이름 : {name}");
        }
    }
    //                 : 부모클래스
    public class Child : Parent
    {
        public Child()
        {
            Console.WriteLine("Child()");
        }
        //                          부모 생성자 호출
        public Child(string name) : base(name)
        {

        }

        //소멸자는 자식부터 호출
        ~Child()
        {
            Console.WriteLine("~Child()");
        }

        public override void PrintParentInfo()
        {
            Console.WriteLine($"Child 이름 : {name}");
        }
    }

}
