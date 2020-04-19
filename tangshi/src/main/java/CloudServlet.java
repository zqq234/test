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
import java.util.HashMap;

/**
 * @className CloudServlet
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/15 14:03
 * @Version 1.0
 **/
@WebServlet("/words.json")
public class CloudServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JSONArray jsonArray=new JSONArray();
        try {
            HashMap<String,Integer> map=new HashMap<>();
            Connection connection=DBconfig.getConnection();
            String sql="select words from tangshi";
            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                String words=rs.getString("words");
                String[] res=words.split(",");
                for (String str:res) {
                    map.put(str,map.getOrDefault(str,0)+1);
                }
            }

            for(String s:map.keySet()){
                JSONArray item=new JSONArray();
                item.add(s);
                item.add(map.get(s));
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
