package com.liferay.myprofile.util;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.testing.service.model.KycDetails;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CurdOperations {
	public static KycDetails updatePanNumber(String panNumber, KycDetails kycDetail, File file, String title, String mimeType, ThemeDisplay themeDisplay) throws PortalException, IOException {
		DLFolder folder = DLFolderLocalServiceUtil.getFolder(20121L, 0, "KYCDetail");
		long folderId = folder.getFolderId();
		FileInputStream f1 = new FileInputStream(file);
		byte [] arr = new byte[(int)file.length()];
		f1.read(arr);
		FileEntry fileEntry =  DLAppLocalServiceUtil.addFileEntry("", themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), folderId, title, mimeType, title, title, "", "", arr, null, null, new ServiceContext());
		long fileEntryId = fileEntry.getFileEntryId();
		kycDetail.setPanNumber(panNumber);
		kycDetail.setPanProofId(fileEntryId);
		return kycDetail;
	}

	public static KycDetails updateGstn(String gstnNumber, KycDetails kycDetail, File file, String title, String mimeType, ThemeDisplay themeDisplay) throws PortalException, IOException {
		DLFolder folder = DLFolderLocalServiceUtil.getFolder(20121L, 0, "KYCDetail");
		long folderId = folder.getFolderId();
		FileInputStream f1 = new FileInputStream(file);
		byte [] arr = new byte[(int)file.length()];
		f1.read(arr);
		FileEntry fileEntry =  DLAppLocalServiceUtil.addFileEntry("", themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), folderId, title, mimeType, title, title, "", "", arr, null, null, new ServiceContext());
		long fileEntryId = fileEntry.getFileEntryId();
		kycDetail.setGstnNumber(gstnNumber);
		kycDetail.setGstnProofId(fileEntryId);
		return kycDetail;
	}

	public static KycDetails updateAddress(String address, KycDetails kycDetail, File file, String title, String mimeType, ThemeDisplay themeDisplay) throws PortalException, IOException {
		DLFolder folder = DLFolderLocalServiceUtil.getFolder(20121L, 0, "KYCDetail");
		long folderId = folder.getFolderId();
		FileInputStream f1 = new FileInputStream(file);
		byte [] arr = new byte[(int)file.length()];
		f1.read(arr);
		FileEntry fileEntry =  DLAppLocalServiceUtil.addFileEntry("", themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), folderId, title, mimeType, title, title, "", "", arr, null, null, new ServiceContext());
		long fileEntryId = fileEntry.getFileEntryId();
		kycDetail.setAddress(address);
		kycDetail.setAddressProofId(fileEntryId);
		return kycDetail;
	}

	public static KycDetails updateBusinessType(String typeOfBusiness, KycDetails kycDetail, File file, String title, String mimeType, ThemeDisplay themeDisplay) throws PortalException, IOException {
		DLFolder folder = DLFolderLocalServiceUtil.getFolder(20121L, 0, "KYCDetail");
		long folderId = folder.getFolderId();
		FileInputStream f1 = new FileInputStream(file);
		byte [] arr = new byte[(int)file.length()];
		f1.read(arr);
		FileEntry fileEntry =  DLAppLocalServiceUtil.addFileEntry("", themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), folderId, title, mimeType, title, title, "", "", arr, null, null, new ServiceContext());
		long fileEntryId = fileEntry.getFileEntryId();
		kycDetail.setTypeOfBusiness(typeOfBusiness);
		kycDetail.setTypeOfBusinessId(fileEntryId);
		return kycDetail;
	}
}
