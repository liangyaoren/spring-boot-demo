package com.example.demo.util;

import java.util.HashMap;

public class Result extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	public static Result error() {
		return error(-1, "未知异常，请联系管理员");
	}
	
	public static Result error(String msg) {
		return error(-1, msg);
	}
	
	public static Result error(int code, String msg) {
		Result r = new Result();
		r.put("code", code);
		r.put("msg", msg);
		r.put("data", null);
		return r;
	}

	public static Result ok() {
		Result r = new Result();
		r.put("code", 0);
		r.put("msg", "success");
		r.put("data", null);
		return r;
	}

	public static Result ok(String msg) {
		Result r = new Result();
		r.put("code", 0);
		r.put("msg", msg);
		r.put("data", null);
		return r;
	}

	public static Result ok(Object obj) {
		Result r = new Result();
		r.put("code", 0);
		r.put("msg", "success");
		r.put("data", obj);
		return r;
	}
	
	public static Result ok(String msg, Object obj) {
		Result r = new Result();
		r.put("code", 0);
		r.put("msg", msg);
		r.put("data", obj);
		return r;
	}

	@Override
	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
