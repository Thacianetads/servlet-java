package pagina3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Pagina3
 */
@WebServlet("/Pagina3")
public class Pagina3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pagina3() {
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
                      "        <br>" +
                      "        <section>" +
                      "                <div align=\"center\">" +
                      "                		<h2>Entre em contato conosco</h2>" +
                      "                		<p>Av. Central da Saúde, 1200 - Centro, Curitiba - PR</p>" +
                      "                		<p>Email: contato@clinicasaudevida.com.br</p>" +
                      "                		<p>Segunda a Sexta: 07h às 20h Sábados: 08h às 14h </p>" +
                      "                <form action=\"/action_page.php\" target=\"_blank\">" +
                      "						<input type=\"text\" placeholder=\"Nome\" required name=\"Nome\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<input type=\"text\" placeholder=\"Email\" required name=\"Email\" style=\"width: 300px; height: 40px; font-size: 16px; padding: 0 10px;\">" +
                      "        				<br>" +
                      "        				<br>" +
                      "						<input type=\"text\" placeholder=\"Mensagem\" required name=\"Mensagem\" style=\"width: 300px; height: 80px; font-size: 16px; padding: 0 10px;\">" +
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
