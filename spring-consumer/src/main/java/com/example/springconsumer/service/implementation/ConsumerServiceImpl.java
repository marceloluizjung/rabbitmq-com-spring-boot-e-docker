package com.example.springconsumer.service.implementation;

import com.example.springconsumer.dto.Message;
import com.example.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public void action(Message message) throws Exception {
        System.out.println(message.getText());
//        throw new Exception("Erro");
    }
}
