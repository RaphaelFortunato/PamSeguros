package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModeloLogin;

import java.io.IOException;

@WebServlet("/ServletDeLogin")
public class ServletDeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDeLogin() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(login != null && !login.isEmpty() && senha !=null && !senha.isEmpty()) {
		
			ModeloLogin moLogin = new ModeloLogin();
			moLogin.setLogin(login);
			moLogin.setSenha(senha);
			
			if(moLogin.getLogin().equalsIgnoreCase("adm") && moLogin.getSenha().equalsIgnoreCase("adm")) {
				
				request.getSession().setAttribute("usuario", moLogin.getLogin());
				RequestDispatcher redirecio = request.getRequestDispatcher("sistema/index.jsp");
				redirecio.forward(request, response);
				
				
			}else {
				RequestDispatcher redirecio = request.getRequestDispatcher("index.jsp");
				request.setAttribute("msg", "informe o login e senha corretamente");
				redirecio.forward(request, response);
			}
			
		}else {
			RequestDispatcher redirecio = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "informe o login e senha corretamente");
			redirecio.forward(request, response);
		}
		
		
	}

}
