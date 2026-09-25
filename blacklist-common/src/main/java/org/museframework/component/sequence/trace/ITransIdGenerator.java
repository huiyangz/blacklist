/** 
* Copyright 2019-2022 the original author or authors of Micro-Unitization-Services Engine.
* @author FanLong
* @since MUSE(2020)
**/
package org.museframework.component.sequence.trace;

public interface ITransIdGenerator {
	String nextId();
	//internal test only
	default String getDummyId(String name) {
		return dummyId(name);
	};
	static String dummyId(String name) {
		return System.currentTimeMillis() % 1000000 +"";
	}
	static String[] stringToArray(String inputString) {
		if (inputString==null) return null;
		return inputString.split(",");
	}
}
