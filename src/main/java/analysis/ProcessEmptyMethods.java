package analysis;

import processor.EmptyMethodProcessor;
import spoon.Launcher;

public class ProcessEmptyMethods {

	public static void main(String[] args) {
		Launcher l = new Launcher();
		l.addInputResource("src/main/java/myclass");
		// プロセッサをLauncherに追加
		l.addProcessor(new EmptyMethodProcessor());
		l.run();
	}

}
