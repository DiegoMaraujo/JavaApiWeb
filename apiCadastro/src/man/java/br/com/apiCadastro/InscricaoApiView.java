package br.com.apiCadastro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inscricao")
public class InscricaoApiView extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException ,IOException {
		System.out.println("Teste Api");
		PrintWriter out = resp.getWriter();
		out.print("<h1> Api com Servlet ! <h1>");
		
	}
	
}
