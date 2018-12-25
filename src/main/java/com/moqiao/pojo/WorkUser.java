package com.moqiao.pojo;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
=======
import org.springframework.stereotype.Component;

@Component
>>>>>>> tangyq
=======
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
>>>>>>> develop
public class WorkUser {
    private String usercode;

    private String username;

    private String usersex;

    private String depttype;

    private String deptcode;

    private String titlecode;

    private String epscode;

    private String userpassword;

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype == null ? null : depttype.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getTitlecode() {
        return titlecode;
    }

    public void setTitlecode(String titlecode) {
        this.titlecode = titlecode == null ? null : titlecode.trim();
    }

    public String getEpscode() {
        return epscode;
    }

    public void setEpscode(String epscode) {
        this.epscode = epscode == null ? null : epscode.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }
}