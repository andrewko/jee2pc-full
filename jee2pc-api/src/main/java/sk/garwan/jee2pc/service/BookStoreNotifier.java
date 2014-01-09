package sk.garwan.jee2pc.service;

import javax.ejb.Remote;

@Remote
public interface BookStoreNotifier {

	String sendMessage(String text);

	String sendMessageWithException(String text);

}
