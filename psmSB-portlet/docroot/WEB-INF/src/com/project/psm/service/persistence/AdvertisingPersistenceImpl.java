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

package com.project.psm.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.project.psm.NoSuchAdvertisingException;
import com.project.psm.model.Advertising;
import com.project.psm.model.impl.AdvertisingImpl;
import com.project.psm.model.impl.AdvertisingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the advertising service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author jeffreyjarin
 * @see AdvertisingPersistence
 * @see AdvertisingUtil
 * @generated
 */
public class AdvertisingPersistenceImpl extends BasePersistenceImpl<Advertising>
	implements AdvertisingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AdvertisingUtil} to access the advertising persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AdvertisingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingModelImpl.FINDER_CACHE_ENABLED, AdvertisingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingModelImpl.FINDER_CACHE_ENABLED, AdvertisingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the advertising in the entity cache if it is enabled.
	 *
	 * @param advertising the advertising
	 */
	public void cacheResult(Advertising advertising) {
		EntityCacheUtil.putResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingImpl.class, advertising.getPrimaryKey(), advertising);

		advertising.resetOriginalValues();
	}

	/**
	 * Caches the advertisings in the entity cache if it is enabled.
	 *
	 * @param advertisings the advertisings
	 */
	public void cacheResult(List<Advertising> advertisings) {
		for (Advertising advertising : advertisings) {
			if (EntityCacheUtil.getResult(
						AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
						AdvertisingImpl.class, advertising.getPrimaryKey()) == null) {
				cacheResult(advertising);
			}
			else {
				advertising.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all advertisings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AdvertisingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AdvertisingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the advertising.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Advertising advertising) {
		EntityCacheUtil.removeResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingImpl.class, advertising.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Advertising> advertisings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Advertising advertising : advertisings) {
			EntityCacheUtil.removeResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
				AdvertisingImpl.class, advertising.getPrimaryKey());
		}
	}

	/**
	 * Creates a new advertising with the primary key. Does not add the advertising to the database.
	 *
	 * @param adsId the primary key for the new advertising
	 * @return the new advertising
	 */
	public Advertising create(long adsId) {
		Advertising advertising = new AdvertisingImpl();

		advertising.setNew(true);
		advertising.setPrimaryKey(adsId);

		return advertising;
	}

	/**
	 * Removes the advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param adsId the primary key of the advertising
	 * @return the advertising that was removed
	 * @throws com.project.psm.NoSuchAdvertisingException if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Advertising remove(long adsId)
		throws NoSuchAdvertisingException, SystemException {
		return remove(Long.valueOf(adsId));
	}

	/**
	 * Removes the advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the advertising
	 * @return the advertising that was removed
	 * @throws com.project.psm.NoSuchAdvertisingException if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Advertising remove(Serializable primaryKey)
		throws NoSuchAdvertisingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Advertising advertising = (Advertising)session.get(AdvertisingImpl.class,
					primaryKey);

			if (advertising == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAdvertisingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(advertising);
		}
		catch (NoSuchAdvertisingException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Advertising removeImpl(Advertising advertising)
		throws SystemException {
		advertising = toUnwrappedModel(advertising);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, advertising);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(advertising);

		return advertising;
	}

	@Override
	public Advertising updateImpl(
		com.project.psm.model.Advertising advertising, boolean merge)
		throws SystemException {
		advertising = toUnwrappedModel(advertising);

		boolean isNew = advertising.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, advertising, merge);

			advertising.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
			AdvertisingImpl.class, advertising.getPrimaryKey(), advertising);

		return advertising;
	}

	protected Advertising toUnwrappedModel(Advertising advertising) {
		if (advertising instanceof AdvertisingImpl) {
			return advertising;
		}

		AdvertisingImpl advertisingImpl = new AdvertisingImpl();

		advertisingImpl.setNew(advertising.isNew());
		advertisingImpl.setPrimaryKey(advertising.getPrimaryKey());

		advertisingImpl.setAdsId(advertising.getAdsId());
		advertisingImpl.setGroupId(advertising.getGroupId());
		advertisingImpl.setCompanyId(advertising.getCompanyId());
		advertisingImpl.setUserId(advertising.getUserId());
		advertisingImpl.setUserName(advertising.getUserName());
		advertisingImpl.setCreateDate(advertising.getCreateDate());
		advertisingImpl.setModifiedDate(advertising.getModifiedDate());
		advertisingImpl.setData1(advertising.getData1());
		advertisingImpl.setData2(advertising.getData2());
		advertisingImpl.setData3(advertising.getData3());
		advertisingImpl.setData4(advertising.getData4());
		advertisingImpl.setData5(advertising.getData5());

		return advertisingImpl;
	}

	/**
	 * Returns the advertising with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the advertising
	 * @return the advertising
	 * @throws com.liferay.portal.NoSuchModelException if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Advertising findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the advertising with the primary key or throws a {@link com.project.psm.NoSuchAdvertisingException} if it could not be found.
	 *
	 * @param adsId the primary key of the advertising
	 * @return the advertising
	 * @throws com.project.psm.NoSuchAdvertisingException if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Advertising findByPrimaryKey(long adsId)
		throws NoSuchAdvertisingException, SystemException {
		Advertising advertising = fetchByPrimaryKey(adsId);

		if (advertising == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + adsId);
			}

			throw new NoSuchAdvertisingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				adsId);
		}

		return advertising;
	}

	/**
	 * Returns the advertising with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the advertising
	 * @return the advertising, or <code>null</code> if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Advertising fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the advertising with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param adsId the primary key of the advertising
	 * @return the advertising, or <code>null</code> if a advertising with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Advertising fetchByPrimaryKey(long adsId) throws SystemException {
		Advertising advertising = (Advertising)EntityCacheUtil.getResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
				AdvertisingImpl.class, adsId);

		if (advertising == _nullAdvertising) {
			return null;
		}

		if (advertising == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				advertising = (Advertising)session.get(AdvertisingImpl.class,
						Long.valueOf(adsId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (advertising != null) {
					cacheResult(advertising);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(AdvertisingModelImpl.ENTITY_CACHE_ENABLED,
						AdvertisingImpl.class, adsId, _nullAdvertising);
				}

				closeSession(session);
			}
		}

		return advertising;
	}

	/**
	 * Returns all the advertisings.
	 *
	 * @return the advertisings
	 * @throws SystemException if a system exception occurred
	 */
	public List<Advertising> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Advertising> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<Advertising> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Advertising> list = (List<Advertising>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADVERTISING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVERTISING;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Advertising>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Advertising>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the advertisings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Advertising advertising : findAll()) {
			remove(advertising);
		}
	}

	/**
	 * Returns the number of advertisings.
	 *
	 * @return the number of advertisings
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADVERTISING);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the advertising persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.project.psm.model.Advertising")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Advertising>> listenersList = new ArrayList<ModelListener<Advertising>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Advertising>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AdvertisingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = AdvertisingPersistence.class)
	protected AdvertisingPersistence advertisingPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ADVERTISING = "SELECT advertising FROM Advertising advertising";
	private static final String _SQL_COUNT_ADVERTISING = "SELECT COUNT(advertising) FROM Advertising advertising";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advertising.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Advertising exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AdvertisingPersistenceImpl.class);
	private static Advertising _nullAdvertising = new AdvertisingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Advertising> toCacheModel() {
				return _nullAdvertisingCacheModel;
			}
		};

	private static CacheModel<Advertising> _nullAdvertisingCacheModel = new CacheModel<Advertising>() {
			public Advertising toEntityModel() {
				return _nullAdvertising;
			}
		};
}