package in.suraj.service;

import org.springframework.stereotype.Service;

import in.suraj.binding.LoginForm;
import in.suraj.binding.SignUpForm;
import in.suraj.binding.UnlockForm;

@Service
public interface UserService {
	
	public String login(LoginForm form);
	
	public String signUp(SignUpForm form);
	
	public String unlockAccount(UnlockForm form);
	
	public String forgotPwd(String email);

}
