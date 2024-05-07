package com.ilp03.entity;

public class Module {
	private int module_id;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Module(int module_id) {
		super();
		this.module_id = module_id;
	}

	public int getModule_id() {
		return module_id;
	}

	public Module(int module_id, String title) {
		super();
		this.module_id = module_id;
		this.title = title;
	}

}
