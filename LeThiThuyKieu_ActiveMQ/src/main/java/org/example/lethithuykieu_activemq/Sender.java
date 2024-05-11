package org.example.lethithuykieu_activemq;

import jakarta.jms.Connection;
import jakarta.jms.Destination;
import jakarta.jms.JMSException;
import jakarta.jms.MessageProducer;
import jakarta.jms.ObjectMessage;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {
    public static void main(String[] args) throws JMSException{
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        Connection connection = factory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        connection.start();

        Destination destination = session.createQueue("sonnees");
        MessageProducer producer = session.createProducer(destination);

        System.out.println("Waiting....");

        TextMessage textMessage = session.createTextMessage("message text oke");
        producer.send(textMessage);

        Student st = new Student("Ha Phuc Thinh");
        ObjectMessage objectMessage = session.createObjectMessage(st);
        producer.send(objectMessage);

        System.out.println("sending....");
    }
}
