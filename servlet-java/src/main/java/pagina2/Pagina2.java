package pagina2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Pagina2
 */
@WebServlet("/Pagina2")
public class Pagina2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pagina2() {
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
                      "                <h2>Mais de 15 anos promovendo saúde.</h2>" +
                      "                <p>A clínica Saúde & Vida nasceu com o propósito de transformar a experiência do paciente, integrando atendimento médico humanizado, tecnologia diagnóstica e conforto em um único local.</p>" +
                      "        </section>" +
                      "         <section>" +
                      "                <img src=\"clinica.jpg\" alt=\"med\" title=\"clinica\" style=\"width: 600px; height: auto;\">" +
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
