package processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 * 空のメソッド用のprocessor.
 */
public class EmptyMethodProcessor extends AbstractProcessor<CtMethod<?>> {
	public void process(CtMethod<?> method) {
		if (method.getBody().getStatements().isEmpty()) {
			System.out.println("Empty method body: " + method.getSimpleName());
		}
	}
}
