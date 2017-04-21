
public class ClientFactory {

	public static void main(String[] args) {
		StatementFactory statementFactory1=StatementFactory.getUniqueInstance();
		StatementFactory statementFactory2=StatementFactory.getUniqueInstance();
		StatementFactory statementFactory3=StatementFactory.getUniqueInstance();
		
		statementFactory1.createStatements("detailedStmt").print();
		
	}
}
