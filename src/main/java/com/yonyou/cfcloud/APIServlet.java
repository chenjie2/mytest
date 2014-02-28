package com.yonyou.cfcloud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class APIServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;
        

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/plain");
                response.setStatus(200);
                Map<String,String> paras = new HashMap<String, String>();
                Enumeration<?> en = request.getParameterNames();
                while (en.hasMoreElements()) {
                    String paramName = (String) en.nextElement();
                    paras.put(paramName, request.getParameter(paramName));
                }
                Object result = null ;
                if(paras.get("cmd")!=null){
                	Command cmd = Commands.getCommand(paras.get("cmd"));
                	result =  cmd.exec(paras);
                }

                PrintWriter writer = response.getWriter();
                Gson gson = new Gson();
                writer.print(gson.toJson(result));
                writer.close();
        }
        
}
