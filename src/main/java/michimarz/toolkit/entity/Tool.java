package michimarz.toolkit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tools")
public class Tool {

   @Id
   @GeneratedValue 
   public long id;

   public String name;

   public String stage;

}
