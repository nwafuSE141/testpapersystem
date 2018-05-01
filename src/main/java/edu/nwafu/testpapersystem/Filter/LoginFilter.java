package edu.nwafu.testpapersystem.Filter;

import com.alibaba.fastjson.JSONObject;
import edu.nwafu.testpapersystem.domain.entity.User;
import edu.nwafu.testpapersystem.util.JsonHandler;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request= (HttpServletRequest) servletRequest;
        User user1=new User();
        user1.setId(1);
        (request.getSession()).setAttribute("user",user1);
        User user= (User) request.getSession().getAttribute("user");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        if(user==null){
            JSONObject jsonObject= JsonHandler.jsonFail("当前用户没有登陆");
            PrintWriter writer=servletResponse.getWriter();
            writer.print(jsonObject);
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}
