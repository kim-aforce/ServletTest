

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/jsp/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Contact() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String company = request.getParameter("company");
        String email = request.getParameter("email");
        String contact = request.getParameter("qna");
        String YesorNo = request.getParameter("Btn");
        String magazine = request.getParameter("option");
        
        out.println("<html><body>");
        out.println("<h2>予約確認</h2>");
        out.println("名前：" + name + "<br>");
        out.println("会社：" + company + "<br>");
        out.println("メールアドレス：" + email + "<br>");
        out.println("お問合せ内容：" + contact + "<br>");
        out.println("資料請求希望：" + YesorNo + "<br>");
        out.println("メルマガ種類：" + magazine + "<br>");


        if ("Yes".equals(YesorNo)) {
            out.println("<p>この度は資料請求いただきありがとうございます。"
                      + "以下のリンクから資料ダウンロードが可能です。</p>");
            response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY); 
    		//302(Found)		
    		response.setHeader("Location", "https://html.spec.whatwg.org/");
        }

        out.println("</body></html>");

	}

}
