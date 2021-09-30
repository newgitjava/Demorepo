package day15.learning;

import java.io.Serializable;

public class SingletonUtil implements Serializable, Cloneable {

	private static SingletonUtil instance;

	private SingletonUtil() {

	}

	public static SingletonUtil getInstance() {

		if (instance == null) {
			synchronized (SingletonUtil.class) {
				if (instance == null) {
					instance = new SingletonUtil();
				}

			}
		}
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}

}
