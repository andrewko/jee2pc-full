package sk.garwan.jee2pc.service;

import javax.ejb.Remote;

@Remote
public interface BookStore {

	String receiveMessage();

}
