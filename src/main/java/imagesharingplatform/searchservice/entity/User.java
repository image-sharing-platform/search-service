package imagesharingplatform.searchservice.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "users")
public class User {

    private String id;
    
    private String firstName;
    
    private String lastName;
    
    private String email;
}
