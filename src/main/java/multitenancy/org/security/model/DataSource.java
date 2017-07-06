package multitenancy.org.security.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Class DataSource.
 */
@Entity(name = "datasource")
public class DataSource implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The first name. */
	private String username;

	/** The password. */
	private String password;

	/** URL. */
	private String url;

	/** Driver Class Name. */
	private String driverClassName;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "user_id")
	User user;

	public DataSource() {
		// TODO Auto-generated constructor stub
	}

	public DataSource(Long id, String username, String password, String url, String driverClassName) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.url = url;
		this.driverClassName = driverClassName;
	}
	
	public DataSource(String username, String password, String url, String driverClassName) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		this.driverClassName = driverClassName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "DataSource [id=" + id + ", username=" + username + ", password=" + password + ", url=" + url
				+ ", driverClassName=" + driverClassName + "]";
	}

}
