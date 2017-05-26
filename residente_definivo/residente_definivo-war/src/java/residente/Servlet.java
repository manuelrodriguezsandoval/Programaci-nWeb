/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author Emtor
 */
public class Servlet extends HttpServlet {

    @EJB
    private ValorMenuLocal valorMenu;

    @EJB
    private SacarNombreLocal sacarNombre;

    @EJB
    private CalcularIvaLocal calcularIva;

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("null")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String vendedor = request.getParameter("vendedor");
            String menu = request.getParameter("menu");
            String ensalada = request.getParameter("ensalada");
            String bebestible = request.getParameter("bebestible");
            String observación = request.getParameter("observa");
            
            int cantidad = Integer.parseInt(request.getParameter("cantidadbebida"));
            int ensa = Integer.parseInt(request.getParameter("porensa"));
            int pormenu = Integer.parseInt(request.getParameter("pormenu"));

            //String codven1=sacarNombre.vendedores(codven,1);
            int menu1 = valorMenu.obtenerValor(menu);
            int vEnsalada = valorMenu.valorEnsalada(ensalada);
            int vBebestible = valorMenu.valorBebestible(bebestible);
            int preTotal = menu1 + vEnsalada + vBebestible;
           

            int totalmenu = menu1 * pormenu;
            int totalensa = vEnsalada * ensa;
            int canbebida = vBebestible * cantidad;
            int totalM = (totalmenu + totalensa + canbebida);
            int totalIva= calcularIva.calcularIvaMenu(totalM);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Detalle</title>");
            out.println("<script src=\"js/funciones.js\" type=\"text/javascript\"> </script>");
            out.println("</head>");
            out.println("<body id=\"fondo1\">");
            out.println("<header>\n"
                    + "<center><h1 id=\"menuentrada\">DETALLE DEL PEDIDO</h1></center>\n"
                    + "</header>");
            out.println("<link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<div id=contenedor>");
            out.println("<form>");
            out.println("<br></br>");
            
            out.println("<p>Menú:   </p>"+"<h4>" + menu + "     "
                    + "Precio   "
                     + menu1 + "<p>Cantidad de Menú: </p>" + pormenu);

            if (vEnsalada==0){out.println("<p>Ensalada:   </p> "+"<h4>"+ ensalada + "</h4>");}
            else {out.println("<p>Ensalada:   </p> "+"<h4>"+ ensalada + "               Precio: " + vEnsalada +
             "<p>Cantidad de Ensalada(s): </p>" + ensa);}

            if (vBebestible==0){out.println("<p>Bebidas:    </p>"+"<h4>"+ bebestible + " sin cargo adicional</h4>");}
            else{ out.println("<p>Bebidas:    </p>"+"<h4>"+ bebestible + "           Precio:   " + vBebestible + 
                "<p>Cantidad de Bebidas: </p>" + cantidad);}
            out.println();
            
            out.println();
            out.println();
            out.println("<p>Vendedor:</p> "+"<h4>"+vendedor+"</h4>");
            out.println("<br></br>");
            out.println("<p>Observaciones:</p> "+"<h4>" + observación+"</h4>");
            out.println("<h1>  Total     </h1>");
            out.println("<h4>Total:   $"+ totalM+"</h4> ");
            out.println("<h4>Total con Iva:  $"+ totalIva+"</h4> ");
            out.println("</div>");

          

            out.println();
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
