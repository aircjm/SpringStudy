/****************************************************************************************
 * 途牛科技有限公司
 ****************************************************************************************/
package com.ioc.spring1;

/**
 * <Description> <br> 
 *
 * @author chenjiaming<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016/2/23 <br>
 */
public class HelloWorld {
    @Override
    public String toString() {
        return "HelloWorld{" +
                "user='" + user + '\'' +
                '}';
    }

    private String user;

    public HelloWorld() {
        System.out.println("HelloWorld constructor");
    }

    public HelloWorld(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
