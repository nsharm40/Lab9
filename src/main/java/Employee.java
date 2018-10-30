/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /** Sets name of employee. */
    private String name;
    /** Sets name of manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName name of employee
     * @param setManager name of manager
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName sets name
     */
    public void setName(final String setName) {
        this.name = setName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager sets manager name
     */
    public void setManager(final String setManager) {
        this.manager = setManager;
    }
}
