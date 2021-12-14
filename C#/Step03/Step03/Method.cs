using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step03
{
    internal class Method
    {
        //리턴 O, 매개변수 O
        public static int Sum(int a, int b)
        {
            return a + b;
        }
        //리턴 O, 매개변수 X
        public static int InputNumber()
        {
            Console.Write("숫자 하나 입력 : ");
            return int.Parse(Console.ReadLine());
        }
        //리턴 X, 매개변수 O
        public static void PrintResult(int result)
        {
            Console.WriteLine("두수의 합 : "+result);
        }
        //리턴 X, 매개변수 X
        public static void PrintMessage()
        {
            Console.WriteLine("두수의 합을 구하는 프로그램을 수행합니다.");
        }
        /*
         *  음료 자판기
         *      금액을 하나 입력 받아서
         *      아래 예시와 같이 뽑을수 있는 음료수와 잔돈을 출력
         *      
         *      금액 3000 보냈을때
         *      음료수 1개, 잔돈 2300원
         *      음료수 2개, 잔돈 1600원
         *      음료수 3개, 잔돈 900원
         *      음료수 4개, 잔돈 200원
         */
        public static void VendiMachine(int money)
        {
            int count = 0;
            while (money >= 700) { 
                count++;
                money -= 700;
                Console.WriteLine($"음료수 = {count}개, 잔돈 = {money}");
            }
        }
        /*
         * 매개변수로 정수를 하나 받아서
         * 해당 숫자가 완전수 인지 판단하는 함수
         * 매개변수로 받은 정수가 완전수 이면 true 리턴
         * 매개변수로 받은 정수가 완전수가 아니면 false 리턴
         * 
         * 완전수 : 자신과 동일한 약수를 제외한
         *         약수들의 전체 합이 자기와 동일한 숫자
         *         
         *         6 == 1 + 2 + 3
         *         
         *         메서드명 : CheckPerfectNumber
         */
        public static bool CheckPerfectNumber(int num)
        {
            bool result = false;
            int total = 0;
            for (int i = 1; i < num; i++)
            {
                if(num % i == 0)
                {
                    total += i;
                }
            }
            if(total == num) result = true;
            return result;
        }
        /*
         *  매개변수로 정수 두개를 받아서
         *  두 정수의 최대 공약수를 리턴하는 메서드
         *  
         *  메서드명 : GetGcd
         */
        static void Main(string[] args)
        {
            /*
            PrintMessage();
            int n1 = InputNumber();
            int n2 = InputNumber();
            int result = Sum(n1, n2);
            PrintResult(result);
            */
            VendiMachine(3000);
            Console.WriteLine(CheckPerfectNumber(4));
        }
    }
}
