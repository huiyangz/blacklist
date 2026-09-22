package com.dcits.common.task;

public interface ITaskContract {
	static void initContext(Request<?> request) { 
		if (request==null) 
			Context.clear();
		else
			new Context(request.getHeader());
	}
	static Context getContext() {return Context.get();}
}
