import java.util.List;

public class DesignMetods {
//Max 4 args
// use builder
//Use interfaces
// prefer enum over boolean
	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C", "A", "C", "A", "D");
		List<String> subList = list.subList(2, 6);
		System.out.println(subList);
		System.out.println(fistIndexOfSubList(subList, "A"));
		System.out.println(lastIndexOfSubList(subList, "A"));
	}

	private static int fistIndexOfSubList(List<String> subList, String element) {

		return subList.indexOf("A");
	}

	private static int lastIndexOfSubList(List<String> subList, String element) {

		return subList.lastIndexOf("A");
	}
}
