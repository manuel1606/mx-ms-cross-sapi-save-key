package mx.ms.cross.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import mx.ms.cross.model.SaveCommonSecret;

@Repository
public interface SecretRepository extends PagingAndSortingRepository<SaveCommonSecret, String>{

}
