package multitenancy.org.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locality implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOCALITY_ID")
	private long idLocality;

	@Column(name = "LONGITUDE", length = 50)
	private double longitude;

	@Column(name = "LATITUDE", length = 50)
	private double latitude;

	public Locality() {
		// TODO Auto-generated constructor stub
	}

	public long getIdLocality() {
		return idLocality;
	}

	public void setIdLocality(long idLocality) {
		this.idLocality = idLocality;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

}
