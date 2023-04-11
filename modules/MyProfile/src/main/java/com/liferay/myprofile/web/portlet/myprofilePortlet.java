package com.liferay.myprofile.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.myprofile.util.CurdOperations;
import com.liferay.myprofile.web.constants.myprofilePortletKeys;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.PhoneLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.testing.service.model.KycDetails;
import com.liferay.testing.service.service.KycDetailsLocalServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=myprofile",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + myprofilePortletKeys.MYPROFILE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class myprofilePortlet extends MVCPortlet {
	
	public List<KycDetails> getKycDetailId(long userId) {
		DynamicQuery dq= KycDetailsLocalServiceUtil.dynamicQuery(); 
		dq.add(RestrictionsFactoryUtil.eq("userId", userId));
		return KycDetailsLocalServiceUtil.dynamicQuery(dq); 

	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
		try{ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
//		long kycDetailIds = CounterLocalServiceUtil.increment(KycDetails.class.getName());
//		KycDetails kycDetail = KycDetailsLocalServiceUtil.createKycDetails(kycDetailIds);
//		kycDetail.setUserId(kycDetailIds);
//		kycDetail.setUserName("testing");
//		kycDetail.setCreateDate(new Date());
//		KycDetailsLocalServiceUtil.addKycDetails(kycDetail);
		
		
		List<KycDetails> kycDetailId = KycDetailsLocalServiceUtil.findByUserId(userId);
		if(kycDetailId==null || kycDetailId.isEmpty())
		{
			renderRequest.setAttribute("address", "");
			renderRequest.setAttribute("pan", "");
			renderRequest.setAttribute("gstn", "");
			renderRequest.setAttribute("business", "");
		}
		else {
			renderRequest.setAttribute("address", kycDetailId.get(0).getAddress());
			renderRequest.setAttribute("pan", kycDetailId.get(0).getPanNumber());
			renderRequest.setAttribute("gstn", kycDetailId.get(0).getGstnNumber());
			renderRequest.setAttribute("business", kycDetailId.get(0).getTypeOfBusiness());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		super.render(renderRequest, renderResponse);
	}
	
	public void updateUser(ActionRequest request, ActionResponse response) throws PortalException {
		System.out.println("hello from userUpdate");
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		long phoneId = ParamUtil.getLong(request, "phoneId");
		String emailAddress = ParamUtil.getString(request, "emailAddress");
		String phoneNumber = ParamUtil.getString(request, "phoneNumber");
		System.out.println(emailAddress + " " + phoneNumber + " " + userId + " " + phoneId);
		User user = UserLocalServiceUtil.getUser(userId);
		Phone phone = PhoneLocalServiceUtil.getPhone(phoneId);
		user.setEmailAddress(emailAddress);
		phone.setNumber(phoneNumber);
		UserLocalServiceUtil.updateUser(user);
		PhoneLocalServiceUtil.updatePhone(phone);
	}
	
	public void addorUpdateDetail(ActionRequest request,ActionResponse response) throws PortalException, IOException {
		try {
			//getting the themedisplay for user detail
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
			long userId = themeDisplay.getUserId();
			
			//getting details from modal forms
			String document = ParamUtil.getString(request, "document");
			String documentNumber = ParamUtil.getString(request, "documentId");
			String message = ParamUtil.getString(request, "message");
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
			File documentProof = uploadPortletRequest.getFile("file");
			String title = uploadPortletRequest.getFileName("file");
			String mimeType = MimeTypesUtil.getContentType(documentProof);
			System.out.println(userId);
//			System.out.println(KycDetailsLocalServiceUtil.getKycDetailByUserId(userId).toString());
			//creating the kycdetail
			KycDetails kycDetail;
			long kycDetailId=0;
			if(KycDetailsLocalServiceUtil.findByUserId(userId)==null || KycDetailsLocalServiceUtil.findByUserId(userId).isEmpty()) {
				kycDetailId = CounterLocalServiceUtil.increment(KycDetails.class.getName());
				kycDetail = KycDetailsLocalServiceUtil.createKycDetails(kycDetailId);
				kycDetail.setUserId(userId);
				kycDetail.setUserName(themeDisplay.getUser().getScreenName());
				kycDetail.setCreateDate(new Date());
				KycDetailsLocalServiceUtil.addKycDetails(kycDetail);
				System.out.println("heloo from update");
			}else {
				kycDetail=KycDetailsLocalServiceUtil.findByUserId(userId).get(0);
				System.out.println("heloo from create");
			}
			
			//updating details
			if(document.equals("PAN Card")) {
				KycDetails kycDetailUpdated = CurdOperations.updatePanNumber(documentNumber,kycDetail,documentProof, title, mimeType, themeDisplay);
				KycDetailsLocalServiceUtil.updateKycDetails(kycDetailUpdated);
			}
			else if(document.equals("GSTN")) {
				KycDetails kycDetailUpdated = CurdOperations.updateGstn(documentNumber,kycDetail,documentProof, title, mimeType, themeDisplay);
				KycDetailsLocalServiceUtil.updateKycDetails(kycDetailUpdated);
			}
			else if(document.equals("Business")) {
				KycDetails kycDetailUpdated = CurdOperations.updateBusinessType(message,kycDetail,documentProof, title, mimeType, themeDisplay);
				KycDetailsLocalServiceUtil.updateKycDetails(kycDetailUpdated);
			}
			else if(document.equals("Address")) {
				KycDetails kycDetailUpdated = CurdOperations.updateAddress(message,kycDetail,documentProof, title, mimeType, themeDisplay);
				KycDetailsLocalServiceUtil.updateKycDetails(kycDetailUpdated);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}