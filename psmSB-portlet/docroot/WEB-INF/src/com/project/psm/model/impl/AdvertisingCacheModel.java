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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.project.psm.model.Advertising;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Advertising in entity cache.
 *
 * @author jeffreyjarin
 * @see Advertising
 * @generated
 */
public class AdvertisingCacheModel implements CacheModel<Advertising>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{adsId=");
		sb.append(adsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", data1=");
		sb.append(data1);
		sb.append(", data2=");
		sb.append(data2);
		sb.append(", data3=");
		sb.append(data3);
		sb.append(", data4=");
		sb.append(data4);
		sb.append(", data5=");
		sb.append(data5);
		sb.append("}");

		return sb.toString();
	}

	public Advertising toEntityModel() {
		AdvertisingImpl advertisingImpl = new AdvertisingImpl();

		advertisingImpl.setAdsId(adsId);
		advertisingImpl.setGroupId(groupId);
		advertisingImpl.setCompanyId(companyId);
		advertisingImpl.setUserId(userId);

		if (userName == null) {
			advertisingImpl.setUserName(StringPool.BLANK);
		}
		else {
			advertisingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			advertisingImpl.setCreateDate(null);
		}
		else {
			advertisingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advertisingImpl.setModifiedDate(null);
		}
		else {
			advertisingImpl.setModifiedDate(new Date(modifiedDate));
		}

		advertisingImpl.setData1(data1);
		advertisingImpl.setData2(data2);
		advertisingImpl.setData3(data3);
		advertisingImpl.setData4(data4);
		advertisingImpl.setData5(data5);

		advertisingImpl.resetOriginalValues();

		return advertisingImpl;
	}

	public long adsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public double data1;
	public double data2;
	public double data3;
	public double data4;
	public double data5;
}