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

package com.pinsightmedia.sb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.pinsightmedia.sb.model.Advertising;

import java.util.List;

/**
 * The persistence utility for the advertising service. This utility wraps {@link AdvertisingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jeffreyjarin
 * @see AdvertisingPersistence
 * @see AdvertisingPersistenceImpl
 * @generated
 */
public class AdvertisingUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Advertising advertising) {
		getPersistence().clearCache(advertising);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Advertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Advertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Advertising> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Advertising update(Advertising advertising, boolean merge)
		throws SystemException {
		return getPersistence().update(advertising, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Advertising update(Advertising advertising, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(advertising, merge, serviceContext);
	}

	/**
	* Caches the advertising in the entity cache if it is enabled.
	*
	* @param advertising the advertising
	*/
	public static void cacheResult(
		com.pinsightmedia.sb.model.Advertising advertising) {
		getPersistence().cacheResult(advertising);
	}

	/**
	* Caches the advertisings in the entity cache if it is enabled.
	*
	* @param advertisings the advertisings
	*/
	public static void cacheResult(
		java.util.List<com.pinsightmedia.sb.model.Advertising> advertisings) {
		getPersistence().cacheResult(advertisings);
	}

	/**
	* Creates a new advertising with the primary key. Does not add the advertising to the database.
	*
	* @param adsId the primary key for the new advertising
	* @return the new advertising
	*/
	public static com.pinsightmedia.sb.model.Advertising create(long adsId) {
		return getPersistence().create(adsId);
	}

	/**
	* Removes the advertising with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param adsId the primary key of the advertising
	* @return the advertising that was removed
	* @throws com.pinsightmedia.sb.NoSuchAdvertisingException if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising remove(long adsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pinsightmedia.sb.NoSuchAdvertisingException {
		return getPersistence().remove(adsId);
	}

	public static com.pinsightmedia.sb.model.Advertising updateImpl(
		com.pinsightmedia.sb.model.Advertising advertising, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(advertising, merge);
	}

	/**
	* Returns the advertising with the primary key or throws a {@link com.pinsightmedia.sb.NoSuchAdvertisingException} if it could not be found.
	*
	* @param adsId the primary key of the advertising
	* @return the advertising
	* @throws com.pinsightmedia.sb.NoSuchAdvertisingException if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising findByPrimaryKey(
		long adsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pinsightmedia.sb.NoSuchAdvertisingException {
		return getPersistence().findByPrimaryKey(adsId);
	}

	/**
	* Returns the advertising with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param adsId the primary key of the advertising
	* @return the advertising, or <code>null</code> if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising fetchByPrimaryKey(
		long adsId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(adsId);
	}

	/**
	* Returns all the advertisings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findByuserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns a range of all the advertisings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of advertisings
	* @param end the upper bound of the range of advertisings (not inclusive)
	* @return the range of matching advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findByuserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the advertisings where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of advertisings
	* @param end the upper bound of the range of advertisings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first advertising in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advertising
	* @throws com.pinsightmedia.sb.NoSuchAdvertisingException if a matching advertising could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising findByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pinsightmedia.sb.NoSuchAdvertisingException {
		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first advertising in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching advertising, or <code>null</code> if a matching advertising could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last advertising in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advertising
	* @throws com.pinsightmedia.sb.NoSuchAdvertisingException if a matching advertising could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising findByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pinsightmedia.sb.NoSuchAdvertisingException {
		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last advertising in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching advertising, or <code>null</code> if a matching advertising could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the advertisings before and after the current advertising in the ordered set where userId = &#63;.
	*
	* @param adsId the primary key of the current advertising
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next advertising
	* @throws com.pinsightmedia.sb.NoSuchAdvertisingException if a advertising with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pinsightmedia.sb.model.Advertising[] findByuserId_PrevAndNext(
		long adsId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pinsightmedia.sb.NoSuchAdvertisingException {
		return getPersistence()
				   .findByuserId_PrevAndNext(adsId, userId, orderByComparator);
	}

	/**
	* Returns all the advertisings.
	*
	* @return the advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the advertisings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of advertisings
	* @param end the upper bound of the range of advertisings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pinsightmedia.sb.model.Advertising> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the advertisings where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Removes all the advertisings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of advertisings where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Returns the number of advertisings.
	*
	* @return the number of advertisings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AdvertisingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AdvertisingPersistence)PortletBeanLocatorUtil.locate(com.pinsightmedia.sb.service.ClpSerializer.getServletContextName(),
					AdvertisingPersistence.class.getName());

			ReferenceRegistry.registerReference(AdvertisingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(AdvertisingPersistence persistence) {
	}

	private static AdvertisingPersistence _persistence;
}