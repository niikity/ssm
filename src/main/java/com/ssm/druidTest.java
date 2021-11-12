package com.ssm;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.Statement;
import java.io.IOException;

public class druidTest {

    static String driver = "com.mysql.jdbc.Driver";

    static String jdbcUrl = "jdbc:mysql://db-wuyuan-pl.cxxl3m4nwvxk.eu-west-3.rds.amazonaws.com:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC&allowMultiQueries=true";

    static String user = "admin";

    static String passwd = "Wuyuan%2021#pL";

    /**
     * Druid实现
     */
    public static void getUsrInfoWithDruid(DruidDataSource dds) {
        String sql = "insert into users values(\"123\",\"123\")";
        try {
            // 通过属性文件设置Druid参数
            long startTime=System.currentTimeMillis();
            Connection conn = dds.getConnection();
            long endTime=System.currentTimeMillis();
            float excTime=(float)(endTime-startTime)/1000;
            System.out.println("连接时间："+excTime+"s");
            Statement st = conn.createStatement();
            int i = st.executeUpdate(sql);
            System.err.println(i);
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Druid数据源
     *
     * @return
     */
    public static DruidDataSource getDruidDataSource() {
        DruidDataSource dds = new DruidDataSource();
        dds.setUsername(user);
        dds.setUrl(jdbcUrl);
        dds.setPassword(passwd);
        dds.setDriverClassName(driver);
        return dds;
    }


    public static void main(String[] args) throws IOException {
        DruidDataSource dds = getDruidDataSource();
        // 运行100次
        getUsrInfoWithDruid(dds);
    }


}

