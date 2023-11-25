package analysis;

import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;

public class ParseResources {
	public static void main(String[] args) {
		SpoonAPI spoon = new Launcher();
		spoon.addInputResource("src/main/java/myclass");
		CtModel model = spoon.buildModel();
	}
}
