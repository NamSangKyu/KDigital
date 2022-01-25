package service;

import dao.MemberDAO;

public class MemberService {
	private static MemberService instance = new MemberService();

	private MemberService() {
	}

	public static MemberService getInstance() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}
	
	public String login(String id, String pass) {
		return MemberDAO.getInstance().login(id, pass);
	}
	
	
}
