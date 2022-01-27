package example.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.model.Dog;
import example.repository.*;

@Component
public class Mutation implements GraphQLMutationResolver {

  DogRepository dogRepository;

  @Autowired
  public Mutation(DogRepository repo){
    this.dogRepository = repo;
  }

  public String createDog(String breed, String color){
    Dog d = new Dog();
    d.setBreed(breed);
    d.setColor(color);

    dogRepository.save(d);

    return d.toString();
  }

}
