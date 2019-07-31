package mx.ms.cross.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="secret")
public class SaveCommonSecret {

	@Id
	@Column(name="app_id")
	String appId;
	@Column(name="common_secret")
	byte [] commonSecret;
	@Column(name="create_at")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
	private LocalDate createAt;
	
	public SaveCommonSecret() {
		
	}
	public SaveCommonSecret(String appId, byte[] commonSecret, LocalDate createAt) {
		this.appId = appId;
		this.commonSecret = commonSecret;
		this.createAt = createAt;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public byte[] getCommonSecret() {
		return commonSecret;
	}
	public void setCommonSecret(byte[] commonSecret) {
		this.commonSecret = commonSecret;
	}
	public LocalDate getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "SaveCommonSecret [appId=" + appId + ", commonSecret=" + Arrays.toString(commonSecret) + ", createAt="
				+ createAt + "]";
	}
	
}
