package com.example.demo.service;

import com.example.demo.model.InquiryForm;

public class InquiryService {
	public Boolean doInquiryEntry(InquiryForm dataForm) {
		if(!checkInquiry(dataForm)) {
			return false;
		}
		
		if(!insertInquiry(dataForm)) {
			return false;
		}
		
		if(!otherInquiry(dataForm)) {
			return false;
		}
		
		return true;
	}
	
	
	
	private Boolean checkInquiry(InquiryForm dataForm) {
		return true;
	}
	
	
	private Boolean insertInquiry(InquiryForm dataForm) {
		return true;
	}
	
	
	private Boolean otherInquiry(InquiryForm dataForm) {
		return true;
	}
}
