package org.neos.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;

/**
 * Helper class for accessing file via a generic method When Java application
 * accesses resource files, it can directly use file reader. However, when it is
 * executing as an applet, it needs to use other method.
 * 
 * This class provide unified interface for accessing resource file.
 * 
 * @author Thawan Kooburat
 * 
 */
public class FileUtils {
	/**
	 * Use this mode when running Java application directly
	 */
	public static final int APPLICATION_MODE = 0;

	/**
	 * Use this mode when executing as an applet
	 */
	public static final int APPLET_MODE = 1;

	private static FileUtils self = null;

	private int mode;

	private FileUtils() {

	}

	/**
	 * Create FileUtils instance for a specified mode
	 * 
	 * @param mode
	 * @return
	 */
	public static FileUtils getInstance(int mode) {
		if (self == null) {
			self = new FileUtils();
			self.mode = mode;
		}

		return self;
	}

	public String readFile(String fileName) {

		StringBuffer content = new StringBuffer();
		String line;
		BufferedReader in;
		try {
			Reader reader;
			if (mode == APPLET_MODE)
				reader = new InputStreamReader(
						FileUtils.class.getResourceAsStream("/" + fileName));
			else
				reader = new FileReader(fileName);

			in = new BufferedReader(reader);

			while ((line = in.readLine()) != null)
				content.append(line + "\n");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content.toString();
	}

	public byte[] readBinaryFile(String fileName) {

		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

		byte buffer[] = new byte[1024];

		int read;

		try {
			DataInputStream reader;
			if (mode == APPLET_MODE)
				reader = new DataInputStream(
						FileUtils.class.getResourceAsStream("/" + fileName));
			else
				reader = new DataInputStream(new FileInputStream(fileName));

			while ((read = reader.read(buffer, 0, buffer.length)) >= 0) {
				byteStream.write(buffer, 0, read);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return byteStream.toByteArray();
	}

	/**
	 * Use to clone object and its children. Useful for cloning a collection.
	 * Standard Java clone only do shallow copy, so object in a collection is
	 * not cloned.
	 * 
	 * @param oldObj
	 * @return
	 */
	static public Object deepCopy(Object oldObj) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Object result = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream(); // A
			oos = new ObjectOutputStream(bos); // B
			// serialize and pass the object
			oos.writeObject(oldObj); // C
			oos.flush(); // D
			ByteArrayInputStream bin = new ByteArrayInputStream(
					bos.toByteArray()); // E
			ois = new ObjectInputStream(bin); // F
			// return the new object
			result = ois.readObject(); // G

			oos.close();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}

}
