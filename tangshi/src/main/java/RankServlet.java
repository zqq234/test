import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @className RankServlet
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/14 10:16
 * @Version 1.0
 **/
@WebServlet("/rank.json")
public class RankServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String condition= req.getParameter("condition");
        if(condition==null){
            condition="5";
        }
        JSONArray jsonArray=new JSONArray();
        try {
            Connection connection=DBconfig.getConnection();
            String sql="select author,count(*) as cnt from tangshi group by author having cnt>=?";

            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,condition);
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                String author=rs.getString("author");
                int count=rs.getInt("cnt");
                JSONArray item=new JSONArray();
                item.add(author);
                item.add(count);
                jsonArray.add(item);
            }
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write(jsonArray.toJSONString());

        } catch (SQLException e) {
            e.printStackTrace();
            JSONObject object=new JSONObject();
            object.put("error",e.getMessage());
            resp.getWriter().write(object.toJSONString());
        }

    }
}
