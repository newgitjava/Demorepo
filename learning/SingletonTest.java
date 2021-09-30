package day15.learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		
		SingletonUtil singlton1 = SingletonUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/Sigleton.ser"));
		oos.writeObject(singlton1);
		
		
		
		
		SingletonUtil singlton2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/Sigleton.ser")));
		singlton2 = (SingletonUtil) ois.readObject();
		
		//SingletonUtil singlton2 = SingletonUtil.getInstance();
		
		System.out.println(singlton1==singlton2);

	}

}
