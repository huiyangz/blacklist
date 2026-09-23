package org.museframework.component.sequence.trace;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component
public class DummyIdGenerator implements ITransIdGenerator {

	private AtomicInteger id = new AtomicInteger();
	@Override
	public String nextId() {
		return id.addAndGet(1)+"";
	}

}
