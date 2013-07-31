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

package com.project.psm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.project.psm.model.Advertising;
import com.project.psm.model.AdvertisingModel;
import com.project.psm.model.AdvertisingSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Advertising service. Represents a row in the &quot;ADVERTISING&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.project.psm.model.AdvertisingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AdvertisingImpl}.
 * </p>
 *
 * @author jeffreyjarin
 * @see AdvertisingImpl
 * @see com.project.psm.model.Advertising
 * @see com.project.psm.model.AdvertisingModel
 * @generated
 */
@JSON(strict = true)
public class AdvertisingModelImpl extends BaseModelImpl<Advertising>
	implements AdvertisingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a advertising model instance should use the {@link com.project.psm.model.Advertising} interface instead.
	 */
	public static final String TABLE_NAME = "ADVERTISING";
	public static final Object[][] TABLE_COLUMNS = {
			{ "AD_ID", Types.BIGINT },
			{ "AD_GRP_ID", Types.BIGINT },
			{ "AD_COMP_ID", Types.BIGINT },
			{ "AD_USER_ID", Types.BIGINT },
			{ "AD_USERNAME", Types.VARCHAR },
			{ "AD_CREATE_DT", Types.TIMESTAMP },
			{ "AD_MODIFIED_DT", Types.TIMESTAMP },
			{ "AD_DATA1", Types.DOUBLE },
			{ "AD_DATA2", Types.DOUBLE },
			{ "AD_DATA3", Types.DOUBLE },
			{ "AD_DATA4", Types.DOUBLE },
			{ "AD_DATA5", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table ADVERTISING (AD_ID LONG not null primary key,AD_GRP_ID LONG,AD_COMP_ID LONG,AD_USER_ID LONG,AD_USERNAME VARCHAR(75) null,AD_CREATE_DT DATE null,AD_MODIFIED_DT DATE null,AD_DATA1 DOUBLE,AD_DATA2 DOUBLE,AD_DATA3 DOUBLE,AD_DATA4 DOUBLE,AD_DATA5 DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table ADVERTISING";
	public static final String DATA_SOURCE = "pinsightDataSource";
	public static final String SESSION_FACTORY = "pinsightSessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.project.psm.model.Advertising"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.project.psm.model.Advertising"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Advertising toModel(AdvertisingSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Advertising model = new AdvertisingImpl();

		model.setAdsId(soapModel.getAdsId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setData1(soapModel.getData1());
		model.setData2(soapModel.getData2());
		model.setData3(soapModel.getData3());
		model.setData4(soapModel.getData4());
		model.setData5(soapModel.getData5());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Advertising> toModels(AdvertisingSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Advertising> models = new ArrayList<Advertising>(soapModels.length);

		for (AdvertisingSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.project.psm.model.Advertising"));

	public AdvertisingModelImpl() {
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

	public Class<?> getModelClass() {
		return Advertising.class;
	}

	public String getModelClassName() {
		return Advertising.class.getName();
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

	@JSON
	public long getAdsId() {
		return _adsId;
	}

	public void setAdsId(long adsId) {
		_adsId = adsId;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
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

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public double getData1() {
		return _data1;
	}

	public void setData1(double data1) {
		_data1 = data1;
	}

	@JSON
	public double getData2() {
		return _data2;
	}

	public void setData2(double data2) {
		_data2 = data2;
	}

	@JSON
	public double getData3() {
		return _data3;
	}

	public void setData3(double data3) {
		_data3 = data3;
	}

	@JSON
	public double getData4() {
		return _data4;
	}

	public void setData4(double data4) {
		_data4 = data4;
	}

	@JSON
	public double getData5() {
		return _data5;
	}

	public void setData5(double data5) {
		_data5 = data5;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Advertising.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Advertising toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Advertising)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		AdvertisingImpl advertisingImpl = new AdvertisingImpl();

		advertisingImpl.setAdsId(getAdsId());
		advertisingImpl.setGroupId(getGroupId());
		advertisingImpl.setCompanyId(getCompanyId());
		advertisingImpl.setUserId(getUserId());
		advertisingImpl.setUserName(getUserName());
		advertisingImpl.setCreateDate(getCreateDate());
		advertisingImpl.setModifiedDate(getModifiedDate());
		advertisingImpl.setData1(getData1());
		advertisingImpl.setData2(getData2());
		advertisingImpl.setData3(getData3());
		advertisingImpl.setData4(getData4());
		advertisingImpl.setData5(getData5());

		advertisingImpl.resetOriginalValues();

		return advertisingImpl;
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

		Advertising advertising = null;

		try {
			advertising = (Advertising)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Advertising> toCacheModel() {
		AdvertisingCacheModel advertisingCacheModel = new AdvertisingCacheModel();

		advertisingCacheModel.adsId = getAdsId();

		advertisingCacheModel.groupId = getGroupId();

		advertisingCacheModel.companyId = getCompanyId();

		advertisingCacheModel.userId = getUserId();

		advertisingCacheModel.userName = getUserName();

		String userName = advertisingCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			advertisingCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			advertisingCacheModel.createDate = createDate.getTime();
		}
		else {
			advertisingCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			advertisingCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			advertisingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		advertisingCacheModel.data1 = getData1();

		advertisingCacheModel.data2 = getData2();

		advertisingCacheModel.data3 = getData3();

		advertisingCacheModel.data4 = getData4();

		advertisingCacheModel.data5 = getData5();

		return advertisingCacheModel;
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

	private static ClassLoader _classLoader = Advertising.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Advertising.class
		};
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
	private Advertising _escapedModelProxy;
}