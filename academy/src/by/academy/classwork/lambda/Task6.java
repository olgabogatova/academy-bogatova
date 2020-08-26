/*
 * 6. 
	Ќаписать л€мбда выражение, которое принимает на вход объект типа HeavyBox и 
	выводит на консоль сообщение Уќтгрузили €щик с весом nФ. Уќтправл€ем €щик с весом nФ 
	»спользуем функциональный интерфейс Consumer и метод по умолчанию andThen.
 */

package by.academy.classwork.lambda;

import java.util.function.Consumer;

import by.academy.classwork.collections.HeavyBox;

public class Task6 {

	public static void main(String[] args) {

		Consumer<HeavyBox> c = heavybox -> System.out.println("ќтгрузили €щик с весом n");
		Consumer<HeavyBox> b = heavybox -> System.out.println("ќтправл€ем €щик с весом n");

		c.andThen(b).accept(new HeavyBox(11, 5, 6, 7));

	}
}