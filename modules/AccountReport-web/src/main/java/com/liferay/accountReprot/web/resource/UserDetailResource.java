package com.liferay.accountReprot.web.resource;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.io.PrintWriter;
import java.util.List;

import com.liferay.accountReport.web.constants.AccountReportPortletKeys;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.validation.Validator;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + AccountReportPortletKeys.ACCOUNTREPORT,
			"mvc.command.name=/user/detail"
		},
		service = MVCResourceCommand.class
	)
public class UserDetailResource implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest request, ResourceResponse response) {
		try {
		List<User> userDataList = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
		JSONArray jsonArrayData = JSONFactoryUtil.createJSONArray();
		
		userDataList.stream().forEach((userData)->{
			JSONObject data = JSONFactoryUtil.createJSONObject();
			//fetching data from database
			String emailAddress = userData.getEmailAddress();
			String firstName = userData.getFirstName();
			String lastName = userData.getLastLoginIP();
			String screenName = userData.getScreenName();
			
			//storng it in json objects
			data.put("EmailAddress", emailAddress);
			data.put("FirstName", firstName);
			data.put("LastName", lastName);
			data.put("ScreenName", screenName);
			
			//put the object in json object array
			jsonArrayData.put(data);	
		});
		if (jsonArrayData!=null && jsonArrayData.length() > 1) {

			PrintWriter out = response.getWriter();
			out.println(jsonArrayData.toString());
		} 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
