import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    ArrayList <Person> emp;

    public Employees(){
        this.emp = new ArrayList<>();

    }
    
    public void add(Person personToAdd) {
        emp.add(personToAdd);


    }//adds the given person to the employees list

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        iterator.forEachRemaining(person -> emp.add(person));

    }//adds the given list of people to the employees list

    public void print() {
        
        Iterator<Person> iterator = emp.iterator();
        iterator.forEachRemaining(employee-> System.out.println(employee));
    } //prints all employees

    public void print(Education education) {
        
        Iterator<Person> iterator = emp.iterator();
  
          while (iterator.hasNext()) {
              Person nextPerson = iterator.next(); // important for printing can't used iterator.next() to print obj needs to be a var
              
              if (nextPerson.getEducation() == education) {
                  System.out.println(nextPerson);
                   
              }
          }//prints the employees whose education matches the education given as a parameter.

    }

    public void fire(Education education) {

        Iterator<Person> iterator = emp.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }

    }

}
