package example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.model.Dog;
import example.repository.*;

@Component
public class Query implements GraphQLQueryResolver {

  DogRepository dogRepository;

  @Autowired
  public Query(DogRepository repo){
    this.dogRepository = repo;
  }

  public String findAllDogs(){
      StringBuilder sb = new StringBuilder();
      for ( Dog d : dogRepository.findAll() ) {
        sb.append(d.toString()+"\n");
      }
      return sb.toString();
  }

  public Long countAll(){
    return dogRepository.count();
  }

}
