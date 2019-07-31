package mx.ms.cross.service;

import mx.ms.cross.model.SaveCommonSecret;

public interface SecretService {

	public SaveCommonSecret saveSecret(SaveCommonSecret secret);
	public SaveCommonSecret getSecretById(String id);
}
