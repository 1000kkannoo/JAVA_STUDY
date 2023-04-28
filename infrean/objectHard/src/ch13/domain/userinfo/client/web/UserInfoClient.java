package ch13.domain.userinfo.client.web;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        // name = value 페어로 아이템을 가지게 됨
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo("user01", "하이룽", "sakdask1234");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("Not Support");
        }

        if(userInfoDao != null){
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
