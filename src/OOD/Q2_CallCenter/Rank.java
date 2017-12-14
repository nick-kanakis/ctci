package OOD.Q2_CallCenter;

/**
 * Available ranks for all employees.
 */
public enum Rank {
    Respondent(1), Manager(2), Director(3);
    private int rankNumValue;
    Rank(int num) {
        rankNumValue = num;
    }
}
