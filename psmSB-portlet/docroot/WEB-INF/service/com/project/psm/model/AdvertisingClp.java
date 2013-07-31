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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.project.psm.service.AdvertisingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jeffreyjarin
 */
public class AdvertisingClp extends BaseModelImpl<Advertising>
	implements Advertising {
	public AdvertisingClp() {
	}

	public Class<?> getModelClass() {
		return Advertising.class;
	}

	public String getModelClassName() {
		return Advertising.class.getName();
	}

	public long getPrimaryKey() {
		return _adsId;
	}

	public void setPrimaryKey(long primaryKey) {
		setAdsId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_adsId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getAdsId() {
		return _adsId;
	}

	public void setAdsId(long adsId) {
		_adsId = adsId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public double getData1() {
		return _data1;
	}

	public void setData1(double data1) {
		_data1 = data1;
	}

	public double getData2() {
		return _data2;
	}

	public void setData2(double data2) {
		_data2 = data2;
	}

	public double getData3() {
		return _data3;
	}

	public void setData3(double data3) {
		_data3 = data3;
	}

	public double getData4() {
		return _data4;
	}

	public void setData4(double data4) {
		_data4 = data4;
	}

	public double getData5() {
		return _data5;
	}

	public void setData5(double data5) {
		_data5 = data5;
	}

	public BaseModel<?> getAdvertisingRemoteModel() {
		return _advertisingRemoteModel;
	}

	public void setAdvertisingRemoteModel(BaseModel<?> advertisingRemoteModel) {
		_advertisingRemoteModel = advertisingRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			AdvertisingLocalServiceUtil.addAdvertising(this);
		}
		else {
			AdvertisingLocalServiceUtil.updateAdvertising(this);
		}
	}

	@Override
	public Advertising toEscapedModel() {
		return (Advertising)Proxy.newProxyInstance(Advertising.class.getClassLoader(),
			new Class[] { Advertising.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AdvertisingClp clone = new AdvertisingClp();

		clone.setAdsId(getAdsId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setData1(getData1());
		clone.setData2(getData2());
		clone.setData3(getData3());
		clone.setData4(getData4());
		clone.setData5(getData5());

		return clone;
	}

	public int compareTo(Advertising advertising) {
		long primaryKey = advertising.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		AdvertisingClp advertising = null;

		try {
			advertising = (AdvertisingClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = advertising.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{adsId=");
		sb.append(getAdsId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", data1=");
		sb.append(getData1());
		sb.append(", data2=");
		sb.append(getData2());
		sb.append(", data3=");
		sb.append(getData3());
		sb.append(", data4=");
		sb.append(getData4());
		sb.append(", data5=");
		sb.append(getData5());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.project.psm.model.Advertising");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>adsId</column-name><column-value><![CDATA[");
		sb.append(getAdsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data1</column-name><column-value><![CDATA[");
		sb.append(getData1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data2</column-name><column-value><![CDATA[");
		sb.append(getData2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data3</column-name><column-value><![CDATA[");
		sb.append(getData3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data4</column-name><column-value><![CDATA[");
		sb.append(getData4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data5</column-name><column-value><![CDATA[");
		sb.append(getData5());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _adsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private double _data1;
	private double _data2;
	private double _data3;
	private double _data4;
	private double _data5;
	private BaseModel<?> _advertisingRemoteModel;
}