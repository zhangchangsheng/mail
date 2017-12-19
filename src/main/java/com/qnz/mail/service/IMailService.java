package com.qnz.mail.service;

import com.qnz.mail.model.Email;

public interface IMailService {

    void send(Email mail);

    void sendHtml(Email mail) throws Exception;

    void sendFreemarker(Email mail) throws Exception;

    void sendThymeleaf(Email mail) throws Exception;
}
