package com.qnz.mail.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class Email implements Serializable {

    private static final long serialVersionUID = 1L;

    // 必选参数
    private String email;
    private String subject;
    private String content;

    // 选填
    private String template;
    private Map<String,String> map;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getKeys(){
        return map.keySet();
    }
}
