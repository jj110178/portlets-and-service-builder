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
 * This class is a wrapper for {@link AdvertisingLocalService}.
 * </p>
 *
 * @author    jeffreyjarin
 * @see       AdvertisingLocalService
 * @generated
 */
public class AdvertisingLocalServiceWrapper implements AdvertisingLocalService,
	ServiceWrapper<AdvertisingLocalService> {
	public AdvertisingLocalServiceWrapper(
		AdvertisingLocalService advertisingLocalService) {
		_advertisingLocalService = advertisingLocalService;
	}

	/**
	* Adds the advertising to the database. Also notifies the appropriate model listeners.
	*
	* @param advertising the advertising
	* @return the advertising that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising addAdvertising(
		com.project.psm.model.Advertising advertising)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.addAdvertising(advertising);
	}

	/**
	* Creates a new advertising with the primary key. Does not add the advertising to the database.
	*
	* @param adsId the primary key for the new advertising
	* @return the new advertising
	*/
	public com.project.psm.model.Advertising createAdvertising(long adsId) {
		return _advertisingLocalService.createAdvertising(adsId);
	}

	/**
	* Deletes the advertising with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param adsId the primary key of the advertising
	* @return the advertising that was removed
	* @throws PortalException if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising deleteAdvertising(long adsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.deleteAdvertising(adsId);
	}

	/**
	* Deletes the advertising from the database. Also notifies the appropriate model listeners.
	*
	* @param advertising the advertising
	* @return the advertising that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising deleteAdvertising(
		com.project.psm.model.Advertising advertising)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.deleteAdvertising(advertising);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advertisingLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.project.psm.model.Advertising fetchAdvertising(long adsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.fetchAdvertising(adsId);
	}

	/**
	* Returns the advertising with the primary key.
	*
	* @param adsId the primary key of the advertising
	* @return the advertising
	* @throws PortalException if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising getAdvertising(long adsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.getAdvertising(adsId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the advertisings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advertisings
	* @param end the upper bound of the range of advertisings (not inclusive)
	* @return the range of advertisings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.project.psm.model.Advertising> getAdvertisings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.getAdvertisings(start, end);
	}

	/**
	* Returns the number of advertisings.
	*
	* @return the number of advertisings
	* @throws SystemException if a system exception occurred
	*/
	public int getAdvertisingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.getAdvertisingsCount();
	}

	/**
	* Updates the advertising in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advertising the advertising
	* @return the advertising that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising updateAdvertising(
		com.project.psm.model.Advertising advertising)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.updateAdvertising(advertising);
	}

	/**
	* Updates the advertising in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advertising the advertising
	* @param merge whether to merge the advertising with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the advertising that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.project.psm.model.Advertising updateAdvertising(
		com.project.psm.model.Advertising advertising, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.updateAdvertising(advertising, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _advertisingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_advertisingLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _advertisingLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.project.psm.model.Advertising getAdvertisingById(long adsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _advertisingLocalService.getAdvertisingById(adsId);
	}

	public void testDynamicQuery()
		throws com.liferay.portal.kernel.exception.SystemException {
		_advertisingLocalService.testDynamicQuery();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AdvertisingLocalService getWrappedAdvertisingLocalService() {
		return _advertisingLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAdvertisingLocalService(
		AdvertisingLocalService advertisingLocalService) {
		_advertisingLocalService = advertisingLocalService;
	}

	public AdvertisingLocalService getWrappedService() {
		return _advertisingLocalService;
	}

	public void setWrappedService(
		AdvertisingLocalService advertisingLocalService) {
		_advertisingLocalService = advertisingLocalService;
	}

	private AdvertisingLocalService _advertisingLocalService;
}