package sk.garwan.jee2pc.service;

import javax.ejb.Remote;

@Remote
public interface TransactionService2DBs {

	void doInTransaction();

	void doInTransactionWithException();

	void doWithoutTransactionWithException();
}
