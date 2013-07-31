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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.project.psm.service.http.AdvertisingServiceSoap}.
 *
 * @author    jeffreyjarin
 * @see       com.project.psm.service.http.AdvertisingServiceSoap
 * @generated
 */
public class AdvertisingSoap implements Serializable {
	public static AdvertisingSoap toSoapModel(Advertising model) {
		AdvertisingSoap soapModel = new AdvertisingSoap();

		soapModel.setAdsId(model.getAdsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setData1(model.getData1());
		soapModel.setData2(model.getData2());
		soapModel.setData3(model.getData3());
		soapModel.setData4(model.getData4());
		soapModel.setData5(model.getData5());

		return soapModel;
	}

	public static AdvertisingSoap[] toSoapModels(Advertising[] models) {
		AdvertisingSoap[] soapModels = new AdvertisingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AdvertisingSoap[][] toSoapModels(Advertising[][] models) {
		AdvertisingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AdvertisingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AdvertisingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AdvertisingSoap[] toSoapModels(List<Advertising> models) {
		List<AdvertisingSoap> soapModels = new ArrayList<AdvertisingSoap>(models.size());

		for (Advertising model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AdvertisingSoap[soapModels.size()]);
	}

	public AdvertisingSoap() {
	}

	public long getPrimaryKey() {
		return _adsId;
	}

	public void setPrimaryKey(long pk) {
		setAdsId(pk);
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

	private long _adsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private double _data1;
	private double _data2;
	private double _data3;
	private double _data4;
	private double _data5;
}