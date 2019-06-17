package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private String address;


    public Person(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = Long.MIN_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "";
    }

    public Address getAddress() {
        return null;
    }

    public void setAddress(Address address) {
        this.address = "";
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}