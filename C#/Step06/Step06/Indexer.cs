using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step06
{
    public class CustomList
    {
        private int[] arr;

        public CustomList()
        {
            arr = new int[10];
        }

        public int this[int index]
        {
            get { return arr[index]; }
            set
            {
                if(index >= arr.Length)
                {
                    Array.Resize(ref arr, index+1);
                    Console.WriteLine($"배열 크기 증가 : {arr.Length}");
                }
                arr[index] = value;
            }
        }
        //배열 크기 리턴하는 프로퍼티 작성
        public int Length { get { return arr.Length; } }
    }
    internal class Indexer
    {
        static void Main(string[] args)
        {
            CustomList list = new CustomList();

            for(int i=0; i < 15; i++){
                list[i] = i + 1;
            }

            for(int i=0; i < list.Length; i++)
            {
                Console.WriteLine(list[i]); 
            }
        }
    }
}
