package obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\test\\person.dat");
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println(p.toString());
			p = (Person) ois.readObject(); //EOF Exception 발생
			System.out.println(p.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null)ois.close();
				if(fis != null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}





