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

package com.project.psm.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Advertising}.
 * </p>
 *
 * @author    jeffreyjarin
 * @see       Advertising
 * @generated
 */
public class AdvertisingWrapper implements Advertising,
	ModelWrapper<Advertising> {
	public AdvertisingWrapper(Advertising advertising) {
		_advertising = advertising;
	}

	public Class<?> getModelClass() {
		return Advertising.class;
	}

	public String getModelClassName() {
		return Advertising.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("adsId", getAdsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("data1", getData1());
		attributes.put("data2", getData2());
		attributes.put("data3", getData3());
		attributes.put("data4", getData4());
		attributes.put("data5", getData5());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long adsId = (Long)attributes.get("adsId");

		if (adsId != null) {
			setAdsId(adsId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Double data1 = (Double)attributes.get("data1");

		if (data1 != null) {
			setData1(data1);
		}

		Double data2 = (Double)attributes.get("data2");

		if (data2 != null) {
			setData2(data2);
		}

		Double data3 = (Double)attributes.get("data3");

		if (data3 != null) {
			setData3(data3);
		}

		Double data4 = (Double)attributes.get("data4");

		if (data4 != null) {
			setData4(data4);
		}

		Double data5 = (Double)attributes.get("data5");

		if (data5 != null) {
			setData5(data5);
		}
	}

	/**
	* Returns the primary key of this advertising.
	*
	* @return the primary key of this advertising
	*/
	public long getPrimaryKey() {
		return _advertising.getPrimaryKey();
	}

	/**
	* Sets the primary key of this advertising.
	*
	* @param primaryKey the primary key of this advertising
	*/
	public void setPrimaryKey(long primaryKey) {
		_advertising.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ads ID of this advertising.
	*
	* @return the ads ID of this advertising
	*/
	public long getAdsId() {
		return _advertising.getAdsId();
	}

	/**
	* Sets the ads ID of this advertising.
	*
	* @param adsId the ads ID of this advertising
	*/
	public void setAdsId(long adsId) {
		_advertising.setAdsId(adsId);
	}

	/**
	* Returns the group ID of this advertising.
	*
	* @return the group ID of this advertising
	*/
	public long getGroupId() {
		return _advertising.getGroupId();
	}

	/**
	* Sets the group ID of this advertising.
	*
	* @param groupId the group ID of this advertising
	*/
	public void setGroupId(long groupId) {
		_advertising.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this advertising.
	*
	* @return the company ID of this advertising
	*/
	public long getCompanyId() {
		return _advertising.getCompanyId();
	}

	/**
	* Sets the company ID of this advertising.
	*
	* @param companyId the company ID of this advertising
	*/
	public void setCompanyId(long companyId) {
		_advertising.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this advertising.
	*
	* @return the user ID of this advertising
	*/
	public long getUserId() {
		return _advertising.getUserId();
	}

	/**
	* Sets the user ID of this advertising.
	*
	* @param userId the user ID of this advertising
	*/
	public void setUserId(long userId) {
		_advertising.setUserId(userId);
	}

	/**
	* Returns the user uuid of this advertising.
	*
	* @return the user uuid of this advertising
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _advertising.getUserUuid();
	}

	/**
	* Sets the user uuid of this advertising.
	*
	* @param userUuid the user uuid of this advertising
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_advertising.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this advertising.
	*
	* @return the user name of this advertising
	*/
	public java.lang.String getUserName() {
		return _advertising.getUserName();
	}

	/**
	* Sets the user name of this advertising.
	*
	* @param userName the user name of this advertising
	*/
	public void setUserName(java.lang.String userName) {
		_advertising.setUserName(userName);
	}

	/**
	* Returns the create date of this advertising.
	*
	* @return the create date of this advertising
	*/
	public java.util.Date getCreateDate() {
		return _advertising.getCreateDate();
	}

	/**
	* Sets the create date of this advertising.
	*
	* @param createDate the create date of this advertising
	*/
	public void setCreateDate(java.util.Date createDate) {
		_advertising.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this advertising.
	*
	* @return the modified date of this advertising
	*/
	public java.util.Date getModifiedDate() {
		return _advertising.getModifiedDate();
	}

	/**
	* Sets the modified date of this advertising.
	*
	* @param modifiedDate the modified date of this advertising
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_advertising.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the data1 of this advertising.
	*
	* @return the data1 of this advertising
	*/
	public double getData1() {
		return _advertising.getData1();
	}

	/**
	* Sets the data1 of this advertising.
	*
	* @param data1 the data1 of this advertising
	*/
	public void setData1(double data1) {
		_advertising.setData1(data1);
	}

	/**
	* Returns the data2 of this advertising.
	*
	* @return the data2 of this advertising
	*/
	public double getData2() {
		return _advertising.getData2();
	}

	/**
	* Sets the data2 of this advertising.
	*
	* @param data2 the data2 of this advertising
	*/
	public void setData2(double data2) {
		_advertising.setData2(data2);
	}

	/**
	* Returns the data3 of this advertising.
	*
	* @return the data3 of this advertising
	*/
	public double getData3() {
		return _advertising.getData3();
	}

	/**
	* Sets the data3 of this advertising.
	*
	* @param data3 the data3 of this advertising
	*/
	public void setData3(double data3) {
		_advertising.setData3(data3);
	}

	/**
	* Returns the data4 of this advertising.
	*
	* @return the data4 of this advertising
	*/
	public double getData4() {
		return _advertising.getData4();
	}

	/**
	* Sets the data4 of this advertising.
	*
	* @param data4 the data4 of this advertising
	*/
	public void setData4(double data4) {
		_advertising.setData4(data4);
	}

	/**
	* Returns the data5 of this advertising.
	*
	* @return the data5 of this advertising
	*/
	public double getData5() {
		return _advertising.getData5();
	}

	/**
	* Sets the data5 of this advertising.
	*
	* @param data5 the data5 of this advertising
	*/
	public void setData5(double data5) {
		_advertising.setData5(data5);
	}

	public boolean isNew() {
		return _advertising.isNew();
	}

	public void setNew(boolean n) {
		_advertising.setNew(n);
	}

	public boolean isCachedModel() {
		return _advertising.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_advertising.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _advertising.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _advertising.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_advertising.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _advertising.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_advertising.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AdvertisingWrapper((Advertising)_advertising.clone());
	}

	public int compareTo(com.project.psm.model.Advertising advertising) {
		return _advertising.compareTo(advertising);
	}

	@Override
	public int hashCode() {
		return _advertising.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.project.psm.model.Advertising> toCacheModel() {
		return _advertising.toCacheModel();
	}

	public com.project.psm.model.Advertising toEscapedModel() {
		return new AdvertisingWrapper(_advertising.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _advertising.toString();
	}

	public java.lang.String toXmlString() {
		return _advertising.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_advertising.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Advertising getWrappedAdvertising() {
		return _advertising;
	}

	public Advertising getWrappedModel() {
		return _advertising;
	}

	public void resetOriginalValues() {
		_advertising.resetOriginalValues();
	}

	private Advertising _advertising;
}