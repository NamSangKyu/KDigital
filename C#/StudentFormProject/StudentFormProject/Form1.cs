using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StudentFormProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void MainForm_Load(object sender, EventArgs e)
        {
            /*
            ColumnHeader[] columns =
           {
                new ColumnHeader(){Text ="학번",Width=60,TextAlign=HorizontalAlignment.Center},
                new ColumnHeader(){Text ="이름",Width=80,TextAlign=HorizontalAlignment.Center},
                new ColumnHeader(){Text ="학과",Width=80,TextAlign=HorizontalAlignment.Center},
                new ColumnHeader(){Text ="평점",Width=60,TextAlign=HorizontalAlignment.Center}
            };
            ListStudent.View = View.Details;
            ListStudent.Columns.AddRange(columns);

            string[] majors = { "경제학과", "경영학과", "컴퓨터공학과", "게임학과" };
            cbx_major.Items.AddRange(majors);
            */
            cbx_major.SelectedIndex = 0;
        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            string[] arr =
            {
                txt_no.Text, txt_name.Text, 
                cbx_major.SelectedItem.ToString(),txt_score.Text
            };
            ListViewItem item = new ListViewItem(arr);
            ListStudent.Items.Add(item);
            MessageBox.Show("데이터 추가 완료", "알림창");
        }

        private void btn_delete_Click(object sender, EventArgs e)
        {
            if (ListStudent.Items.Count == 0) return;
            if (ListStudent.FocusedItem == null) return;
            int idx = ListStudent.FocusedItem.Index;
            ListStudent.Items[idx].Remove();
        }

        private void ListStudent_ItemSelectionChanged(object sender, ListViewItemSelectionChangedEventArgs e)
        {
            if(ListStudent.SelectedItems.Count == 0) return;
            int idx = ListStudent.FocusedItem.Index;
            txt_no.Text = ListStudent.Items[idx].SubItems[0].Text;
            txt_name.Text = ListStudent.Items[idx].SubItems[1].Text;
            cbx_major.SelectedItem = ListStudent.Items[idx].SubItems[2].Text;
            txt_score.Text = ListStudent.Items[idx].SubItems[3].Text;

        }

        private void btn_update_Click(object sender, EventArgs e)
        {
            if (ListStudent.SelectedItems.Count == 0) return;
            if (ListStudent.FocusedItem == null) return;
            int idx = ListStudent.FocusedItem.Index;
            ListStudent.Items[idx].SubItems[0].Text = txt_no.Text;
            ListStudent.Items[idx].SubItems[1].Text = txt_name.Text;
            ListStudent.Items[idx].SubItems[2].Text = cbx_major.SelectedItem.ToString();
            ListStudent.Items[idx].SubItems[3].Text = txt_score.Text;
        }
    }
}
