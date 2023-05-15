package in.suraj.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.suraj.binding.LoginForm;
import in.suraj.binding.SignUpForm;
import in.suraj.binding.UnlockForm;
import in.suraj.entity.UserDtlsEntity;
import in.suraj.repo.UserDtlsRepo;
import in.suraj.utils.EmailUtils;
import in.suraj.utils.PwdUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDtlsRepo userDtlsRepo;
	
	@Autowired
	private EmailUtils emailUtils;
	
	/*
	@Override
	public String login(LoginForm form) {

		// TODO Auto-generated method stub
		return null;
	}
	*/
	@Override
	public boolean signUp(SignUpForm form) {
		
		UserDtlsEntity user = userDtlsRepo.findByEmail(form.getEmail());
		
		if(user != null) {
			return false;
		}
		
		
		// TODO: Copy data from binding obj to entity obj
		UserDtlsEntity entity = new UserDtlsEntity();
		BeanUtils.copyProperties(form, entity);
		
		
		// TODO: generate random pwd and set to object
		String tempPwd = PwdUtils.generateRandomPwd();
		entity.setPwd(tempPwd);

		// TODO: Set account status as LOCKED
		entity.setAccStatus("LOCKED");
		

		// TODO Insert record
		userDtlsRepo.save(entity);
		
		// TODO: Send email to user unlock the account
		
		String to = form.getEmail();
		String subject = "Unlock Your Account | Ashok IT";
		
		StringBuffer body = new StringBuffer("");
		body.append("<h1>Use below temporary password to unlock your account</h1>");
		body.append("Temporary pwd : "+ tempPwd);
		body.append("<br/>");
		
		body.append("<a href=\"http://localhost:8080/unlock?email="+ to +"\">Click Here To Unlock Your Account</a>");
		
		emailUtils.sendEmail(to, subject, body.toString());
	
		return true;
	}
	/*
	@Override
	public String unlockAccount(UnlockForm form) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	/*
	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

}
