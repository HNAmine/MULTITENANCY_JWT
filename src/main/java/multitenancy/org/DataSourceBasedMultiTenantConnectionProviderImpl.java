package multitenancy.org;

import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;

public class DataSourceBasedMultiTenantConnectionProviderImpl
		extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {

	private static final long serialVersionUID = 1L;

	private String defaultTenant;

	private Map<String, DataSource> map;

	public DataSourceBasedMultiTenantConnectionProviderImpl(String defaultTenant, Map<String, DataSource> map) {
		super();
		this.defaultTenant = defaultTenant;
		this.map = map;
	}

	@Override
	protected DataSource selectAnyDataSource() {
		return map.get(defaultTenant);
	}

	@Override
	protected DataSource selectDataSource(String tenantIdentifier) {
		return map.get(tenantIdentifier);
	}

	public void addDataSource(String tenant_id, DataSource dataSource) {
		this.map.put(tenant_id, dataSource);
	}

	public void deleteDataSource(String idTenant) {
		this.map.remove(idTenant);
	}

	public DataSource getDefaultDataSource() {
		return map.get(defaultTenant);
	}

	public String getDefaultTenant() {
		return defaultTenant;
	}

	public void setDefaultTenant(String defaultTenant) {
		this.defaultTenant = defaultTenant;
	}

	public Map<String, DataSource> getMap() {
		return map;
	}

	public void setMap(Map<String, DataSource> map) {
		this.map = map;
	}

}
