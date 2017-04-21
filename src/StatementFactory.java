
public class StatementFactory {
	
	private static StatementFactory dt;
    private StatementFactory() {
    }
    public static StatementFactory getUniqueInstance() {
        if ( dt == null) {
            dt = new StatementFactory(); 
            //System.out.println("Creating a new StatementFactory instance");
        }
        return dt;
    }
    public StatementType createStatements(String selection) {
        if (selection.equalsIgnoreCase("detailedStmt")) {
            return new DetailedStatement();
        } else if (selection.equalsIgnoreCase("miniStmt")) {
            return new MiniStatement();
        }
        throw new IllegalArgumentException("Selection doesnot exist");
    }
}
