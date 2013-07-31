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

package com.project.psm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link AdvertisingService}.
 * </p>
 *
 * @author    jeffreyjarin
 * @see       AdvertisingService
 * @generated
 */
public class AdvertisingServiceWrapper implements AdvertisingService,
	ServiceWrapper<AdvertisingService> {
	public AdvertisingServiceWrapper(AdvertisingService advertisingService) {
		_advertisingService = advertisingService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _advertisingService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_advertisingService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _advertisingService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.project.psm.model.Advertising getAdvertisingById(long adsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advertisingService.getAdvertisingById(adsId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AdvertisingService getWrappedAdvertisingService() {
		return _advertisingService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAdvertisingService(
		AdvertisingService advertisingService) {
		_advertisingService = advertisingService;
	}

	public AdvertisingService getWrappedService() {
		return _advertisingService;
	}

	public void setWrappedService(AdvertisingService advertisingService) {
		_advertisingService = advertisingService;
	}

	private AdvertisingService _advertisingService;
}