package in.suraj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.suraj.binding.DashboardResponse;
import in.suraj.binding.EnquiryForm;
import in.suraj.binding.EnquirySearchCriteria;

@Service
public interface EnquiryService {
	
	public List<String> getCourseNames();
	
	public List<String> getEnquiryStatus();
	
	public DashboardResponse getDashBoardData(Integer UserId);
	
	public String upsertEnquiry(EnquiryForm form);

	public List<EnquiryForm> getEnquiries(Integer UserId, EnquirySearchCriteria criteria);
	
	public EnquiryForm getEnquiry(Integer UserId);

}
