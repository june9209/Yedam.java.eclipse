package com.dev.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 컨트롤러 인터페이스.
public interface Command {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
