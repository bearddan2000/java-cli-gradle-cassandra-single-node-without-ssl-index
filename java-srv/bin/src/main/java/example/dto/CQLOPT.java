package example.dto;

public enum CQLOPT {
  KEYSPACE("-create-keyspace.cql", "Keyspace"),
  CREATE("-create-table.cql", "Create"),
  INDEX("-create-index.cql", "Index"),
  BATCH("-run-batch.cql", "Batch"),
  INSERT("-insert-table.cql", "Insert"),
  SELECT("-select-table.cql", "Select"),
  VIEW("-create-view.cql", "View");

  public final String cqlFile;
  public final String operation;

  private CQLOPT(String file, String op)
  {
    this.cqlFile = file;
    this.operation = op;
  }

}
