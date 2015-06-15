import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeService {

	public static void serialize(String path) {

		NoVersionSerializableObject object = new NoVersionSerializableObject("Serialize", new Date());
		try {
			ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(path));
			oss.writeObject(object);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		System.out.println("SAVE: " + object.toString());

	}
}
