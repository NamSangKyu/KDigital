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

        public Person(string name, int age)
        {
            this.name = name;
            this.age = age;
        }
        ~Person()
        {
            Console.WriteLine("~Person()");
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
        }
    }
}


