using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step05
{   
    class Person
    {
        //set/get
        public string Name { get; set; }

        //필드, set/get
        private int age;
        public int Age
        {
            get => age;
            set => age = value;
        }
        private bool gender;
        public bool Gender
        {
            get
            {
                return gender;
            }
            set
            {
                gender = value;
            }
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person();
            person.Age = 30;
            person.Name = "홍길동";
            Console.WriteLine($"{person.Age}, {person.Name}");

        }
    }
}
