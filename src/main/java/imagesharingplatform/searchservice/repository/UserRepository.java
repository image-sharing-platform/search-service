package imagesharingplatform.searchservice.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import imagesharingplatform.searchservice.entity.User;

public interface UserRepository extends ElasticsearchRepository<User, String> {

}
