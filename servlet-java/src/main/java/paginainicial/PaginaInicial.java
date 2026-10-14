package paginainicial;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PaginaInicial
 */
@WebServlet("/PaginaInicial")
public class PaginaInicial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaginaInicial() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

        String html = "<!DOCTYPE html>" +
                      "<html lang=\"pt-BR\">" +
                      "<head>" +
                      "    <meta charset=\"UTF-8\">" +
                      "    <link rel=\"stylesheet\" href=\"styles.css\">" +
                                         "</head>" +
                      "    <title>Página Inicial</title>" +
                      "</head>" +
                      "<body>" +
                      "        <div class=\"div1\">" +
                      "                <p>" +
                      "                    <a href=\"http://localhost:8080/atividade-servlet/PaginaInicial\">INICIO</a></h4>" +
                      "                    <a href=\"http://localhost:8080/atividade-servlet/Pagina2\">SOBRE</a></h4>" +
                      "                    <a href=\"http://localhost:8080/atividade-servlet/Pagina3\">CONTATO</a></h4>" +
                      "                    <a href=\"http://localhost:8080/atividade-servlet/Pagina4\">AGENDAMENTO</a></h4>" +
                      "                </p>" +
                      "        </div>" +
                      "         <section>" +
                      "                <h2> Bem vindo </h2>" +
                      "                <p>Consultas, exames de diagnóstico e procedimentos especializados com tecnologia de ponta e um corpo médico renomado.</p>" +
                      "        </section>" +
                      "         <section>" +
                      "                <img src=\"image.jpg\" alt=\"med\" title=\"clinica\" style=\"width: 600px; height: auto;\">" +
                      "        </section>" +
                      "        <footer>" +
                      "                <div class=\"div1\" align=\"center\">" +
                      "                        <p>Desenvolvido na disciplina web 3</p>" +
                      "                </div>" +
                      "        </footer>" +
                      "</body>" +
                      "</html>";

        out.println(html);
	}

}
