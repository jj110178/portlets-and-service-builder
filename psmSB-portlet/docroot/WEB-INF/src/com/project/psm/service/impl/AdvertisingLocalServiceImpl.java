/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.project.psm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.project.psm.model.Advertising;
import com.project.psm.service.base.AdvertisingLocalServiceBaseImpl;

/**
 * The implementation of the advertising local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.project.psm.service.AdvertisingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author jeffreyjarin
 * @see com.project.psm.service.base.AdvertisingLocalServiceBaseImpl
 * @see com.project.psm.service.AdvertisingLocalServiceUtil
 */
public class AdvertisingLocalServiceImpl extends AdvertisingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.project.psm.service.AdvertisingLocalServiceUtil} to access the advertising local service.
	 */
	private static final Log logger = LogFactoryUtil.getLog(AdvertisingLocalServiceImpl.class);

	public Advertising getAdvertisingById(final long adsId) throws SystemException, PortalException {
		testDynamicQuery();
		return advertisingLocalService.getAdvertising(adsId);
	}
	
	public void testDynamicQuery() throws SystemException{		
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(User.class, PortalClassLoaderUtil.getClassLoader());
		query.addOrder(OrderFactoryUtil.desc("userId"));
		List<User> result = UserLocalServiceUtil.dynamicQuery(query);
		for(User userList : result){
		           System.out.println("....................."+userList.getFirstName());
		}
	}
}