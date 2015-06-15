import java.io.Serializable;
import java.util.Date;

public class NoVersionSerializableObject implements Serializable {

	public NoVersionSerializableObject(String name, Date createdAt) {
		this.name = name;
		this.createdAt = createdAt;
	}

	protected String name;
	
	protected Date createdAt;

	public String getName() {
		return name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	@Override public String toString() {
		final StringBuilder sb = new StringBuilder("NoVersionSerializableObject{");
		sb.append("name='").append(name).append('\'');
		sb.append(", createdAt=").append(createdAt);
		sb.append('}');
		return sb.toString();
	}
}
