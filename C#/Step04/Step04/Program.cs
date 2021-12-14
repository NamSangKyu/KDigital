using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public class Animal
    {
        //필드
        private int age;

        public int GetAge() { return age; }
        public void SetAge(int age) { this.age = age; } 

        //기본 생성자
        public Animal()
        {
            Console.WriteLine("Animal 기본 생성자");
        }
        public Animal(int age)
        {
            this.age = age;
        }
        //메서드
        public void PrintAnimal()
        {
            Console.WriteLine("이 동물의 나이 : " + age);
        }
    }

    public class Person
    {
        private string name;
        private int age;
        //생성자 - 메모리에서 할당 될때 실행
        public Person(string name, int age)
        {
            this.name = name;
            this.age = age;
        }
        //소멸자(종료자) - 메모리에서 해제 될때 실행
        ~Person()
        {
            Console.WriteLine("~Person()");
        }

        public override bool Equals(object obj)
        {
            return obj is Person person &&
                   name == person.name &&
                   age == person.age;
        }

        public void PrintPersonInfo()
        {
            Console.WriteLine($"{name} - {age}");
        }

    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Animal animal = new Animal();//생성
            //animal.age = 20;
            animal.SetAge(20);
            animal.PrintAnimal();

            Person p = new Person("홍길동", 30);
            p.PrintPersonInfo();

            Person s = new Person("홍길동", 30);
            //Console.WriteLine(p == s);
            Console.WriteLine(p.Equals(s));

            Student std1 = new Student("20001111", "홍길동", "경제학과", 3.24);
            std1.PrintInfo();

            TV tv = new TV();
            for(int i = 0; i < 30; i++)
                tv.ChDown();

            Console.WriteLine(Number.GetInstance().GetNum());
            Console.WriteLine(Number.GetInstance().GetNum());
            Console.WriteLine(Number.GetInstance().GetNum());
            Console.WriteLine(Number.GetInstance().GetNum());
            Console.WriteLine("--------------------------");
            Child child = new Child();
            child.PrintParentInfo();
            Child child2 = new Child("홍길동");
            child2.PrintParentInfo();
            Console.WriteLine("--------------------------");
            //추상 클래스는 생성 안됨
            //Gun gun = new Gun();
            M16 m16 = new M16();
            m16.shot();
            //자바의 instanceof 동일한 연산
            Console.WriteLine(m16 is Gun);
            Gun gun = m16;
            gun.shot();
            Console.WriteLine("--------------------------");
            Power power = new Aircon();
            power.PowerOn();
            UpDown upDown = new Aircon();
            upDown.Up();


        }
    }
}


