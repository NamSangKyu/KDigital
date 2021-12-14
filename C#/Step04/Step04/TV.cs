using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Step04
{
    public class TV
    {
        //전원, 채널(1~455), 음량(0~40), 음소거
        private bool power;
        private int ch;
        private int vol;
        private bool mute;

        public TV()
        {
            power = false;
            ch = 24;
            vol = 10;
            mute = false;
        }
        //전원OnOff
        public void PowerOnOff()
        {
            power = !power;
            if (power)
                Console.WriteLine("TV 전원 On");
            else
                Console.WriteLine("TV 전원 Off");

        }
        //채널Up
        public void ChUp()
        {
            ch++;
            if (ch > 455) ch = 1;
            Console.WriteLine($"현재 채널 : {ch}");
        }
        //채널Down
        public void ChDown()
        {
            ch--;
            if (ch < 1) ch = 455;
            Console.WriteLine($"현재 채널 : {ch}");
        }
        //음량Up
        public void VolUp()
        {
            if(mute) MuteOnOff();
            if (vol < 40) vol++;
            Console.WriteLine($"현재 음량 : {vol}");
        }
        //음량Down
        public void VolDown()
        {
            if(mute) MuteOnOff();
            if (vol > 0) vol--;
            Console.WriteLine($"현재 음량 : {vol}");
        }

        //음소거OnOff
        public void MuteOnOff()
        {
            mute = !mute;
            if (mute)
                Console.WriteLine("음소거 활성화");
            else 
                Console.WriteLine("음소거 비활성화");
        }
    }
}
