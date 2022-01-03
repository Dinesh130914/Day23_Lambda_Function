package com.userentrywithlambda;

@FunctionalInterface
public interface Ivalidate {
	public boolean validate(String regex, String inputs);
}
