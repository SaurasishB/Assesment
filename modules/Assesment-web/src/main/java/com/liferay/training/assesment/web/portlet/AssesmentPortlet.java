package com.liferay.training.assesment.web.portlet;

import com.liferay.training.assesment.web.constants.AssesmentPortletKeys;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;


/**
 * @author me
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Assesment", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + AssesmentPortletKeys.ASSESMENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AssesmentPortlet extends MVCPortlet {
	@ProcessAction(name = "addEntry")
	public void addEntry(ActionRequest request, ActionResponse response) {
		try {
			String firstName = ParamUtil.getString(request, "firstName");
			String lastName = ParamUtil.getString(request, "lastName");
			String email = ParamUtil.getString(request, "emailId");
			String userName = ParamUtil.getString(request, "userName");
			String phoneNumber = ParamUtil.getString(request, "phoneNumber");
			String roles = ParamUtil.getString(request, "roles");
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

			User user = UserLocalServiceUtil.addUser(themeDisplay.getUserId(), themeDisplay.getCompanyId(), false, "test",
					"test", false, firstName + lastName, email, themeDisplay.getLocale(), firstName, "", lastName, 0, 0,
					false, 0, 1, 1970, "dealer", null, null, null, null, false, new ServiceContext());
			List<Role> role = RoleLocalServiceUtil.getRoles(themeDisplay.getCompanyId());
			long roleId = 0l;
			for (Role rolesingle : role) {
				if (rolesingle.getName().equals("dealer")) {
					roleId = rolesingle.getRoleId();
					break;
				}
				
			}
			UserLocalServiceUtil.addRoleUser(roleId, user.getUserId());
			
			Phone phone = PhoneLocalServiceUtil.createPhone(user.getUserId());
			phone.setUserName(userName);
			phone.setNumber(phoneNumber);
			phone.setUserId(user.getUserId());
			PhoneLocalServiceUtil.addPhone(phone);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	public void deleteEntry(ActionRequest request, ActionResponse response) {
		try {
			long userId = ParamUtil.getLong(request, "userId");
			long phoneId = ParamUtil.getLong(request, "phoneId");
			UserLocalServiceUtil.deleteUser(userId);
			PhoneLocalServiceUtil.deletePhone(phoneId);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void updateEntry(ActionRequest request, ActionResponse response) {
		long userId = ParamUtil.getLong(request, "userId");
		long phoneId = ParamUtil.getLong(request, "phoneId");
		String firstName = ParamUtil.getString(request, "firstName");
		String lastName = ParamUtil.getString(request, "lastName");
		String emailAddress = ParamUtil.getString(request, "emailId");
		System.out.println(emailAddress+"hell");
		String screenName = ParamUtil.getString(request,"userName");
		String number = ParamUtil.getString(request,"phoneNumber");
		try {
			User user = UserLocalServiceUtil.getUser(userId);
			Phone phone =PhoneLocalServiceUtil.getPhone(phoneId);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmailAddress(emailAddress);
			System.out.println(emailAddress);
			user.setScreenName(screenName);
			System.out.println("hello4");
			phone.setUserName(screenName);
			phone.setNumber(number);
			phone.setUserId(userId);
			System.out.println("hello4");
			UserLocalServiceUtil.updateUser(user);
			System.out.println(user.getEmailAddress());
			PhoneLocalServiceUtil.updatePhone(phone);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
