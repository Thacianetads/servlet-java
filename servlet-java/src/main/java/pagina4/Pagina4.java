package pagina4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Pagina4
 */
@WebServlet("/Pagina4")
public class Pagina4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pagina4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
                      "        <br>" +
                      "        <section>" +
                      "                <div align=\"center\">" +
                      "                		<h2>Agende sua consulta!</h2>" +
                      "                <form action=\"/action_page.php\" target=\"_blank\">" +
                      "						<input type=\"text\" placeholder=\"Nome\" required name=\"Nome\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<input type=\"text\" placeholder=\"Email\" required name=\"Email\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<input type=\"text\" placeholder=\"CPF\" required name=\"CPF\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "                     <input type=\"datetime-local\" placeholder=\"data\" required name=\"data\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<select id=\"especialidade\" required name=\"especialidade\" style=\"width: 325px; height: 45px; font-size: 16px; padding: 0 10px;\">\n" +
                      "							<option value=\"selecione\">Selecione uma opção</option>" +
                      "							<option value=\"Cardiologia\">Cardiologia</option>" +
                      "							<option value=\"Dermatologia\">Dermatologia</option>" +
                      "							<option value=\"Ortopedia\">Ortopedia</option>" +
                      "							<option value=\"Pediatria\">Pediatria</option>" +
                      "        				</select>" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<button type=\"submit\"> Enviar </button>" +
                      "        				<br>" +
                      "        				<br>" +
                      "                </form>" +
                      "                </div>" +
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
