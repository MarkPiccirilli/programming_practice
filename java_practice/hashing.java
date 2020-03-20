import java.util.Objects;

public class hashing {
	public static void main(String[] args) {
		System.out.println("Hashing practice!");

		int hashCode = Objects.hash(1,2,3);

		System.out.println(hashCode);
	}
}
