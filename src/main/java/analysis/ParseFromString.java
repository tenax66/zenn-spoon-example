package analysis;

import java.util.Set;

import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

public class ParseFromString {

	public static void main(String[] args) {
		CtClass<?> classA = Launcher
				.parseClass("class A { void foo() { System.out.println(\"yeah\");} String bar() { return \"yeah\" }");

		Set<CtMethod<?>> methods = classA.getMethods();

		for (CtMethod<?> method : methods) {
			System.out.println(method.getSimpleName());
			System.out.println(method.getType());
		}
	}

}
