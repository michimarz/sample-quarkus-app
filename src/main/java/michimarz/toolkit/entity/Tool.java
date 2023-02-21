package michimarz.toolkit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "tools")
@TableGenerator(name = "tools")
public class Tool {

   @Id
   @GeneratedValue 
   public long id;

   public String name;

   public String stage;

}
