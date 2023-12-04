package analysis;

import java.util.Collection;
import java.util.List;

import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class ParseResource {
	public static void main(String[] args) {
		SpoonAPI spoon = new Launcher();
		// myclassパッケージ配下のコードを一括で解析対象に追加
		spoon.addInputResource("src/main/java/myclass");
		CtModel model = spoon.buildModel();
		
		// myclassパッケージ配下のクラス・インタフェースがCtTypeとして格納されたコレクション
		Collection<CtType<?>> types = model.getAllTypes();
		
		for(CtType<?> t : types) {
			System.out.println(t.getSimpleName() + ": ");
			System.out.println(t.getElements(new TypeFilter<>(CtMethod.class)));
		}
	}
}
