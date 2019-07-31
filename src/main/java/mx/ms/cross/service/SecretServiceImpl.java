package mx.ms.cross.service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ms.cross.model.SaveCommonSecret;
import mx.ms.cross.repository.SecretRepository;

@Service
public class SecretServiceImpl implements SecretService{

	@Autowired
	private SecretRepository secretRepo;
	
	@Override
	public SaveCommonSecret saveSecret(SaveCommonSecret secret) {
		
//		secret.setCreateAt(LocalDateTime.now(ZoneOffset.UTC));
//		secret.setCreateAt(LocalDate.now(ZoneOffset.UTC));
		return secretRepo.save(secret);
	}

	@Override
	public SaveCommonSecret getSecretById(String id) {
		
		return secretRepo.findOne(id);
	}
	
//	 public static java.sql.Time toSqlTime(LocalDateTime time) {
//		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
//		 java.time.LocalDateTime dateTime = LocalDateTime.parse(time, fmt);
//		 java.sql.Timestamp ts = Timestamp.valueOf(dateTime);   
//		 return 
////		 return java.sql.Time.valueOf(time);
//		  }


}
