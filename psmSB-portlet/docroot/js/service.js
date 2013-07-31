Liferay.Service.register("Liferay.Service.psm", "com.project.psm.service", "psmSB-portlet");

Liferay.Service.registerClass(
	Liferay.Service.psm, "Advertising",
	{
		getAdvertisingById: true
	}
);