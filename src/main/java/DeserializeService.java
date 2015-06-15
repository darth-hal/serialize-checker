import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeService {

	public static void desirialize(String path) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			NoVersionSerializableObject serializableObject = (NoVersionSerializableObject) ois.readObject();
			System.out.println("LOAD: " + serializableObject.toString());
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(e);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
