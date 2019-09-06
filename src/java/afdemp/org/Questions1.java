/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afdemp.org;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author George.Pasparakis
 */
public class Questions1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //File file = new File("/quiz2.json"); 
        //BufferedReader br = new BufferedReader(new FileReader(file)); 
        //String st; 
    
        response.setContentType("application/json;charset=UTF-8");
        //response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Methods", "GET, PUT, POST, OPTIONS, DELETE");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
            response.addHeader("Access-Control-Max-Age", "86400");
            //while((st = br.readLine()) != null) out.println();
            out.println("{\n" +
"    \"Brand\": \"Samsung\",\n" +
"    \"Model\": \"Galaxy S8\",\n" +
"    \"Pic\": \"s8.jpg\",\n" +
"    \"Cores\": 9,\n" +
"    \"StorageGB\": 64,\n" +
"    \"ScreenSizeInches\": 5.8,\n" +
"    \"Features\": [\"SMS\",\"MMS\",\"Email\",\"Push\",\"Mail\",\"IM\"]\n" +
"}");
          /*  out.println("[\n" +
"  {\n" +
"    \"questions\": [\"Tι είναι το Coding Bootcamp;\",\"Ποια είναι η διαδικασία επιλογής των υποψηφίων;\",\"Υπάρχει κάποιο όριο ηλικίας για τη συμμετοχή στο πρόγραμμα;\",\"Ποιο είναι το κόστος του προγράμματος;\",\"Θα βρω εργασία ως προγραμματιστής με τη λήξη του Bootcamp;\",\"Που γίνονται τα μαθήματα;\",\"Πόσο διαρκεί το πρόγραμμα μαθημάτων;\",\"Ποιος θα κάτσει στον Σιδερένιο Θρόνο στο Game of Thrones;\",\"Ποια τραγουδίστρια θα παρουσιάσει το 7 Rings στα Billboard Music Awards 2019;\",\"Ποιος από τους παρακάτω οδηγούς θα κερδίσει το Ισπανικό Grand Prix της F1 στην Ισπανία;\"]\n" +
"      \n" +
"  },\n" +
"  {\n" +
"    \"answers\": \n" +
"      {\n" +
"        \"1\": [\"Μια σχολή πολεμικών τεχνών για προγραμματιστές\",\"Ένα ιδιαίτερα εντατικό πρόγραμμα το οποίο παρέχει ταχύρρυθμη εκπαίδευση και πιστοποίηση στον τομέα του προγραμματισμού\",\"Δεν ξέρω\",\"Ήρθα για να μάθω\"],\n" +
"        \"2\": [\"Να είσαι παθιασμένος με τον Προγραμματισμό\",\"Να είσαι προετοιμασμένος να εργαστείς σκληρά καθώς το πρόγραμμα είναι πολύ απαιτητικό\",\"Να γνωρίζεις καλά Αγγλικά (Επίπεδο Β2)\",\"Όλα τα παραπάνω\"],\n" +
"        \"3\": [\"Ναι, από βρέφος έως 175 ετών\",\"Όχι δεν υπάρχει\",\"Ίσως αλλά δεν μου το λένε\",\"Κανένα από τα παραπάνω\"],\n" +
"        \"4\": [\"Άκουσα ότι θα με πληρώσουν 2500 ευρώ για να παρακολουθήσω\",\"Ίσως πρέπει να πληρώσω κάποια συνδρομή, 5 ευρώ το μήνα\",\"Νομίζω κοστίζει 200 το μήνα\",\"Το κόστος είναι 2500 ευρώ\"],\n" +
"        \"5\": [\"Δεν νομίζω\",\"Έτσι διαφημίζουν\",\"Έχει υψηλό ποσοστό απασχολησιμότητας\",\"Μόνο εφόσον ακολουθήσω πιστά το πρόγραμμα\"],\n" +
"        \"6\": [\"Στην παραλία\",\"Σε διάφορα νησιά της Ελλάδας\",\"Σε σύγχρονες εγκαταστάσεις στο κέντρο της Αθήνας\",\"Διαδικτυακά\"],\n" +
"        \"7\": [\"3 μήνες\",\"6 μήνες\",\"500 ώρες\",\"3 ή 6 μήνες με σύνολο 500 ώρες μαθημάτων\"],\n" +
"        \"8\": [\"ο δράκος\",\"ο Τζον Σνόου\",\"ο Σάμγουελ Τάρλυ\",\"ο Χόντορ\"],\n" +
"        \"9\": [\"Jennifer Lopez\",\"Άννα Βίσση\",\"Ariana Grande\",\"Rihanna\"],\n" +
"        \"10\": [\"Ποπάυ\",\"Spider Man\",\"Superman\",\"Chuck Norris\"]\n" +
"      }\n" +
"  },\n" +
"  {\n" +
"    \"correct\": [1,3,1,3,3,2,3,1,2,3]\n" +
"  }\n" +
"]");*/
            out.flush();
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
