package springcoretutorial.services;

public class AccountService {
	private static AccountService clientService = new AccountService();

	private AccountService() {
	}

	public static AccountService createInstance() {
		return clientService;
	}
}
