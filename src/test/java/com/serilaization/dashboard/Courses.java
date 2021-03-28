package com.serilaization.dashboard;

import java.util.List;

public class Courses {
	private List<WebAutomation> webautomation;
	private List<Api> api;
	private List<MobileAutomation> Mobileautomation;

	public List<WebAutomation> getWebautomation() {
		return webautomation;
	}

	public void setWebautomation(List<WebAutomation> webautomation) {
		this.webautomation = webautomation;
	}

	public List<Api> getApi() {
		return api;
	}

	public void setApi(List<Api> api) {
		this.api = api;
	}

	public List<MobileAutomation> getMobileautomation() {
		return Mobileautomation;
	}

	public void setMobileautomation(List<MobileAutomation> Mobileautomation) {
		this.Mobileautomation = Mobileautomation;
	}

	

}
