package com.beyond.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

@WebServlet("/life.do")
public class LifeServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 925836552546399049L;

    public LifeServlet() {
        System.out.println("LifeServlet constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("LifeServlet init() 메소드 호출");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LifeServlet service() 메소드 호출");
        
        // 요청 방식에 따라 doGet(), doPost(), ... 메소드 호출
        super.service(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LifeServlet doGet() 메소드 호출");
    }

    @Override
    public void destroy() {
        System.out.println("LifeServlet destroy() 메소드 호출");
    }
}
