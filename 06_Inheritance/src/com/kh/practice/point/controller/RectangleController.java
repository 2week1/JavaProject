package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();

	public String calcPerimeter(int x, int y, int width, int height) {
		//면적 : 너비 * 높이
		r = new Rectangle (x, y, width, height);
		return "면적 : " + r.toString() + " / " + (r.getWidth() * r.getHeight());
	}

	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle (x, y, width, height);
		// 둘레 : 2 * (너비 + 높이)
		return  "둘레 : " + r.toString() + " / " + (2 * (r.getWidth() + r.getHeight()));
	}
	

}