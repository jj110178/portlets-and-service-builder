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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.project.psm.model.Advertising;
import com.project.psm.service.base.AdvertisingServiceBaseImpl;
import com.project.psm.service.persistence.AdvertisingUtil;

/**
 * The implementation of the advertising remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.project.psm.service.AdvertisingService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author jeffreyjarin
 * @see com.project.psm.service.base.AdvertisingServiceBaseImpl
 * @see com.project.psm.service.AdvertisingServiceUtil
 */
public class AdvertisingServiceImpl extends AdvertisingServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.project.psm.service.AdvertisingServiceUtil} to access the advertising remote service.
	 */
	
	public Advertising getAdvertisingById(final long adsId) throws SystemException, PortalException {
		return advertisingLocalService.getAdvertising(adsId);
	}
}