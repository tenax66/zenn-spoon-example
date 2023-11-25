package analysis;

import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;

public class ParseResource {
	public static void main(String[] args) {
		SpoonAPI spoon = new Launcher();
		// myclassパッケージ配下のコードを一括で解析対象に追加
		spoon.addInputResource("src/main/java/myclass");
		CtModel model = spoon.buildModel();
		
		for (CtType<?> ctType : model.getAllTypes()) {
			System.out.println(ctType.getQualifiedName());
		}
	}
}
