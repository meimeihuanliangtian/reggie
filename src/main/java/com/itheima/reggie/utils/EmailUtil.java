package com.itheima.reggie.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtil {
    public static void sendAuthCodeEmail(String email, String authCode) {
        try {
            SimpleEmail mail = new SimpleEmail();
            mail.setHostName("smtp.qq.com");//发送邮件的服务器,这个是qq邮箱的，不用修改
            mail.setAuthentication("1098771179@qq.com", "exlpsbacaafpfhbj");//第一个参数是对应的邮箱用户名一般就是自己的邮箱第二个参数就是SMTP的密码,我们上面获取过了
            mail.setFrom("1098771179@qq.com","百度科技技术有限公司");  //发送邮件的邮箱和发件人
            mail.setSSLOnConnect(false); //使用安全链接
            mail.addTo(email);//接收的邮箱
            mail.setSubject("jht问候信");//设置邮件的主题
            mail.setMsg("尊敬的蒋海涛同学:你好!\n 请不要过度学习，及时享受人生，享受当下。jht祝您年年有今日，岁岁有今朝！！！！");//设置邮件的内容
            mail.send();//发送
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

}
