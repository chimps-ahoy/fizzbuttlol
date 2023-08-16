import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {
	public static void main(String[] args) {

		int range = (args.length > 0 ? Integer.parseInt(args[0]) : 150);

		Map<Integer,String> table = new TreeMap<Integer,String>();
		table.put(5,"buzz");
		table.put(3,"fizz");
		table.put(7,"baz");
		table.put(11,"bar");

		for (int i = 0; i <= range; i++) {
			System.out.print(i + " - ");
			for (Integer key : table.keySet()) {
				if (i%key == 0) {
					System.out.print(table.get(key));
				}
			}
			System.out.print('\n');
		}
	}
}
